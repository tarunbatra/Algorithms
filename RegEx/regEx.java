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
package RegEx;

import java.util.Scanner;

/**
 *
 * @author tbking
 */
public class regEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.trim().equals(""))
        {
            System.out.println(0);
            return;
        }
        String a[]=str.trim().split("[!,?.\\_'@ ]+");
        System.out.println(a.length);
        for(String k:a)
        {
            System.out.println(k);
        }
    }
}
