package com.ch1.no5

import com.ch1.no5.Kotlin.CirculaQueueKt
import com.ch1.no5.Kotlin.LinearQueueKt

object TestMainKt {
    @JvmStatic
    fun main(args: Array<String>) {
        println("============== Linear Queue ==============")
        val linearQueue = LinearQueueKt(5)
        linearQueue.displayQueue() // 큐가 비어있습니다.
        println()

        linearQueue.enqueue(DataKt(3)) //0방에 3데이터를 추가했습니다.
        linearQueue.enqueue(DataKt(4)) //1방에 4데이터를 추가했습니다.
        linearQueue.displayQueue()     //0번 방의 데이터 : 3
        println()                      //1번 방의 데이터 : 4


        linearQueue.dequque()      //0방의 3데이터를 추출했습니다.
        linearQueue.displayQueue() //1번 방의 데이터 : 4
        println()

        linearQueue.dequque() //1방의 4데이터를 추출했습니다.
        linearQueue.dequque() //큐가 비어있습니다.
        println()

        linearQueue.enqueue(DataKt(1))    //2방에 1데이터를 추가했습니다.
        linearQueue.enqueue(DataKt(11))   //3방에 11데이터를 추가했습니다.
        linearQueue.enqueue(DataKt(111))  //4방에 111데이터를 추가했습니다.
        linearQueue.enqueue(DataKt(1111)) //큐가 꽉 차있습니다.
        linearQueue.displayQueue()        //2번 방의 데이터 : 1
        println()                         //3번 방의 데이터 : 11
                                          //4번 방의 데이터 : 111

        linearQueue.dequque()      //2방의 1데이터를 추출했습니다.
        linearQueue.dequque()      //3방의 11데이터를 추출했습니다.
        linearQueue.dequque()      //4방의 111데이터를 추출했습니다.
        linearQueue.dequque()      //큐가 비어있습니다.
        linearQueue.dequque()      //큐가 비어있습니다.
        linearQueue.dequque()      //큐가 비어있습니다.
        linearQueue.displayQueue() //큐가 비어있습니다.
        println()
        println()


        println("============== Circular Queue ==============")
        val circulaQueue = CirculaQueueKt(5)
        circulaQueue.displayQueue() // 큐가 비어있습니다.
        println()

        circulaQueue.enqueue(DataKt(3)) //0방에 3데이터를 추가했습니다.
        circulaQueue.enqueue(DataKt(4)) //1방에 4데이터를 추가했습니다.
        circulaQueue.displayQueue()     //0번 방의 데이터 : 3
        println()                       //1번 방의 데이터 : 4


        circulaQueue.dequque()      //0방의 3데이터를 추출했습니다.
        circulaQueue.displayQueue() //1번 방의 데이터 : 4
        println()

        circulaQueue.dequque() //1방의 4데이터를 추출했습니다.
        circulaQueue.dequque() //큐가 비어있습니다.
        println()

        circulaQueue.enqueue(DataKt(1))    //2방에 1데이터를 추가했습니다.
        circulaQueue.enqueue(DataKt(11))   //3방에 11데이터를 추가했습니다.
        circulaQueue.enqueue(DataKt(111))  //4방에 111데이터를 추가했습니다.
        circulaQueue.enqueue(DataKt(1111)) //0방에 1111데이터를 추가했습니다.
        circulaQueue.displayQueue()        //2번 방의 데이터 : 1
        println()                          //3번 방의 데이터 : 11
                                           //4번 방의 데이터 : 111
                                           //0번 방의 데이터 : 1111

        circulaQueue.dequque()      //2방의 1데이터를 추출했습니다.
        circulaQueue.dequque()      //3방의 11데이터를 추출했습니다.
        circulaQueue.dequque()      //4방의 111데이터를 추출했습니다.
        circulaQueue.dequque()      //0방의 1111데이터를 추출했습니다.
        circulaQueue.dequque()      //큐가 비어있습니다.
        circulaQueue.dequque()      //큐가 비어있습니다.
        circulaQueue.displayQueue() //큐가 비어있습니다.
        println()
        println()
    }
}
