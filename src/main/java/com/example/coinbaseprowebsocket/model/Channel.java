package com.example.coinbaseprowebsocket.model;

import java.util.List;

public class Channel {
    private String name;
    private List<String> product_ids;

    public Channel(String name, List<String> product_ids) {
        this.name = name;
        this.product_ids = product_ids;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getProduct_ids() {
        return product_ids;
    }

    public void setProduct_ids(List<String> product_ids) {
        this.product_ids = product_ids;
    }
}