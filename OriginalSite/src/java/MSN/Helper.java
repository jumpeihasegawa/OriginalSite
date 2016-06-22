/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MSN;

/**
 *
 * @author Jumpei
 */
public class Helper {

    public static Helper getInstance() {
        return new Helper();
    }

    public String genre(String genre) {
        String output = "";

        if (genre.equals("national")) {
            output = "国内";
        }
        if (genre.equals("world")) {
            output = "海外";
        }
        if (genre.equals("money")) {
            output = "ビジネス";
        }
        if (genre.equals("techandscience")) {
            output = "テクノロジー";
        }
        if (genre.equals("entertainment")) {
            output = "エンタメ";
        }
        if (genre.equals("sports")) {
            output = "スポーツ";
        }

        return output;
    }

}
