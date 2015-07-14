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
public class Sort {
    public int[] QuickSort(int a[])
    {
        QuickSort qs=new QuickSort();
        return qs.QS(a);
    }
    public int[] MergeSort(int a[])
    {
        MergeSort ms=new MergeSort();
        return ms.MS(a);
    }
}
