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
package Sort;

import Sort.MergeSort.MergeSort;
import Sort.QuickSort.QuickSort;


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
