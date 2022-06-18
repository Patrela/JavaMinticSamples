package utility;

import java.util.Scanner;

/**
 *
 * @author cahuc
 */
public class ScannerReader {
    
    
    public static int readInt( String message ){
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.nextInt();
    }
    
    public static double readDouble( String message ){
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.nextDouble();
    }
    
    public static String readString( String message ){
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.next();
    }
    
}
