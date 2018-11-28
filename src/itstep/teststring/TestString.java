package itstep.teststring;

/**
 *
 * @author java
 */
public class TestString {
    
    public static String convertToUkrDate(String dataGb) {
        String day = dataGb.substring(8);//substring(8,10)
        String month = dataGb.substring(5, 7);
        String year = dataGb.substring(0, 4);
        
        return ""+day+'.'+month+'.'+year;
    }
    
    public static String FamIO(String sername,String name,String patronimName) {
        
        return sername+" "+name.charAt(0)+'.'+patronimName.charAt(0)+'.';
    }

    public static void main(String[] args) {

        String str = "Двухглавов 1972.08.14 SCJ6";
        System.out.println("length = " + str.length());
        System.out.println("First char = " + str.charAt(0));
        System.out.println("Last char = " + str.charAt(str.length() - 1));

        int n = 10;
        String str2 = str.substring(n + 1);//(11)
        System.out.println("str2 = " + str2);//1972.08.14 SCJ6
        str2 = str2.substring(0, 10);
        System.out.println("str2-2 = " + str2);

        String data = str2;
        String day = data.substring(8);//substring(8,10)
        String month = data.substring(5, 7);
        String year = data.substring(0, 4);
        System.out.printf("%s.%s.%s\n",day,month,year);//14.08.1972
        String newDate = ""+day+'.'+month+'.'+year;
        System.out.println(newDate);
        
        System.out.println("ukrDate = "+convertToUkrDate(data));
        String ukrDate=convertToUkrDate(data);
        System.out.println("ukrDate = "+ukrDate);
        
        String fio =FamIO("Двухглавов","Дмитрий","Эдуардович");
        System.out.println(fio);
        
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
    
    
    
    

    void rusToNull() {//2. Разработайте метод, которыйвсе символы русского алфавита меняет на‘0’ 

        System.out.println();
    }

}
