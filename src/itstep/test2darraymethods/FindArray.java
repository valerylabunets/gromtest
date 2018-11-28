package itstep.test2darraymethods;

import java.util.Arrays;

public class FindArray {


    // найти кол-во элементов от 10 до 20
    public static int countFrom10To20(double[][] arr, double min, double max) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] >= min && arr[i][j] <= max) {
                    count++;
                }
            }
        }
        return count;
    }

    //найти максимальный элемент
    public static double maxElement(double[][] arr) {
        double max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    //найти позицию максимального элемента int[]
    public static int[] positionMaxElement(double[][] arr) {
        int[] positionMaxElement = new int[1];
        double max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }

            }
        }
       // positionMaxElement ={max[i],max[j]};

        return positionMaxElement;
    }

    //найти сумму элементо заданой строки double
    public static double sumElementThisRow(double[][] arr) {
        double sum = 0.0;

        return sum;
    }

    //Сформировать массив min эл-тов столбцов
    public static double[] createMinInColumn(double[][] mas) {
        // double[] minColumnsArr = new double[mas[0].length];

        int kcol = mas[0].length;
        double[] minColumnsArr = new double[kcol];
        for (int i = 0; i < kcol; i++) {
            minColumnsArr[i] = minInColumn(mas, i);

        }


        return minColumnsArr;
    }

    public static double minInColumn(double[][] mas, int numCol) {
        int krow = mas.length;
        double[] arrCol = new double[krow];
        for(int i = 0; i < krow; i++) {
            arrCol[i] = mas[i][numCol];
        }
        Arrays.sort(arrCol);
        return arrCol[0];
    }
}
