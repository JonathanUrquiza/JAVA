package JAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {
    private JMenuBar mb;
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miCaculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
    private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelApellido, labelAmaterno,
            labellDepartamento, labellAntiguedad, labellResultado, labellfooter;
    private JTextField txtNombreTrabajador, txtAPaternoTrabajador, txtAMaternoTrabajador;
    private JComboBox comboDepartamento, comboAntiguedad;
    private JScrollPane scrollpane1;
    private JTextArea texarea1;

    public Principal() {
        setLayout(null);
        setTitle("Pantalla principal");
        setIconImage(new ImageIcon(getClass().getResource("img/icon.png")).getImage());

        mb = new JMenuBar();
        mb.setBackground(new Color(255, 0, 0));
        setJMenuBar(mb);

        // Configuracion y diseño de menuBar y menuItems.
        menuOpciones = new JMenuBar();
        menuOpciones.setBackground(new Color(255, 0, 0));
        menuOpciones.setFont(new Font("Andale Mono", 1, 14));
        menuOpciones.setForeground(new Color(255, 255, 255));
        mb.add(menuOpciones);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255, 0, 0));
        menuCalcular.setFont(new Font("Andale Mono", 1, 14));
        menuCalcular.setForeground(new Color(255, 255, 255));
        mb.add(menuCalcular);

        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(new Color(255, 0, 0));
        menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));

        menuColorFondo = new JMenu("Color de fondo");
        menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
        menuOpciones.add(menuColorFondo);

        miRojo = new JMenuItem("Rojo");
        miRojo.setFont(new Font("Andale Mono", 1, 14));
        miRojo.setForeground(new Color(255, 0, 0));
        menuColorFondo.add(this);
        miRojo.addActionListener(this);

        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("Andale Mono", 1, 14));
        miNegro.setForeground(new Color(255, 0, 0));
        menuColorFondo.add(this);
        miNegro.addActionListener(this);

        miMorado = new JMenuItem("Mordado");
        miMorado.setFont(new Font("Andale Mono", 1, 14));
        miMorado.setForeground(new Color(255, 0, 0));
        menuColorFondo.add(this);
        miMorado.addActionListener(this);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono", 1, 14));
        miNuevo.setForeground(new Color(255, 0, 0));
        menuOpciones.add(this);
        miNuevo.addActionListener(this);

        miElCreador = new JMenuItem("El creador");
        miElCreador.setFont(new Font("Andale Mono", 1, 14));
        miElCreador.setForeground(new Color(255, 0, 0));
        menuAcercaDe.add(this);
        miElCreador.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono", 1, 14));
        miSalir.setForeground(new Color(255, 0, 0));
        menuOpciones.add(this);
        miSalir.addActionListener(this);

        // Diseño de Label´s e imagenes.

        ImageIcon = new ImageIcon("img/logo-coca.png");
        labelLogo = new JLabel(imagen);
        labelLogo.setBounds(5, 5, 250, 100);
        add(labelLogo);

        labelBienvenido = new JLabel("Bienvenido");
        labelBienvenido.setBounds(280, 30, 300, 50);
        labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
        labelBienvenido.setForeground(new Color(255, 255, 255));
        add(labelBienvenido);

        labelTitle = new JLabel("Datos del trabajador");
        labelTitle.setBounds(45, 140, 900, 25);
        labelTitle.setForeground(new Font("Andale Mono", 0, 24));
        labelTitle.setForeground(new Color(255, 255, 255));
        add(labelTitle);

        labelNombre = new JLabel("Nombre Compelto");
        labelNombre.setBounds(25, A188, 180, 25);
        labelNombre.setFont(new Font("Andale Mono", 1, 12));
        labelNombre.setForeground(new Color(255, 255, 255));
        add(labelNombre);

        txtNombreTrabajador = new JTextField();
        txtNombreTrabajador.setBounds(25, 213, 150, 25);
        txtNombreTrabajador.setBackground(new java.awt.color(225, 224, 224));
        txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtNombreTrabajador.setForeground(new java.awt.Color(255, 0, 0));
        add(txtNombreTrabajador);

        labelApellido = new JLabel("Apellido");
        labelApellido.setBounds(25, 248, 180, 25);
        labelApellido.setFont(new Font("Andale Mono", 1, 12));
        labelApellido.setForeground(new Color(255, 255, 255));
        add(labelApellido);

        txtAPaternoTrabajador = new JTextField();
        txtAPaternoTrabajador.setBounds(25, 273, 150, 25);
        txtAPaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
        txtAPaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtAPaternoTrabajador.setForeground(new java.awt.Color(255, 0, 0));
        add(txtAPaternoTrabajador);

        labelAmaterno = new JLabel("Apellido Materno");
        labelAmaterno.setBounds(25, 308, 180, 25);
        labelAmaterno.setFont(new Font("Andale Mono", 1, 12));
        labelAmaterno.setForeground(new Color(255, 255, 255));
        add(labelAmaterno);

        txtAMaternoTrabajador = new JTextField();
        txtAMaternoTrabajador.setBounds(25, 334, 150, 25);
        txtAMaternoTrabajador.setBackground(new java.awt.color(224, 224, 224));
        txtAMaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtAMaternoTrabajador.setForeground(new java.awt.Color(225, 0, 0));
        add(txtAMaternoTrabajador);

        labellDepartamento = new JLabel("Seleccione el Departamento");
        labellDepartamento.setBounds(220, 188, 180, 25);
        labellDepartamento.setFont(new Font("Andale Mono", 1, 12));
        labellDepartamento.setForeground(new Color(255, 255, 255));
        add(labellDepartamento);

        comboDepartamento = new JComboBox();

    }

    public void actionPerformed(ActionEvent e) {
    }
}
