package itstep.test2darraymethods;

import java.util.Arrays;

/**
 *
 * @author java
 */
public class Test2DArrayMethods {

    //Метод заполнения числами 2D массива
    public static void setValue2DArray(double[][] mas) {
        for (int i = 0; i < mas.length; i++) //кол-во строк в массиве
        {
            for (int j = 0; j < mas[0].length; j++) //кол-во столбцов
            //(!!! Если массив регулярный, т.е. матрица
            {
                mas[i][j] = (i + 1) * (j + 1) / 10.0;
            }
        }

    }

    public static void show2DArray(double[][] mas) {
        for (int i = 0; i < mas.length; i++) {//кол-во строк в массиве
            //Вывод элементов строки
            for (int j = 0; j < mas[0].length; j++) //кол-во столбцов
            //(!!! Если массив регулярный, т.е. матрица
            //System.out.print(mas[i][j]+"\t");
            {
                System.out.printf("%-12.3f", mas[i][j]);
            }
            //Перевод на след строку
            System.out.println();
        }
    }

    public static double[][] create2DArray(int krow, int kcol, double value) {
        if (krow < 1 || kcol < 1) {
            return null;
        }
        double[][] mas = new double[krow][kcol];
        for (int i = 0; i < krow; i++) {
            for (int j = 0; j < kcol; j++) {
                mas[i][j] = value;
            }
        }
        return mas;
    }

    //Генерация массива и заполнение случайными числами
    public static double[][] create2DRandomArray(
            int krow, int kcol,
            double min, double max
    ) {
        if (krow < 1 || kcol < 1) {
            return null;
        }
        if (min > max) {
            double pr = min;
            min = max;
            max = pr;
        }
        double[][] mas = new double[krow][kcol];
        for (int i = 0; i < krow; i++) {
            for (int j = 0; j < kcol; j++) {
                mas[i][j] = min + Math.random() * (max - min + 1);
            }
        }
        return mas;
    }

    public static int CountInRegion(double[][] mas, double min, double max){
        int count=0;
        for (int i = 0; i < mas.length; i++) //кол-во строк в массиве
        {
            for (int j = 0; j < mas[0].length; j++) //кол-во столбцов
            //(!!! Если массив регулярный, т.е. матрица
            {
                if (mas[i][j]>=min&&mas[i][j]<=max) //  min <= x <= max
                    count++;
            }
        }
        return count;

    }


    public static void main(String[] args) {
        // PROGRAMM CODE WRITING HERE!!!
        int n = 3, m = 4;

        double[][] arr = new double[n][m];

        setValue2DArray(arr);

        System.out.println("Array double 3-4");
        show2DArray(arr);

        double[][] arr53;
        arr53 = create2DArray(-5, 3, 3.3);  //создается массив 5-3 и заполняется 3.3
        if (arr53 != null) {
            System.out.println("Array double 5-3 create");
            show2DArray(arr53);
        } else {
            System.out.println("Mistake when create array!!!");
        }

        double[][] randArr;
        randArr = create2DRandomArray(4, 6, -20.0, +20.0);  //создается массив 5-3 и заполняется 3.3
        if (randArr != null) {
            System.out.println("Random Array double -20:+20");
            show2DArray(randArr);
        } else {
            System.out.println("Mistake when create random array!!!");
        }

        System.out.println("\nCount in -10:+10 = "
                +CountInRegion(randArr, -10.0, 10.0));

        System.out.println("\n\nMin in Columns "
                +Arrays.toString(createMinInColumn(randArr)));

    }

    public static double[] createMinInColumn(double[][] mas) {
        int kcol=mas[0].length;
        double[] minColumnsArr = new double[kcol];
        for (int i = 0; i < kcol; i++) {
            minColumnsArr[i] = minInColumn(mas,i);
        }
        return minColumnsArr;
    }

    private static double minInColumn(double[][] mas, int numCol) {
        int krow=mas.length;
        double[] arrCol= new double[krow];
        for (int i=0;i<krow;i++)
            arrCol[i]=mas[i][numCol];
        Arrays.sort(arrCol);
        return arrCol[0];
    }

}
