/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dosimetertest;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author gunebakan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UIManager.LookAndFeelInfo looks[] = UIManager.getInstalledLookAndFeels();
        try {        
            //0-Swing, 1-Mac, 2-?, 3-Windows, 4-Old Windows
            UIManager.setLookAndFeel(looks[3].getClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        MainUi mainui = new MainUi();
        
    }
    
}
