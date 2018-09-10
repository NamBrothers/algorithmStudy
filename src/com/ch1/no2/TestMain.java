package com.ch1.no2;

/**
 * Created by BossNam on 2018. 9. 6..
 */
public class TestMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.printNodes();

        linkedList.addNode("Hello, ");
        linkedList.addNode("Node!");
        linkedList.printNodes();

        linkedList.deleteNode();
        linkedList.deleteNode();
        linkedList.deleteNode();
        linkedList.deleteNode();
        linkedList.deleteNode();
        linkedList.printNodes();

        //You're gonna see me in a new light
        linkedList.addNode("You're");
        linkedList.addNode("gonna");
        linkedList.addNode("see me in");
        linkedList.addNode("new light");
        linkedList.addNode(3, "a");
        linkedList.printNodes();

        linkedList.deleteNode(2);
        linkedList.printNodes();
    }
}
