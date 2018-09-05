package com.ch1.no2;

/**
 * Created by BossNam on 2018. 9. 6..
 */
public class TestMain {
    public static void main(String[] args) {
        OneWayList oneWayList = new OneWayList();
        oneWayList.printNodes();

        oneWayList.addNode("Hello, ");
        oneWayList.addNode("Node!");
        oneWayList.printNodes();

        oneWayList.deleteNode();
        oneWayList.deleteNode();
        oneWayList.deleteNode();
        oneWayList.deleteNode();
        oneWayList.deleteNode();
        oneWayList.printNodes();

        //You're gonna see me in a new light
        oneWayList.addNode("You're");
        oneWayList.addNode("gonna");
        oneWayList.addNode("see me in");
        oneWayList.addNode("new light");
        oneWayList.addNode(3, "a");
        oneWayList.printNodes();
    }
}
