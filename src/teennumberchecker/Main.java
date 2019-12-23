/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teennumberchecker;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TeenNumberChecker.hasTeen(9, 99, 19);
        TeenNumberChecker.hasTeen(23, 15, 42);
        TeenNumberChecker.hasTeen(22, 23, 34);
        TeenNumberChecker.isTeen(9);
        TeenNumberChecker.isTeen(13);
        
    }
    
}
