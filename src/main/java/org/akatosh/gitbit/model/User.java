package org.akatosh.gitbit.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class User {
    private int id;

    @SerializedName("login")
    private String username;
    private String url;

    public User() {}

    public User(int id, String username, String url) {
        this.id = id;
        this.username = username;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
