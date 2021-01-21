package com.example.coinbaseprowebsocket;

import com.example.coinbaseprowebsocket.controller.CoinbaseproController;
import com.example.coinbaseprowebsocket.model.CoinbaseproResponse;
import com.google.gson.Gson;

import javax.websocket.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@ClientEndpoint
public class MyClientEndpoint {
    @OnOpen
    public void onOpen(Session session) {
        System.out.println("Connected to endpoint: " + session.getBasicRemote());
        try {
            String name = "{\n" +
                    "    \"type\": \"subscribe\",\n" +
                    "    \"channels\": [\n" +
                    "      { \"name\": \"ticker\", \n" +
                    "    \"product_ids\": [\n" +
                    "      \"BTC-USD\",\n" +
                    "      \"BTC-EUR\",\n" +
                    "       \"ETH-USD\",\n" +
                    "      \"ETH-EUR\"\n" +
                    "    ] }]\n" +
                    "}";
            System.out.println("Sending message to endpoint: " + name);
            session.getBasicRemote().sendText(name);
        } catch (IOException ex) {
            Logger.getLogger(MyClientEndpoint.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @OnMessage
    public void processMessage(String message) {
        System.out.println("Received message in client: " + message);
        Gson g = new Gson();
        CoinbaseproResponse coinbaseproResponse = g.fromJson(message, CoinbaseproResponse.class);
        CoinbaseproController.data = coinbaseproResponse;
        Client.messageLatch.countDown();
    }

    @OnError
    public void processError(Throwable t) {
        t.printStackTrace();
    }
}
