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
class MyStack {

    private final Deque<Integer> items;

    MyStack() {
        this.items = new ArrayDeque<>();
    }

    public Integer pop() {
        return items.removeFirst();
    }

    public void push(Integer item) {
        items.addFirst(item);
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }

    @Override
    public String toString() {
        return items.toString();
    }
}
