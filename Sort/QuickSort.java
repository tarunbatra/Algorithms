/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;


/**
 *
 * @author tbking
 */
public class QuickSort {
    public int[] QS(int a[])
    {
        if(a.length==0)
            return a;
        int pivot=getPivot(a);
        int pVal=a[pivot];
        int pos=getPivotPos(a,pivot);
        a=swap(pivot,pos,a);
        if(a.length==2)
            return a;
        else
        {
            int x[]=new int[pos];
            int y[]=new int[a.length-pos-1];
            System.arraycopy(a, 0, x, 0, pos);
            /*
            for(int i=0;i<pos;i++)
            {
                x[i]=a[i];
            }
                        */
            for(int i=pos+1;i<a.length;i++)
            {
                y[i-pos-1]=a[i];
            }
            x=QS(x);
            y=QS(y);
            System.arraycopy(x, 0, a, 0, x.length);
            /*
            for(int i=0;i<x.length;i++)
            {
                a[i]=x[i];
            }
                    */
            a[x.length]=pVal;
            for(int i=x.length+1;i<a.length;i++)
            {
                a[i]=y[i-x.length-1];
            }
            return a;
        }
    }
    private int getPivot(int[] array)
    {
        return 0;
    }
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
    private int[] swap(int p, int c, int[] array)
    {
        int temp=array[p];
        array[p]=array[c];
        array[c]=temp;
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
}
