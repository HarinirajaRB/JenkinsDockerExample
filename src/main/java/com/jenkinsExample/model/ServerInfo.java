package com.jenkinsExample.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ServerInfo {
    private String serverTime;
    private String buildVersion;
    private String environment;

    public ServerInfo() {
        // Get current time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.serverTime = now.format(formatter);
        
        // These would normally come from application properties or environment variables
        this.buildVersion = "1.0.0";
        this.environment = System.getProperty("env", "development");
    }

    public String getServerTime() {
        return serverTime;
    }

    public void setServerTime(String serverTime) {
        this.serverTime = serverTime;
    }

    public String getBuildVersion() {
        return buildVersion;
    }

    public void setBuildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
