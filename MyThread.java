/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JARD
 */
public class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println("running..." + Thread.currentThread().toString());
        System.out.println("max priority is = " + Thread.MAX_PRIORITY);
        System.out.println("min priority is = " + Thread.MIN_PRIORITY);

    }

    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        System.out.println("Name of t1:" + t1.getName());
        System.out.println("Name of t2:" + t2.getName());
        System.out.println("id of t1:" + t1.getId());

        t1.start();
        t2.start();

        t1.setName("STIW3054");
        System.out.println("After changing name of t1:" + t1.getName());
    }

}
