package edu.boot.protobuf;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.TimeZone;

public class PracticeTest {

    @Test
    public void testTimeZone() {
        TimeZone timeZone = TimeZone.getTimeZone(ZoneId.systemDefault());
        long toEpochSecond = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
        System.out.println(toEpochSecond);
    }
}
