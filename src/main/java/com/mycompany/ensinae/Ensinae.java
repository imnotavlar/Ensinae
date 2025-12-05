package com.mycompany.ensinae;
import com.mycompany.ensinae.views.TelaLogin;
import javax.swing.*;

public class Ensinae {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
                new TelaLogin().setVisible(true);
    });
       
    }
}
