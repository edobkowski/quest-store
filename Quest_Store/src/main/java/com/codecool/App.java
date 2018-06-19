package com.codecool;

import com.codecool.Handlers.MentorHandler;
import com.codecool.Handlers.StaticHandler;
import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class App {
    public static void main(String[] args) throws Exception {
        // create a server on port 8000
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        // set routes
//        server.createContext("/dashboard", new Dashboard());
        server.createContext("/dashboard", new MentorHandler());
        server.createContext("/static", new StaticHandler());
        server.setExecutor(null); // creates a default executor

        // start listening
        server.start();
    }
}

