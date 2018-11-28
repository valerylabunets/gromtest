package itstep.testif1;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class TestIf1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Test IF");
        //****************************
        Scanner scan = new Scanner(System.in);//2
        
        int rost=-1;
        //1. Read from console
        System.out.println("Vvedite rost (int value)");
        rost = scan.nextInt();
        
        
        System.out.println("Rost="+rost);
        //2.Processing
        
        //считать с консоли
        //проверить данные
        //высокий больше 180
        if(rost>=60 && rost <= 230) {// проверяем на допустимость
            if (rost >= 180) {
            System.out.println("Vysokiy");
        } else {
            if(rost<160) {
                System.out.println("Nizkiy");
            } else {
                System.out.println("Sredniy");
            }
            
        }
        }else{
            System.out.println("Rost veden neverno");
        }
        
        
        //******************************
        System.out.println("The end!!!");
        scan.close();//3
        
        
    }
    
}
