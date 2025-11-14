package javaapplication5;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Jogo extends javax.swing.JFrame {
    
    JConnectorDB dados = new JConnectorDB();
    Perdeu perdeste = new Perdeu();
    public String perguntas[] = new String[6];
    public double pontuacao = 100.0;
    int pulosRestantes = 3;
    int dicasRestantes = 3;
    String nomes;
    int dicasPorRound = 1;
    ArrayList<String> perUsadas = new ArrayList<String>();
    int perguntasColocadas=0;
    
    public Jogo() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parar = new javax.swing.JLabel();
        valor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        resposta4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pular = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dica = new javax.swing.JLabel();
        resposta3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        resposta2 = new javax.swing.JLabel();
        resposta1 = new javax.swing.JLabel();
        pergunta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(1024, 768, 768, 768));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        parar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        parar.setForeground(new java.awt.Color(0, 0, 0));
        parar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        parar.setText("Parar");
        parar.setToolTipText("");
        parar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        parar.setVerifyInputWhenFocusTarget(false);
        parar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pararMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pararMouseEntered(evt);
            }
        });
        getContentPane().add(parar);
        parar.setBounds(630, 320, 350, 60);

        valor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        valor.setForeground(new java.awt.Color(0, 0, 0));
        valor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valor.setText("Pontuação: 1.0");
        valor.setToolTipText("");
        valor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        valor.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(valor);
        valor.setBounds(630, 240, 360, 70);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("4");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 640, 80, 90);

        resposta4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resposta4.setForeground(new java.awt.Color(0, 0, 0));
        resposta4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resposta4.setText("<html><center> </center></html>");
        resposta4.setToolTipText("");
        resposta4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resposta4.setVerifyInputWhenFocusTarget(false);
        resposta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resposta4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resposta4MouseEntered(evt);
            }
        });
        getContentPane().add(resposta4);
        resposta4.setBounds(130, 640, 350, 90);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("1");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 320, 80, 100);

        pular.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pular.setForeground(new java.awt.Color(0, 0, 0));
        pular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pular.setText("3 Pulos restantes");
        pular.setToolTipText("");
        pular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pular.setVerifyInputWhenFocusTarget(false);
        pular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pularMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pularMouseEntered(evt);
            }
        });
        getContentPane().add(pular);
        pular.setBounds(630, 600, 360, 130);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("2");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 430, 80, 90);

        dica.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dica.setForeground(new java.awt.Color(0, 0, 0));
        dica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dica.setText("3 Ajudas restantes");
        dica.setToolTipText("");
        dica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dica.setVerifyInputWhenFocusTarget(false);
        dica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dicaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dicaMouseEntered(evt);
            }
        });
        getContentPane().add(dica);
        dica.setBounds(630, 460, 360, 130);

        resposta3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resposta3.setForeground(new java.awt.Color(0, 0, 0));
        resposta3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resposta3.setText("<html><center> </center></html>");
        resposta3.setToolTipText("");
        resposta3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resposta3.setVerifyInputWhenFocusTarget(false);
        resposta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resposta3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resposta3MouseEntered(evt);
            }
        });
        getContentPane().add(resposta3);
        resposta3.setBounds(130, 530, 350, 90);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("3");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 530, 80, 90);

        resposta2.setBackground(new java.awt.Color(255, 255, 255));
        resposta2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resposta2.setForeground(new java.awt.Color(0, 0, 0));
        resposta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resposta2.setText("<html><center> </center></html>");
        resposta2.setToolTipText("");
        resposta2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resposta2.setVerifyInputWhenFocusTarget(false);
        resposta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resposta2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resposta2MouseEntered(evt);
            }
        });
        getContentPane().add(resposta2);
        resposta2.setBounds(130, 430, 350, 90);

        resposta1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resposta1.setForeground(new java.awt.Color(0, 0, 0));
        resposta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resposta1.setText("<html><center> </center></html>");
        resposta1.setToolTipText("");
        resposta1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resposta1.setVerifyInputWhenFocusTarget(false);
        resposta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resposta1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resposta1MouseEntered(evt);
            }
        });
        getContentPane().add(resposta1);
        resposta1.setBounds(130, 320, 350, 100);

        pergunta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pergunta.setForeground(new java.awt.Color(0, 0, 0));
        pergunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pergunta.setText("<html><center> </center></html>");
        pergunta.setToolTipText("");
        pergunta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pergunta.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(pergunta);
        pergunta.setBounds(90, 100, 840, 100);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Show do Milhão");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 0, 360, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/4433votarjapa.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -10, 1030, 780);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void resposta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resposta1MouseClicked
        clicouPergunta(1);
    }//GEN-LAST:event_resposta1MouseClicked

    private void resposta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resposta2MouseClicked
        clicouPergunta(2);
    }//GEN-LAST:event_resposta2MouseClicked

    private void resposta3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resposta3MouseClicked
        clicouPergunta(3);
    }//GEN-LAST:event_resposta3MouseClicked

    private void resposta4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resposta4MouseClicked
        clicouPergunta(4);
    }//GEN-LAST:event_resposta4MouseClicked

    private void dicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dicaMouseClicked
        if(dicasRestantes>0) {
            if(dicasPorRound >0) {
                apertouDica();
            }
        }
        
    }//GEN-LAST:event_dicaMouseClicked

    private void pularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pularMouseClicked
        if(pulosRestantes>0) {
            int input = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja pular essa questão?");
            if(input ==JOptionPane.YES_OPTION) {
                pulosRestantes--;
                mudarPergunta();
                pular.setText(pulosRestantes+" Pulos restantes");
                JOptionPane.showMessageDialog(null, "Questão pulada!");
                if(pulosRestantes <1) {
                    pular.setFocusable(false);
                }
            }
        }
    }//GEN-LAST:event_pularMouseClicked

    private void pararMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pararMouseClicked
        int input = JOptionPane.showConfirmDialog(null, "Deseja mesmo parar por aqui? sua pontuação será salva.");
        if(input ==0) {
            parouJogo();
        }
    }//GEN-LAST:event_pararMouseClicked

    private void resposta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resposta1MouseEntered
        resposta1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_resposta1MouseEntered

    private void resposta2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resposta2MouseEntered
        resposta2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_resposta2MouseEntered

    private void resposta3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resposta3MouseEntered
        resposta3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_resposta3MouseEntered

    private void resposta4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resposta4MouseEntered
        resposta4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        // TODO add your handling code here:
    }//GEN-LAST:event_resposta4MouseEntered

    private void pararMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pararMouseEntered
        parar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_pararMouseEntered

    private void dicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dicaMouseEntered
        // TODO add your handling code here:
        dica.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_dicaMouseEntered

    private void pularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pularMouseEntered
        pular.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_pularMouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        mudarPergunta();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new Jogo2().setVisible(true);
                Jogo cleber = new Jogo();
                cleber.setVisible(true);
                cleber.setSize(1034, 798);
                cleber.setLocationRelativeTo(null);
                cleber.setResizable(false);
            }
        });
    }
    
    public void perdeuJogo() {
        dados.ManipularDados(
                "INSERT INTO `tb_ranking` (`nome`, `pontos`)\n" +
                "VALUES ('"+nomes+"', '"+pontuacao+"');"
        );
        perdeste.setVisible(true);
        perdeste.setSize(1034, 798);
        perdeste.setLocationRelativeTo(null);
        perdeste.setResizable(false);
        perdeste.pontuacao2 = pontuacao;
        perdeste.perdou.setText("Perdeu!");
        dispose();
    }
    
    public void clicouPergunta(int qualFoi) {
        int input = JOptionPane.showConfirmDialog(null, "Você tem certeza?");
        if(input ==JOptionPane.YES_OPTION) {
            String texto = resposta1.getText();
            if(qualFoi ==1) {
                texto = resposta1.getText();
            }if(qualFoi ==2) {
                texto = resposta2.getText();
            } if(qualFoi ==3) {
                texto = resposta3.getText();
            } if(qualFoi ==4) {
                texto = resposta4.getText();
            }
            texto = texto.substring(14);
            if(texto.contains(perguntas[1])) {
                JOptionPane.showMessageDialog(null, "Acertou !");
                pontuacao +=100;
                mudarPergunta();
            } else {
                JOptionPane.showMessageDialog(null, "Errou!\nA questão era: "+ perguntas[1]);
                pontuacao = pontuacao*0.5;
                perdeuJogo();
            }
            valor.setText("Pontuação: "+pontuacao);
        }
    }
    
    public void apertouDica() {
        int input = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja uma dica??");
        if(input ==JOptionPane.YES_OPTION) {
            Random numero1 = new Random();
            int ii = numero1.nextInt(4);
            String respostas[] = new String[4];
            respostas[0] = resposta1.getText();
            respostas[0] = respostas[0].substring(14);
            respostas[1] = resposta2.getText();
            respostas[1] = respostas[1].substring(14);
            respostas[2] = resposta3.getText();
            respostas[2] = respostas[2].substring(14);
            respostas[3] = resposta4.getText();
            respostas[3] = respostas[3].substring(14);
            if(respostas[ii].contains(perguntas[1])) {
                if(ii==0) {
                    ii++;
                }if(ii<=3&&ii!=0) {
                    ii--;
                }
            } if (!respostas[ii].contains(perguntas[1])) {
                if(respostas[ii].equals(respostas[0])) {
                    resposta1.setForeground (Color.red);
                }
                if(respostas[ii].equals(respostas[1])) {
                    resposta2.setForeground (Color.red);
                }
                if(respostas[ii].equals(respostas[2])) {
                    resposta3.setForeground (Color.red);
                }
                if(respostas[ii].equals(respostas[3])) {
                    resposta4.setForeground (Color.red);
                }
            }
            if(dicasRestantes<1) {
                dica.setFocusable(false);
            }
            JOptionPane.showMessageDialog(null, "Dica concedida!");
            dicasPorRound--;
            dicasRestantes--;
            dica.setText(dicasRestantes+" Dicas restantes");
        }
    }
    
    public void parouJogo() {
            dados.ManipularDados(
                "INSERT INTO `tb_ranking` (`nome`, `pontos`)\n" +
                "VALUES ('"+nomes+"', '"+pontuacao+"');"
            );
            perdeste.setVisible(true);
            perdeste.setSize(1034, 798);
            perdeste.setLocationRelativeTo(null);
            perdeste.setResizable(false);
            perdeste.pontuacao2 = pontuacao;
            perdeste.perdou.setText("Parou!");
            dispose();
    }
    
    public void mudarPergunta() {
        perguntasColocadas++;
        if(perguntasColocadas==508) {
            JOptionPane.showMessageDialog(null, "Parabéns !, você conseguiu ver todas as questões do jogo !");
            parouJogo();
        }
        resposta1.setForeground (Color.black);
        resposta2.setForeground (Color.black);
        resposta3.setForeground (Color.black);
        resposta4.setForeground (Color.black);
        pular.setText(pulosRestantes+" Pulos restantes");
        dica.setText(dicasRestantes+" Dicas restantes");
        Random arthur = new Random();
        int numero = arthur.nextInt(508)+1;
        valor.setText("Pontuação: "+ pontuacao);
        perguntas = dados.Consulta("select * from tb_perguntas where id_pergunta = "+String.valueOf(numero));
        
        while(perUsadas.contains(perguntas[5])) {
            numero = arthur.nextInt(508)+1;
            perguntas = dados.Consulta("select * from tb_perguntas where id_pergunta = "+String.valueOf(numero));
        }
        perUsadas.add(perguntas[5]);
        
        dicasPorRound =1;
        
        pergunta.setText("<html><center>"+perguntas[0]+"</center></html>");
        
        ArrayList<String> perguntas2 = new ArrayList<String>();
        perguntas2.add(perguntas[1]);
        perguntas2.add(perguntas[2]);
        perguntas2.add(perguntas[3]);
        perguntas2.add(perguntas[4]);
        Collections.shuffle(perguntas2);
        
        resposta1.setText("<html><center>" + perguntas2.get(0) + "</center></html>");
        resposta2.setText("<html><center>" + perguntas2.get(1) + "</center></html>");
        resposta3.setText("<html><center>" + perguntas2.get(2) + "</center></html>");
        resposta4.setText("<html><center>" + perguntas2.get(3) + "</center></html>");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel parar;
    private javax.swing.JLabel pergunta;
    private javax.swing.JLabel pular;
    private javax.swing.JLabel resposta1;
    private javax.swing.JLabel resposta2;
    private javax.swing.JLabel resposta3;
    private javax.swing.JLabel resposta4;
    private javax.swing.JLabel valor;
    // End of variables declaration//GEN-END:variables
}