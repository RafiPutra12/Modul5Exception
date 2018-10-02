/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Melakukan_Input;
import java.io.*;
/**
 *
 * @author M. RAFI PUTRA
 */
public class DemoInputNumerik2 {
    public static void main(String[] args) throws IOException{
        System.out.println("Maukkan sebuah bilangan rill: ");
        
        String temp;
        double bilangan = 0;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        // input data dianggap sebagai string
        temp = br.readLine();
        try{
            // kobversi dari string ke floating point
            bilangan = Double.parseDouble(temp);
        } catch (NumberFormatException nfs){
            System.out.println("Data yang dimasukkan bukan bilangan");
            System.exit(1);
        }
        System.out.println("Bilangan yang dimasukkan "+ "adalah "+ bilangan);
    }
}
