package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    public void test1() {
        try {
            provideInput("3\nenqueue 5 3\nenqueue 6 5\nenqueue 1 -1\ndequeue\nenqueue -2 0\ndequeue\nenqueue 3 1\nenqueue 4 2");
            Main.main((new String[] {}));

            assertEquals("", "");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test2() {
        try {
            provideInput("3\ndequeue\nenqueue 91 4\nenqueue 30 8");
            Main.main((new String[] {}));

            assertEquals("", "");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test3() {
        try {
            provideInput("10\nenqueue -57 -5\ndequeue\ndequeue\nenqueue -51 5\ndequeue\ndequeue\ndequeue\nenqueue -43 1\nenqueue 13 2\nenqueue -93 3\ndequeue\nenqueue 71 3\nenqueue -46 3\nenqueue 40 4\ndequeue");
            Main.main((new String[] {}));

            assertEquals("", "");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test4() {
        try {
            provideInput("3\nenqueue 7 -3\nenqueue 15 6\nenqueue -2 -9\nenqueue -11 4\nenqueue -13 0\ndequeue\ndequeue\nenqueue 0 1\nenqueue 15 -7\nenqueue 19 1\nenqueue 12 -6");
            Main.main((new String[] {}));

            assertEquals("", "");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
