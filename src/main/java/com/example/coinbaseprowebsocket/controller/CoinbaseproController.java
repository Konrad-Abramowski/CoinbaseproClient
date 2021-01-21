package com.example.coinbaseprowebsocket.controller;

import com.example.coinbaseprowebsocket.model.CoinbaseproResponse;
import com.example.coinbaseprowebsocket.model.ControllerResponse;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class CoinbaseproController {

    public static CoinbaseproResponse btcUSD;
    public static CoinbaseproResponse btcEUR;
    public static CoinbaseproResponse ethUSD;
    public static CoinbaseproResponse ethEUR;


    @GetMapping()
    public ResponseEntity<List<ControllerResponse>> getCryptocurrencyData() throws JSONException, IOException {
        List<ControllerResponse> arrayList = new ArrayList<>();
        if(btcUSD != null){
            arrayList.add(new ControllerResponse(btcUSD));
        }
        if(btcEUR != null){
            arrayList.add(new ControllerResponse(btcEUR));
        }
        if(ethUSD != null){
            arrayList.add(new ControllerResponse(ethUSD));
        }
        if(ethEUR != null){
            arrayList.add(new ControllerResponse(ethUSD));
        }
        return  ResponseEntity.ok(arrayList);
    }
}
