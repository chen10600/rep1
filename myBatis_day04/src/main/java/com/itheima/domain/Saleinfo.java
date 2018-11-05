package com.itheima.domain;

import java.sql.Date;

public class Saleinfo {
    private int saleid;
    private int bookid;
    private int cid;
    private Date saletime;
    private int nums;
    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getSaleid() {
        return saleid;
    }

    public void setSaleid(int saleid) {
        this.saleid = saleid;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Date getSaletime() {
        return saletime;
    }

    public void setSaletime(Date saletime) {
        this.saletime = saletime;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    @Override
    public String toString() {
        return "Saleinfo{" +
                "saleid=" + saleid +
                ", bookid=" + bookid +
                ", cid=" + cid +
                ", saletime=" + saletime +
                ", nums=" + nums +
                ", book=" + book +
                '}';
    }
}
