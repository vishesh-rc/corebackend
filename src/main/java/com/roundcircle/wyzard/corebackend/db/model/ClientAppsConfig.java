package com.roundcircle.wyzard.corebackend.db.model;

import com.roundcircle.wyzard.corebackend.db.model.appconfig.AwsClientConfig;
import com.roundcircle.wyzard.corebackend.db.model.appconfig.SlackClientConfig;
import com.roundcircle.wyzard.corebackend.db.model.appconfig.ZoomClientConfig;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("clientAppsConfig")
public class ClientAppsConfig {
    @Id
    private String clientName;

    public String getClientName() {
        return clientName;
    }

    public AwsClientConfig getAwsClientConfig() {
        return awsClientConfig;
    }

    public void setAwsClientConfig(AwsClientConfig awsClientConfig) {
        this.awsClientConfig = awsClientConfig;
    }

    public SlackClientConfig getSlackClientConfig() {
        return slackClientConfig;
    }

    public void setSlackClientConfig(SlackClientConfig slackClientConfig) {
        this.slackClientConfig = slackClientConfig;
    }

    public ZoomClientConfig getZoomClientConfig() {
        return zoomClientConfig;
    }

    public void setZoomClientConfig(ZoomClientConfig zoomClientConfig) {
        this.zoomClientConfig = zoomClientConfig;
    }

    private AwsClientConfig awsClientConfig;
    private SlackClientConfig slackClientConfig;
    private ZoomClientConfig zoomClientConfig;

    public ClientAppsConfig(String clientName, AwsClientConfig awsClientConfig, SlackClientConfig slackClientConfig, ZoomClientConfig zoomClientConfig) {
        super();
        this.clientName = clientName;
        this.awsClientConfig = awsClientConfig;
        this.slackClientConfig = slackClientConfig;
        this.zoomClientConfig = zoomClientConfig;
    }
}
