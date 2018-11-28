package itstep.solveTaskString;

public class SolveTaskString {

    public static void string05_01(String str) {/* 1 Дана строка. Вывести строку, содержащую те же символы, но расположенные в обратном порядке.*/
        char[] reverseArray1 = str.toCharArray(); // Преобразуем строку str в массив символов (char)
        System.out.print("1. Массив в обратном порядке: ");
        for (int i = reverseArray1.length-1; i >= 0; i--) {
            System.out.print(reverseArray1[i]);
        }

    }


    public static void string05_02(String str) {/* 2 Дана непустая строка S. Вывести строку, содержащую символы строки S,между которыми вставлено по одному пробелу.*/
        char[] reverseArray1 = str.toCharArray(); // Преобразуем строку str в массив символов (char)
        System.out.print("1. Массив c пробелами: ");
        for (int i = 0; i < reverseArray1.length; i++) {
            if(i <= reverseArray1.length - 2) {
                System.out.print(reverseArray1[i] + "_");
            } else {
                System.out.print(reverseArray1[i]);
            }

        }
    }

    public static void string05_03(String str, int N) {/* 3 Дана непустая строка S и целое число N (> 0).
                                                      Вывести строку, содержащую символы строки S,
                                                      ежду которыми вставлено по N символов «*» (звездочка). */
        char[] reverseArray1 = str.toCharArray(); // Преобразуем строку str в массив символов (char)
        System.out.print("1. Массив c символом «*» (звездочка) ");
        for (int i = 0; i < reverseArray1.length; i++) {
            if(i <= reverseArray1.length - 2) {
                System.out.print(reverseArray1[i]);
                for (int j = 0; j < N; j++) {
                    System.out.println("*");
                }
            } else {
                System.out.print(reverseArray1[i]);
            }
            //не решена!!!!
        }
    }

    public static void string05_04(String str) {/* Дана строка. Подсчитать количество содержащихся в ней цифр. */
        char[] reverseArray1 = str.toCharArray(); // Преобразуем строку str в массив символов (char)
        int count = 0;
        for (int i = 0; i < reverseArray1.length; i++) {
            if(reverseArray1[i] >= '0' && reverseArray1[i] <='9' ) {
                count++;
            }
        }
        System.out.println("В строке содержится цифр : " + count);
    }

    public static void string05_05(String str) {/* Дана строка. Подсчитать количество содержащихся в ней прописных латинских букв. */
        char[] reverseArray1 = str.toCharArray(); // Преобразуем строку str в массив символов (char)
        int count = 0;
        for (int i = 0; i < reverseArray1.length; i++) {
            if(reverseArray1[i] >= 'A' && reverseArray1[i] <='Z' ) {
                count++;
            }
        }
        System.out.println("В строке содержится прописных латинских букв : " + count);
    }

    public static void string05_06(String str) {/* 6 Дана строка. Подсчитать общее количество содержащихся в ней
                                                 строчных латинских и русских букв. */
        char[] reverseArray1 = str.toCharArray(); // Преобразуем строку str в массив символов (char)
        int count = 0;
        for (int i = 0; i < reverseArray1.length; i++) {
            if(reverseArray1[i] >= 'a' && reverseArray1[i] <='z' || reverseArray1[i] >= 'а' && reverseArray1[i] <='я' ) {
                count++;
            }
        }
        System.out.println("В строке содержится строчных латинских и русских букв : " + count);
    }
    public static void string05_10(String str) {/* 10 Дана строка. Если она представляет собой запись целого числа, то вывести 1, если
                                                вещественного (с дробной частью) — вывести 2; если строку нельзя преобразовать в
                                                число, то вывести 0. Считать, что дробная часть вещественного числа отделяется от его
                                                целой части десятичной точкой «.».  */
        byte flag=1;
        for (int i=0;i<str.length();i++)
        {
            if ((str.charAt(i)<48||str.charAt(i)>57)&&str.charAt(i)!=46){
                System.out.println(3);
            }
            if (str.charAt(i)==46) flag=2;
        }

        System.out.println(flag);
    }
    public static void string05_11(String str) { /* 11 Дано целое положительное число. Вывести символы, изображающие цифры
                                                 этого числа (в порядке слева направо).  */
        System.out.println("");
        for (int i=0;i<str.length();i++)
            System.out.print(str.charAt(i)+" ");
    }
    public static void string05_12(String str) { /* 12 Дано целое положительное число. Вывести символы, изображающие цифры этого числа (в
                                                   порядке справа налево).  */
        System.out.println("");
        for (int i=str.length()-1;i>=0;i--)
            System.out.print(str.charAt(i)+" ");
    }




    public static void main(String[] args) {
        //SolveTaskString.string05_01("123456");
        //SolveTaskString.string05_02("123456");
        //SolveTaskString.string05_03("123456", 3);
        //SolveTaskString.string05_04("hgjhkjhjkh12345");
        //SolveTaskString.string05_05("hPPjhkjhjkh12345");
        SolveTaskString.string05_06("hPPjhkjhфтjkh12345");
    }
}
