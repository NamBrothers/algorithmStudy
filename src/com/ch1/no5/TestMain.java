package com.ch1.no5;

/**
 * Created by BossNam on 2018. 11. 5..
 */
public class TestMain {
    public static void main(String[] args) {
        System.out.println("============== Linear Queue ==============");
        LinearQueue linearQueue = new LinearQueue(5);
        linearQueue.displayQueue(); // 큐가 비어있습니다.
        System.out.println();

        linearQueue.enqueue(new DataKt(3)); //0방에 3데이터를 추가했습니다.
        linearQueue.enqueue(new DataKt(4)); //1방에 4데이터를 추가했습니다.
        linearQueue.displayQueue();       //0번 방의 데이터 : 3
        System.out.println();             //1번 방의 데이터 : 4


        linearQueue.dequque();      //0방의 3데이터를 추출했습니다.
        linearQueue.displayQueue(); //1번 방의 데이터 : 4
        System.out.println();

        linearQueue.dequque(); //1방의 4데이터를 추출했습니다.
        linearQueue.dequque(); //큐가 비어있습니다.
        System.out.println();

        linearQueue.enqueue(new DataKt(1));    //2방에 1데이터를 추가했습니다.
        linearQueue.enqueue(new DataKt(11));   //3방에 11데이터를 추가했습니다.
        linearQueue.enqueue(new DataKt(111));  //4방에 111데이터를 추가했습니다.
        linearQueue.enqueue(new DataKt(1111)); //큐가 꽉 차있습니다.
        linearQueue.displayQueue();          //2번 방의 데이터 : 1
        System.out.println();                //3번 방의 데이터 : 11
                                             //4번 방의 데이터 : 111

        linearQueue.dequque();      //2방의 1데이터를 추출했습니다.
        linearQueue.dequque();      //3방의 11데이터를 추출했습니다.
        linearQueue.dequque();      //4방의 111데이터를 추출했습니다.
        linearQueue.dequque();      //큐가 비어있습니다.
        linearQueue.dequque();      //큐가 비어있습니다.
        linearQueue.dequque();      //큐가 비어있습니다.
        linearQueue.displayQueue(); //큐가 비어있습니다.
        System.out.println();
        System.out.println();


        System.out.println("============== Circular Queue ==============");
        CirculaQueue circulaQueue = new CirculaQueue(5);
        circulaQueue.displayQueue(); // 큐가 비어있습니다.
        System.out.println();

        circulaQueue.enqueue(new DataKt(3)); //0방에 3데이터를 추가했습니다.
        circulaQueue.enqueue(new DataKt(4)); //1방에 4데이터를 추가했습니다.
        circulaQueue.displayQueue();       //0번 방의 데이터 : 3
        System.out.println();              //1번 방의 데이터 : 4


        circulaQueue.dequque();      //0방의 3데이터를 추출했습니다.
        circulaQueue.displayQueue(); //1번 방의 데이터 : 4
        System.out.println();

        circulaQueue.dequque(); //1방의 4데이터를 추출했습니다.
        circulaQueue.dequque(); //큐가 비어있습니다.
        System.out.println();

        circulaQueue.enqueue(new DataKt(1));    //2방에 1데이터를 추가했습니다.
        circulaQueue.enqueue(new DataKt(11));   //3방에 11데이터를 추가했습니다.
        circulaQueue.enqueue(new DataKt(111));  //4방에 111데이터를 추가했습니다.
        circulaQueue.enqueue(new DataKt(1111)); //0방에 1111데이터를 추가했습니다.
        circulaQueue.displayQueue();          //2번 방의 데이터 : 1
        System.out.println();                 //3번 방의 데이터 : 11
                                              //4번 방의 데이터 : 111
                                              //0번 방의 데이터 : 1111

        circulaQueue.dequque();      //2방의 1데이터를 추출했습니다.
        circulaQueue.dequque();      //3방의 11데이터를 추출했습니다.
        circulaQueue.dequque();      //4방의 111데이터를 추출했습니다.
        circulaQueue.dequque();      //0방의 1111데이터를 추출했습니다.
        circulaQueue.dequque();      //큐가 비어있습니다.
        circulaQueue.dequque();      //큐가 비어있습니다.
        circulaQueue.displayQueue(); //큐가 비어있습니다.
        System.out.println();
        System.out.println();
    }
}
