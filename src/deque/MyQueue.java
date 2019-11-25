/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deque;

import java.util.ArrayDeque;
import java.util.Deque;
/**
 *
 * @author Johannes
 */
public class MyQueue {

    private final Deque<Integer> items;

    MyQueue() {
        this.items = new ArrayDeque<>();
    }

    public void add(Integer item) {
        items.addLast(item);
    }

    public void remove() {
        items.removeFirst();
    }

    @Override
    public String toString() {
        return items.toString();
    }
}
