/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

import Sort.Sort;
import java.util.Arrays;

/**
 *
 * @author tbking
 */
// this class only exists to show the usage of the QuickSort class
public class Main {
    public static void main(String[] args) {
        int a[]={12,34,5,1,78,32,65,34,98,25,6,0,0,0,1,1,12};       //initializing array
        a=new Sort().MergeSort(a);
        System.out.println(Arrays.toString(a));                     //printing array before searching
        int search[]={98,43,-1,-5,3,65};
        System.out.println("Value\t Index");
        for(int i=0;i<search.length;i++)
        {
            BinarySearch bs=new BinarySearch();
            System.out.println(search[i]+"\t"+bs.BinarySearch(a,search[i]));
        }
    }
}

/*
output:
[0, 0, 0, 1, 1, 1, 5, 6, 12, 12, 25, 32, 34, 34, 65, 78, 98]
Value	 Index
98	16
43	-1
-1	-1
-5	-1
3	-1
65	14
*/