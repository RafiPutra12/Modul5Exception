/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan6_MembuatEksepsiSemdiri;

/**
 *
 * @author M. RAFI PUTRA
 */
public class NegativeNumberException extends Exception{
    private int bilangan;
    // default contruktor
    NegativeNumberException() {
    }
    // cinstruktor degan parameter bertipe String
    NegativeNumberException(String pesan) {
        super(pesan);
    }
    // construktor dengan parameter bertipe String dan int
    NegativeNumberException(String pesan, int nilai) {
        super(pesan);
        bilangan = nilai;
    }
    public int getBilangan() {
        return bilangan;
    }
    
}
