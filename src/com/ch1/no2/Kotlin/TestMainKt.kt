package com.ch1.no2.Kotlin

/**
 * Created by BossNam on 2018. 10. 14..
 */
object TestMainKt {
    @JvmStatic
    fun main(args: Array<String>) {
        println("============ Example no 1 (Linked List) ============")
        var linkedList = LinkedListKt()
        linkedList.printNodes()

        linkedList.addNode("Hello, ")
        linkedList.addNode("Node!")
        linkedList.printNodes()

        linkedList.deleteNode()
        linkedList.deleteNode()
        linkedList.deleteNode()
        linkedList.deleteNode()
        linkedList.deleteNode()
        linkedList.printNodes()

        //You're gonna see me in a new light
        linkedList.addNode("You're")
        linkedList.addNode("gonna")
        linkedList.addNode("see me in")
        linkedList.addNode("new light")
        linkedList.addNode(3, "a")
        linkedList.printNodes()

        linkedList.deleteNode(2)
        linkedList.printNodes()

        println("============ Example no 2 (Circular Linked List) ============")
        var circularLinkedList = CircularLinkedListKt()
        circularLinkedList.printNodes()

        circularLinkedList.addNode("Hello, ")
        circularLinkedList.addNode("Node!")
        circularLinkedList.printNodes()

        circularLinkedList.deleteNode()
        circularLinkedList.deleteNode()
        circularLinkedList.deleteNode()
        circularLinkedList.deleteNode()
        circularLinkedList.deleteNode()
        circularLinkedList.printNodes()

        //You're gonna see me in a new light
        circularLinkedList.addNode("You're")
        circularLinkedList.addNode("gonna")
        circularLinkedList.addNode("see me in")
        circularLinkedList.addNode("new light")
        circularLinkedList.addNode(3, "a")
        circularLinkedList.printNodes()

        circularLinkedList.deleteNode(2)
        circularLinkedList.printNodes()


        println("\n============ Example no 3 (Double Linked List) ============")
        var doubleLinkedList = DoubleLinkedListKt()
        doubleLinkedList.printNodes()

        doubleLinkedList.addNodeFromHead("Hello, ")
        doubleLinkedList.addNodeFromHead("Node!")
        doubleLinkedList.printNodes()

        doubleLinkedList.deleteNodeFromTail()
        doubleLinkedList.printNodes()

        doubleLinkedList.deleteNodeFromHead()
        doubleLinkedList.printNodes()

        //You're gonna see me in a new light
        doubleLinkedList.addNodeFromTail("You're")
        doubleLinkedList.addNodeFromTail("gonna")
        doubleLinkedList.addNodeFromTail("see me in")
        doubleLinkedList.addNodeFromTail("new light")
        doubleLinkedList.addNode(4, "a")
        doubleLinkedList.printNodes()

        doubleLinkedList.deleteNode(4)
        doubleLinkedList.printNodesBackward()
    }
}