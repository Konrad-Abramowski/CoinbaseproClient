package com.example.coinbaseprowebsocket.controller;

import com.example.coinbaseprowebsocket.Client;
import com.example.coinbaseprowebsocket.model.CoinbaseproMessage;
import com.example.coinbaseprowebsocket.model.CoinbaseproResponse;
import com.example.coinbaseprowebsocket.model.ControllerResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


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
