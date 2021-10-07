package com.example.recycleronclick.rv_onclick_bundle_data;
import java.io.Serializable;

public class DataBandle implements Serializable {

    String tx;
    int img;

    public DataBandle(String tx, int img) {
        this.tx = tx;
        this.img = img;
    }

    public String getTx() {
        return tx;
    }

    public void setTx(String tx) {
        this.tx = tx;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

}
