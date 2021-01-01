package edu.boot.grpc.server;

import edu.boot.protobuf.proto.SearchProto.SearchRequest;
import edu.boot.protobuf.proto.SearchProto.SearchResponse;
import edu.boot.protobuf.proto.SearchServiceGrpc;
import io.grpc.stub.StreamObserver;

public class SearchServiceImpl extends SearchServiceGrpc.SearchServiceImplBase {

    @Override
    public void search(SearchRequest request, StreamObserver<SearchResponse> responseObserver) {

        SearchResponse searchResponse = SearchResponse.newBuilder()
                .setMessage("Hello From MyService")
                .build();
        responseObserver.onNext(searchResponse);
        responseObserver.onCompleted();
        System.out.println("Search Service called :) ");
    }
}
