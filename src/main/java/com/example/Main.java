package com.example;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String message = "Hello, Profit Deployment!";
        
        if (StringUtils.isNotBlank(message)) {
            System.out.println(message);
        } else {
            System.out.println("Message is empty");
        }
    }
}

