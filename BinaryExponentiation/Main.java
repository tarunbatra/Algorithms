/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryExponentiation;

/**
 *
 * @author tbking
 */
// this class only exists to show the usage of the LeftToRightBinExpo and RightToLeftBinExpo class
public class Main {
     public static void main(String[] args) {
        LeftToRightBinExpo obj=new LeftToRightBinExpo();
        System.out.println(obj.calcL2RBE(5,25));
    }
}
