package jspservlet;

import java.util.Arrays;

class MyCircularQueue {
    private int lenth;
    private int head;
    private int end;
    private int[] numlist;
    public MyCircularQueue(int k) {
        this.head=-1;
        this.end=-1;
        this.lenth=k;
        this.numlist=new int[k];
    }

    public boolean enQueue(int value) {
        if (isFull()){
            return false;
        }
        if (isEmpty()){
            head=0;
            end=0;
            numlist[0]=value;
            return true;
        }
        else if(end!=lenth-1){
            end++;
            numlist[end]=value;
            return true;
        }
        else{
            end = 0;
            numlist[end]=value;
            return true;
        }

    }

    public boolean deQueue() {
        if (isEmpty())
            return false;
        else if (end == head) {
            end = -1;
            head = -1;
            return true;
        } else if (head != lenth-1) {
            head++;
            return true;
        } else {
            head = 0;
            return true;
        }

    }


    public int Front() {
        boolean b = isEmpty();
        return b?-1:numlist[head];
    }

    public int Rear() {
        boolean b = isEmpty();
        return b?-1:numlist[end];
    }

    public boolean isEmpty() {
        if(head==-1&&end==-1)
            return true;

        else
            return false;
    }

    public boolean isFull() {
        if ((end+1)%lenth==head%lenth) return true;
        else return false;
    }



    public static void main(String[] args) {
        MyCircularQueue org=new MyCircularQueue(0);
        System.out.println(Arrays.toString(org.numlist));
        System.out.println(org.isFull());
//        boolean b=org.enQueue(1);
//        System.out.println(b);
//        b=org.enQueue(2);
//        System.out.println(b);

//        System.out.println(0 % 1);

    }

}
