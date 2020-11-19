package U2_Proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author Isaias
 */
public class Ventana extends JPanel implements ActionListener, KeyListener {
   // ventana
    private JFrame ventana;
    //private JTextField caja;    
    // contenedor
    private Container contenedor;

    private Punto[] figura, Punto2;
    
    public JMenuBar ar, ar2, ar3, ar4, ar5, ar6, ar7, ar8;
    public JMenu uno;
    public JMenuItem u1, u2, u3, u4, u5, u6, u7, u8;
    
    public JButton a,b,c,d,e,f,g,h;
    public JButton a1,b1,c1,d1,e1,f1,g1, h1;
    
    /**
     * Crear una ventana para representar la figura
     * @param titulo Titulo de la ventana
     * @param figura Figura representada por puntos
     */
    public Ventana(String titulo, Punto[] figura) {
        // inicializar la ventana
        ventana = new JFrame(titulo);
        // definir tamaño a ventana
        ventana.setSize(1000, 800);
        
//-------------------------BOTONES----------------------------------------------
        ar  = new JMenuBar();
        ar2 = new JMenuBar();
        ar3 = new JMenuBar();
        ar4 = new JMenuBar();
        ar5 = new JMenuBar();
        ar6 = new JMenuBar();
        ar7 = new JMenuBar();
        ar8 = new JMenuBar();
        
        a1 = new JButton("Traslación");
        b1 = new JButton("Escalamiento");
        c1 = new JButton("Rotacion En Manecillas");
        d1 = new JButton("Rotacion Parte 2");
        e1 = new JButton("Reflexion Eje X");
        f1 = new JButton("Reflexion Eje Y");
        g1 = new JButton("Reflexion Eje XY");
        h1 = new JButton("Restaurar Figura");
        
        //f = new JTextField();
       
        
        add(ar);
        add(ar2);
        add(ar3);
        add(ar4);
        add(ar5);
        add(ar6);
        add(ar7);
        add(ar8);
        
        a1.addActionListener(this);
        b1.addActionListener(this);
        c1.addActionListener(this);
        d1.addActionListener(this);
        e1.addActionListener(this);
        f1.addActionListener(this);
        g1.addActionListener(this);
        h1.addActionListener(this);
        
        ar.add(a1);
        ar.add(b1);
        ar.add(c1);
        ar.add(d1);
        ar.add(e1);
        ar.add(f1);
        ar.add(g1);
        ar.add(h1);
        
//-----------------------------BARRA DE MENU---------------------------------------
        setLayout(new FlowLayout(FlowLayout.CENTER, 3, 5));
        ar  = new JMenuBar();
        ar2 = new JMenuBar();
        ar3 = new JMenuBar();
        ar4 = new JMenuBar();
        ar5 = new JMenuBar();
        ar6 = new JMenuBar();
        ar7 = new JMenuBar();
        ar8 = new JMenuBar();
        
        uno = new JMenu("Opciones de Aplicación");
        uno.setBorder(BorderFactory.createLineBorder(Color.red));
        
        u1 = new JMenuItem("Traslación", new javax.swing.ImageIcon(getClass().getResource("traslacion.jpg"))); 
        u2 = new JMenuItem("Escalamiento", new javax.swing.ImageIcon(getClass().getResource("escalar.jpg")));
        u3 = new JMenuItem("Rotación En Manecillas", new javax.swing.ImageIcon(getClass().getResource("rot.png")));
        u4 = new JMenuItem("Rotacion Parte 2", new javax.swing.ImageIcon(getClass().getResource("rotacion2.jpg")));
        u5 = new JMenuItem("Reflexion Eje X", new javax.swing.ImageIcon(getClass().getResource("reflexionX.jpg")));
        u6 = new JMenuItem("Reflexion Eje Y", new javax.swing.ImageIcon(getClass().getResource("reflexionY.jpg")));
        u7 = new JMenuItem("Reflexion Eje XY", new javax.swing.ImageIcon(getClass().getResource("reflexionXY.jpg")));
        u8 = new JMenuItem("Restaurar Figura");

        add(ar);
        add(ar2);
        add(ar3);
        add(ar4);
        add(ar5);
        add(ar6);
        add(ar7);
        add(ar8);
        
         ar.add(uno);
        ar2.add(uno);
        ar3.add(uno);
        ar4.add(uno);
        ar5.add(uno);
        ar6.add(uno);
        ar7.add(uno);
        ar8.add(uno);
        
        uno.add(u1);
        uno.add(u2);
        uno.add(u3);
        uno.add(u4);
        uno.add(u5);
        uno.add(u6);
        uno.add(u7);
        uno.add(u8);
        
        u1.addActionListener(this);
        a1.addActionListener(this);
        u2.addActionListener(this);
        u3.addActionListener(this);
        u4.addActionListener(this);
        u5.addActionListener(this);
        u6.addActionListener(this);
        u7.addActionListener(this);
        u8.addActionListener(this);
        
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        
//-------------------------ACCIONES DE TECLADO---------------------------------
        ventana.setFocusable(true);
        ventana.addKeyListener(this);
        ventana.setLocationRelativeTo(null);
//------------------------------------------------------------------------------

        contenedor = ventana.getContentPane();
        contenedor.setSize(1000, 800);
        // agregar la ventana en el contenedor
        contenedor.add(this, BorderLayout.CENTER);
        
        //Definiendo la figura
        this.figura = figura;
        Punto2 = figura;
    }
   
    public void actionPerformed(ActionEvent e) {
//-------------------------TRASLACION-------------------------------------------
        if(e.getSource() == u1) {
            double x, y;
            x = Integer.parseInt(JOptionPane.showInputDialog("Traslacion en X"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Traslacion en Y"));
            this.traslacion(x, y);
            repaint();
        }
        if (e . getSource () == a1) {
            double x, y;
            x = 100;
            y = 80;
            this.traslacion(x, y);
            repaint();
        }
//------------------------ESCALAMIENTO------------------------------------------
        if(e.getSource() == u2) {
            double x, y;
            x = Integer.parseInt(JOptionPane.showInputDialog("Escalar en X"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Escalar en Y"));
            this.escalar(x, y);
            repaint();
        }
        if (e . getSource () == b1) {
            double x, y;
            x = 2;
            y = 2;
            this.escalar(x, y);
            repaint();
        }
//-----------------------ROTACION EN SENTIDO A MANECILLAS DE RELOJ--------------
        if(e.getSource() == u3) {
            int ang;
            ang = Integer.parseInt(JOptionPane.showInputDialog("Angulo"));
            this.rotacionManecillasDeReloj(ang);
            repaint();
        }
        if (e . getSource () == c1) {
            this.rotacionManecillasDeReloj(20);
            repaint();
        }
//-----------------------ROTACION PARTE 2---------------------------------------
        if(e.getSource() == u4) {
            int ang;
            ang = Integer.parseInt(JOptionPane.showInputDialog("Angulo"));
            this.rotacionPart2(ang);
            repaint();
        }
        if (e . getSource () == d1) {
            this.rotacionPart2(25);
            repaint();
        }
//------------------------REFLEXION EJE X---------------------------------------
        if(e.getSource() == u5) {
            this.reflexionX();
            repaint();
        }
        if(e.getSource() == u5) {
            int x, y;
            x = Integer.parseInt(JOptionPane.showInputDialog("Traslacion en X"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Traslacion en Y"));
            this.traslacion(x, y);
            repaint();
        }
        if (e . getSource () == e1) {
            this.reflexionX();
            repaint();
        }
         if(e.getSource() == e1) {
            int x, y;
            x = 50;
            y = 50;
            this.traslacion(x, y);
            repaint();
        }
//-------------------------REFLEXION EJE Y--------------------------------------
        if(e.getSource() == u6) {
            this.reflexionY();
            repaint();
        }
        if(e.getSource() == u6) {
            int x, y;
            x = Integer.parseInt(JOptionPane.showInputDialog("Traslacion en X"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Traslacion en Y"));
            this.traslacion(x, y);
            repaint();
        }
        if (e . getSource () == f1) {
            this.reflexionY();
            repaint();
        }
         if(e.getSource() == f1) {
            int x, y;
            x = 50;
            y = 50;
            this.traslacion(x, y);
            repaint();
        }
//-------------------------REFLEXION EJE XY-------------------------------------
        if(e.getSource() == u7) {
            this.reflexionXY();
            repaint();
        }
        if(e.getSource() == u7) {
            int x, y;
            x = Integer.parseInt(JOptionPane.showInputDialog("Traslacion en X"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Traslacion en Y"));
            this.traslacion(x, y);
            repaint();
        }
        if (e . getSource () == g1) {
            this.reflexionXY();
            repaint();
        }
         if(e.getSource() == g1) {
            int x, y;
            x = 50;
            y = 50;
            this.traslacion(x, y);
            repaint();
        }
//--------------------------RESTAURAR FIGURA------------------------------------
        if(e.getSource() == u8) {
            this.restaurarFig();
            repaint();
        }
        if(e.getSource() == h1) {
           this.restaurarFig();
           repaint();
        }
    }
    

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
          //Dibujar la figura original
          g.setColor(Color.green);
          this.dibujar(g);
    }
    
    //Dibujar Figura
    private void dibujar(Graphics g){
        for(int i = 0; i < figura.length - 1; i++){
            g.drawLine(figura[i].getX(), //Punto A
                       figura[i].getY(),
                       figura[i + 1].getX(), //Punto B
                       figura[i + 1].getY());
        }
    }
    //Escalamiento
    private void escalar(double fx, double fy) {
        int tx = figura[0].getX();
        int ty = figura[0].getY();
        
        for(Punto punto : figura) {
            //nueva x: ((a.tx) * fx) tx
            //nueva y: ((b.ty) * fy) ty
            punto.setX((int)((punto.getX() - tx) * fx) + tx);
            punto.setY((int)((punto.getY() - ty) * fy) + ty);
        }
    }
    //Traslación
    private void traslacion(double fx, double fy) {
        for(Punto punto : figura) {
            punto.setX((int)((punto.getX() + fx)));
            punto.setY((int)((punto.getY() + fy)));
        }
    }
    //Rotación en sentido a manesillas de reloj
    private void rotacionManecillasDeReloj(int ang) {
        int tx = figura[0].getX();
        int ty = figura[0].getY();
        
        for(Punto punto : figura) {
            punto.setX((int)((punto.getX() - tx) * Math.cos(Math.toRadians(ang)) 
                    - (punto.getY() - ty) * Math.sin(Math.toRadians(ang)) + tx));
            punto.setY((int)((punto.getY() - ty) * Math.cos(Math.toRadians(ang)) 
                    - (punto.getY() - ty) * Math.sin(Math.toRadians(ang)) + ty));
        }
    }
    //Rotacion Parte 2
    private void rotacionPart2(int ang) {
        int tx = figura[0].getX();
        int ty = figura[0].getY();
        
        for(Punto punto : figura) {
            punto.setX((int)((punto.getX() - tx) * Math.cos(Math.toRadians(ang)) 
                    + (punto.getY() - ty) * Math.sin(Math.toRadians(ang)) + tx));
            punto.setX((int)((-1) * (punto.getX() - tx) * Math.sin(Math.toRadians(ang)) 
                    + (punto.getY() - ty) * Math.cos(Math.toRadians(ang)) + ty));
        }
    }
    //Reflexion eje X
    private void reflexionX() {
        int tx = figura[0].getX();
        int ty = figura[0].getY();
        
        for(Punto punto : figura) {
            punto.setX(-(punto.getX() - tx) + tx);
            punto.setY(-(punto.getY() - ty) + ty);
        }
    }
    //Reflexion eje Y
    private void reflexionY() {
        int tx = figura[0].getX();
        int ty = figura[0].getY();
        
        for(Punto punto : figura) {
            punto.setX((punto.getX() - tx) + tx);
            punto.setY((punto.getY() + ty) + ty);
        }
    }
    //Reflexion eje XY
    private void reflexionXY() {
        int tx = figura[0].getX();
        int ty = figura[0].getY();
        
        for(Punto punto : figura) {
            punto.setX(-(punto.getX() - tx) + tx);
            punto.setY(-(punto.getY() - ty) + ty);
        }
    }
    
    private void nuevaFigura (Punto figura[]) {
        this.figura = figura;
    }
    private void restaurarFig(){
    Punto figur[]= {new Punto(15,50),
                          new Punto(25,50),
                          new Punto(45,50),
                          new Punto(100,50),
                          new Punto(125,50),
                          new Punto(125,100),
                          new Punto(200,100),
                          new Punto(200,125),
                          new Punto(200,150),
                          new Punto(150,150),
                          new Punto(125,150),
                          new Punto(125,175),
                          new Punto(125,200),
                          new Punto(100,200),
                          new Punto(75,200),
                          new Punto(50,200),
                          new Punto(25,200),
                          new Punto(15,200),
                          new Punto(15,175),
                          new Punto(15,150),
                          new Punto(25,150),
                          new Punto(50,150),
                          new Punto(65,150),
                          new Punto(65,140),
                          new Punto(65,130),
                          new Punto(50,130),
                          new Punto(25,130),
                          new Punto(15,130),
                          new Punto(15,125),
                          new Punto(15,115),
                          new Punto(45,115),
                          new Punto(65,115),
                          new Punto(65,95),
                          new Punto(55,95),
                          new Punto(25,95),
                          new Punto(15,95),
                          new Punto(15,85),
                          new Punto(15,75),
                          new Punto(15,65),
                          new Punto(15,55),
                          new Punto(15,50),
                          //new Punto(,),
                          //new Punto(,),
                          //new Punto(,),
                          //new Punto(,),
                          //new Punto(,),
                          //new Punto(,),
                          //new Punto(,),
                          //new Punto(,),
                          //new Punto(,),
                          //new Punto(,),
        }; 
    nuevaFigura(figur);
    repaint();
    }

//---------------------ACCIONES DE TECLADO--------------------------------------
    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_0) {
            this.traslacion(200, 90);
            repaint();
        }
        if(e.getKeyCode() == KeyEvent.VK_1) {
            this.escalar(4, 4);
            repaint();
        }
        if(e.getKeyCode() == KeyEvent.VK_2) {
            this.rotacionManecillasDeReloj(30);
            repaint();
        }
        if(e.getKeyCode() == KeyEvent.VK_3) {
            this.rotacionPart2(35);
            repaint();
        }
        if(e.getKeyCode() == KeyEvent.VK_4) {
            this.reflexionX();
            repaint();
        }
        if(e.getKeyCode() == KeyEvent.VK_5) {
            this.reflexionY();
            repaint();
        }
        if(e.getKeyCode() == KeyEvent.VK_6) {
            this.reflexionXY();
            repaint();
        }
        if(e.getKeyCode() == KeyEvent.VK_7) {
            this.restaurarFig();
            repaint();
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) { }
    
//-------------------------Acciones del Mouse-----------------------------------
}























