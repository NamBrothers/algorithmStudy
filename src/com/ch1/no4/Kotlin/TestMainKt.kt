package com.ch1.no4.Kotlin


/**
 * Created by BossNam on 2018. 10. 14..
 */
object TestMainKt {
    @JvmStatic
    fun main(args: Array<String>) {
        val myStack = MyStackKt()
        myStack.printMyStack()
        println()

        //You're gonna see me in a new light
        myStack.push("You're")
        myStack.push("gonna")
        myStack.push("see me in")
        myStack.push("a")
        myStack.push("new light")

        println(myStack.pop())
        println(myStack.pop())
        println(myStack.pop())
        println(myStack.pop())
        println(myStack.pop())
        println(myStack.pop())
        println(myStack.pop())
    }
}