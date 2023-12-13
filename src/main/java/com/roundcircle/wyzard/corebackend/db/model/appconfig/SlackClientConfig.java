package com.roundcircle.wyzard.corebackend.db.model.appconfig;

public class SlackClientConfig {
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public SlackClientConfig(String token) {
        this.token = token;
    }

    private String token;
}
