/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MSN;

import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * MSNニュースのURLにリクエストをして、 そのHTMLの要素からタイトル、本文、画像を取得するオブジェクト
 *
 * @author Jumpei
 */
public class URLSeach {

    private String genreURL;
    private Document doc;
    private Elements aTag;
    private ArrayList<String> hrefArr;
    private ArrayList<String> genreArr;
    private Elements titel;
    private Elements article;
    private Elements text;
    private Elements imgTag;
    private ArrayList<String> dataSrcArr;

    public URLSeach() {
        this.genreURL = "http://www.msn.com/ja-jp/news/";
        this.hrefArr = new ArrayList<String>();
        this.genreArr = new ArrayList<String>();
        this.dataSrcArr = new ArrayList<String>();
    }

    /**
     * URLのHTMLの情報を取得
     *
     * @param URL
     * @throws IOException
     */
    public void setMsnURL(String genre) throws IOException {
        this.genreURL += genre;
        this.doc = Jsoup.connect(this.genreURL).userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2526.73 Safari/537.36").post();
    }

    /**
     * 一覧のURLのHTMLの情報を取得
     *
     * @param URL
     * @throws IOException
     */
    public void setGenreURL(String genreURL) throws IOException {
        this.doc = Jsoup.connect(genreURL).userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2526.73 Safari/537.36").post();
    }

    public String getHTML() {
        return this.doc.html();
    }

    /**
     * <a>タグを取得する
     */
    public void aTagEles() {
        this.aTag = this.doc.getElementsByTag("a");
    }

    public Elements getAtagEles() {
        return this.aTag;
    }

    /**
     * URLを取得
     */
    public void hrefArr() {
        for (Element url : this.aTag) {
            this.hrefArr.add(url.absUrl("href"));
        }
    }

    public ArrayList<String> getHrefArr() {
        return this.hrefArr;
    }

    /**
     * ジャンルのURLを取得
     */
    public void genreArr() {
        for (String hrefURL : this.hrefArr) {
            if (hrefURL.startsWith(this.genreURL + "/")) {
                genreArr.add(hrefURL);
            }
        }
    }

    public ArrayList<String> getGenreArr() {
        return genreArr;
    }

    /**
     * 記事の部分を取得する
     */
    public void articleEles() {
        this.article = this.doc.getElementsByTag("article");
    }

    public Elements getArticleEles() {
        return this.article;
    }

    /**
     * タイトルを取得する
     */
    public void titel() {
        this.titel = this.doc.getElementsByClass("collection-headline").get(0).getElementsByTag("h1");
    }

    public Elements getTitel() {
        return this.titel;
    }

    /**
     * 画像があった場合はimgタグを取得する
     */
    public void imgTagEles() {
        this.imgTag = this.article.get(0).getElementsByTag("img");
    }

    public Elements getImgTagEles() {
        return this.imgTag;
    }

    /**
     * data-src属性があった場合は属性値を取得する
     */
    public void dataSrcArr() {
        //imgタグがあり画像のURLの属性値があったら取得する
        if (imgTag.size() != 0) {
            for (int i = 0; i < imgTag.size(); i++) {
                if (imgTag.get(i).hasAttr("data-src")) {
                    //画像のURLを抜き取る、まず//の後ろから切り取る
                    int start = imgTag.get(i).attr("data-src").indexOf("//");
                    String imageURL = imgTag.get(i).attr("data-src").substring(start + 2);
                    //?の前を切り取る
                    int end = imageURL.indexOf("?");
                    this.dataSrcArr.add(imageURL.substring(0, end));
                }
            }
        }
    }

    public ArrayList<String> getDataSrcArr() {
        return this.dataSrcArr;
    }

    /**
     * 画像のURLが引き継がれていくのを防ぐためインスタンス化と削除
     */
    public void imgClear() {
        this.imgTag.clear();
        this.dataSrcArr = new ArrayList<String>();
    }

    /**
     * 本文を取得する
     */
    public void text() {
        //本文の書き方の変化に対応する条件
        if (this.article.get(0).getElementsByAttribute("xmlns").hasText()) {
            this.text = this.article.get(0).getElementsByAttribute("xmlns");
        } else {
            this.text = this.article.get(0).getElementsByTag("p");
        }
        //本文の中にインライン要素で画像があったときに削除する
        for (int i = 0; i < this.text.size(); i++) {
            if (!this.text.get(i).getElementsByTag("span").isEmpty()) {
                this.text.get(i).getElementsByTag("span").remove();
            }
        }
    }

    public Elements getText() {
        return this.text;
    }

}
