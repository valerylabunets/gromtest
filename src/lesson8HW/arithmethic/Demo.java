package lesson8HW.arithmethic;

public class Demo {

    public static void main(String[] args) {
        Adder adder = new Adder();
        int[] array = {2,4,6,8,10};
        int a = 5, b = 8;
//        adder.check(array);
//        adder.add(a,b);
        System.out.println(adder.add(a,b));
        System.out.println(adder.check(array));
    }
}
