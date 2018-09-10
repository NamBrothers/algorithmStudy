package com.ch1.no2;

/**
 * Created by BossNam on 2018. 9. 5..
 */
public class CircularLinkedList {

    private Node rootNode;
    private int size;

    public CircularLinkedList() {
        rootNode = new Node("first node");
        rootNode.setNextNode(rootNode);
        size = 1;
    }

    public void addNode(String dataStr) {
        if(size == 0) {
            rootNode = new Node(dataStr);
            size++;
            return;
        }

        Node newNode = new Node(dataStr);
        findLastNode().setNextNode(newNode);
        newNode.setNextNode(rootNode);
        size++;
    }

    public boolean addNode(int index, String dataStr) {
        if(index > size || index < 0)
            return false;

        else if(size == 0) {
            rootNode = new Node(dataStr);

        } else if(index == 0) {
            Node newNode = new Node(dataStr);
            Node oldRootNode = rootNode;
            findLastNode().setNextNode(newNode);
            rootNode = newNode;
            rootNode.setNextNode(oldRootNode);

        } else if (index == size) {
            addNode(dataStr);
            size--; // double cnt

        } else {
            Node newNode = new Node(dataStr);
            Node prevNodeOfnewNode = rootNode;
            for(int i=0; i<index-1; i++) {
                prevNodeOfnewNode = prevNodeOfnewNode.getNextNode();
            }
            Node nextNodeOfnewNode = prevNodeOfnewNode.getNextNode();

            prevNodeOfnewNode.setNextNode(newNode);
            if(nextNodeOfnewNode != null)
                newNode.setNextNode(nextNodeOfnewNode);
        }

        size++;
        return true;
    }

    public boolean deleteNode() {
        if(size == 0) {
            return false;
        } else if(size == 1) {
            rootNode = null;
            size--;
            return true;
        } else {
            Node prevNode = rootNode;
            for(int i=0; i<size-2; i++) {
                prevNode = prevNode.getNextNode();
            }

            prevNode.setNextNode(rootNode);
            size--;
            return true;
        }
    }

    public boolean deleteNode(int index) {
        if(size == 0 || index < 0 || index >= size) {
            return false;

        } else if(size == 1 && index == 0) {
            rootNode = null;
            size--;
            return true;

        } else if(index == 0) {
            Node node = this.rootNode.getNextNode();
            findLastNode().setNextNode(node);
            this.rootNode = node;
            size--;
            return true;

        }  else if(index == size - 1 ) {
            return this.deleteNode();

        } else {
            Node prevNode = this.rootNode;
            for(int i=0; i<index-1; i++) {
                prevNode = prevNode.getNextNode();
            }
            Node targetNode = prevNode.getNextNode();
            Node nextNode = null;
            nextNode = targetNode.getNextNode();
            prevNode.setNextNode(nextNode);
            size--;
            return true;
        }
    }

    public void printNodes(){
        if(size == 0) {
            System.out.println("There is no node!\n");
            return;
        }

        int i = 1;
        Node node = rootNode;
        do {
            System.out.println("("+i+"/"+size + ") :: " + node.getDataStr());
            node = node.getNextNode();
            i++;
        }
        while (node != rootNode);
        System.out.println();
    }

    private Node findLastNode() {
        if(size == 0)
            return null;

        Node node = this.rootNode;
        for(int i=0; i<size-1; i++) {
            node = node.getNextNode();
        }
        return node;
    }

    private boolean isNextNodeExists(Node node) {
        if (node.getNextNode() != null)
            return true;
        else
            return false;
    }


}
