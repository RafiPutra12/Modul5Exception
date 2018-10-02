/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5_MelemparException;

/**
 *
 * @author M. RAFI PUTRA
 */
public class DemoThrows2 {
    public static void uji(int angka)throws NullPointerException,ArithmeticException {
        if (angka < 0) {
            throw new NullPointerException("KESALAHAN: nul pointer exception");
        }else {
            throw new ArithmeticException("KESALAHAN: Arithmetic Exception");
        }
    }
    public static void main(String[] args) {
        try{
            //uji(-12); // menimbulkan eksepsi NullPointerException
            uji(0); // menibulkan eksepsi ArithmeticException 
        }catch(Exception e) {
            System.out.println("Exception ditangkap di sini...");
            System.out.println(e.getMessage());
        }
        System.out.println("Statemen setelah blok try-catch");
    }
}
