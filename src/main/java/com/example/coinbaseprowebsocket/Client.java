package com.example.coinbaseprowebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.WebSocketContainer;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
public class Client {
    final static CountDownLatch messageLatch = new CountDownLatch(1);

    public static void main(String[] args) {
        SpringApplication.run(Client.class, args);
        try {
            WebSocketContainer container = ContainerProvider.getWebSocketContainer();
            String uri = "wss://ws-feed.pro.coinbase.com/";
            System.out.println("Connecting to " + uri);
            container.connectToServer(MyClientEndpoint.class, URI.create(uri));
            messageLatch.await(100, TimeUnit.SECONDS);
        } catch (DeploymentException | InterruptedException | IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

        new Scanner(System.in).nextLine(); //Don't close immediately.
    }
}
