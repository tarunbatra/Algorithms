/*
 * Copyright 2015 tbking.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package BinaryExponentiation;

import java.math.BigInteger;

/**
 *
 * @author tbking
 */
public class LeftToRightBinExpo {
    
    public BigInteger calcL2RBE(long x,long e)
    {
        return calcL2RBE(BigInteger.valueOf(x),BigInteger.valueOf(x));
    }
    public BigInteger calcL2RBE(BigInteger x,BigInteger e)
    {
        BigInteger xVal=x;
        char[] charray=getBinary(e).toCharArray();
        for(int i=0;i<charray.length;i++)
        {
            x=square(x);
            if(charray[i]=='1')
                x=mul(x,xVal);
        }
        return x;
    }
    
    private String getBinary(BigInteger l)
    {
        return l.toString(2).substring(1);
    }
    private BigInteger square(BigInteger a)
    {
        return a.multiply(a);
    }
    private BigInteger mul(BigInteger a,BigInteger b)
    {
        return a.multiply(b);
    }
}
