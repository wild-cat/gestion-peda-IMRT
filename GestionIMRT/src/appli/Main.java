/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appli;

import dao.SourceOracle;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import vue.FenetreLogin;

/**
 *
 * @author p1313137
 */
public class Main {
    
    public static Connection cnx;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, SQLException {
        
        //je fait la connexion à la base
        cnx = SourceOracle.getConnextion();
        
        //je crée la fenêtre du login
        FenetreLogin fl = new FenetreLogin(Main.cnx);
        
        //je le fait visible
        fl.setVisible(true);
    }
    
}
