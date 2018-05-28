/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Arrays;

/**
 *
 * @author ismayil
 */
public class TheQueue {

    private String[] queueArray;
    private int queueSize;
    private int front, rear, numberOfItems = 0;

    public TheQueue(int size) {
        queueSize = size;
        queueArray = new String[size];
        Arrays.fill(queueArray, "-1");
    }

    public void insert(String input) {
        if (numberOfItems + 1 <= queueSize) {
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
            System.out.println("Insert " + input + " Was Added to the Queue\n");
        } else {
            System.out.println("Sorry but the queue is full");
        }
    }
    public void priorityInsert(String input){
        int i;
        if(numberOfItems==0){
            insert(input);
        }else{
            for (i = numberOfItems-1; i >= 0; i--) {
                
            }
        }
    }
    public void remove() {
        if (numberOfItems > 0) {
            System.out.println("Remove " + queueArray[front] + " Was removed");
            queueArray[front] = "-1";
            front++;
            numberOfItems--;
        } else {
            System.out.println("Sorry But the Queue is Empty");
        }

    }

    public static void main(String[] args) {
        TheQueue theQueue = new TheQueue(10);
        theQueue.insert("10");
        theQueue.insert("15");
        theQueue.insert("11");
        theQueue.displayTheQueue();
        theQueue.remove();
        theQueue.displayTheQueue();
        theQueue.peek();
    }

    private void displayTheQueue() {
        for (int n = 0; n < 61; n++) {
            System.out.print("-");
        }

        System.out.println();

        for (int n = 0; n < queueSize; n++) {

            System.out.format("| %2s " + " ", n);

        }

        System.out.println("|");

        for (int n = 0; n < 61; n++) {
            System.out.print("-");
        }

        System.out.println();

        for (int n = 0; n < queueSize; n++) {

            if (queueArray[n].equals("-1")) {
                System.out.print("|     ");
            } else {
                System.out.print(String.format("| %2s " + " ", queueArray[n]));
            }

        }

        System.out.println("|");

        for (int n = 0; n < 61; n++) {
            System.out.print("-");
        }

        System.out.println();

        // Number of spaces to put before the F
        int spacesBeforeFront = 3 * (2 * (front + 1) - 1);

        for (int k = 1; k < spacesBeforeFront; k++) {
            System.out.print(" ");
        }

        System.out.print("F");

        // Number of spaces to put before the R
        int spacesBeforeRear = (2 * (3 * rear) - 1) - (spacesBeforeFront);

        for (int l = 0; l < spacesBeforeRear; l++) {
            System.out.print(" ");
        }

        System.out.print("R");

        System.out.println("\n");
    }

    private void peek() {
        System.out.println("The First Element is "+ queueArray[front]);
    }
}
