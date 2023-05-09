
package com.aboiyon.mycolletions;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class BookStoreSearchResponse {

    @SerializedName("total")
    @Expose
    private String total;
    @SerializedName("page")
    @Expose
    private String page;
    @SerializedName("books")
    @Expose
    private List<Book> books;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BookStoreSearchResponse() {
    }

    /**
     * 
     * @param total
     * @param books
     * @param page
     */
    public BookStoreSearchResponse(String total, String page, List<Book> books) {
        super();
        this.total = total;
        this.page = page;
        this.books = books;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

}
