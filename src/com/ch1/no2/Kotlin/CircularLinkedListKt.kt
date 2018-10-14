package com.ch1.no2.Kotlin


/**
 * Created by BossNam on 2018. 10. 14..
 */
class CircularLinkedListKt {

    private var rootNode: NodeKt? = null
    private var size: Int = 0

    constructor() {
        rootNode = NodeKt("first node")
        rootNode!!.nextNodeKt = rootNode
        size = 1
    }

    fun addNode(dataStr: String) {
        if (size == 0) {
            rootNode = NodeKt(dataStr)
            size++
            return
        }

        val newNode = NodeKt(dataStr)
        findLastNode()!!.nextNodeKt = newNode
        newNode.nextNodeKt = rootNode
        size++
    }

    fun addNode(index: Int, dataStr: String): Boolean {
        if (index > size || index < 0)
            return false
        else if (size == 0) {
            rootNode = NodeKt(dataStr)

        } else if (index == 0) {
            val newNode = NodeKt(dataStr)
            val oldRootNode = rootNode
            findLastNode()!!.nextNodeKt = newNode
            rootNode = newNode
            rootNode!!.nextNodeKt = oldRootNode

        } else if (index == size) {
            addNode(dataStr)
            size-- // double cnt

        } else {
            val newNode = NodeKt(dataStr)
            var prevNodeOfnewNode: NodeKt = rootNode!!
            for (i in 0..index - 1 - 1) {
                prevNodeOfnewNode = prevNodeOfnewNode.nextNodeKt!!
            }
            val nextNodeOfnewNode = prevNodeOfnewNode.nextNodeKt

            prevNodeOfnewNode.nextNodeKt = newNode
            if (nextNodeOfnewNode != null)
                newNode.nextNodeKt = nextNodeOfnewNode
        }

        size++
        return true
    }

    fun deleteNode(): Boolean {
        if (size == 0) {
            return false
        } else if (size == 1) {
            rootNode = null
            size--
            return true
        } else {
            var prevNode: NodeKt = rootNode!!
            for (i in 0..size - 2 - 1) {
                prevNode = prevNode.nextNodeKt!!
            }

            prevNode.nextNodeKt = rootNode
            size--
            return true
        }
    }

    fun deleteNode(index: Int): Boolean {
        if (size == 0 || index < 0 || index >= size) {
            return false

        } else if (size == 1 && index == 0) {
            rootNode = null
            size--
            return true

        } else if (index == 0) {
            val node = this.rootNode!!.nextNodeKt
            findLastNode()!!.nextNodeKt = node
            this.rootNode = node
            size--
            return true

        } else if (index == size - 1) {
            return this.deleteNode()

        } else {
            var prevNode: NodeKt = this.rootNode!!
            for (i in 0..index - 1 - 1) {
                prevNode = prevNode.nextNodeKt!!
            }
            val targetNode = prevNode.nextNodeKt
            var nextNode: NodeKt? = null
            nextNode = targetNode!!.nextNodeKt
            prevNode.nextNodeKt = nextNode
            size--
            return true
        }
    }

    fun printNodes() {
        if (size == 0) {
            println("There is no node!\n")
            return
        }

        var i = 1
        var node = rootNode
        do {
            println("(" + i + "/" + size + ") :: " + node!!.dataStr)
            node = node!!.nextNodeKt
            i++
        } while (node !== rootNode)
        println()
    }

    private fun findLastNode(): NodeKt? {
        if (size == 0)
            return null

        var node: NodeKt = this.rootNode!!
        for (i in 0..size - 1 - 1) {
            node = node.nextNodeKt!!
        }
        return node
    }

    private fun isNextNodeExists(node: NodeKt): Boolean {
        if (node.nextNodeKt != null)
            return true
        else
            return false
    }
}