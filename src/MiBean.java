
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samuel
 */
public class MiBean extends JButton{
    
    private String urlITV;
    private String navegador;
    
    public MiBean(){
        setUrlITV("https://www.itvcita.com/Welcome.do;jsessionid=ncRzk8fugmDKEO-FTHOfC5eSgMDWUu15IhizKRvt.master:nodo-citas1");
        setNavegador("");
        setText("ITV");
        setForeground(Color.red);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setIcon(new ImageIcon(""));
        addMouseListener(new URListener());
    }
    public class URListener extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent me) {
            irURL();
        }

    }

    private void irURL() {

        try {
            Runtime.getRuntime().exec("xdg-open " + urlITV);
        } catch (IOException ex) {
            Logger.getLogger(MiBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void setUrlITV(String urlITVNueva){
        this.urlITV = urlITVNueva;
    }
    
    private void setNavegador(String navegadorNuevo){
        this.navegador = navegadorNuevo;
    }
    
    public String getUrlITV(){
        return urlITV;
    }
    
    public String getNavegador(){
        return navegador;
    }
}
