
package itstep.functionstest;


public class FunctionsTest {

    //все переменные-параметры - примитивные типы
    //в момент вызова - создаются для функции
    //в стеке
    //присходит "удвоение" переменых в памяти
public static Boolean calcSolution(double a, 
                                   double b,
                                   double c,
                                   double x1,
                                   double x2)
{
    if ( a == 0) return false;
    double d = b * b - 4 * a * c;
    if (d <= 0) return false;
    x1 = (- b - Math.sqrt(d))/(2 * a);
    x2 = (- b + Math.sqrt(d))/(2 * a);
    return true;
}
    
//MySolution
public static Boolean calcSolution(double a, 
                                   double b,
                                   double c,
                                MySolution result)
{
    if ( a == 0) return false;
    double d = b * b - 4 * a * c;
    if (d <= 0) return false;
    result.X1 = (- b - Math.sqrt(d))/(2 * a);
    result.X2 = (- b + Math.sqrt(d))/(2 * a);
    return true;
}
//
public static Boolean calcSolution(double a,
        double b,
        double c,
        double []result
)
{
    if ( a == 0) return false;
    double d = b * b - 4 * a * c;
    if (d <= 0) return false;
    result[0] = (- b - Math.sqrt(d))/(2 * a);
    result[1]= (- b + Math.sqrt(d))/(2 * a);
    return true;
    
}
//
/*
public static void main(String[] args) 
    {
        int a = 1;
        int b = -7;
        int c = 12;
        double x1 = 0;
        double x2 = 0;
        boolean res = calcSolution(a, b, c, x1, x2);
        if (res == false)
        {
            System.out.println("Действительных корней нет");
        }
        else
        {
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
        }
        MySolution result = new MySolution();
        boolean R = calcSolution(a, b, c, result);
        System.out.println(result);
        //
        double[]RESULT = new double[2];
        calcSolution(a, b, c, RESULT);
        System.out.println("x1="+RESULT[0]);
        System.out.println("x2="+RESULT[1]);
    }
 */   
public static void main(String[] args) 
{
    functionstest.MyWindow window = new functionstest.MyWindow();
    window.setVisible(true);
}
}
