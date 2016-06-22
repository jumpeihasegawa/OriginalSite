/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MSN;

import java.io.Serializable;
import java.util.ArrayList;
import org.jsoup.select.Elements;

/**
 * ニュースの情報を持ち運ぶBeans 主に画面に表示をするためのもの
 *
 * @author Jumpei
 */
public class MSNBeans implements Serializable {

    private String genre;
    private Elements titel;
    private Elements text;
    private String image;
    private ArrayList<String> dataSrcArr;

    public MSNBeans() {
        dataSrcArr = new ArrayList<String>();
        image = "";
    }

    public static MSNBeans getInstance() {
        return new MSNBeans();
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setTitel(Elements titel) {
        this.titel = titel;
    }

    public Elements getTitel() {
        return this.titel;
    }

    public void setText(Elements text) {
        this.text = text;
    }

    public Elements getText() {
        return this.text;
    }

    public void setDataSrcArr(ArrayList<String> dataSrcArr) {
        this.dataSrcArr = dataSrcArr;
    }

    public ArrayList<String> getDataSrcArr() {
        return this.dataSrcArr;
    }

    public String getImage(int i) {
        this.image = "https://" + this.dataSrcArr.get(i);
        return this.image;
    }
}
