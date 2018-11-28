/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itstep.testif2;

/**
 *
 * @author java
 */
public class TestIf2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //t1 Task 1
        
        /*//является ли число четным
        
        //ввести с клавиатуры
        int number = -1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite chislo");
        number = scan.nextInt();
        
        //проверить не четность
        
        
        if(number == 0) {
            System.out.println("Vy vveli null");
        } else {
            if(number%2 == 0) {
            System.out.println("chislo chetnoe");
        } else {
            System.out.println("chislo nechetnoe");
        }
        }
        //ввывести результат
         */
        //t2 Task 2
        /*
        int number;
        int number2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite chislo");
        number = scan.nextInt();
        System.out.println("Vvedite chislo");
        number2 = scan.nextInt();
        if(number == 0) {
            System.out.println("Vy vveli null");
        } else {
            if(number%number2 == 0) {
            System.out.println("chislo kratnoe");
        } else {
            System.out.println("chislo nechetnoe");
        }
        }
         */
        
        //t3 Task 3
        
        /*double number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite summu pokupki");
        number = scan.nextInt();
        double skidka = number / 10;
        double cenaSoSkid = number - skidka;

        if (number >= 1000) {
            System.out.println("Summa vashey pokupki sostavlyaet: " + cenaSoSkid);
            System.out.println("Vasha skidka ravna: " + skidka);
        } else {
            System.out.println("Summa vashey pokupki sostavlyaet:" + number);
            System.out.println("Vasha skidka ravna: " + null);
        }
        */

        /*double price;
        int bonus = 0;
        price = 10000;
        double priceWithBonus = price * (1 - bonus / 100);
        System.out.println("priceWithBonus:" + priceWithBonus);
        //Тернарный оператор
        bonus = price > 1000 ? 10 : 0;
        */
        
        //t4 Task 4
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite summu pokupki");
        //double price;
        int bonus = 0;
        double price = scan.nextInt();
        double priceWithBonus = price * (1 - bonus / 100);
        if(price > 5000) {
            //5-10%
            if(price >= 50000 && price < 10000) {
                //5%
                bonus = 5;
                System.out.println("Summa vashey pokupki: " + priceWithBonus );
                System.out.println("Vasha skidka: " + price/20);
            } else {
                //10%
                bonus = 10;
                System.out.println("Summa vashey pokupki: " + priceWithBonus );
                System.out.println("Vasha skidka: " + price/10);
            }
        } else {
            // 0%
            bonus = 0;
                System.out.println("Summa vashey pokupki: " + priceWithBonus );
                System.out.println("Vasha skidka: " + null);
        }
        */
        
        //t5 Task 5
        
        
        
    }

}
