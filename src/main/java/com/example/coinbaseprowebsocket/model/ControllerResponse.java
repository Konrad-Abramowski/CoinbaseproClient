package com.example.coinbaseprowebsocket.model;

public class ControllerResponse {

    private String instrument;
    private String bid;
    private String ask;
    private String last;
    private String time;


    public ControllerResponse(CoinbaseproResponse coinbaseproResponse) {
        this.instrument = coinbaseproResponse.getProduct_id().replace("-", "");
        this.bid = coinbaseproResponse.getBest_bid();
        this.ask = coinbaseproResponse.getBest_ask();
        this.last = coinbaseproResponse.getLast_size();
        this.time = coinbaseproResponse.getTime().toString();
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
