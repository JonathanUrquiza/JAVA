package JAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bienvenida extends JFrame implements ActionListener {

    // llamar de las librerias los objetos con acceso privado.
    private JTextField textfield1;
    private JLabel label1, label2, label3, label4, label5;
    private JButton boton1;
    public static String texto = "";

    // metodo constructor.
    public Bienvenida() {

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255, 0, 0));// asigna el color al fondo de contenerdor.
        setIconImage(new ImageIcon(getClass().getResource("../img\\icon.png")).getImage());
        /*
         * getImage: obtiene la imagen segun la ruta.
         * getResource carga la imagen i se fija a donde asignarla.
         * getClass: es la asignacion qeu busca getResource.
         * ImageIon: es un objeto la cual se le asigna la imagen.
         */

        // Diseño de las Compoentes.

        ImageIcon img = new ImageIcon("../img\\logo-coca.png");
        label1 = new JLabel(img);
        label1.setBounds(25, 15, 300, 150);
        add(label1);

        label2 = new JLabel("Sistema de control vacacional");
        label2.setBounds(35, 135, 300, 30);
        label2.setFont(new Font("Anadale Mono", 3, 18));
        label2.setForeground(new Color(255, 255, 255));
        add(label2);

        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(45, 212, 200, 30);
        label3.setFont(new Font("Anadale Mono", 1, 12));
        label3.setForeground(new Color(255, 255, 255));
        add(label3);

        label4 = new JLabel("© 2023 The Coca-Cola Company");
        label4.setBounds(85, 375, 300, 30);
        label4.setFont(new Font("Anadale Mono", 1, 12));
        label4.setForeground(new Color(255, 255, 255));
        add(label4);

        label5 = new JLabel("Proyecto educativo");
        label5.setBounds(85, 541, 300, 30);
        label5.setFont(new Font("Anadale Mono", 1, 6));
        label5.setForeground(new Color(255, 255, 255));
        add(label5);

        textfield1 = new JTextField();
        textfield1.setBounds(45, 240, 255, 25);
        textfield1.setBackground(new Color(224, 224, 224));
        textfield1.setFont(new Font("Andale Mono", 1, 14));
        textfield1.setForeground(new Color(255, 0, 0));
        add(textfield1);

        boton1 = new JButton("ingresar");
        boton1.setBounds(125, 280, 100, 30);
        boton1.setBackground(new Color(255, 255, 255));
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.setForeground(new Color(255, 0, 0));
        add(boton1);
        // Finaliza el diseño de los componentes.
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            texto = textfield1.getText().trim();
            if (texto.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
            } else {
                Licencia ventanalicencia = new Licencia();
                ventanalicencia.setBounds(0, 0, 600, 360);
                ventanalicencia.setVisible(true);
                ventanalicencia.setResizable(false);
                ventanalicencia.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
    }

    public static void main(String args[]) {
        Bienvenida ventanabienvenida = new Bienvenida();
        ventanabienvenida.setBounds(0, 0, 350, 450);
        ventanabienvenida.setVisible(true);
        ventanabienvenida.setResizable(false);
        ventanabienvenida.setLocationRelativeTo(null);
    }
}