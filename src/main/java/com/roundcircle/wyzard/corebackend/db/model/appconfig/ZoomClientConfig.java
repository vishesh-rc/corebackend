package com.roundcircle.wyzard.corebackend.db.model.appconfig;

public class ZoomClientConfig {
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ZoomClientConfig(String token) {
        this.token = token;
    }

    private String token;
}
