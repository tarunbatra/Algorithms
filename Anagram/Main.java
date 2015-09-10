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

import java.util.Arrays;

/**
 *
 * @author tbking
 */
// this class only exists to show the usage of the anagram class
public class Main {
    public static void main(String args[])
    {
        anagram obj=new anagram();
        String[] arr={"a","b","c"};
        obj.anagram(arr);
        String[] resAr=obj.res.substring(1).split("\\.");
        System.out.println(Arrays.toString(resAr));
        System.out.println(obj.calcSum(resAr));
    }
}
