/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itstep.testswich;

/**
 *
 * @author java
 */
public class TestSwich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int stage = 5;
        switch (stage) {
            case 1:
                System.out.println("This is Supermarket");
                break;
            case 2:
                System.out.println("This is Bowling");
                break;
            case 3:
                System.out.println("This is Restauran");
                break;
            case 0:
                System.out.println("This is Parking");
                break;
            default:
                System.out.println("Mistake!!!");
                

        }
    }

}
