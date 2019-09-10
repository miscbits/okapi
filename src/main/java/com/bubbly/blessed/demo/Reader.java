package com.bubbly.blessed.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Reader {

    @Autowired
    private Scanner scanner;

    public Reader(Scanner scanner) {
        this.scanner = scanner;
    }

    public String readName() {
        System.out.println("What is your name");

        return scanner.next();
    }
}
