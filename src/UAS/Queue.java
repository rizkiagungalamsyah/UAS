/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author LENOVO
 */
public class Queue {
     private int ukuran;
    private long[]queue;
    private int belakang;
    private int jumItem;
    private int depan;
    
    public Queue (int s){
        ukuran = s;
        queue = new long[ukuran];
        depan = 0;
        belakang = -1;
        jumItem = 0;
        
    }
    
    public void enqueue (long j){
        if(!isFull()){
            queue[++belakang]=j;
            jumItem++;
        }
    }
    public long dequeue (){
        long temp = queue[0];
        if (!isEmpty()){
            for (int i = 0; i<jumItem; i++)
                queue [i] = queue[i+1];
            jumItem--;
            belakang--;
        }
        return temp;
    }
    public long peek(){
        return queue[depan];
    }
    public boolean isEmpty(){
        return (jumItem==0);
    }
    public boolean isFull(){
        return (belakang==ukuran-1);
    }
    public int ukuran(){
        return jumItem;
    }
    public void display(){
        for (int i=0; i<jumItem; i++)
            System.out.print(queue[i]+" ");
            System.out.println("");
    }
    
}
