
package itstep.testdowhile;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class TestDoWhile {

    public static void main(String[] args) {
        
        //читаем числа с клавиатуры пока пользователь не введет ноль
        //и вывести сумму элементов
        Scanner scan = new Scanner(System.in);
        int sum=0;
        int num=-1;    
        do{
            num=scan.nextInt();
            sum+=num;
            
        } while (num!=0);            
        System.out.println("Sum = " + sum);    
        
    //**************************************************************
    // without while
    System.out.println("Calc sum2 (for)");
    sum=0;
    for(;;) {
      num=scan.nextInt();
      sum+=num;
      if(num==0) break;//выбрасывает за приделы блока операторов
    }
    System.out.println("Sum = " +sum);
    
        
    }
}
