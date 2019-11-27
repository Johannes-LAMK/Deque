/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deque;

/**
 *
 * @author Johannes
 */
public class Deque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create mystack and push ten items
        MyStack<Integer> myStack = new MyStack();
        for (int i = 0; i < 10; i++) {
            myStack.push(i);
        }
        // Print before and after pop()
        System.out.println("MyStack:");
        System.out.println("Before popping: \t" + myStack + "\nisEmpty(): " + myStack.isEmpty());
        for (int i = 0; i < 5; i++) {
            myStack.pop();
        }
        System.out.println("After popping 5 x: \t" + myStack.toString());
        for (int i = 0; i < 5; i++) {
            myStack.pop();
        }
        System.out.println("After popping 5 x: \t" + myStack + "\nisEmpty(): " + myStack.isEmpty());
        System.out.println();
        System.out.println("MyQueue:");
        MyQueue<Integer> myQueue = new MyQueue();
        for (int i = 0; i < 10; i++) {
            myQueue.add(i);
        }
        System.out.println("Added 10 items: \t" + myQueue);

        for (int i = 0; i < 5; i++) {
            myQueue.remove();
        }
        System.out.println("removed 5 items: \t" + myQueue);
        System.out.println();
        
        // Add items to mylist
        System.out.println("MyList: ");
        MyList<Integer> myList = new MyList();
        for (int i = 0; i < 10; i++) {
            myList.add(i, i);
        }
        System.out.println("MyList before removing: \t" + myList);
        System.out.println("Get item in i = 5: " + myList.get(5));
        myList.remove(5);
        System.out.println("MyList after removing i = 5: \t" + myList);
        System.out.println("Get item in i = 5: " + myList.get(5));
        myList.remove(3);
        System.out.println("MyList after removing i = 3: \t" + myList);

        System.out.println("Get item in i = 5: " + myList.get(5));
    }

}
