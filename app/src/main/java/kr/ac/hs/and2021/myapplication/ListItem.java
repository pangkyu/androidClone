package kr.ac.hs.and2021.myapplication;


public class ListItem {

    private String mainTitle;
    private String subTitle;

    public void setTitle(String mainTitle){
        this.mainTitle = mainTitle;
    }
    public void setDesc(String subTitle){
        this.subTitle = subTitle;
    }

    public String getTitle(){
        return mainTitle;
    }
    public String getDesc(){
        return subTitle;
    }


    ListItem(String mainTitle, String subTitle){
        this.mainTitle = mainTitle;
        this.subTitle = subTitle;
    }
}
