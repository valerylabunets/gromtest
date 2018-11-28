package itstep.createmethods;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author java
 */
public class CreateMethods {

    //method show Array
    public static void showArray(double[] arr) {//signature | declaration
        //Output to console - body of method
        System.out.println("\nArray arr:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "  " + arr[i]);
        }
        //System.out.println("arr = "+Arrays.toString(arr));
    }

    public static double sumElementsArray(double[] arr) {
        double sum = 0.0;
        //System.out.println("arr = "+Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // System.out.println("sum = "+sum);
        return sum;
    }

    //Method wich show elements in array wich more 10 and less 20
    public static void showElementsMore10Less20(double[] mass) {
        System.out.println("\nArray array wich more 10 and less 20");
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 10 && mass[i] < 20) {
                System.out.println((i + 1) + "  " + mass[i]);
            }
        }
        //System.out.println("arr = "+Arrays.toString(arr));
    }

    public static double maxInArray(double[] mass) {
        double max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        return max;
    }

    public static void showElementInRegion(double[] mas, double left, double right) {

        System.out.println("\nArray in region");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > left && mas[i] < right) {
                System.out.println((i + 1) + "  " + mas[i]);
            }
        }
    }


        public static void main (String[] args){

            Scanner scan = new Scanner(System.in);
            System.out.print("Введите n >>>>>");
            int n = scan.nextInt();
            double[] arr = new double[n];
            do {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print("Введите элемент массива типа double >>>>>");
                    arr[i] = scan.nextDouble();
                }
            } while (arr.length == n - 1);

            showArray(arr);//call method
            //*******Find sum*********************************

            double summa = sumElementsArray(arr);
            System.out.println("summa = " + sumElementsArray(arr));

            System.out.println("sum = " + sumElementsArray(arr));

            //*************************************************
            //вывести на экран >30
            //и умножить на 10
            for (int i = 0; i < arr.length; i++) {// надо доделать!!!!!
                if (arr[i] > 30) {
                    arr[i] *= 10;
                }
            }
            System.out.println("Элементы массива умноженные на 10 = " + Arrays.toString(arr));
            //**********************************************************************
            //Сортировка
            //Вывод на экран

            Arrays.sort(arr);
            showArray(arr);
            //System.out.println("Сортированный массив arr = "+Arrays.toString(arr));

            //**********************************************************************
            double[] mas = {10, 4.5, 22, 5.4};
            showArray(mas);
            System.out.println("sum = " + sumElementsArray(mas));

            showElementsMore10Less20(mas);
            //System.out.println(" = "+showElementsMore10Less20(mas)));

            System.out.println("Max = " + maxInArray(mas));

            showElementInRegion(mas, summa, summa);

        }

    }

