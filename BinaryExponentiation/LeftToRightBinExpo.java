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
public class LeftToRightBinExpo {
    public long calcL2RBE(long x,long e)
    {
        long xVal=x;
        char[] charray=getBinary(e).toCharArray();
        for(int i=0;i<charray.length;i++)
        {
            x=square(x);
            if(charray[i]=='1')
                x=mul(x,xVal);
            System.out.println(x);
        }
        return x;
    }
    
    private String getBinary(long l)
    {
        return Long.toBinaryString(l).substring(1);
    }
    private long square(long a)
    {
        return a*a;
    }
    private long mul(long a,long b)
    {
        return a*b;
    }
    
    public static void main(String[] args) {
        LeftToRightBinExpo obj=new LeftToRightBinExpo();
        System.out.println(obj.calcL2RBE(5,25));
    }
}
