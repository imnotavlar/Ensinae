package com.mycompany.ensinae;
import com.mycompany.ensinae.views.TelaPrincipal;
import javax.swing.*;

public class Ensinae {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
                new TelaPrincipal().setVisible(true);
    });
       
    }
}
