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
public class MyList {

    private final Deque<Integer> items;

    MyList() {
        this.items = new ArrayDeque<>();
    }

    public void add(int item, int index) {
        Object[] toArray = items.toArray();
        if (toArray.length > 0) {
            int[] arr = new int[toArray.length + 1];
            for (int i = 0; i < arr.length; i++) {
                if (index == i) {
                    arr[i] = item;
                } else {
                    arr[i] = (int) toArray[i];
                }
            }
            items.clear();
            for (int i = 0; i < arr.length; i++) {
                items.add(arr[i]);
            }
        } else {
            items.add(item);
        }
    }

    public Integer get(int index) {
        Object[] arr = items.toArray();
        return (Integer) arr[index];
    }

    public void remove(int index) {
        Object[] toArray = items.toArray();
        if (toArray.length > 0) {
            int[] arr = new int[toArray.length];
            for (int i = 0; i < arr.length; i++) {
                if (index != i) {
                    arr[i] = (int) toArray[i];
                }
            }
            items.clear();
            for (int i = 0; i < arr.length; i++) {
                if (index != i) {
                    items.add(arr[i]);
                }
            }
        } else {
            System.out.println("No items to remove");
        }
    }

    @Override
    public String toString() {
        return items.toString();
    }
}
