package itstep.selfChekKnowledge;

import static java.lang.Math.PI;

public class selfChekKnowledge {

    public static void sin_01(int x1,
                              int x2,
                              int x3,
                              int x4,
                              int x5)
    {
        System.out.println("sin 30 = " + Math.sin((x1*PI) / 180) +
                "sin 60 = " + Math.sin((x2*PI) / 180) +
        "sin 45 = " + Math.sin((x3*PI) / 180) +
        "sin 90 = " + Math.sin((x4*PI) / 180) +
        "sin 0 = " + Math.sin((x5*PI) / 180));

    }

    public static void cos_02(int x1,
                              int x2,
                              int x3,
                              int x4,
                              int x5)
    {
        System.out.println("cos 30 = " + Math.cos((x1*PI) / 180) +
                "cos 60 = " + Math.cos((x2*PI) / 180) +
                "cos 45 = " + Math.cos((x3*PI) / 180) +
                "cos 90 = " + Math.cos((x4*PI) / 180) +
                "cos 0 = " + Math.cos((x5*PI) / 180));

    }

    public static void areOfTriangle(double a,
                                     double b,
                                     double alpha)
    {
        System.out.println("Area of triangle : " +
        1.0/2.0 * a * b * Math.sin((alpha*PI) / 180));
    }
    public static void squareRoot(double x) {
        System.out.println("sSquare root x = " + Math.sqrt(x));
    }



    public static void main(String[] args) {

        sin_01(30,60,45,90,0);
        cos_02(30,60,45,90,0);
        areOfTriangle(10, 20, 45);
        squareRoot(9.0);
    }

}
