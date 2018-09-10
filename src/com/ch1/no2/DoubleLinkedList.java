package com.ch1.no2;

/**
 * Created by BossNam on 2018. 9. 5..
 */
public class DoubleLinkedList {

    private Node rootNode;
    private int size;

    public DoubleLinkedList() {
        rootNode = new Node("first node");
        size = 1;
    }

    public void addNodeFromHead(String dataStr) {
        if(size == 0) {
            rootNode = new Node(dataStr);
            size++;
            return;
        }

        Node newNode = new Node(dataStr);
        newNode.setNextNode(rootNode);
        rootNode = newNode;
        rootNode.setPrevNode(null);
        size++;
    }

    public void addNodeFromTail(String dataStr) {
        if(size == 0) {
            rootNode = new Node(dataStr);
            size++;
            return;
        }

        Node newNode = new Node(dataStr);
        newNode.setPrevNode(findLastNode());
        findLastNode().setNextNode(newNode);
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
            rootNode = newNode;
            oldRootNode.setPrevNode(rootNode);
            rootNode.setNextNode(oldRootNode);

        } else if (index == size) {
            addNodeFromTail(dataStr);
            size--; // double cnt

        } else {
            Node newNode = new Node(dataStr);
            Node prevNodeOfnewNode = rootNode;
            for(int i=0; i<index-1; i++) {
                prevNodeOfnewNode = prevNodeOfnewNode.getNextNode();
            }
            Node nextNodeOfnewNode = prevNodeOfnewNode.getNextNode();

            prevNodeOfnewNode.setNextNode(newNode);
            newNode.setPrevNode(prevNodeOfnewNode);
            if(nextNodeOfnewNode != null) {
                newNode.setNextNode(nextNodeOfnewNode);
                nextNodeOfnewNode.setPrevNode(newNode);
            }
        }

        size++;
        return true;
    }

    public boolean deleteNodeFromHead() {
        if(size == 0) {
            return false;
        } else if(size == 1) {
            rootNode = null;
            size--;
            return true;
        } else {
            Node nextNode = rootNode.getNextNode();
            rootNode = nextNode;
            rootNode.setPrevNode(null);
            size--;
            return true;
        }
    }

    public boolean deleteNodeFromTail() {
        if(size == 0) {
            return false;
        } else if(size == 1) {
            rootNode = null;
            size--;
            return true;
        } else {
            Node node = this.rootNode;
            Node prevNode = null;
            while (isNextNodeExists(node)) {
                if(isNextNodeExists(node.getNextNode()))
                    node = node.getNextNode();
                else {
                    prevNode = node;
                    break;
                }
            }
            prevNode.setNextNode(null);
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
            this.rootNode = node;
            this.rootNode.setPrevNode(null);
            size--;
            return true;

        }  else if(index == size - 1 ) {
            return this.deleteNodeFromTail();

        } else {
            Node prevNode = this.rootNode;
            for(int i=0; i<index-1; i++) {
                prevNode = prevNode.getNextNode();
            }
            Node targetNode = prevNode.getNextNode();
            Node nextNode = null;
            nextNode = targetNode.getNextNode();
            prevNode.setNextNode(nextNode);
            nextNode.setPrevNode(prevNode);
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
        while (i <= size);
        System.out.println();
    }

    public void printNodesBackward(){
        if(size == 0) {
            System.out.println("There is no node!\n");
            return;
        }

        int i = 1;
        Node node = this.findLastNode();
        do {
            System.out.println("("+i+"/"+size + ") :: " + node.getDataStr());
            node = node.getPrevNode();
            i++;
        }
        while (i <= size);
        System.out.println();
    }

    private Node findLastNode() {
        if(size == 0)
            return null;

        Node node = this.rootNode;
        while (isNextNodeExists(node)) {
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
