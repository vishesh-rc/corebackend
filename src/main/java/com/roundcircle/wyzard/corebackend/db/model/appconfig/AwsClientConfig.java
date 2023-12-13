package com.roundcircle.wyzard.corebackend.db.model.appconfig;

public class AwsClientConfig {
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public AwsClientConfig(String token) {
        this.token = token;
    }

    private String token;
}
