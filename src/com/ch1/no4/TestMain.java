package com.ch1.no4;

/**
 * Created by BossNam on 2018. 9. 16..
 */
public class TestMain {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.printMyStack();
        System.out.println();

        //You're gonna see me in a new light
        myStack.push("You're");
        myStack.push("gonna");
        myStack.push("see me in");
        myStack.push("a");
        myStack.push("new light");

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());


    }
}
