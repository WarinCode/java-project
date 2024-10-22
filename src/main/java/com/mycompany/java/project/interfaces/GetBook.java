package com.mycompany.java.project.interfaces;


//interface เก็บ ฟังก์ชั้น ของ getbook สำหรับ สร้าง custom function
public interface GetBook {
    public int getBookId();
    public String getBookName();
    public String getAuthorName();
    public double getPrice();
    public String getIsbn();
    public String getImageUrl();
    public int getRemain();
}
