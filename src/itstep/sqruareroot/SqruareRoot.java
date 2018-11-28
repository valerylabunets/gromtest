/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itstep.sqruareroot;

/**
 *
 * @author java
 */
public class SqruareRoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Square Root Define program");

        double a = 1, b = -4, c = 4, x, x1, x2, d;
        System.out.println("Коэффициенты: a= " + a + ", b = " + b + ", c = "+c);
        d = Math.pow(b, 2) - 4 * a * c;
        //если d<0, то корней нет
        if (d < 0) {
            System.out.println("Korney net");
        } else {
            if (d == 0) {//иначе
                // d=0, один корень
                x =-b/(2*a);
                System.out.println("Koren odin x = " + x);

            } else {// иначе(d>0), два корня x1,x2

                x1=(-b - Math.sqrt(d))/(2*a);
                x2=(-b + Math.sqrt(d))/(2*a);
                //Вывести корни х1,х2
                System.out.println("Korney dva x1 = " +x1+ ", x2 = "+x2);
                
            }

        }

        System.out.println("\n\n\nThe end!!!");
    }

}
