/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasRumah;

/**
 *
 * @author M. RAFI PUTRA
 */
public class TugasRumah {
    public static void main(String[] args) {
        int angka1 = 12, angka2 = 0;
        try{
            int hasil = angka1/angka2;
            System.out.println("Hasil : "+hasil);
        }catch(ArithmeticException ae){
            System.out.println("Pembagian dengan 0 dapat ditagkap");
        }catch(NullPointerException npe){
            System.out.println("Ganti angka2");
        }catch(Exception e){
            System.out.println("Exception lain");
        }
        System.out.println("Hasil akhir");
    }
}
