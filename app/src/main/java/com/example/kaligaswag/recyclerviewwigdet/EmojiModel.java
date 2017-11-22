package com.example.kaligaswag.recyclerviewwigdet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kaligaswag on 22/11/2017.
 */

public class EmojiModel {

    private int imageID;
    private String title;

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static List<EmojiModel> getObjectList(){

        List<EmojiModel> datalist = new ArrayList<>();
        int[] images = getImages();

        for (int i = 0; i < images.length; i++){
            EmojiModel emoji = new EmojiModel();
            emoji.setImageID(images[i]);
            emoji.setTitle("Emoji " + i);
            datalist.add(emoji);
        }
        return datalist;
    }

    private static int[] getImages(){

        int[] images = {
                R.drawable.emoji1,
                R.drawable.emoji2,
                R.drawable.emoji3,
                R.drawable.emoji4,
                R.drawable.emoji5,
                R.drawable.emoji6
        };

        return images;
    }
}
