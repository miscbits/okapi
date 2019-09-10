package com.bubbly.blessed.demo;

import com.bubbly.blessed.demo.Reader;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Scanner;

@SpringBootTest
public class ReaderTest {

    @Autowired
    Scanner scanner;

    @Autowired
    Reader reader;

    @Test
    public void readName() {

        BDDMockito.given(scanner.next())
                .willReturn("Jimbo");

        String actual  = reader.readName();

        Assert.assertEquals("Jimbo"
                , actual);
    }
}