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

import java.math.BigDecimal;

/**
 *
 * @author tbking
 */

/*
* ALGORITHM
*
*Power(x,n) {
*  r := 1
*  y := x
*  while (n > 1) { 
*    if odd(n) then r := r*y
*    n := floor(n/2)
*    y := y*y
*  }
*  r := r*y
*  return(r)
*}
*/
public class RightToLeftBinExpo {
    public BigDecimal power(long x,long e)
    {
        return power(BigDecimal.valueOf(x),BigDecimal.valueOf(e));
    }
    
    public BigDecimal power(BigDecimal x, BigDecimal e)
    {
        BigDecimal r = BigDecimal.ONE;
        BigDecimal y = x;
        while(e.compareTo(BigDecimal.ONE)==1)
        {
            if(e.remainder(BigDecimal.valueOf(2))!=BigDecimal.ZERO)
            {
                r=r.multiply(y);
            }
            e=e.divide(BigDecimal.valueOf(2),BigDecimal.ROUND_FLOOR);
            y=y.multiply(y);
        }
        r=r.multiply(y);
        return r;
    }
}
