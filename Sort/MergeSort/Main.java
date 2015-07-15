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

import Sort.Sort;
import java.util.Arrays;

/**
 *
 * @author tbking
 */

// this class only exists to show the usage of the MergeSort class
public class Main {
    public static void main(String[] args) {
        int a[]={12,34,5,1,78,32,65,34,98,25,6,0,0,0,1,1,12};       //initializing array
        System.out.println(Arrays.toString(a));                     //printing array before sorting
        Sort sort=new Sort();                                       //creating object of Sort class
        System.out.println(Arrays.toString(sort.MergeSort(a)));     //calling MergeSort method of the Sort class and printing the array returned
    }
}
/*
output:
[12, 34, 5, 1, 78, 32, 65, 34, 98, 25, 6, 0, 0, 0, 1, 1, 12]
[0, 0, 0, 1, 1, 1, 5, 6, 12, 12, 25, 32, 34, 34, 65, 78, 98]
*/