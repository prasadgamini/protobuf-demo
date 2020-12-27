package edu.boot.protobuf;

import edu.boot.protobuf.proto.PersonProto;
import edu.boot.protobuf.proto.PersonProto.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class ProtobufDemoApplicationTests {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    void contextLoads() {
//        ResponseEntity<Person> responseEntity = restTemplate.getForEntity("http://localhost:8080/helloProto", PersonProto.Person.class);
//        var person = responseEntity.getBody();
//        System.out.println(person);
//        assertEquals("Prasad", person.getName());
//        assertEquals(101, person.getId());
//        assertEquals("temp@sysdig.com", person.getEmail());
    }

}
