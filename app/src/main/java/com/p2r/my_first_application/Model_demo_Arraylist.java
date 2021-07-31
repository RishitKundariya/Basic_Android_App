package com.p2r.my_first_application;

public class Model_demo_Arraylist {
    int iamge;
    String Header_text;
    String text;
    Model_demo_Arraylist(int image,String Header_text,String text){
        this.text=text;
        this.Header_text=Header_text;
        this.iamge=image;
    }

    public int getIamge() {
        return iamge;
    }

    public String getHeader_text() {
        return Header_text;
    }

    public String getText() {
        return text;
    }
}
