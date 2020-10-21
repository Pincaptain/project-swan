package org.akatosh.exchangio.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

@SuppressWarnings("unused")
public class Exchange {
    private String base;

    @SerializedName("date")
    private Date updatedDate;

    private Rates rates;

    public Exchange() {}

    public Exchange(String base, Date updatedDate, Rates rates) {
        this.base = base;
        this.updatedDate = updatedDate;
        this.rates = rates;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }
}
