/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5_MelemparException;

import Latihan5_MelemparException.Mhs;

/**
 *
 * @author M. RAFI PUTRA
 */
public class DemoThrow {
    public static void main(String[] args) {
        Mhs obj = new Mhs();
        obj.setNim("101533402134");
        obj.setNama("Rudi");
        obj.setNilai(80);
        System.out.println("NIM : "+ obj.getNim());
        System.out.println("Nama : "+ obj.getNama());
        System.out.println("Nilai : "+ obj.getNilai());
    }
}
