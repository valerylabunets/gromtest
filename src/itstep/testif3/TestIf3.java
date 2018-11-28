/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itstep.testif3;

import java.util.Scanner;

/**
 *
 * @author Valera
 */
public class TestIf3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);

        double x, y;
        int sumPoints = 0;

        //input x and y - conditionates of point
        x = 3;
        y = 4;

        int answer=-1;
        do {

            for (int i = 1; i <= 3; i++) {
                System.out.println("Введите координаты точки " + i + ":");
                System.out.print("Введите x >>>>>");
                x = scan.nextDouble();
                System.out.print("Введите y >>>>>");
                y = scan.nextDouble();
                int event = -1;
                //processing input
                int points = -1;
                if (x >= 0 && y > 0) {
                    event = 1;
                }
                if (x > 0 && y <= 0) {
                    event = 2;
                }
                if (x <= 0 && y < 0) {
                    event = 3;
                }
                if (x < 0 && y >= 0) {
                    event = 4;
                }
                if (x == 0 && y == 0) {
                    event = 0;
                }
                //define point
                switch (event) {
                    case 0:
                        points = 100;
                        break;
                    case 1:
                        points = 50;
                        break;
                    case 2:
                    case 4:
                        points = 20;
                        break;
                    case 3:
                        points = 10;
                        break;

                }
                System.out.println("Your result is " + points + " points");

                sumPoints += points;

            }
            System.out.println("Результат игры = " + sumPoints);
            ///**********************************************
            System.out.println("Do you want continue?(1 - YES)");
            //System.out.println("Do you want exit?(0 - YES)"); var 2
            answer = scan.nextInt();
        } while (answer == 1);
        //while(answer != 0); var 2
        
        // подсчитать кол-во цифр в целом числе
        int myNumber = 123456;
        int copyNumber = myNumber;
        int count = 0;
        while(myNumber != 0) {
            count++;
            myNumber/=10;
            
        }
        System.out.printf("В числе %d содержится %d цифр\n\n",copyNumber,count);
    }

}
