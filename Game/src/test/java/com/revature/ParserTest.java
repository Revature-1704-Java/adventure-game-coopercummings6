package com.revature;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;

/*
Unit tests for Parser
*/
public class ParserTest
{
    @Test
    public void caseShouldNotMatter()
    {
        ByteArrayInputStream in = new ByteArrayInputStream("nOrTh".getBytes());
        System.setIn(in);//parser reads from System.in, set System.In to a different stream so test can control input

        Parser parser = new Parser();
        String returnedCommand = parser.getCommand();
        assertTrue("North".equals(returnedCommand));

        System.setIn(System.in);//reset System.in stream
    }

    @Test
    public void eastShouldWork()
    {
        ByteArrayInputStream in = new ByteArrayInputStream("East".getBytes());
        System.setIn(in);//parser reads from System.in, set System.In to a different stream so test can control input

        Parser parser = new Parser();
        String returnedCommand = parser.getCommand();
        assertTrue("East".equals(returnedCommand));

        System.setIn(System.in);//reset System.in stream
    }

    @Test
    public void westShouldWork()
    {
        ByteArrayInputStream in = new ByteArrayInputStream("west".getBytes());
        System.setIn(in);//parser reads from System.in, set System.In to a different stream so test can control input

        Parser parser = new Parser();
        String returnedCommand = parser.getCommand();
        assertTrue("West".equals(returnedCommand));

        System.setIn(System.in);//reset System.in stream
    }

    @Test
    public void southShouldWork()
    {
        ByteArrayInputStream in = new ByteArrayInputStream("SOuth".getBytes());
        System.setIn(in);//parser reads from System.in, set System.In to a different stream so test can control input

        Parser parser = new Parser();
        String returnedCommand = parser.getCommand();
        assertTrue("South".equals(returnedCommand));

        System.setIn(System.in);//reset System.in stream
    }

    @Test
    public void invalidPromptsForNewCommand()
    {
        ByteArrayInputStream in = new ByteArrayInputStream("Nroth\nnorth".getBytes());
        System.setIn(in);//parser reads from System.in, set System.In to a different stream so test can control input

        Parser parser = new Parser();
        String returnedCommand = parser.getCommand();
        assertTrue("North".equals(returnedCommand));

        System.setIn(System.in);//reset System.in stream
    }
}