/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreadingmusic;

/**
 *
 * @author sujiitramurukeshan
 */
public class MultiThreadingMusic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TwinkleThread1 t1=new TwinkleThread1();
        TwinkleThread2 t2=new TwinkleThread2();
        
        t1.start();
        t2.start();

    }
    
}
