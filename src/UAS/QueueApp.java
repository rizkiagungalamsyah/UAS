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
public class QueueApp {
      public static void main(String[] args){
        Queue antrian = new Queue(10);
        antrian.enqueue(0);
        antrian.display();
        antrian.enqueue(0);
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        System.out.println("Nama saya adalah Rizki Agung Alamsyah");
        antrian.display();
        antrian.enqueue(7);
        antrian.display();
        antrian.enqueue(6);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        
    }
}
