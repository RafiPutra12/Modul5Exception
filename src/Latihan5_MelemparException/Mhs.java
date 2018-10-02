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
class Mhs {
   private String nama;
   private String nim;
   private double nilai;
   
   public void setNim(String vnim) {
       try{
           nim = vnim;
           if(nim == null) {
               throw new NullPointerException();
           }
       }catch(NullPointerException npe) {
           System.out.println("KESALAHAN: "+ "NIM mahasisawa tidak boleh null");
       }
   }
   public String getNim() {
       return nim;
   }
   public void setNama(String vnama){
       try{
           nama = vnama;
           if(nama == null) {
               throw new NullPointerException();
           }
       }catch (NullPointerException npe) {
           System.out.println("KESALAHAN: "+ "Nama mahasiswa tidak boleh null");
       }
   }
   public String getNama() {
       return nama;
   }
   public void setNilai(int vnilai) {
       nilai = vnilai;
   }
   public double getNilai() {
       return nilai;
   }
}
