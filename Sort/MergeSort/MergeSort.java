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
package Sort.MergeSort;

/**
 *
 * @author tbking
 */
public class MergeSort {
    //takes unsorted array, returns sorted array
    public int[] MS(int a[])
    {
        //if array size is one, return the array as it is
        if(a.length<2)
            return a;
        int mid=a.length/2;                                             //calculates mid point of array
        int leftArray[]=new int[mid];                                   //declares leftArray
        int rightArray[]=new int[a.length-mid];                         //declares right array
        System.arraycopy(a, 0, leftArray, 0, leftArray.length);         //copies first half of the array to leftArray
        System.arraycopy(a, mid, rightArray, 0, rightArray.length);     //copies second half of the array to rightArray
        leftArray=MS(leftArray);                                        //calls the function MS recursively for leftArray
        rightArray=MS(rightArray);                                      //calls the function MS recursively for rightArray
        return merge(leftArray,rightArray);                             //returns the array after merging leftArray and rightArray
    }
    
    //takes two sorted arrays and returns one merged sorted array
    public int[] merge(int l[],int r[])
    {
        int x=0,y=0,ptr=0;
        int ret[]=new int[l.length+r.length];                           //declares the final array
        int min=(l.length<r.length)?l.length:r.length;                  //calculates the length of smaller array
        //sorting till one of the array runs out
        while(true)
        {
            ret[ptr++]=(l[x]<r[y])?l[x++]:r[y++];
            if(x==l.length||y==r.length)
                break;
        }
        //if leftArray ran out, fill the ret array with rightArray else otherwise
        if(min==x)
        {
            for(int i=y;i<r.length;i++)
            {
                ret[ptr++]=r[i];
            }
        }
        else
        {
            for(int i=x;i<l.length;i++)
            {
                ret[ptr++]=l[i];
            }
        }
        //return the final array, ret
        return ret;
    }
}
