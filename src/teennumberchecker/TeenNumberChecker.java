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
public class TeenNumberChecker {

    public static boolean hasTeen(int x, int y, int z) {

        if (x >= 13 && x <= 19) {
            System.out.println("true");
            return true;
        }
        else if (y >= 13 && y <= 19) {
            System.out.println("true");
            return true;
        }
        else if (z >= 13 && z <= 19){
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }
    
    public static boolean isTeen (int x) {
        if (x >= 13 && x <= 19){
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }
}

