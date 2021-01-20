package com.example.coinbaseprowebsocket.model;

import java.util.List;

public class CoinbaseproMessage {

    private String type;
    private List<Channel> channels;

    public CoinbaseproMessage(String type, List<Channel> channels) {
        this.type = type;
        this.channels = channels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }
}
