package com.ch1.no2.Kotlin

/**
 * Created by BossNam on 2018. 10. 14..
 */
class DoubleLinkedListKt {
    private var rootNode: NodeKt? = null
    private var size: Int = 0

    constructor() {
        rootNode = NodeKt("first node")
        size = 1
    }

    fun addNodeFromHead(dataStr: String) {
        if (size == 0) {
            rootNode = NodeKt(dataStr)
            size++
            return
        }

        val newNode = NodeKt(dataStr)
        newNode.nextNodeKt = rootNode
        rootNode = newNode
        rootNode!!.prevNodeKt = null
        size++
    }

    fun addNodeFromTail(dataStr: String) {
        if (size == 0) {
            rootNode = NodeKt(dataStr)
            size++
            return
        }

        val newNode = NodeKt(dataStr)
        newNode.prevNodeKt = findLastNode()
        findLastNode()!!.nextNodeKt = newNode
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
            rootNode = newNode
            oldRootNode!!.prevNodeKt = rootNode
            rootNode!!.nextNodeKt = oldRootNode

        } else if (index == size) {
            addNodeFromTail(dataStr)
            size-- // double cnt

        } else {
            val newNode = NodeKt(dataStr)
            var prevNodeOfnewNode: NodeKt = rootNode!!
            for (i in 0..index - 1 - 1) {
                prevNodeOfnewNode = prevNodeOfnewNode.nextNodeKt!!
            }
            val nextNodeOfnewNode = prevNodeOfnewNode.nextNodeKt

            prevNodeOfnewNode.nextNodeKt = newNode
            newNode.prevNodeKt = prevNodeOfnewNode
            if (nextNodeOfnewNode != null) {
                newNode.nextNodeKt = nextNodeOfnewNode
                nextNodeOfnewNode.prevNodeKt = newNode
            }
        }

        size++
        return true
    }

    fun deleteNodeFromHead(): Boolean {
        if (size == 0) {
            return false
        } else if (size == 1) {
            rootNode = null
            size--
            return true
        } else {
            val nextNode = rootNode!!.nextNodeKt
            rootNode = nextNode
            rootNode!!.prevNodeKt = null
            size--
            return true
        }
    }

    fun deleteNodeFromTail(): Boolean {
        if (size == 0) {
            return false
        } else if (size == 1) {
            rootNode = null
            size--
            return true
        } else {
            var node: NodeKt = this.rootNode!!
            var prevNode: NodeKt? = null
            while (isNextNodeExists(node)) {
                if (isNextNodeExists(node.nextNodeKt!!))
                    node = node.nextNodeKt!!
                else {
                    prevNode = node
                    break
                }
            }
            prevNode!!.nextNodeKt = null
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
            this.rootNode = node
            this.rootNode!!.prevNodeKt = null
            size--
            return true

        } else if (index == size - 1) {
            return this.deleteNodeFromTail()

        } else {
            var prevNode: NodeKt = this.rootNode!!
            for (i in 0..index - 1 - 1) {
                prevNode = prevNode.nextNodeKt!!
            }
            val targetNode = prevNode.nextNodeKt
            var nextNode: NodeKt? = null
            nextNode = targetNode!!.nextNodeKt
            prevNode.nextNodeKt = nextNode
            nextNode!!.prevNodeKt = prevNode
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
        } while (i <= size)
        println()
    }

    fun printNodesBackward() {
        if (size == 0) {
            println("There is no node!\n")
            return
        }

        var i = 1
        var node = this.findLastNode()
        do {
            println("(" + i + "/" + size + ") :: " + node!!.dataStr)
            node = node!!.prevNodeKt
            i++
        } while (i <= size)
        println()
    }

    private fun findLastNode(): NodeKt? {
        if (size == 0)
            return null

        var node: NodeKt = this.rootNode!!
        while (isNextNodeExists(node)) {
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