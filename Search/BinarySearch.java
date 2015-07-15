/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;


/**
 *
 * @author tbking
 */
public class BinarySearch {
    public int BinarySearch(int a[],int s)
    {
        return BS(a,0,a.length,s);
    }
    private int BS(int array[],int low,int high,int search)
    {
        if(low>=high &&array[low]!=search)
            return -1;
        int mid=(low+high)/2;
        if(array[mid]==search)
            return mid;
        else if(array[mid]>search)
            return BS(array,low,mid-1,search);
        else
            return BS(array,mid+1,high,search);   
    }
}
