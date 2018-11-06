package com.ch1.no5.Kotlin

import com.ch1.no5.DataKt

/**
 * Created by BossNam on 2018. 11. 5..
 */
class CirculaQueueKt(var size: Int) {
    private var dataKtAry: Array<DataKt?> = arrayOfNulls(size)
    private var front: Int = 0// 데이터 추출 위치
    private var rear: Int = 0 // 데이터 추가 위치

    fun enqueue(dataKt: DataKt): Boolean {
        if (this.isQueueFull()) {
            return false
        }

        this.dataKtAry[rear] = dataKt
        println(rear.toString() + "방에 " + dataKt.intData + "데이터를 추가했습니다.")
        rear = (rear + 1) % size
        return true
    }

    fun dequque(): DataKt? {
        if (this.isQueueEmpty()) {
            return null
        }

        val res = this.dataKtAry[front]
        this.dataKtAry[front] = null
        println(front.toString() + "방의 " + res.toString() + "데이터를 추출했습니다.")
        front = (front + 1) % size
        return res
    }

    fun isQueueEmpty(): Boolean {
        if (front == rear) {
            println("큐가 비어있습니다.")
            return true
        }

        return false
    }

    fun isQueueFull(): Boolean {
        if (front != 0 && front - 1 == rear) {
            println("큐가 꽉 차있습니다.")
            return true
        } else if (front == 0 && rear == size.minus(1)) {
            println("큐가 꽉 차있습니다.")
            return true
        }

        return false
    }

    fun displayQueue() {
        if (this.isQueueEmpty()) {
            return
        }

        var cntFront = this.front

        while (cntFront != this.rear) {
            println(cntFront.toString() + "번 방의 데이터 : " + dataKtAry[cntFront]!!.intData)
            cntFront = (cntFront + 1) % size
        }
    }
}
