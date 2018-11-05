package com.itheima.domain;

public class Book {
    private Integer id;
    private String bookname;
    private Integer kind_id;
    private String author;
    private String company;
    private double price;
    private Integer count;
    private Integer page;
    private String names;
    private Kind kind;
    private Saleinfo saleinfo;
    private Customer customer;
    private Double avgprice;

    public Double getAvgprice() {
        return avgprice;
    }

    public void setAvgprice(Double avgprice) {
        this.avgprice = avgprice;
    }

    public Saleinfo getSaleinfo() {
        return saleinfo;
    }

    public void setSaleinfo(Saleinfo saleinfo) {
        this.saleinfo = saleinfo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Integer getKind_id() {
        return kind_id;
    }

    public void setKind_id(Integer kind_id) {
        this.kind_id = kind_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookname='" + bookname + '\'' +
                ", kind_id=" + kind_id +
                ", author='" + author + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", page=" + page +
                ", names='" + names + '\'' +
                ", kind=" + kind +
                ", saleinfo=" + saleinfo +
                ", customer=" + customer +
                ", avgprice=" + avgprice +
                '}';
    }
}
