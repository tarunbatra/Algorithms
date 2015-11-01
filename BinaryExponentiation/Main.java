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
package BinaryExponentiation;

/**
 *
 * @author tbking
 */
// this class only exists to show the usage of the LeftToRightBinExpo and RightToLeftBinExpo class
public class Main {
     public static void main(String[] args) {
         
        LeftToRightBinExpo obj1=new LeftToRightBinExpo();
        System.out.println(obj1.power(5,25));
        
        RightToLeftBinExpo obj2=new RightToLeftBinExpo();
        System.out.println(obj2.power(5,25));
    }
}
