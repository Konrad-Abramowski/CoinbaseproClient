package com.example.coinbaseprowebsocket.model;

import java.util.Date;

public class CoinbaseproResponse {

    private String type;
    private long sequence;
    private String product_id;
    private String price;
    private String open_24h;
    private String volume_24h;
    private String low_24h;
    private String high_24h;
    private String volume_30d;
    private String best_bid;
    private String best_ask;
    private String side;
    private Date time;
    private int trade_id;
    private String last_size;

    public CoinbaseproResponse(String type, long sequence, String product_id, String price, String open_24h, String volume_24h, String low_24h, String high_24h, String volume_30d, String best_bid, String best_ask, String side, Date time, int trade_id, String last_size) {
        this.type = type;
        this.sequence = sequence;
        this.product_id = product_id;
        this.price = price;
        this.open_24h = open_24h;
        this.volume_24h = volume_24h;
        this.low_24h = low_24h;
        this.high_24h = high_24h;
        this.volume_30d = volume_30d;
        this.best_bid = best_bid;
        this.best_ask = best_ask;
        this.side = side;
        this.time = time;
        this.trade_id = trade_id;
        this.last_size = last_size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getSequence() {
        return sequence;
    }

    public void setSequence(long sequence) {
        this.sequence = sequence;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOpen_24h() {
        return open_24h;
    }

    public void setOpen_24h(String open_24h) {
        this.open_24h = open_24h;
    }

    public String getVolume_24h() {
        return volume_24h;
    }

    public void setVolume_24h(String volume_24h) {
        this.volume_24h = volume_24h;
    }

    public String getLow_24h() {
        return low_24h;
    }

    public void setLow_24h(String low_24h) {
        this.low_24h = low_24h;
    }

    public String getHigh_24h() {
        return high_24h;
    }

    public void setHigh_24h(String high_24h) {
        this.high_24h = high_24h;
    }

    public String getVolume_30d() {
        return volume_30d;
    }

    public void setVolume_30d(String volume_30d) {
        this.volume_30d = volume_30d;
    }

    public String getBest_bid() {
        return best_bid;
    }

    public void setBest_bid(String best_bid) {
        this.best_bid = best_bid;
    }

    public String getBest_ask() {
        return best_ask;
    }

    public void setBest_ask(String best_ask) {
        this.best_ask = best_ask;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getTrade_id() {
        return trade_id;
    }

    public void setTrade_id(int trade_id) {
        this.trade_id = trade_id;
    }

    public String getLast_size() {
        return last_size;
    }

    public void setLast_size(String last_size) {
        this.last_size = last_size;
    }
}
