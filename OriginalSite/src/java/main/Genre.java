/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import MSN.MSNBeans;
import MSN.URLSeach;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jumpei
 */
public class Genre extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            //リクエストパラメータの文字コードをUTF-8に変更
            request.setCharacterEncoding("UTF-8");

            //キーワードの値を受け取る
            String genre = request.getParameter("genre");

            URLSeach urlSeach = new URLSeach();

            //検索するURLをセットするとそのままXML形式のdocument型に変換
            urlSeach.setMsnURL(genre);

            //<a>タグの部分を取得
            urlSeach.aTagEles();

            //取得した<a>タグからhrefの属性値を取得
            urlSeach.hrefArr();

            //取得したhrefの属性値からジャンルのURLを取得
            urlSeach.genreArr();

            //ジャンルのHTMLからタイトルと本文と画像を取得する
            ArrayList<MSNBeans> newsArr = new ArrayList<MSNBeans>();
            for (String genreURL : urlSeach.getGenreArr()) {

                //一覧のリンクにリクエスト
                urlSeach.setGenreURL(genreURL);
                //記事の部分を取得
                urlSeach.articleEles();
                //タイトルを取得
                urlSeach.titel();
                //out.print(urlSeach.getTitel());
                //imgタグを取得
                urlSeach.imgTagEles();
                //画像のURLを取得
                urlSeach.dataSrcArr();
                //本文を取得
                urlSeach.text();
                //out.print(urlSeach.getText());

                //表示のためにbeansにニュースの情報を入れる
                MSNBeans mb = new MSNBeans();
                mb.setTitel(urlSeach.getTitel());
                mb.setText(urlSeach.getText());
                mb.setDataSrcArr(urlSeach.getDataSrcArr());
                mb.setGenre(genre);

                //画像のURLが足されていくために毎回削除
                urlSeach.imgClear();

                //ArrayListにそれぞれの情報を入れる
                newsArr.add(mb);
            }

            //表示用にセッションに入れる
            HttpSession hs = request.getSession();
            hs.setAttribute("newsArr", newsArr);

            request.getRequestDispatcher("/genre.jsp").forward(request, response);
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
