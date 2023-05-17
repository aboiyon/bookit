
package com.aboiyon.mycolletions.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;


@Generated("jsonschema2pojo")
public class Book implements Parcelable {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("subtitle")
    @Expose
    private String subtitle;
    @SerializedName("isbn13")
    @Expose
    private String isbn13;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Book() {
    }

    /**
     * 
     * @param image
     * @param price
     * @param subtitle
     * @param isbn13
     * @param title
     * @param url
     */
    public Book(String title, String subtitle, String isbn13, String price, String image, String url) {
        super();
        this.title = title;
        this.subtitle = subtitle;
        this.isbn13 = isbn13;
        this.price = price;
        this.image = image;
        this.url = url;
    }

    protected Book(Parcel in) {
        title = in.readString();
        subtitle = in.readString();
        isbn13 = in.readString();
        price = in.readString();
        image = in.readString();
        url = in.readString();
    }

    public static final Parcelable.Creator<Book> CREATOR = new Parcelable.Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(subtitle);
        dest.writeString(isbn13);
        dest.writeString(price);
        dest.writeString(image);
        dest.writeString(url);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
