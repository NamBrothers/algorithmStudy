package com.ch1.no5;

/**
 * Created by BossNam on 2018. 11. 5..
 * 선형큐: 한 번 rear가 끝까지 차면 다시 이용할 수 없다
 */
public class LinearQueue {
    private int size;
    private DataKt[] dataAry;
    private int front;// 데이터 추출 위치
    private int rear; // 데이터 추가 위치

    public LinearQueue(int size){
        this.size = size;
        this.dataAry = new DataKt[size];
        this.front = 0;
        this.rear = 0;
    }

    public boolean enqueue(DataKt data){
        if(this.isQueueFull()){
            return false;
        }

        this.dataAry[rear]=data;
        System.out.println(rear+"방에 "+data.getIntData()+"데이터를 추가했습니다.");
        rear += 1;
        return true;
    }

    public DataKt dequque(){
        if(this.isQueueEmpty()){
            return null;
        }

        DataKt res = this.dataAry[front];
        this.dataAry[front]=null;
        System.out.println(front+"방의 "+res.getIntData()+"데이터를 추출했습니다.");
        front += 1;
        return res;
    }

    public boolean isQueueEmpty(){
        if(front == rear){
            System.out.println("큐가 비어있습니다.");
            return true;
        }

        return false;
    }

    public boolean isQueueFull(){
        if(rear == size){
            System.out.println("큐가 꽉 차있습니다.");
            return true;
        }

        return false;
    }

    public void displayQueue(){
        if(this.isQueueEmpty()){
            return;
        }

        int cntFront = this.front;

        while(cntFront != this.rear){
            System.out.println(cntFront+"번 방의 데이터 : "+dataAry[cntFront].getIntData());
            cntFront = cntFront+1;
        }


    }
}
