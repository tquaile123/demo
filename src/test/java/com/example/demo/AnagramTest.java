package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    public void test1() {
        String s1 = "danger";
        String s2 = "garden";

        assertEquals(anagram.isAnagram(s1, s2), true);
    }

    @Test
    public void test2() {
        String s1 = "danger";
        String s2 = "darden";

        assertEquals(anagram.isAnagram(s1, s2), false);
    }

    @Test
    public void test3() {
        String s1 = "tom";
        String s2 = "mot";

        assertEquals(anagram.isAnagram(s1, s2), true);
    }

    @Test
    public void test4() {
        String s1 = "tomm";
        String s2 = "mott";

        assertEquals(anagram.isAnagram(s1, s2), false);
    }
}
