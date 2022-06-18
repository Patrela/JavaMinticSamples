package utility;

import javax.swing.JOptionPane;

/**
 *
 * @author cahuc
 */
public class GraphicMessage {

    public static int readInt(String message) {

        String input = JOptionPane.showInputDialog(message);

        return Integer.parseInt(input);
    }

}
