/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ridersapp;

import model_pkg.Conexion;
import views_pkg.LogInFrame;

/**
 *
 * @author kh15user
 */
public class RidersApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LogInFrame loginVista = new LogInFrame();
        loginVista.setLocationRelativeTo(null);
        loginVista.setVisible(true);
    }
    
}
