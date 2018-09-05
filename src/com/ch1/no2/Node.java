package com.ch1.no2;

/**
 * Created by BossNam on 2018. 9. 5..
 */
public class Node {
   private String dataStr;
   private Node nextNode;
   private Node prevNode;

   public Node(String dataStr) {
      this.dataStr = dataStr;
   }

   public Node(String dataStr, Node nextNode) {
      this.dataStr = dataStr;
      this.nextNode = nextNode;
   }

   public Node(String dataStr, Node nextNode, Node prevNode) {
      this.dataStr = dataStr;
      this.nextNode = nextNode;
      this.prevNode = prevNode;
   }

   public String getDataStr() {
      return dataStr;
   }

   public void setDataStr(String dataStr) {
      this.dataStr = dataStr;
   }

   public Node getNextNode() {
      return nextNode;
   }

   public void setNextNode(Node nextNode) {
      this.nextNode = nextNode;
   }

   public Node getPrevNode() {
      return prevNode;
   }

   public void setPrevNode(Node prevNode) {
      this.prevNode = prevNode;
   }

   @Override
   public String toString() {
      return "Node{" +
              "dataStr='" + dataStr + '\'' +
              '}';
   }
}

