package edu.boot.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GRPCServer {

    public static void main(String[] args) {
        Server server = ServerBuilder.forPort(8080).addService(new SearchServiceImpl().bindService()).build();
        try {
            server.start();
            System.out.println("GRPC Server started");
            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
