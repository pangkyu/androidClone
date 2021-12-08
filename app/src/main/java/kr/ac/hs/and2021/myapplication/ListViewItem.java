package kr.ac.hs.and2021.myapplication;

import android.graphics.drawable.Drawable;

public class ListViewItem {

    private String titleStr;
    private String descStr;
    private Drawable iconDrawable;

    public void setIcon(Drawable icon){
        iconDrawable = icon;
    }
    public void setTitle(String title){
        titleStr = title;
    }
    public void setDesc(String desc){
        descStr = desc;
    }
    public Drawable getIcon(){
        return this.iconDrawable;
    }
    public String getTitle(){
        return this.titleStr;
    }
    public String getDesc(){
        return this.descStr;
    }
}
