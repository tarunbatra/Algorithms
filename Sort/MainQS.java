/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

import java.util.Arrays;

/**
 *
 * @author tbking
 */

// this class only exists to show the usage of the LinkedList class
public class MainQS {
    public static void main(String[] args) {
        int a[]={12,34,5,1,78,32,65,34,98,25,6,0,0,0,1,1,12};       //initializing array
        System.out.println(Arrays.toString(a));                     //printing array before sorting
        Sort sort=new Sort();                                       //creating object of Sort class
        System.out.println(Arrays.toString(sort.QuickSort(a)));     //calling QuickSort method of the Sort class and printing the array returned
    }
}
/*
output:
[12, 34, 5, 1, 78, 32, 65, 34, 98, 25, 6, 0, 0, 0, 1, 1, 12]
[0, 0, 0, 1, 1, 1, 5, 6, 12, 12, 25, 32, 34, 34, 65, 78, 98]
*/