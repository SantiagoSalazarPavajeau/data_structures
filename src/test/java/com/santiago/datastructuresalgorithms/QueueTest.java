package com.santiago.datastructuresalgorithms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QueueTest {
    @Test
    public void queueReturnsTrue_WhenInitializedIsEmpty(){
        Queue queue = new Queue();
        assertTrue(queue.isEmpty(),"Returns true when queue is empty");
    }

    @Test
    public void addsValuesToQueue_WithAddMethod(){
        Queue queue = new Queue();
        int expected = 2;
        queue.add(2);
        int actual = queue.peek();
        assertEquals(expected,actual,"Expected value of 2 when we add 2 to queue");
    }

    @Test
    public void queueReturnsHeadData_WhenPeekIsCalled(){
        Queue queue = new Queue();
        int expected = 3;
        queue.add(3);
        queue.add(9);
        queue.add(7);
        int actual = queue.peek();
        assertEquals(expected, actual, "Queue returned 3 when we peak for head data");
    }

    @Test
    public void deletesAtTheStartOfTheQueue_WhenDeleteIsCalled(){
        Queue queue = new Queue();
        int expected = 4;
        queue.add(4);
        queue.add(6);
        queue.add(7);
        queue.add(5);
        int actual = queue.remove();
        assertEquals(expected, actual, "Returns first value when we call remove method");
    }
}
