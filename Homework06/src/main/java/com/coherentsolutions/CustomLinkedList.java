package com.coherentsolutions;

public class CustomLinkedList {
    /**
     * Main class to test the functionality of the Custom linked list
     * @param args
     */
    public static void main(String[] args) {
        //create the linked list
        MyLinkedList linkedList = new MyLinkedList();

        //add ew values for the list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        //print the original list after adding the values
        System.out.println("Original List:");
        linkedList.print();

        //remove value "3" from the list and print again
        linkedList.remove(3);
        System.out.println("List after removing 3:");
        linkedList.print();

        //add new value "8" to the list and print again
        linkedList.add(8);
        System.out.println("List after adding 8:");
        linkedList.print();

        //try to remove a number that is not in the list
        linkedList.remove(10);
        System.out.println("List after trying to remove 10 (but this element doesn't exist in the list:)");
        linkedList.print();

        //add a repeated number in the list
        linkedList.add(2);
        System.out.println("List after adding 2 (repeating number):");
        linkedList.print();

        //remove the repeated number
        linkedList.remove(2);
        System.out.println("List after removing 2 (repeating number):");
        linkedList.print();


    }

    /**
     * Node Class to represents a node in a linked list
     */
    static class Node {
        //the data stored in this node
        int data;
        //Reference to the next node
        Node next;

        /**
         * Constructor  for a new Node with specific data to store
         * @param data The data to be stored in this node
         */
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Class MyLinkedList that is the custom linked list implementation
     */
    static class MyLinkedList {
        //reference to the first node in the linked list
        Node head;

        /**
         * Method to add a new node with the specific data to the end of the linked list
         * @param data The data to be added to the linked list
         */
        public void add(int data) {
            //define the new node and use the constructor and include the data
            Node newNode = new Node(data);
            //if it is the first node in the linked list, set it as the head
            if (head==null){
                head = newNode;
            }
            else{
                // if there are existing nodes, traverse the list to find the last node
                Node currentNode = head;
                while (currentNode.next != null){
                    currentNode = currentNode.next;
                }
                //attach the new node to the last node's "next" reference,  effectively adding it to the end
                currentNode.next = newNode;
            }
        }

        /**
         * Method to remove the first occurrence of a node with the specific data
         * @param data The data to be removed
         */
        public void remove(int data) {
            //if the linked list is empty, there is nothing to remove
            if (head == null){
                return;
            }
            //if the data to be remove is in the first node, update the head to the next node
            if (head.data == data){
                head = head.next;
                return;
            }
            //Traverse the linked list to find the node with the data
            Node currentNode = head;
            while (currentNode.next != null && currentNode.next.data != data){
                currentNode = currentNode.next;
            }
            //if the node with the specified data is found, update the references to remove it
            if(currentNode.next != null){
                currentNode.next = currentNode.next.next;
            }
        }

        /**
         * Method to print the elements of the linked list
         */
        public void print() {
            //start at the head of the linked list
            Node currentNode = head;
            //traverse the linked list while printing the data of each node
            while (currentNode != null){
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }
}
