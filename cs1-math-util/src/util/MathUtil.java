/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author win 10
 */
public class MathUtil {
    
    //ham tinh n!= 1.2.3...n
    public static long getFactorial(int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. It must be between 0..20");
        
        if (n==0 || n==1)
            return 1;
        return n * getFactorial(n-1);
    }
}
