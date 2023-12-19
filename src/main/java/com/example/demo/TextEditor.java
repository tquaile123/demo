package com.example.demo;

public class TextEditor {

    public String solution (String[][] queries) {
        StringBuilder sb = new StringBuilder();

        for (String[] query: queries) {
            String action = query[1];
            if ("APPEND".equalsIgnoreCase(action)) {
                sb.append(query[2]);
            }
            else if ("BACKSPACE".equalsIgnoreCase(action)) {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }
        return sb.toString();
    }
}
