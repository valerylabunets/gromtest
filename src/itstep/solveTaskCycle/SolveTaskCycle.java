package itstep.solveTaskCycle;

public class SolveTaskCycle {

    public static void for04_01(int n, int k) {//вывести N раз число K
        for (int i = 0; i < n; i++) {
            System.out.println(k);
        }
    }

    public static void for04_02(int a, int b) {//найти сумму всех чисел от A до B
        long sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void for04_03(int a, int b) {//найти произведение всех целых чисел от A до B
        long multy = 1;
        for (int i = a; i <= b; i++) {
            multy *= i;
        }
        System.out.println(multy);

    }

    public static void for04_04(int a, int b) {//Вывести в порядке возрастания все целые числа, расположенные между A и B (включая сами числа A и B),
                                               // а также количество N этих чисел.
        int count = 0;
        for (int i = a; i <= b; i++) {
            count++;
            System.out.println(count + "." + " " + i);
        }

    }

    public static void for04_05(int a, int b) {//Вывести в порядке убывания все целые числа, расположенные между A и B (не включая числа A и B),
                                               //а также количество N этих чисел.
        int count = 0;
        for (int i = b - 1; i > a; i--) {
            count++;
            System.out.println(count + "." + " " + i);
        }

    }
    public static void for04_06(int a, int b) {//Найти сумму квадратов всех целых чисел от A до B включительно
        int sum = 0;
        for (int i = a; i <= b; i++) {
            i *= i;
            sum += i;
        }
        System.out.println(sum);
    }
    public static void for04_07(int n) {//7 Дано целое число N (> 0). Найти сумму 1 + 1/2 + 1/3 + … + 1/N (вещественное число).
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
        System.out.println("Sum " + sum);
    }
    public static void for04_08(int n) {/* Дано целое число N (> 0). Найти квадрат данного числа, используя для его вычисления следующую
                                        формулу: N2 = 1 + 3 + 5 + … + (2·N − 1). После добавления к сумме каждого слагаемого выводить текущее
                                         значение суммы (в результате будут выведены квадраты всех целых чисел от 1 до N). */
        int sum=0;
        for (int i=1; i<=n;i++)
        {
            sum=sum+2*i-1;
            System.out.println(sum+" ");
        }
    }
    public static void for04_12(int n) {/* 12 Дано целое число N (> 0). Найти произведение
                                         N! = 1·2·…·N (N–факториал). Чтобы избежать целочисленного переполнения, вычислять это
                                         произведение с помощью вещественной переменной и вывести его как вещественное число. */
        double sum=1;
        for (int i=1;i<=n;i++)
            sum*=i;
        System.out.println(sum+" ");
    }

    public static void while04_18(int n) {//Дано целое число N (> 0). Используя операции деления нацело и взятия остатка от деления,
                                          //вывести все его цифры, начиная с самой правой (разряда единиц).
        if (n<1) {
            return;
        }
        while(n>0) {
            int cyfra = n%10;
            System.out.println(cyfra + " ");
            n /= 10;
        }
        System.out.println();
    }

    public static void while04_19(int n) {/* 19 Дано целое число N (> 0). Используя операции деления нацелои взятия остатка от деления,
                                           найти количество и сумму его цифр.*/
        int counter=0;
        int sum=0;
        int cifra;
        while (n!=0)
        {
            cifra=n%10;
            n/=10;
            sum+=cifra;
            counter+=1;
        }
        System.out.println("сумма цифр ="+sum+" кол цифр"+counter);

    }

    public static void while04_20(int n) {/* Дано целое число N (> 0). Используя операции деления нацело и взятия остатка от деления,
                                         найти число, полученное при прочтении числа N справа налево.*/
        int cifra;
        int nov=0;
        do {
            cifra = n % 10;
            nov=nov*10+cifra;  // сборка в обратном порядке
            System.out.println("cifra = " + cifra);
            n = n / 10;
        } while (n != 0);
        System.out.println("");
        System.out.println("nov = "+nov);
    }
    public static void while04_21(int n) {/* 21 Дано целое число N (> 0). С помощью операций деления нацело и взятия остатка от деления определить,
                                         имеется ли в записи числа N цифра «2». Если имеется, то вывести true, если нет — вывести false. */

    }
    public static void while04_22(int n) {/* 22 Дано целое число N (> 0). С помощью операций деления нацело
                                           и взятия остатка от деления определить, имеются ли в записи числа N нечетные цифры.
                                           Если имеются, то вывести true, если нет — вывести false.*/
        int cifra;
        boolean flag=false;
        while (n!=0)
        {
            cifra=n%10;
            n/=10;
            if (cifra%2!=0) {flag=true;break;}
        }
        System.out.println(flag);
    }

    public static void while04_23(int n) {/* 23 Дано целое число N (> 1). Если оно является простым,
                                          т. е. не имеет положительных делителей, кроме 1 и самого себя, то вывести true, иначе вывести false.*/
        boolean flag=true;
        for (int i=n-1;i>1;i--)
        {
            if (n%i==0){flag=false;break;}
        }
        System.out.println(flag);

    }
    public static int while04_24 (int n) { /*  24 Дано целое число N (> 0). Найти наименьшее целое положительное число K, квадрат
                                           которого превосходит N: K2 > N. Функцию извлечения квадратного корня не использовать. */
        for (int i=1;i<=n;i++)
        {
            if ((i*i)>n){return i;}
        }
        return -1;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SolveTaskCycle.for04_01(3, 5);
        //SolveTaskCycle.for04_02(3, 5);
        //SolveTaskCycle.for04_03(3, 5);
        //SolveTaskCycle.for04_04(3, 5);
        //SolveTaskCycle.for04_05(3, 5);
        //SolveTaskCycle.for04_06(1, 5);
        //SolveTaskCycle.for04_07(3);
        //SolveTaskCycle.while04_18(569);
        SolveTaskCycle.while04_20(567);




    }
}
