/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21strings;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class JPTV21strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-----Работа со строками-----");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку:");
        String str = scanner.nextLine();
        char[]charArrayBegin = str.toCharArray();
        char[] charArrayEnd = new char[charArrayBegin.length];
        for(int i = 0; i < charArrayBegin.length; i++){
            charArrayEnd[i] = charArrayBegin[charArrayBegin.length-1 - i]; 
        }
        // TODO code application logic here
    
    System.out.println("charArrayEnd = " + Arrays.toString(charArrayEnd));
    String reversString = new String(charArrayEnd);
    System.out.println("Revers string "+ reversString);
    System.out.println("Теперь,я могу работать дома над этим проектом");
    System.out.println("Itˇs classwork");
    System.out.println("----- Использование StringBuilder -----");
    System.out.println("Введите длинный текст:");
    str = scanner.nextLine();
    StringBuilder sb = new StringBuilder(str);
    System.out.println(sb.reverse());
}
}
