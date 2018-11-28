package itstep.testvarconvert;

/**
 *
 * @author java
 */
public class TestVarConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int myInt;
        myInt = 1000;
        System.out.println(myInt);

        byte myByte = 100;
        System.out.println(myByte);

        byte myByte2 = 0;
        myByte2 = (byte) (myByte + 5);

        int myInt2 = myInt * 3;

        long myLong = 1_000_000_000_000L;

        double myDouble = 5;

        double myDouble2 = 1.5;

        System.out.println("myInt2 = " + myInt2);

        myInt2 = (int) myDouble2; // отбрасывание дробной части

        System.out.println("myInt2 = " + myInt2);

        float myFloat = 3.14F;
        myFloat = (float) 33.56;
        myFloat = 1.0f * myFloat;

        //char
        char myChar = 'd';
        System.out.println("myChar = " + myChar);
        System.out.println("Code of myChar=" + (int) myChar);

        int cod = 100;
        myChar = (char) (cod + 1);
        System.out.println("myChar=" + myChar);//'e'
        System.out.println("myChar=" + (char) (myChar - 4));

        //boolean
        boolean myBool1 = true;
        boolean myBool2 = false;
        System.out.println("myBool1=" + myBool1 + ", myBool2=" + myBool2);
        
        //myInt=myBool2; преобразование не возможно
        
        

    }

}
