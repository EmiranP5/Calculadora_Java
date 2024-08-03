
package Vista;
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.*;
import javax.swing.JTextArea;

public class frm_calculadora extends javax.swing.JFrame {


    public frm_calculadora() {
          this.setLocationRelativeTo(null);
        initComponents();
        
    }
    private String currentInput = "";
    private double currentResult = 0;
    private String operator = "";
    private ArrayList<String> operationHistory = new ArrayList<>();

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tp_principal = new javax.swing.JTabbedPane();
        pn_calculadora = new javax.swing.JPanel();
        tf_pantalla = new javax.swing.JTextField();
        tf_0 = new javax.swing.JButton();
        tf_1 = new javax.swing.JButton();
        tf_2 = new javax.swing.JButton();
        tf_3 = new javax.swing.JButton();
        tf_4 = new javax.swing.JButton();
        tf_5 = new javax.swing.JButton();
        tf_6 = new javax.swing.JButton();
        tf_7 = new javax.swing.JButton();
        tf_8 = new javax.swing.JButton();
        tf_9 = new javax.swing.JButton();
        tf_div = new javax.swing.JButton();
        tf_multi = new javax.swing.JButton();
        tf_restar = new javax.swing.JButton();
        tf_suma = new javax.swing.JButton();
        tf_punto = new javax.swing.JButton();
        tf_igual = new javax.swing.JButton();
        tf_borrar = new javax.swing.JButton();
        tf_borrar1 = new javax.swing.JButton();
        pn_historial = new javax.swing.JPanel();
        tx_historial = new javax.swing.JScrollPane();
        tx_historial2 = new javax.swing.JTextArea();
        lbl_ayuda1 = new javax.swing.JLabel();
        pn_ayuda = new javax.swing.JPanel();
        lbl_ayuda = new javax.swing.JLabel();
        lbl_tx1 = new javax.swing.JLabel();
        lbl_dcp1 = new javax.swing.JLabel();
        lbl_dcp2 = new javax.swing.JLabel();
        lbl_dcp3 = new javax.swing.JLabel();
        lbl_dcp4 = new javax.swing.JLabel();
        lbl_dcp5 = new javax.swing.JLabel();
        lbl_dcp6 = new javax.swing.JLabel();
        lbl_dcp7 = new javax.swing.JLabel();
        lbl_dcp8 = new javax.swing.JLabel();
        lbl_tx2 = new javax.swing.JLabel();
        lbl_dcp9 = new javax.swing.JLabel();
        lbl_dcp10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 0));

        pn_calculadora.setForeground(new java.awt.Color(204, 255, 255));

        tf_pantalla.setEditable(false);
        tf_pantalla.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        tf_pantalla.setAutoscrolls(false);
        tf_pantalla.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        tf_pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pantallaActionPerformed(evt);
            }
        });

        tf_0.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        tf_0.setText("0");
        tf_0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        tf_0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_0ActionPerformed(evt);
            }
        });

        tf_1.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        tf_1.setText("1");
        tf_1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        tf_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_1ActionPerformed(evt);
            }
        });

        tf_2.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        tf_2.setText("2");
        tf_2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        tf_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_2ActionPerformed(evt);
            }
        });

        tf_3.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        tf_3.setText("3");
        tf_3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        tf_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_3ActionPerformed(evt);
            }
        });

        tf_4.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        tf_4.setText("4");
        tf_4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        tf_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_4ActionPerformed(evt);
            }
        });

        tf_5.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        tf_5.setText("5");
        tf_5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        tf_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_5ActionPerformed(evt);
            }
        });

        tf_6.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        tf_6.setText("6");
        tf_6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        tf_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_6ActionPerformed(evt);
            }
        });

        tf_7.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        tf_7.setText("7");
        tf_7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        tf_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_7ActionPerformed(evt);
            }
        });
        tf_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_7KeyPressed(evt);
            }
        });

        tf_8.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        tf_8.setText("8");
        tf_8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        tf_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_8ActionPerformed(evt);
            }
        });

        tf_9.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        tf_9.setText("9");
        tf_9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        tf_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_9ActionPerformed(evt);
            }
        });

        tf_div.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        tf_div.setText("/");
        tf_div.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        tf_div.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_divActionPerformed(evt);
            }
        });

        tf_multi.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        tf_multi.setText("*");
        tf_multi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        tf_multi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_multiActionPerformed(evt);
            }
        });

        tf_restar.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        tf_restar.setText("-");
        tf_restar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        tf_restar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_restarActionPerformed(evt);
            }
        });

        tf_suma.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        tf_suma.setText("+");
        tf_suma.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        tf_suma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_sumaActionPerformed(evt);
            }
        });

        tf_punto.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        tf_punto.setText(".");
        tf_punto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        tf_punto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_puntoActionPerformed(evt);
            }
        });

        tf_igual.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        tf_igual.setText("=");
        tf_igual.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        tf_igual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_igualActionPerformed(evt);
            }
        });

        tf_borrar.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        tf_borrar.setText("Retroceder");
        tf_borrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        tf_borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_borrarActionPerformed(evt);
            }
        });

        tf_borrar1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        tf_borrar1.setText("Borrar");
        tf_borrar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        tf_borrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_borrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_borrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_calculadoraLayout = new javax.swing.GroupLayout(pn_calculadora);
        pn_calculadora.setLayout(pn_calculadoraLayout);
        pn_calculadoraLayout.setHorizontalGroup(
            pn_calculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_calculadoraLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(tf_pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(pn_calculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_calculadoraLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addGroup(pn_calculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pn_calculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_calculadoraLayout.createSequentialGroup()
                                .addComponent(tf_1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_restar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_calculadoraLayout.createSequentialGroup()
                                .addComponent(tf_4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_multi, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_calculadoraLayout.createSequentialGroup()
                                .addComponent(tf_7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_div, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pn_calculadoraLayout.createSequentialGroup()
                            .addComponent(tf_0, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tf_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tf_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tf_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pn_calculadoraLayout.createSequentialGroup()
                            .addComponent(tf_borrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_borrar)))
                    .addContainerGap(65, Short.MAX_VALUE)))
        );
        pn_calculadoraLayout.setVerticalGroup(
            pn_calculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_calculadoraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tf_pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(529, Short.MAX_VALUE))
            .addGroup(pn_calculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_calculadoraLayout.createSequentialGroup()
                    .addGap(160, 160, 160)
                    .addGroup(pn_calculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_div, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(pn_calculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_multi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(pn_calculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_restar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(pn_calculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_0, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(pn_calculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_borrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        tf_pantalla.getAccessibleContext().setAccessibleName("");
        tf_pantalla.getAccessibleContext().setAccessibleDescription("");

        tp_principal.addTab("CALCULADORA", pn_calculadora);

        tx_historial2.setColumns(20);
        tx_historial2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tx_historial2.setRows(5);
        tx_historial.setViewportView(tx_historial2);

        lbl_ayuda1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lbl_ayuda1.setText("HISTORIAL");
        lbl_ayuda1.setAlignmentX(0.5F);

        javax.swing.GroupLayout pn_historialLayout = new javax.swing.GroupLayout(pn_historial);
        pn_historial.setLayout(pn_historialLayout);
        pn_historialLayout.setHorizontalGroup(
            pn_historialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_historialLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(lbl_ayuda1)
                .addContainerGap(221, Short.MAX_VALUE))
            .addComponent(tx_historial)
        );
        pn_historialLayout.setVerticalGroup(
            pn_historialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_historialLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_ayuda1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tx_historial, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
        );

        tp_principal.addTab("HISTORIAL", pn_historial);

        pn_ayuda.setForeground(new java.awt.Color(204, 255, 255));

        lbl_ayuda.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lbl_ayuda.setText("Guía Básica para Usar una Calculadora ");
        lbl_ayuda.setAlignmentX(0.5F);

        lbl_tx1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lbl_tx1.setText("1. Realizar Operaciones Aritméticas Básicas ");

        lbl_dcp1.setText("Suma (+): Introduce el primer número, presiona el botón +,introduce el segundo número ");
        lbl_dcp1.setToolTipText("");
        lbl_dcp1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_dcp1.setIconTextGap(5);
        lbl_dcp1.setMaximumSize(new java.awt.Dimension(74, 16));
        lbl_dcp1.setName(""); // NOI18N

        lbl_dcp2.setText("y luego presiona = para obtener el resultado.");
        lbl_dcp2.setToolTipText("");
        lbl_dcp2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_dcp2.setIconTextGap(5);
        lbl_dcp2.setMaximumSize(new java.awt.Dimension(74, 16));
        lbl_dcp2.setName(""); // NOI18N

        lbl_dcp3.setText("Resta (-): Introduce el primer número, presiona el botón -, introduce el segundo número");
        lbl_dcp3.setToolTipText("");
        lbl_dcp3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_dcp3.setIconTextGap(5);
        lbl_dcp3.setMaximumSize(new java.awt.Dimension(74, 16));
        lbl_dcp3.setName(""); // NOI18N

        lbl_dcp4.setText("y luego presiona =");
        lbl_dcp4.setToolTipText("");
        lbl_dcp4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_dcp4.setIconTextGap(5);
        lbl_dcp4.setMaximumSize(new java.awt.Dimension(74, 16));
        lbl_dcp4.setName(""); // NOI18N

        lbl_dcp5.setText("número y luego presiona =");
        lbl_dcp5.setToolTipText("");
        lbl_dcp5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_dcp5.setIconTextGap(5);
        lbl_dcp5.setMaximumSize(new java.awt.Dimension(74, 16));
        lbl_dcp5.setName(""); // NOI18N

        lbl_dcp6.setText("Multiplicación (*): Introduce el primer número, presiona el botón *, introduce el segundo ");
        lbl_dcp6.setToolTipText("");
        lbl_dcp6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_dcp6.setIconTextGap(5);
        lbl_dcp6.setMaximumSize(new java.awt.Dimension(74, 16));
        lbl_dcp6.setName(""); // NOI18N

        lbl_dcp7.setText("División (/): Introduce el primer número, presiona el botón /, introduce el segundo número");
        lbl_dcp7.setToolTipText("");
        lbl_dcp7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_dcp7.setIconTextGap(5);
        lbl_dcp7.setMaximumSize(new java.awt.Dimension(74, 16));
        lbl_dcp7.setName(""); // NOI18N

        lbl_dcp8.setText("y luego presiona =.");
        lbl_dcp8.setToolTipText("");
        lbl_dcp8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_dcp8.setIconTextGap(5);
        lbl_dcp8.setMaximumSize(new java.awt.Dimension(74, 16));
        lbl_dcp8.setName(""); // NOI18N

        lbl_tx2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lbl_tx2.setText("2. Funciones Basica");

        lbl_dcp9.setText("Retroceso: Borra el último dígito ingresado. ");
        lbl_dcp9.setToolTipText("");
        lbl_dcp9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_dcp9.setIconTextGap(5);
        lbl_dcp9.setMaximumSize(new java.awt.Dimension(74, 16));
        lbl_dcp9.setName(""); // NOI18N

        lbl_dcp10.setText("Borrar: Borra la entrada actual. ");
        lbl_dcp10.setToolTipText("");
        lbl_dcp10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_dcp10.setIconTextGap(5);
        lbl_dcp10.setMaximumSize(new java.awt.Dimension(74, 16));
        lbl_dcp10.setName(""); // NOI18N

        javax.swing.GroupLayout pn_ayudaLayout = new javax.swing.GroupLayout(pn_ayuda);
        pn_ayuda.setLayout(pn_ayudaLayout);
        pn_ayudaLayout.setHorizontalGroup(
            pn_ayudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ayudaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_ayudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_ayudaLayout.createSequentialGroup()
                        .addGroup(pn_ayudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ayuda)
                            .addGroup(pn_ayudaLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(lbl_tx1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pn_ayudaLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(lbl_tx2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn_ayudaLayout.createSequentialGroup()
                        .addComponent(lbl_dcp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(pn_ayudaLayout.createSequentialGroup()
                        .addComponent(lbl_dcp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pn_ayudaLayout.createSequentialGroup()
                        .addComponent(lbl_dcp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addComponent(lbl_dcp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_dcp5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_ayudaLayout.createSequentialGroup()
                        .addComponent(lbl_dcp6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addComponent(lbl_dcp9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_dcp10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_dcp8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_ayudaLayout.createSequentialGroup()
                        .addComponent(lbl_dcp7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))))
        );
        pn_ayudaLayout.setVerticalGroup(
            pn_ayudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_ayudaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_tx1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_dcp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_dcp2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_dcp3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_dcp4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_dcp6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_dcp5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lbl_dcp7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_dcp8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_tx2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_dcp9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_dcp10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330))
        );

        tp_principal.addTab("AYUDA", pn_ayuda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tp_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 703, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_7ActionPerformed
        // TODO add your handling code here:
         appendNumber("7");
    }//GEN-LAST:event_tf_7ActionPerformed

    private void tf_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_8ActionPerformed
        // TODO add your handling code here:
         appendNumber("8");
    }//GEN-LAST:event_tf_8ActionPerformed

    private void tf_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_9ActionPerformed
        // TODO add your handling code here:
         appendNumber("9");
    }//GEN-LAST:event_tf_9ActionPerformed

    private void tf_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_divActionPerformed
        // TODO add your handling code here:
         setOperator("/");
    }//GEN-LAST:event_tf_divActionPerformed

    private void tf_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_4ActionPerformed
        // TODO add your handling code here:
         appendNumber("4");
    }//GEN-LAST:event_tf_4ActionPerformed

    private void tf_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_5ActionPerformed
        // TODO add your handling code here:
         appendNumber("5");
    }//GEN-LAST:event_tf_5ActionPerformed

    private void tf_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_6ActionPerformed
        // TODO add your handling code here
        appendNumber("6");
    }//GEN-LAST:event_tf_6ActionPerformed

    private void tf_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_multiActionPerformed
        // TODO add your handling code here:
         setOperator("*");
    }//GEN-LAST:event_tf_multiActionPerformed

    private void tf_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_1ActionPerformed
        // TODO add your handling code here:
         appendNumber("1");
    }//GEN-LAST:event_tf_1ActionPerformed

    private void tf_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_2ActionPerformed
        // TODO add your handling code here:
         appendNumber("2");
    }//GEN-LAST:event_tf_2ActionPerformed

    private void tf_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_3ActionPerformed
        // TODO add your handling code here:
         appendNumber("3");
    }//GEN-LAST:event_tf_3ActionPerformed

    private void tf_restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_restarActionPerformed
        // TODO add your handling code here:
         setOperator("-");
    }//GEN-LAST:event_tf_restarActionPerformed

    private void tf_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_0ActionPerformed
        // TODO add your handling code here:
         appendNumber("0");
    }//GEN-LAST:event_tf_0ActionPerformed

    private void tf_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_puntoActionPerformed
        // TODO add your handling code here:
         appendNumber(".");
    }//GEN-LAST:event_tf_puntoActionPerformed

    private void tf_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_sumaActionPerformed
        // TODO add your handling code here:
         setOperator("+");
    }//GEN-LAST:event_tf_sumaActionPerformed

    private void tf_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_igualActionPerformed
        // TODO add your handling code here:
    calculateResult();
    }//GEN-LAST:event_tf_igualActionPerformed

    private void tf_pantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pantallaActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_tf_pantallaActionPerformed

    private void tf_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_borrarActionPerformed
        // TODO add your handling code here:
        if (!currentInput.isEmpty()) {
        currentInput = currentInput.substring(0, currentInput.length() - 1);
        tf_pantalla.setText(currentInput);
    }
    }//GEN-LAST:event_tf_borrarActionPerformed

    private void tf_borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_borrar1ActionPerformed
        // TODO add your handling code here:
         currentInput = "";
    currentResult = 0;
    operator = "";
    tf_pantalla.setText("");
    }//GEN-LAST:event_tf_borrar1ActionPerformed

    private void tf_7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_7KeyPressed
    }//GEN-LAST:event_tf_7KeyPressed
     private void appendNumber(String number) {
        currentInput += number;
        tf_pantalla.setText(currentInput);
    }

    private void setOperator(String op) {
        if (!currentInput.isEmpty()) {
            currentResult = Double.parseDouble(currentInput);
            currentInput = "";
            operator = op;
        }
    }

    private void updateHistory(String operation, double result) {
        String newEntry = operation + " = " + new DecimalFormat("#.######").format(result) + "\n";
        operationHistory.add(0, newEntry); // Add new entry at the beginning
        // Update the JTextArea with the latest history
        StringBuilder historyText = new StringBuilder();
        for (String entry : operationHistory) {
            historyText.append(entry);
        }
        tx_historial2.setText(historyText.toString());
    }

    private void calculateResult() {
        if (!currentInput.isEmpty() && !operator.isEmpty()) {
            double inputNumber = Double.parseDouble(currentInput);
            switch (operator) {
                case "+":
                    currentResult += inputNumber;
                    break;
                case "-":
                    currentResult -= inputNumber;
                    break;
                case "*":
                    currentResult *= inputNumber;
                    break;
                case "/":
                    if (inputNumber != 0) {
                        currentResult /= inputNumber;
                    } else {
                        tf_pantalla.setText("Error");
                        currentResult = 0;
                        currentInput = "";
                        operator = "";
                        return;
                    }
                    break;
            }
            String operation = currentResult + " " + operator + " " + inputNumber;
            updateHistory(operation, currentResult);
            tf_pantalla.setText(String.valueOf(currentResult));
            currentInput = "";
            operator = "";
    }
}
    

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_ayuda;
    private javax.swing.JLabel lbl_ayuda1;
    private javax.swing.JLabel lbl_dcp1;
    private javax.swing.JLabel lbl_dcp10;
    private javax.swing.JLabel lbl_dcp2;
    private javax.swing.JLabel lbl_dcp3;
    private javax.swing.JLabel lbl_dcp4;
    private javax.swing.JLabel lbl_dcp5;
    private javax.swing.JLabel lbl_dcp6;
    private javax.swing.JLabel lbl_dcp7;
    private javax.swing.JLabel lbl_dcp8;
    private javax.swing.JLabel lbl_dcp9;
    private javax.swing.JLabel lbl_tx1;
    private javax.swing.JLabel lbl_tx2;
    private javax.swing.JPanel pn_ayuda;
    private javax.swing.JPanel pn_calculadora;
    private javax.swing.JPanel pn_historial;
    private javax.swing.JButton tf_0;
    private javax.swing.JButton tf_1;
    private javax.swing.JButton tf_2;
    private javax.swing.JButton tf_3;
    private javax.swing.JButton tf_4;
    private javax.swing.JButton tf_5;
    private javax.swing.JButton tf_6;
    private javax.swing.JButton tf_7;
    private javax.swing.JButton tf_8;
    private javax.swing.JButton tf_9;
    private javax.swing.JButton tf_borrar;
    private javax.swing.JButton tf_borrar1;
    private javax.swing.JButton tf_div;
    private javax.swing.JButton tf_igual;
    private javax.swing.JButton tf_multi;
    private javax.swing.JTextField tf_pantalla;
    private javax.swing.JButton tf_punto;
    private javax.swing.JButton tf_restar;
    private javax.swing.JButton tf_suma;
    private javax.swing.JTabbedPane tp_principal;
    private javax.swing.JScrollPane tx_historial;
    private javax.swing.JTextArea tx_historial2;
    // End of variables declaration//GEN-END:variables
}
