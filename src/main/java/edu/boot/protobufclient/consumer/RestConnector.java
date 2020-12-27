package edu.boot.protobufclient.consumer;

import edu.boot.protobuf.pojo.MessagePojo;
import edu.boot.protobuf.proto.PersonProto;
import edu.boot.protobuf.proto.PersonProto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestConnector {
    private RestTemplate restTemplate;

    private final ProtobufHttpMessageConverter converter;
    public RestConnector(RestTemplate restTemplate, ProtobufHttpMessageConverter converter) {
        this.restTemplate = restTemplate;
        this.converter = converter;
    }

    public void call(){
        MessagePojo messagePojo = restTemplate.getForObject("http://localhost:8080/hello", MessagePojo.class);
        System.out.println(messagePojo);
    }

    public PersonProto.Person callProto(){
        Object personProto = restTemplate.getForObject("http://localhost:8080/helloProto", Object.class);
        System.out.println(personProto); //LinkedHashMap

        ResponseEntity<PersonProto.Person> responseEntity= restTemplate.getForEntity("http://localhost:8080/helloProto", PersonProto.Person.class);
        var person = responseEntity.getBody();
        System.out.println(person);
        return person;
    }
}
