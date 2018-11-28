/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itstep.testarray;

import java.util.Arrays;

/**
 *
 * @author java
 */
public class TestArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] a = {10,35,20,40,25,46,33};
        System.out.println("Вывод одной строкой");
        for(int i = 0;i<a.length;i++) {
            System.out.println(a[i]+ "\t");
            System.out.println(); //пропуск строки для перевода
            System.out.println(); //пропуск строки для отделения
        }
        
        int[] b = {15,33,25,40,72};
        System.out.println("Вывод в столбец");
        for(int i = 0;i<b.length;i++) {
            System.out.println(b[i]);
        }
        
        System.out.println("Четные в макссиве а");
        for(int i = 0;i<a.length;i++) {
            if(a[i]%2==0)
                System.out.println(a[i] + "   ");
            System.out.println();
        }
        
        System.out.println("Кратные 5 в массиве b");
        for(int i = 0;i<b.length;i++)
            if(b[i]%5 == 0)
                System.out.println(b[i] + "  ");
        System.out.println();
        
        System.out.println("Суммирование элементов массива");
        int sum = 0;
        for(int i = 0; i<a.length;i++) {
            sum += a[i];
        }
        System.out.println("sum = "+sum);
        
        
        System.out.println("умножение элементов массива");
        int multy = 1;
        for(int i = 0; i < a.length ;i++) {
            multy *= a[i];
        }
        System.out.println("multy = " + multy);
        
        System.out.println("Копирование массива в другой массив");
        int n = a.length;
        int[] c = new int[n];
        for(int i=0;i<n ;i++) {
            c[i] = a[i];
        }
        //System.out.println("int[] c = "+c);//выводит адрес массива с
        System.out.println("int[] c = "+Arrays.toString(c));
        
        
        System.out.println("Вывод со счетчиком");
        int count = 0;
        for(int i = 0;i<b.length;i++)
            if(b[i]%5 == 0)
                count++;
               
        System.out.println("Кратных 5 = "+count);
        

        System.out.println("Максимум");
        int max = a[0];
        for(int i = 0;i<a.length ;i++) {
            if(a[i]>max) {
                max = a[i];
            }
        }
        System.out.println("Max = " +max);
        
        
        System.out.println("Минимум");
        int min = a[0];
        for(int i = 0;i<a.length ;i++) {
            if(a[i]<min) {
                min = a[i];
            }
        }
        System.out.println("Min = " +min);
        
        
        System.out.println("Поменять третий и пятый местами");
        //int i = 2;//swap(i,j)
        //int j = 4;
        //for(int i=0 ;i<a.length ;i++) {
            //int i = 2;//swap(i,j)
            //int j = 4;
            int temp = a[2];
            a[2] = a[4];
            a[4] = temp;
      //  }
        System.out.println("int[] a = "+Arrays.toString(a));
        
        
        System.out.println();
        
        
        int[] a1 = {1,2,3,0,9,7};
        int[] a2 = a1;
        a2[1] = 100;
        System.out.println(a1[1]);
        
        //Сортировка массива по возростанию
        
        Arrays.sort(a2);//сортировка Хара
        System.out.println("int[] a2 = "+Arrays.toString(a2));
        
        //Вывести в обратном порядке
        for (int i = a2.length-1; i > a2.length-1; i--) {
            System.out.println(a2);//выводит адрес
        }
        
        //умножить все эл на -1
        
        //Arrays.sort
        
        //* -1
        
        //Array.sort
        
        //перестановка в обратном порядке
    }
    
}
