package itstep.testoop;

/**
 *
 * @author java
 */
public class TestOOP {

    public static void main(String[] args) {
        Triangle tr1 = new Triangle();
        System.out.println(tr1.ToString());
        tr1.a = 3;
        tr1.b = 4;
        tr1.c = 5;
        System.out.println(tr1.ToString());
        System.out.println("P = " + tr1.perimetr());
        System.out.println("S = " + tr1.square());

        Triangle tr2 = new Triangle(5, 5, 7);
        System.out.println(tr2.ToString());
        tr2.info();
    }

}

class Triangle {

    //if(a+b>c && b+c>a && a+c >b);
    double a, b, c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        //Если выполняется условие существования, то.....
        if (a + b > c && b + c > a && a + c > b) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {//2.3.4
            a = 2;
            b = 3;
            c = 4;
        }
    }

    double perimetr() {
        //return a+b+c;
        double P = a + b + c;
        return P;
    }

    double square() {
        double pp = perimetr() / 2;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }

    String ToString() {
        return ("Triangle : a=" + a + ", b=" + b + ", c=" + c);
    }

    void info() {
        System.out.println("P=" + perimetr());
        System.out.println("S=" + square());
    }
}
