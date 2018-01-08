package Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Shubhransu on 08-Jan-18.
 */

public class MyDTOpojo {

    @SerializedName("productid")
    private String productid;
    @SerializedName("productname")
    private String productname;
    @SerializedName("price")
    private String price;
    @SerializedName("instock")
    private String instock;
    @SerializedName("offer")
    private String offer;
    @SerializedName("color")
    private String color;
    @SerializedName("imageurl")
    private String imageurl;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getInstock() {
        return instock;
    }

    public void setInstock(String instock) {
        this.instock = instock;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
