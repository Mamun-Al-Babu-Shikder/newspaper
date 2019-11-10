package com.mcubes.newspaper.model;

/**
 * Created by A.A.MAMUN on 11/11/2019.
 */

public class SingleNews {

    private String link;
    private String img;
    private String title;


    public SingleNews(){

    }

    public SingleNews(String link, String img, String title) {
        this.link = link;
        this.img = img;
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Model{" +
                "link='" + link + '\'' +
                ", img='" + img + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
