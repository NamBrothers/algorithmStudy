package com.ch1.no3;

/**
 * Created by BossNam on 2018. 9. 16..
 */
public class TestMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.printArray();
        System.out.println();

        //You're gonna see me in a new light
        myArray.addData("You're");
        myArray.addData("gonna");
        myArray.addData("see me in");
        myArray.addData("new light");
        myArray.addData(4, "a");
        myArray.printArray();
        System.out.println();

        myArray.deleteData(0);
        myArray.printArray();
        System.out.println();
    }
}
