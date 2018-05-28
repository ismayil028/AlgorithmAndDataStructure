package test;

import java.util.Arrays;

public class TheStack {

    private String[] stackArray;
    private int stackSize;
    private int topOfStack = -1;

    public TheStack(int size) {
        stackSize = size;
        stackArray = new String[size];
        Arrays.fill(stackArray, "-1");
    }

    public void push(String input) {
        if (topOfStack + 1 < stackSize) {
            topOfStack++;
            stackArray[topOfStack] = input;

        } else {
            System.out.println("Sorry Stack is Full");
        }
        displayTheStack();
        System.out.println("Push " + input + " was added to the Stack");
    }
    public void pushMany (String multipleValues){
    String[] tempStrings = multipleValues.split(" ");
        for (int i = 0; i < tempStrings.length; i++) {
            push(tempStrings[i]);
        }
    }
    public String pop() {
        if (topOfStack >= 0) {
            displayTheStack();
            System.out.println("Pop" + stackArray[topOfStack] + "Was Removed From the Stack");
            stackArray[topOfStack] = "-1";
            return stackArray[topOfStack--];
        } else {
            displayTheStack();
            System.out.println("Sorry but the Stack is empty");
            return "-1";
        }
    }
    public void popAll(){
        for (int i= topOfStack ; i>=0; i--){
        
            pop();}
    }
    public String peek() {
        displayTheStack();
        System.out.println("Peek " + stackArray[topOfStack] + " is at the Top of the Stack\n");
        return stackArray[topOfStack];
    }

    public static void main(String[] args) {
        TheStack stack = new TheStack(10);

        stack.pushMany("12 33 44 11 33 22 22");
        stack.displayTheStack();
    }

    private void displayTheStack() {

        for (int n = 0; n < 61; n++) {
            System.out.print("-");
        }

        System.out.println();

        for (int n = 0; n < stackSize; n++) {

            System.out.format("| %2s " + " ", n);

        }

        System.out.println("|");

        for (int n = 0; n < 61; n++) {
            System.out.print("-");
        }

        System.out.println();

        for (int n = 0; n < stackSize; n++) {

            if (stackArray[n].equals("-1")) {
                System.out.print("|     ");
            } else {
                System.out.print(String.format("| %2s " + " ", stackArray[n]));
            }

        }

        System.out.println("|");

        for (int n = 0; n < 61; n++) {
            System.out.print("-");
        }

        System.out.println();
    }
}
