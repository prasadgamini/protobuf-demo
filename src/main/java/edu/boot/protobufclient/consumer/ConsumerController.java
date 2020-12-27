package edu.boot.protobufclient.consumer;

import edu.boot.protobuf.pojo.MessagePojo;
import edu.boot.protobuf.proto.PersonProto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    private final RestConnector restConnector;

    public ConsumerController(RestConnector restConnector) {
        this.restConnector = restConnector;
    }

    @GetMapping("/consume")
    public MessagePojo consume() {
        var messagePojo = restConnector.call();
        System.out.println("DONE");
        return messagePojo;
    }

    @GetMapping("/consumeProto")
    public String consumeProto() {
        var person = restConnector.callProto();
        System.out.println("DONE");
        return person.toString();
    }
}
