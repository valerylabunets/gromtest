package itstep.CurrencyExchange;

import java.util.Scanner;

public class CurrencyExchange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//131313132

        final double courseUSDSell = 28.050;
        final double courseUSDBuy = 27.980;
        final double courseEURSell = 31.850;
        final double courseEURBuy = 31.650;
        final double courseRURSell = 0.412;
        final double courseRURBuy = 0.408;

        double sumUahClient;
        int cycle = -1;
        int sum;

        while (cycle != 0) {
            int choiсe;
            System.out.print("Push 1 if you want to sell and 0 if you want to buy: ");
            choiсe = scan.nextInt();
            switch (choiсe) {
                case 1: //Продажа валюты
                    int numCurSell;// Переменная выбора валюты для продажи;
                    System.out.println("If you want to sell currency, please, choose it's of type:");
                    System.out.println("Sell USD - push 1");
                    System.out.println("Sell EUR - push 2");
                    System.out.println("Sell RUR - push 3");
                    numCurSell = scan.nextInt();
                    switch (numCurSell) {
                        case 1: //Продажа USD

                            System.out.println("Enter the amount of USD multiple of 10 you want to sell::");
                            sum = scan.nextInt();
                            if (sum % 10 == 0) {
                                sumUahClient = sum * courseUSDSell;
                                System.out.println("You must :" + sumUahClient + "UAH");

                            } else {
                                System.out.println("You have entered a non-multiple amount !!!");
                            }
                            break;
                        case 2://Продажа EUR
                            System.out.println("Enter the amount of EUR multiple of 10 you want to sell::");
                            sum = scan.nextInt();
                            if (sum % 10 == 0) {
                                sumUahClient = sum * courseEURSell;
                                System.out.println("You must :" + sumUahClient + "UAH");

                            } else {
                                System.out.println("You have entered a non-multiple amount !!!");
                            }
                            break;
                        case 3: //Продажа RUR
                            System.out.println("Enter the amount of RUR multiple of 200 you want to sell::");
                            sum = scan.nextInt();
                            if (sum % 200 == 0) {
                                sumUahClient = sum * courseRURSell;
                                System.out.println("You must :" + sumUahClient + "UAH");

                            } else {
                                System.out.println("You have entered a non-multiple amount!!!");
                            }
                            break;
                    }
                case 0: //Покупка валюты
                    int numCurBuy;// Переменная выбора валюты для покупки;
                    System.out.println("If you want to buy currrency, please, choise type of it:");
                    System.out.println("Buy USD - push 1");
                    System.out.println("Buy EUR - push 2");
                    System.out.println("Buy RUR - push 3");
                    numCurBuy = scan.nextInt();
                    switch (numCurBuy) {
                        case 1: //Покупк USD
                            System.out.println("Enter the number of USD a multiple of 10 you want to buy:");
                            sum = scan.nextInt();
                            if (sum % 10 == 0) {
                                sumUahClient = sum * courseUSDBuy;
                                System.out.println("Your USD sale amount is :" + sumUahClient + "UAH");

                            } else {
                                System.out.println("You have entered a non-multiple amount!!!");
                            }
                            break;

                        case 2://Покупка EUR
                            System.out.println("Enter the number of EUR a multiple of 10 you want to buy:");
                            sum = scan.nextInt();
                            if (sum % 10 == 0) {
                                sumUahClient = sum * courseEURBuy;
                                System.out.println("Your EUR sale amount is :" + sumUahClient + "UAH");

                            } else {
                                System.out.println("You have entered a non-multiple amount !!!");
                            }
                            break;

                        case 3://Покупка RUR
                            System.out.println("Enter the number of RUR a multiple of 200 you want to buy:");
                            sum = scan.nextInt();
                            if (sum % 200 == 0) {
                                sumUahClient = sum * courseRURBuy;
                                System.out.println("Your RUR sale amount is :" + sumUahClient + "UAH");

                            } else {
                                System.out.println("You have entered a non-multiple amount !!!");
                            }
                            break;
                    }
                    System.out.println("---------------------------------");
                    System.out.println("Do you want to continue?");
                    System.out.println("Please push from 1 to 9, if you are continue or 0 if you want to STOP!");
                    cycle = scan.nextInt();
            }

            System.out.println("The programm is OVER!");
        }

    }
}

