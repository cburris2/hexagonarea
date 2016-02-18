/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hexagonarea;

/**
 *
 * @author office
 */
import java.util.Scanner;

public class HexagonArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Setup a scanner for user input
        Scanner input = new Scanner(System.in);
        
        double side = input.nextDouble();
        
        double area = 3 * 1.732 *side * side / 2;
        System.out.println("Area is" + area);
    }
    
}
