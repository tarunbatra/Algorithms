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
package Sort.QuickSort;

/**
 *
 * @author tbking
 */
public class QuickSort {
    //takes unsorted array, returns sorted array
    public int[] QS(int a[])
    {
        //if null array
        if(a.length<=1)
            return a;
        a=getPivot(a);
        int pivot=0;                    //always the first element is the pivot
        int pVal=a[pivot];              //pivot value
        int pos=getPivotPos(a,pivot);   //pivot's position in sorted array
        a=divide(pivot,pos,a);            //swapped array according to pivot 
        if(a.length==2)
            return a;
        else
        {
            int x[]=new int[pos];
            int y[]=new int[a.length-pos-1];
            System.arraycopy(a, 0, x, 0, pos);  //copying first part of array to x
            /*
            for(int i=0;i<pos;i++)
            {
                x[i]=a[i];
            }
                        */
            System.arraycopy(a, pos+1, y, 0,y.length);  //copying second part of array to y
            /*
            for(int i=pos+1;i<a.length;i++) 
            {
                y[i-pos-1]=a[i];
            }
                        */
            x=QS(x);    //calling the function QS recursively for x
            y=QS(y);    //calling the function QS recursively for y
            System.arraycopy(x, 0, a, 0, x.length); //copying x to first part of array
            /*
            for(int i=0;i<x.length;i++)
            {
                a[i]=x[i];
            }
                    */
            a[x.length]=pVal;
            System.arraycopy(y,0, a, x.length+1, y.length);    //copying to second part of array
            /*
            for(int i=x.length+1;i<a.length;i++)
            {
                a[i]=y[i-x.length-1];
            }
                    */
            return a;
        }
    }
    
    // estimates the pivot
    private int[] getPivot(int[] array)
    {
        if(array[0]<array[array.length/2])
        {
            array=swap(0,array.length/2,array);
        }
        if(array[0]>array[array.length-1])
        {
            array=swap(0,array.length-1,array);
        }
        return array;
    }
    // calculating actual pivot position
    private int getPivotPos(int[] array,int p)
    {
        int pVal=array[p];
        int count=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<pVal)
            {
                count++;
            }
        }
        return count;
    }
    
    //to divide the array on the basis of pivot
    private int[] divide(int p, int c, int[] array)
    {
        array=swap(p,c,array);
        int tmp[]=new int[array.length];
        tmp[c]=array[c];
        int less=0,more=array.length-1;
        for(int i=0;i<array.length;i++)
        {
            if(i!=c)
            if(array[i]<array[c])
                tmp[less++]=array[i];
            else if(array[i]>=array[c])
                tmp[more--]=array[i];
        }
        return tmp;
    }
    
    //swap two elements in an array and return the updated array
    private int[] swap(int p,int c, int[]array)
    {
        int temp=array[p];
        array[p]=array[c];
        array[c]=temp;
        return array;
    }
}
