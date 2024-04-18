package com.von.userbackend.common.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ItemTest {

    @Test
    void systemOut() {
        Item s = new Item();
        String s3 = s.systemOut();
        System.out.println("-->"+s3);
        String s2 = "Hello";
        Assertions.assertEquals(s.systemOut(), "Hello");
    }

    @Test
    void add() {

    }
}