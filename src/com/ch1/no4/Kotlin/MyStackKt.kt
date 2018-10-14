package com.ch1.no4.Kotlin

import java.util.*

/**
 * Created by BossNam on 2018. 10. 14..
 */
class MyStackKt {
    private var size: Int = 0
    private val container: MutableList<String>

    constructor() {
        this.size = 0
        this.container = ArrayList<String>()
    }

    fun getSize(): Int {
        return size
    }

    fun getContainer(): List<String> {
        return container
    }

    fun push(data: String) {
        this.container.add(data)
        this.size = container.size
    }

    fun pop(): String? {
        if (size == 0)
            return null

        size -= 1
        val returnStr = container[size]
        container.removeAt(size)
        return returnStr
    }

    fun printMyStack() {
        if (size == 0)
            println("There is no data!!")

        for (i in size - 1 downTo 0)
            println(container[i])
    }
}