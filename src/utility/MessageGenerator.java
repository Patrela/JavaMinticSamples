package utility;

import javax.swing.JOptionPane;

/**
 *
 * @author cahuc
 */
public class MessageGenerator {

    public static int readInt(String message) {

        String input = JOptionPane.showInputDialog(message);
        return Integer.parseInt(input);
    }
    
    public static String readString( String message ){
        
        String input = JOptionPane.showInputDialog( message );
        return input;
    }
    
    public static void showMessage( String message ){
        
        JOptionPane.showMessageDialog( null , message);
    }

}
