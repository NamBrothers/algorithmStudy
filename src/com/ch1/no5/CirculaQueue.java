package com.ch1.no5;

/**
 * Created by BossNam on 2018. 11. 5..
 * 원형큐: 데이터가 끝까지 차더라도 dequque 시 계속 이용할 수 있다
 */
public class CirculaQueue {
    private int size;
    private DataKt[] dataAry;
    private int front;// 데이터 추출 위치
    private int rear; // 데이터 추가 위치

    public CirculaQueue(int size){
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
        rear = (rear+1)%size;
        return true;
    }

    public DataKt dequque(){
        if(this.isQueueEmpty()){
            return null;
        }

        DataKt res = this.dataAry[front];
        this.dataAry[front]=null;
        System.out.println(front+"방의 "+res.getIntData()+"데이터를 추출했습니다.");
        front = (front+1)%size;
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
        if(front != 0 && front-1 == rear){
            System.out.println("큐가 꽉 차있습니다.");
            return true;
        }
        else if(front == 0 && rear == size-1){
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
            cntFront = (cntFront+1)%size;
        }


    }
}
