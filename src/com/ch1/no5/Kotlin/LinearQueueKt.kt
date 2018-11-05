package com.ch1.no5.Kotlin

import com.ch1.no5.DataKt

/**
 * Created by BossNam on 2018. 11. 5..
 */
class LinearQueueKt {
    private val size: Int?
    private val dataKtAry: Array<DataKt?>
    private var front: Int = 0// 데이터 추출 위치
    private var rear: Int = 0 // 데이터 추가 위치

    constructor(size: Int) {
        this.size = size
        this.dataKtAry = arrayOfNulls<DataKt>(size)
        this.front = 0
        this.rear = 0
    }

    fun enqueue(dataKt: DataKt): Boolean {
        if (this.isQueueFull()) {
            return false
        }

        this.dataKtAry[rear] = dataKt
        println(rear.toString() + "방에 " + dataKt.intData + "데이터를 추가했습니다.")
        rear += 1
        return true
    }

    fun dequque(): DataKt? {
        if (this.isQueueEmpty()) {
            return null
        }

        val res = this.dataKtAry[front]
        this.dataKtAry[front] = null
        println(front.toString() + "방의 " + res!!.intData + "데이터를 추출했습니다.")
        front += 1
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
        if (rear == size) {
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
            cntFront = cntFront + 1
        }


    }
}