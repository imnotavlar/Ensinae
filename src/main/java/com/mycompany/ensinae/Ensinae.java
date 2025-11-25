package com.mycompany.ensinae;
import com.mycompany.ensinae.views.Vestibulares;
import javax.swing.*;

public class Ensinae {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
                new Vestibulares().setVisible(true);
    });
       
    }
}
