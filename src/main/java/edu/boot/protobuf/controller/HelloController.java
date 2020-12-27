package edu.boot.protobuf.controller;

import edu.boot.protobuf.pojo.MessagePojo;
import edu.boot.protobuf.proto.PersonProto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public MessagePojo getMessage() {
        MessagePojo messagePojo = new MessagePojo(101, "Om Namo Bhagavathe Vasudevaya");
        messagePojo.addMetaDataProp("Timestamp", Long.toString(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC)));
        return messagePojo;
    }

    @GetMapping(value="/helloProto")
    public PersonProto.Person getPersonProto() {
        PersonProto.Person person = PersonProto.Person.newBuilder()
                .setId(101)
                .setName("Prasad")
                .setEmail("temp@sysdig.com")
                .build();

        return person;
    }
}
