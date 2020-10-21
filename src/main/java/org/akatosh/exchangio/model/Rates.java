package org.akatosh.exchangio.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Rates {
    @SerializedName("USD")
    private float dollar;

    public Rates () {}

    public Rates(float dollar) {
        this.dollar = dollar;
    }

    public float getDollar() {
        return dollar;
    }

    public void setDollar(float dollar) {
        this.dollar = dollar;
    }
}
