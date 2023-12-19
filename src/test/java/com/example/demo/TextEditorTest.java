package com.example.demo;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Text;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextEditorTest {

    TextEditor textEditor = new TextEditor();

    @Test
    public void test1() {
        String[][]  queries = {
            {"0", "APPEND", "Hey"},
            {"1", "APPEND", " there"},
            {"2", "APPEND", "!"}
        };

        assertEquals(textEditor.solution(queries), "Hey there!");
    }

    @Test
    public void test2() {
        String[][]  queries = {
                {"0", "APPEND", "Hey you"},
                {"1", "BACKSPACE"}
        };

        assertEquals(textEditor.solution(queries), "Hey yo");
    }

    @Test
    public void test3() {
        String[][]  queries = {
                {"0", "APPEND", "!"},
                {"1", "BACKSPACE"},
                {"2", "BACKSPACE"}
        };

        assertEquals(textEditor.solution(queries), "");
    }

}
