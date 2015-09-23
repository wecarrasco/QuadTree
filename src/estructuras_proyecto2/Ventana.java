/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_proyecto2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Daniela Odileth
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JFrame();
        panel2 = new javax.swing.JPanel();
        panel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        c_exportar = new javax.swing.JLabel();
        CargarImagen = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        c_imagen = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        b_n = new javax.swing.JLabel();

        panel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel.getContentPane());
        panel.getContentPane().setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(224, 216, 224));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel1.setText("Escala de Grises");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        c_exportar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(c_exportar, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(c_exportar, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );

        CargarImagen.setBackground(new java.awt.Color(204, 204, 204));
        CargarImagen.setText("Cargar Imagen");
        CargarImagen.setBorder(null);
        CargarImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarImagenMouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Convertir a Gris");
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Ver Escala");
        jButton3.setBorder(null);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        c_imagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(c_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(c_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("Exportar Imagen");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        b_n.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_n, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_n, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(CargarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel1)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(262, 262, 262))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CargarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargarImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarImagenMouseClicked
        JFileChooser fc = new JFileChooser();
        FileFilter filtro = new FileNameExtensionFilter("Imagenes", "png", "jpg", "jpeg", "gif");
        fc.setFileFilter(filtro);
        File archivo;
        int op = fc.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();
            Image img = Toolkit.getDefaultToolkit().createImage(archivo.getPath()).getScaledInstance(210, 210, 0);
            this.c_imagen.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_CargarImagenMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Image img = iconToImage(b_n.getIcon());
        int cantidad = 2;
        BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        BufferedImage bf = new BufferedImage(bimage.getWidth(), bimage.getHeight(), BufferedImage.TYPE_INT_ARGB);

        for (int i = 0; i < bf.getWidth(); i++) {
            for (int j = 0; j < bf.getHeight(); j++) {
                Color px1 = null, px2 = null;

                if (j != bf.getHeight()) {
                    px1 = new Color(bf.getRGB(i, j));
                    px2 = new Color(bf.getRGB(i, j));
                }

                if (px1 != px2) {
                    System.out.println("i: " + i + " Height: " + bf.getHeight());
                    System.out.println("j: " + j + " Width: " + bf.getWidth());
                    System.out.println("Pixel 1: " + px1);
                    System.out.println("Pixel 2: " + px2);

                    Nodo nw = new Nodo(bf.getWidth() / cantidad, bf.getHeight() / cantidad, null, null, null, null);
                    Nodo ne = new Nodo(bf.getWidth() / cantidad, bf.getHeight() / cantidad, null, null, null, null);
                    Nodo sw = new Nodo(bf.getWidth() / cantidad, bf.getHeight() / cantidad, null, null, null, null);
                    Nodo se = new Nodo(bf.getWidth() / cantidad, bf.getHeight() / cantidad, null, null, null, null);
                    cantidad = cantidad + 2;
                    Nodo padre = new Nodo(bf.getWidth(), bf.getHeight(), nw, ne, sw, se);
                    QuadTree qt = new QuadTree(padre);

                    if (((j >= 0) && (j < bf.getWidth() / 2)) && ((i >= 0) && (i < bf.getHeight() / 2))) {
                        System.out.println("REGION NW");
                        Crear(nw, px1, px2);
                        Imagen(nw, bf);

                    } else if (((j > bf.getWidth() / 2) && (j <= bf.getWidth())) && ((i >= 0) && (i < bf.getHeight() / 2))) {
                        System.out.println("REGION NE");
                        Crear(ne, px1, px2);
                        Imagen(ne, bf);

                    } else if (((j >= 0) && (j < bf.getWidth() / 2)) && ((i > bf.getHeight() / 2) && (i <= bf.getHeight()))) {
                        System.out.println("REGION SW");
                        Crear(sw, px1, px2);
                        Imagen(sw, bf);

                    } else if (((j > bf.getWidth() / 2) && (j <= bf.getWidth())) && ((i > bf.getHeight() / 2) && (i <= bf.getHeight()))) {
                        System.out.println("REGION SE");
                        Crear(se, px1, px2);
                        Imagen(se, bf);
                    }
                }

                if (j == bf.getHeight() / 2) {
                    Color color_negro = new Color(0, 0, 0);
                    bf.setRGB(i, j, color_negro.getRGB());
                } else if (i == bf.getWidth() / 2) {
                    Color color_negro = new Color(0, 0, 0);
                    bf.setRGB(i, j, color_negro.getRGB());
                }

                c_exportar.setIcon(new ImageIcon(bf));
            }
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Image img = iconToImage(c_imagen.getIcon());
        BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        BufferedImage invertido = new BufferedImage(bimage.getHeight(), bimage.getWidth(), BufferedImage.TYPE_INT_ARGB);

        // Draw the image on to the buffered image
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();

        for (int i = 0; i < bimage.getWidth(); i++) {
            for (int j = 0; j < bimage.getHeight(); j++) {
                int color = bimage.getRGB(i, j);
                Color color_obtenido = new Color(color);
                int rojo = color_obtenido.getRed();
                int verde = color_obtenido.getGreen();
                int azul = color_obtenido.getBlue();
                int gris = (rojo + verde + azul) / 3;
                Color color_gris = new Color(gris, gris, gris);
                invertido.setRGB(i, j, color_gris.getRGB());
            }
        }

        b_n.setIcon(new ImageIcon(invertido));
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        Image img = iconToImage(c_exportar.getIcon());
        BufferedImage bf = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_RGB);
        Graphics g = bf.createGraphics();
        g.drawImage(img, 0, 0, null);
        g.dispose();
        File file = new File("theimage.jpg");
        try {
            //ImageIO.write(null, null, file)
            ImageIO.write(bf, "jpg", file);

//        int width = img.getWidth(null);
//
//        BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_BYTE_ARGB);
//
//        Graphics2D g2 = bi.createGraphics();
//        g2.drawImage(img, 0, 0, null);
//        g2.dispose();
//        ImageIO.write(bi, "jpg", new File("img.jpg"));
//        File archivo = null;
//        try {
//            archivo = new File("c:\\Archivos\\image.png");
//
//            if (!archivo.exists()) {
//
//                FileOutputStream salida = new FileOutputStream(archivo);
//                ObjectOutputStream objecto = new ObjectOutputStream(salida);
//
//                objecto.writeObject(c_exportar.getIcon());
//                objecto.flush();
//                objecto.close();
//                salida.close();
//
//                JOptionPane.showMessageDialog(this, "La imagen fue agregada existosamente");
//
//            } else {
////                //Sobreescribir el archivo
////                FileInputStream entrada = new FileInputStream (archivo);
////                ObjectInputStream objeto = new ObjectInputStream(entrada);
////                ImageIcon temp;
////                ArrayList<Persona> amigos = new ArrayList<Persona>();
////                
////                try{
////                    while( (temp =(c_exportar.getIcon()) objeto.readObject())!=null){
////                        amigos.add(temp);
////                    }
////                }catch(EOFException e){
////                    //fin de archivo
////                }finally{
////                    entrada.close();
////                    objeto.close();
////                }
////                
////                amigos.add(p);
////                
////                //sobreescribir archivo
////                
////                FileOutputStream salida = new FileOutputStream(archivo);
////                ObjectOutputStream objeto2 = new ObjectOutputStream(salida);
////                for(Persona per: amigos){
////                    objeto2.writeObject(per);
////                }
////                objeto2.flush();
////                objeto2.close();
////                salida.close();
////            
//            }
////            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void panel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel2MouseClicked
        int x = evt.getX();
        int y = evt.getY();
        Icon i = panel3.getIcon();
        i.paintIcon(this, null, x, y);
        panel3.setIcon(i);
    }//GEN-LAST:event_panel2MouseClicked

    static Image iconToImage(Icon icon) {
        if (icon instanceof ImageIcon) {
            return ((ImageIcon) icon).getImage();
        } else {
            int w = icon.getIconWidth();
            int h = icon.getIconHeight();
            GraphicsEnvironment ge
                    = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice gd = ge.getDefaultScreenDevice();
            GraphicsConfiguration gc = gd.getDefaultConfiguration();
            BufferedImage image = gc.createCompatibleImage(w, h);
            Graphics2D g = image.createGraphics();
            icon.paintIcon(null, g, 0, 0);
            g.dispose();
            return image;
        }
    }

    void Crear(Nodo nodo, Color pixel1, Color pixel2) {
        int cantidad = 2;
        Nodo temp;
        temp = nodo;
        while (pixel1.getRGB() != pixel2.getRGB()) {
            for (int i = 0; i < temp.getWidth(); i++) {
                for (int j = 0; j < temp.getHeight(); i++) {
                    if (((j >= 0) && (j < temp.getWidth() / cantidad)) && ((i >= 0) && (i < temp.getHeight() / cantidad))) {
                        temp.setNw(new Nodo(temp.getWidth() / cantidad, temp.getHeight() / 2, null, null, null, null));
                        temp.setNe(new Nodo(temp.getWidth() / cantidad, temp.getHeight() / 2, null, null, null, null));
                        temp.setSw(new Nodo(temp.getWidth() / cantidad, temp.getHeight() / 2, null, null, null, null));
                        temp.setSe(new Nodo(temp.getWidth() / cantidad, temp.getHeight() / 2, null, null, null, null));
                        Nodo nuevo = new Nodo(temp.getWidth() / cantidad, temp.getHeight() / cantidad, temp.getNw(), temp.getNe(),
                                temp.getSw(), temp.getSe());
                        temp = nuevo;
                        cantidad = cantidad + 2;
                        System.out.println("Entra");
                    } else if (((j > temp.getWidth() / cantidad) && (j <= temp.getWidth())) && ((i >= 0) && (i < temp.getHeight() / cantidad))) {
                        temp.setNw(new Nodo(temp.getWidth() / cantidad, temp.getHeight() / 2, null, null, null, null));
                        temp.setNe(new Nodo(temp.getWidth() / cantidad, temp.getHeight() / 2, null, null, null, null));
                        temp.setSw(new Nodo(temp.getWidth() / cantidad, temp.getHeight() / 2, null, null, null, null));
                        temp.setSe(new Nodo(temp.getWidth() / cantidad, temp.getHeight() / 2, null, null, null, null));
                        Nodo nuevo = new Nodo(temp.getWidth() / cantidad, temp.getHeight() / cantidad, temp.getNw(), temp.getNe(),
                                temp.getSw(), temp.getSe());
                        temp = nuevo;
                        cantidad = cantidad + 2;
                        System.out.println("Entra 2");
                    } else if (((j >= 0) && (j < temp.getWidth() / cantidad)) && ((i > temp.getHeight() / cantidad) && (i <= temp.getHeight()))) {
                        temp.setNw(new Nodo(temp.getWidth() / cantidad, temp.getHeight() / 2, null, null, null, null));
                        temp.setNe(new Nodo(temp.getWidth() / cantidad, temp.getHeight() / 2, null, null, null, null));
                        temp.setSw(new Nodo(temp.getWidth() / cantidad, temp.getHeight() / 2, null, null, null, null));
                        temp.setSe(new Nodo(temp.getWidth() / cantidad, temp.getHeight() / 2, null, null, null, null));
                        Nodo nuevo = new Nodo(temp.getWidth() / cantidad, temp.getHeight() / cantidad, temp.getNw(), temp.getNe(),
                                temp.getSw(), temp.getSe());
                        temp = nuevo;
                        cantidad = cantidad + 2;
                        System.out.println("Entra 3");
                    } else if (((j > temp.getWidth() / 2) && (j <= temp.getWidth())) && ((i > temp.getHeight() / 2) && (i <= temp.getHeight()))) {
                        temp.setNw(new Nodo(temp.getWidth() / cantidad, temp.getHeight() / 2, null, null, null, null));
                        temp.setNe(new Nodo(temp.getWidth() / cantidad, temp.getHeight() / 2, null, null, null, null));
                        temp.setSw(new Nodo(temp.getWidth() / cantidad, temp.getHeight() / 2, null, null, null, null));
                        temp.setSe(new Nodo(temp.getWidth() / cantidad, temp.getHeight() / 2, null, null, null, null));
                        Nodo nuevo = new Nodo(temp.getWidth() / cantidad, temp.getHeight() / cantidad, temp.getNw(), temp.getNe(),
                                temp.getSw(), temp.getSe());
                        temp = nuevo;
                        cantidad = cantidad + 2;
                        System.out.println("Entra 4");
                    }
                }
            }
        }
    }

    void Imagen(Nodo nodo, BufferedImage bf) {
        int cantidad = 2;
        int c = 1;
        while (nodo.getNw() != null || nodo.getNe() != null || nodo.getSw() != null
                || nodo.getSe() != null) {
            Nodo temp = nodo.getNw();
            if (temp.getNw() != null || temp.getNe() != null || temp.getSw() != null || temp.getSe() != null) {
                if (c == 1) {
                    if (temp.getHeight() == bf.getHeight() / cantidad) {
                        Color color_negro = new Color(0, 0, 0);
                        bf.setRGB(temp.getWidth(), temp.getHeight(), color_negro.getRGB());
                    } else if (temp.getWidth() == bf.getWidth() / cantidad) {
                        Color color_negro = new Color(0, 0, 0);
                        bf.setRGB(temp.getWidth(), temp.getWidth(), color_negro.getRGB());
                        c++;
                        if (c == 2) {
                            Nodo nuevo = temp.getNe();
                            temp = nuevo;
                        }
                        if (c == 3) {
                            Nodo nuevo = temp.getSw();
                            temp = nuevo;
                        } else {
                            Nodo nuevo = temp.getSe();
                            temp = nuevo;
                        }
                    }
                }
            }
        }
        c_exportar.setIcon(new ImageIcon(bf));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Ventana().setVisible(true);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CargarImagen;
    private javax.swing.JLabel b_n;
    private javax.swing.JLabel c_exportar;
    private javax.swing.JLabel c_imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JFrame panel;
    private javax.swing.JPanel panel2;
    private javax.swing.JLabel panel3;
    // End of variables declaration//GEN-END:variables
}