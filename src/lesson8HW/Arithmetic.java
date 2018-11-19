package lesson8HW;

public class Arithmetic {

    public boolean check(int[] array) {
        boolean bool;
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length;i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length;i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        if ((max + min) > 100) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }
}
