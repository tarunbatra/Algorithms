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
package Anagram;

/**
 *
 * @author tbking
 */
public class anagram {
    String res=".";
    public void anagram(String[] a)
    {
        createString(a);
        if(a.length>1)
        {
            String[] sub=new String[a.length-1];
            for(int i=0;i<a.length;i++)
            {
                anagram(getSub(a,i));
            }
        }
    }
    //to create string from the array s
    public void createString(String[] s)
    {
        String ret="";
        for (String item : s)
        {
            ret += item;
        }
        if(!res.contains("."+ret+"."))
            res+=ret+".";
    }
    //to create child array from a parent array
    public String[] getSub(String[] ar,int index)
    {
        String[] retAr=new String[ar.length-1];
        int pos=0;
        for(int i=0;i<ar.length;i++)
        {
            if(i!=index)
            {
                retAr[pos++]=ar[i];
            }
        }
        return retAr;
    }
    //to calculate sum of all the integers in each permutation
    public int calcSum(String[] ar)
    {
        int sum=0;
        for (String ar1 : ar)
        {
            try
            {
                sum += Integer.parseInt(ar1);
            }
            catch(Exception e){}
        }
        return sum;
    }
}
