package JAVA;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {

    private JLabel label1, label2;// Asigna el tipo de ingreso (privado) y objeto (JLabel).
    private JCheckBox check1;
    private JButton boton1, boton2;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;

    public Licencia() {
        // Inicia la funcion constructora.
        setLayout(null);
        setTitle("Licencia de uso");// Asigna un titulo.
        setIconImage(new ImageIcon(getClass().getResource("img/icon.png")).getImage());

        label1 = new JLabel("TERMINOS Y CONDICIONES");// Asigna a una variable el objeto creado.
        label1.setBounds(215, 5, 200, 30);// da diseño y dimenciones al objeto.
        label1.setFont(new Font("Andale Mono", 1, 14));// Crea y asigna un tipo de fuente.
        label1.setForeground(new Color(0, 0, 0));// Crea y asigna un color a la fuente creada en la linea anterior.
        add(label1);

        textarea1 = new JTextArea();// Asigna a una variable el objeto creado.
        textarea1.setEditable(false);// Impide la edisi;ón del texto.
        textarea1.setFont(new Font("Andale Mono", 0, 9));// da diseño y dimenciones al objeto.
        textarea1.setText("\n\n          TERMINOS Y CONDICIONES" +
                "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACI�N DE LA GEEKIPEDIA DE ERNESTO." +
                "\n            B.  PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LAS INTERFACES GR�FICAS." +
                "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE"
                +
                "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" +
                "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)"
                +
                "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +
                "\n\n          PARA MAYOR INFORMACI�N SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" +
                "\n          http://www.youtube.com/ernestoperezm");
        scrollpane1 = new JScrollPane(textarea1);// Asigna a una variable el objeto creado.
        scrollpane1.setBounds(10, 40, 575, 200);// da diseño y dimenciones al objeto.
        add(scrollpane1);

        check1 = new JCheckBox("Yo acepto");
        check1.setBounds(10, 250, 300, 30);
        check1.addChangeListener(this);
        add(check1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10, 290, 100, 30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);

        boton2 = new JButton("No acepto");
        boton2.setBounds(120, 290, 100, 30);
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        add(boton2);

        ImageIcon imagen = new ImageIcon("scr\\img\\coca-cola.png");
        label2 = new JLabel(imagen);
        label2.setBounds(315, 135, 300, 300);
        add(label2);
    }

    public void stateChanged(ChangeEvent e) {

    }

    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String args[]) {
        Licencia ventanalicencia = new Licencia();
        ventanalicencia.setBounds(0, 0, 600, 360);
        ventanalicencia.setVisible(true);
        ventanalicencia.setResizable(false);
        ventanalicencia.setLocationRelativeTo(null);
    }
}
