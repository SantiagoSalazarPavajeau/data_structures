package com.santiago.datastructuresalgorithms;
import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertTrue;

public class StackTest {
    @Test
    public void stack_IsEmpty(){
        //Setup

        //exec
        Stack stack = new Stack();
        // Assert
        assertTrue("stack is empty", stack.isEmpty() );
    }

    @Test
    public void stack_push_AddsNewObjectToTop(){
        //Setup
        Stack stack = new Stack();
        int expectedSize = 2;
        //Exec

        stack.push(1);
        stack.push(2);

        assertEquals("is size 2 after pushing two items", expectedSize, stack.getSize());
    }

    @Test
    public  void stack_peek_ReturnsTheTopObjectButLeavesIt(){
        //Setup
        Stack stack = new Stack();
        String top = "top";

        // exec
        stack.push(top);

        assertEquals("Returns top element without erasing it", top, stack.peek());
    }

    @Test
    public void stack_pop_RemovesTopItemAndReturnsIt(){
        Stack stack= new Stack();
        String expected = "second";
        int expectedSize = 1;


        stack.push("first");
        stack.push("second");


        assertEquals("return second item we added", expected, stack.pop());
        assertEquals("is size 1", expectedSize, stack.getSize());

    }
}

