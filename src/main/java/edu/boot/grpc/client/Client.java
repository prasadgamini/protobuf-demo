package edu.boot.grpc.client;

import edu.boot.protobuf.proto.SearchProto.SearchRequest;
import edu.boot.protobuf.proto.SearchProto.SearchResponse;
import edu.boot.protobuf.proto.SearchServiceGrpc;
import edu.boot.protobuf.proto.SearchServiceGrpc.SearchServiceBlockingStub;
import edu.boot.protobuf.proto.SearchServiceGrpc.SearchServiceStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client {

    public static void main(String[] args) {
        System.out.println(".Client.Start.");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
        SearchServiceBlockingStub searchServiceBlockingStub = SearchServiceGrpc.newBlockingStub(channel);
        SearchResponse searchResponse = searchServiceBlockingStub.search(SearchRequest.newBuilder().setId(1).build());
        System.out.println(searchResponse);
        System.out.println(".Client.End.");
    }
}
