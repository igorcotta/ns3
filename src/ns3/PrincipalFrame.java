/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PrincipalFrame.java
 * 
 * Created on 04/10/2011, 10:46:50
 */
package ns3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.text.Position;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;



/**
 *
 * @author João
 */
public class PrincipalFrame extends javax.swing.JFrame {

    static final int TERMINAL = 0;
    static final int SWITCH = 1;
    static final int AP = 2;
    static final int ROUTER = 3;
    
    
    int flagLinha = 0;
    int linhaX, linhaY;
    Component auxLink;
    
    Node ultimaBorda = null;
    Node nodes[] = new Node [500];
    Conexao conexoes[] = new Conexao[100];
    Aplicacao aplicacoes[] = new Aplicacao[100];
    
    String codigo = "";
    AbrirFrame abrir = new AbrirFrame();
    File routerF;
    
    /** Creates new form PrincipalFrame */
    public PrincipalFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMonitor = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupNotebook = new javax.swing.JPopupMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenuExcluir = new javax.swing.JMenuItem();
        panelAmbiente = new javax.swing.JPanel();
        scrArvore = new javax.swing.JScrollPane();
        arvore = new javax.swing.JTree();
        scrComponentes = new javax.swing.JScrollPane();
        panelComponentes = new javax.swing.JPanel();
        terminalMenu = new javax.swing.JLabel();
        switchMenu = new javax.swing.JLabel();
        accessPointMenu = new javax.swing.JLabel();
        routerMenu = new javax.swing.JLabel();
        scrPropriedades = new javax.swing.JScrollPane();
        panelConfiguracao = new javax.swing.JPanel();
        tbtnUDP = new javax.swing.JToggleButton();
        lblCriarAplicacao = new javax.swing.JLabel();
        tbtnTCP = new javax.swing.JToggleButton();
        cmbAplicacoes = new javax.swing.JComboBox();
        lblAplicacoes = new javax.swing.JLabel();
        tbtnecho = new javax.swing.JToggleButton();
        lblCriarConexao = new javax.swing.JLabel();
        tbtnP2P = new javax.swing.JToggleButton();
        tbtnCSMA = new javax.swing.JToggleButton();
        tbtnWifi = new javax.swing.JToggleButton();
        cmbConexoes = new javax.swing.JComboBox();
        lblConexoes = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuNovo = new javax.swing.JMenuItem();
        jMenuAbrir = new javax.swing.JMenuItem();
        jMenuFechar = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuCodigo = new javax.swing.JMenuItem();

        jMenu1.setText("Atributos");

        jMenuItem2.setText("Atributo 1");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Atributo 2");
        jMenu1.add(jMenuItem3);

        jPopupMonitor.add(jMenu1);

        jMenu3.setText("Aplicações");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Aplicação 1");
        jMenu3.add(jCheckBoxMenuItem1);

        jPopupMonitor.add(jMenu3);

        jMenu4.setText("Atributos");

        jMenuItem4.setText("Atributo 1");
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("Atributo 2");
        jMenu4.add(jMenuItem5);

        jPopupNotebook.add(jMenu4);

        jMenu5.setText("Aplicações");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Aplicação 1");
        jMenu5.add(jCheckBoxMenuItem2);

        jPopupNotebook.add(jMenu5);

        jMenuExcluir.setText("Remover");
        jPopupNotebook.add(jMenuExcluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        panelAmbiente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelAmbiente.setMaximumSize(null);
        panelAmbiente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelAmbienteMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout panelAmbienteLayout = new javax.swing.GroupLayout(panelAmbiente);
        panelAmbiente.setLayout(panelAmbienteLayout);
        panelAmbienteLayout.setHorizontalGroup(
            panelAmbienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );
        panelAmbienteLayout.setVerticalGroup(
            panelAmbienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        arvore.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Componentes");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Terminal");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Switch");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("AccessPoint");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Router");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Hub");
        treeNode1.add(treeNode2);
        arvore.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        scrArvore.setViewportView(arvore);

        panelComponentes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        terminalMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Terminal.png"))); // NOI18N
        terminalMenu.setToolTipText("Terminal");
        terminalMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terminalMenuMouseClicked(evt);
            }
        });

        switchMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Switch.png"))); // NOI18N
        switchMenu.setToolTipText("Switch");
        switchMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                switchMenuMouseClicked(evt);
            }
        });

        accessPointMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AccessPoint.png"))); // NOI18N
        accessPointMenu.setToolTipText("Wifi AP");
        accessPointMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accessPointMenuMouseClicked(evt);
            }
        });

        routerMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Router.png"))); // NOI18N
        routerMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                routerMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelComponentesLayout = new javax.swing.GroupLayout(panelComponentes);
        panelComponentes.setLayout(panelComponentesLayout);
        panelComponentesLayout.setHorizontalGroup(
            panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComponentesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(terminalMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(switchMenu)
                    .addComponent(routerMenu)
                    .addComponent(accessPointMenu))
                .addGap(39, 39, 39))
        );
        panelComponentesLayout.setVerticalGroup(
            panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComponentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(terminalMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(switchMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(routerMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(accessPointMenu)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        scrComponentes.setViewportView(panelComponentes);

        scrPropriedades.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panelConfiguracao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Configuração ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        panelConfiguracao.setPreferredSize(new java.awt.Dimension(656, 30));

        tbtnUDP.setText("UDP");
        tbtnUDP.setFocusable(false);
        tbtnUDP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtnUDP.setPreferredSize(new java.awt.Dimension(63, 28));
        tbtnUDP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblCriarAplicacao.setForeground(new java.awt.Color(5, 0, 0));
        lblCriarAplicacao.setText("Criar Aplicação:");

        tbtnTCP.setText("TCP");
        tbtnTCP.setFocusable(false);
        tbtnTCP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtnTCP.setPreferredSize(new java.awt.Dimension(63, 28));
        tbtnTCP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        cmbAplicacoes.setPreferredSize(new java.awt.Dimension(200, 28));
        cmbAplicacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAplicacoesActionPerformed(evt);
            }
        });

        lblAplicacoes.setText("Aplicações:");

        tbtnecho.setText("ECHO");
        tbtnecho.setFocusable(false);
        tbtnecho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtnecho.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblCriarConexao.setForeground(new java.awt.Color(5, 0, 0));
        lblCriarConexao.setText("Criar Conexão:");

        tbtnP2P.setText("P2P");
        tbtnP2P.setFocusable(false);
        tbtnP2P.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtnP2P.setPreferredSize(new java.awt.Dimension(63, 28));
        tbtnP2P.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        tbtnCSMA.setText("Csma");
        tbtnCSMA.setFocusable(false);
        tbtnCSMA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtnCSMA.setPreferredSize(new java.awt.Dimension(63, 28));
        tbtnCSMA.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        tbtnWifi.setText("Wifi");
        tbtnWifi.setFocusable(false);
        tbtnWifi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtnWifi.setPreferredSize(new java.awt.Dimension(63, 28));
        tbtnWifi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        cmbConexoes.setPreferredSize(new java.awt.Dimension(200, 28));
        cmbConexoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbConexoesActionPerformed(evt);
            }
        });

        lblConexoes.setText("Conexões:");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConfiguracaoLayout = new javax.swing.GroupLayout(panelConfiguracao);
        panelConfiguracao.setLayout(panelConfiguracaoLayout);
        panelConfiguracaoLayout.setHorizontalGroup(
            panelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfiguracaoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCriarConexao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCriarAplicacao, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(panelConfiguracaoLayout.createSequentialGroup()
                        .addComponent(tbtnP2P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tbtnCSMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tbtnWifi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelConfiguracaoLayout.createSequentialGroup()
                        .addComponent(tbtnTCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tbtnUDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tbtnecho)))
                .addGap(13, 13, 13)
                .addGroup(panelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConexoes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAplicacoes, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cmbConexoes, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAplicacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(btnLimpar)
                .addGap(0, 0, 0))
        );
        panelConfiguracaoLayout.setVerticalGroup(
            panelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfiguracaoLayout.createSequentialGroup()
                .addGroup(panelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelConfiguracaoLayout.createSequentialGroup()
                        .addGroup(panelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblConexoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbConexoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tbtnWifi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tbtnCSMA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tbtnP2P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addGroup(panelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbtnecho, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tbtnTCP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbtnUDP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbAplicacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAplicacoes))))
                    .addGroup(panelConfiguracaoLayout.createSequentialGroup()
                        .addComponent(lblCriarConexao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblCriarAplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
            .addGroup(panelConfiguracaoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnLimpar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuArquivo.setText("Arquivo");

        jMenuNovo.setText("Novo");
        jMenuArquivo.add(jMenuNovo);

        jMenuAbrir.setText("Abrir");
        jMenuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAbrirActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuAbrir);

        jMenuFechar.setText("Fechar");
        jMenuFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFecharActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuFechar);

        jMenuBar1.add(jMenuArquivo);

        jMenuEditar.setText("Editar");
        jMenuBar1.add(jMenuEditar);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItem1.setText("Upload Route Table");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItem1);

        jMenuBar1.add(jMenuFerramentas);

        jMenu2.setText("Gerar");

        jMenuCodigo.setText("Código C++");
        jMenuCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCodigoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuCodigo);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrArvore)
                    .addComponent(scrComponentes, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelAmbiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(scrPropriedades, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelConfiguracao, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrArvore, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(scrComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelConfiguracao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrPropriedades)
                            .addComponent(panelAmbiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void terminalMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terminalMenuMouseClicked
            try {
                criarNo(TERMINAL);
            } catch (IOException ex) {
                Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            manterLinks();
    }//GEN-LAST:event_terminalMenuMouseClicked

    private void switchMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchMenuMouseClicked
            try {
                criarNo(SWITCH);
            } catch (IOException ex) {
                Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            manterLinks();
    }//GEN-LAST:event_switchMenuMouseClicked

    private void accessPointMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accessPointMenuMouseClicked
            try {
                criarNo(AP);
            } catch (IOException ex) {
                Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            manterLinks();
    }//GEN-LAST:event_accessPointMenuMouseClicked

    private void routerMenuMouseClicked(java.awt.event.MouseEvent evt) {                                        
            try {
                criarNo(ROUTER);
            } catch (IOException ex) {
                Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            manterLinks();
    }                                        

    private void criarNo(int tipo) throws IOException{
        
        Node newNode = new Node(tipo);
            
        nodes[Node.getQtde()] = newNode;
        Node.upQtde(tipo);

        newNode.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                Node label = ((Node)evt.getComponent());
                //if(jTBExcluir.isSelected())
                    //excluirNo(label);
                criarConexao(evt);
                
                if(tbtnTCP.isSelected()||tbtnUDP.isSelected()||tbtnecho.isSelected())
                    validarAplicacao(evt);
                if(ultimaBorda!=null){
                    ultimaBorda.setBorder(null);
                    ultimaBorda.setSelected(false);
                }
                label.setSelected(true);
                ultimaBorda = label;
                label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 127, 0)));
                label.exibirPropriedades(label.getTipo(),scrPropriedades);
                
                   RouterTable routerT = null;                     
                
                if(label.isEnableTable() && label.getTipo() == 3){
                    routerT = new RouterTable(label.getId());
                    routerT.createTable(nodes, label.getNome(), routerF);
                    routerT.setVisible(true);
                }
            }
            
            @Override
            public void mouseMoved(MouseEvent evt) {
                manterLinks();
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                manterLinks();
            }
            @Override
            public void mouseEntered(MouseEvent evt) {
                manterLinks();
            }
            @Override
            public void mouseDragged(MouseEvent evt) {
                manterLinks();
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                manterLinks();
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                manterLinks();
            }

        }); 
        
        inserirComponenteArvore(newNode);
        panelAmbiente.add(newNode);
        panelAmbiente.repaint();
    }

    public void excluirNo(Node no){
        int i,j,k,flag=0;
        Node labelLink = null;
        
        //jTBExcluir.setSelected(false);
        no.setVisible(false);
        removerComponenteArvore(no);
        
        for(i=0;i<Node.getQtde();i++){
            if(nodes[i]==no)
                flag++;
            if(flag==1)
                nodes[i]=nodes[i+1];
        }
        Node.downQtde(no.getTipo());
        
        for(i=0;i<Conexao.getQtde();i++){
            if((conexoes[i].getNo1() == no) || (conexoes[i].getNo2() == no)){
                conexoes[i] = null;
                for(j=i+1;j<Conexao.getQtde();j++){
                    conexoes[i] = conexoes[j];
                }
                i--;
                Conexao.downQtde();
            }
        }
        
        no.setNome("");
        
        manterLinks();
        panelAmbiente.repaint();
        remove(no);
        
    }
    
    private String inserirComponenteArvore(Node no){
        String prefix = "";
        int startRow = 0;
        
        switch(no.getTipo()){
            case TERMINAL: {
                     prefix = "Terminal";
                    }break;
            case SWITCH: {
                     prefix = "Switch";
                    }break;
            case AP: {
                     prefix = "AccessPoint";
                    }break;
            case ROUTER: {
                     prefix = "Router";
                    }break;
        }


        DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode(no.getNome());
        TreePath path = arvore.getNextMatch(prefix, startRow, Position.Bias.Forward);
        arvore.setSelectionPath(path);
        ((DefaultMutableTreeNode)arvore.getSelectionPath().getLastPathComponent()).add(treeNode2);
        
        arvore = new JTree(arvore.getModel());
        scrArvore.setViewportView(arvore);
        arvore.expandPath(path);
        arvore.addMouseListener(new java.awt.event.MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent evt) {
            String nomePaiSelecionado = "";
            String nomeSelecionado = "";
            int i;

            if(((JTree)evt.getComponent()).getSelectionPath()==null) return;

            nomePaiSelecionado = ((JTree)evt.getComponent()).getSelectionPath().getParentPath().getLastPathComponent().toString();
            nomeSelecionado = ((JTree)evt.getComponent()).getSelectionPath().getLastPathComponent().toString();

            for(i=0;i<Node.getQtde();i++){
                    if(nodes[i].getNome().equals(nomeSelecionado)){
                        if(ultimaBorda!=null) ultimaBorda.setBorder(null);
                        ultimaBorda = nodes[i];
                        //ultimaBorda.exibirPropriedades(((Node)evt.getComponent()).getTipo(),jScrollPane3);
                        //ultimaBorda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 127, 0)));
                    }
            }
        }
            
        });
        
        return no.getNome();
    }
    
    public void removerComponenteArvore(Node no){
        
        arvore.expandRow(1);
        arvore.expandRow(2+Node.getQtde(TERMINAL));
        arvore.expandRow(3+Node.getQtde(TERMINAL)+Node.getQtde(SWITCH));
        arvore.expandRow(4+Node.getQtde(TERMINAL)+Node.getQtde(SWITCH)+Node.getQtde(AP));
        
        TreePath path = arvore.getNextMatch(no.getNome(), 0, Position.Bias.Forward);
        arvore.setSelectionPath(path);
        ((DefaultMutableTreeNode)arvore.getSelectionPath().getLastPathComponent()).removeFromParent();
        arvore = new JTree(arvore.getModel());
        scrArvore.setViewportView(arvore);
        arvore.expandPath(path.getParentPath());
        
    }

    private void gerarCodigo(String string) throws IOException{
        
        
        float delay;
        int index = 0;
        
        List metricas = new ArrayList();
        String [] ipsUsados = new String [100];
        
        for(int i=0; i<Conexao.getQtde();i++){
            delay = conexoes[i].getDelay();
            Collections.sort(metricas);
            if(Collections.frequency(metricas, delay) == 0 )
                metricas.add(delay);                        
        }
        
        Collections.sort(metricas); //ordena as metricas
        //seta as métricas de todas conexões
        for(int i=0; i<Conexao.getQtde();i++){
            delay = conexoes[i].getDelay();
            index = Collections.binarySearch(metricas, delay);
            conexoes[i].setMetrica(index);
        }
        
        File padroes = new File("padroes/fixo.txt");
        Scanner scan = new Scanner(padroes);
        String temp;
        
        while(scan.hasNext()){
            temp = scan.nextLine();
            codigo += temp+"\n";
        }
        codigo += string + "\n";


        Scanner scanner;

        File padrao = new File("padroes/node.txt");

        for(int i=0;i<Node.getQtde();i++){
            scanner = new Scanner(padrao); 
            codigo += scanner.nextLine() + nodes[i].getNome() + ";\n";
            codigo += "\t" + nodes[i].getNome() + scanner.nextLine() + "\n";
        }


        File arquivo = new File("Script.cc");
        PrintWriter pw = new PrintWriter(new FileWriter(arquivo));

        codigo += "\n\tInternetStackHelper internet; \n";
        codigo += "\tinternet.InstallAll (); \n\n";


        int i;
        for(i=0;i<Conexao.getQtde();i++){

            // Leitura do arquivo Point to Point
            if(conexoes[i].getTipo().equals("pointToPoint")){
                
                
                
                File p2p = new File("padroes/p2p.txt");
                scanner = new Scanner(p2p);

                while(scanner.hasNext()){
                    if(scanner.nextLine().equals("CRIAR"))
                        break;
                }
                    codigo += scanner.nextLine() + conexoes[i].getNome() + ";\n";
                    codigo += "\t" + conexoes[i].getNome() + scanner.nextLine() + conexoes[i].getDataRate() + scanner.nextLine() + "\n";
                    codigo += "\t" + conexoes[i].getNome() + scanner.nextLine() + conexoes[i].getDelay() + scanner.nextLine()+"\n\n";
                    codigo += scanner.nextLine() + conexoes[i].getIdConexao() + ";\n";
                    codigo += scanner.nextLine() + conexoes[i].getIdConexao() + scanner.nextLine() + ((Node)conexoes[i].getNo1()).getNome() + scanner.nextLine() + "\n";
                    codigo += scanner.nextLine() + conexoes[i].getIdConexao() + scanner.nextLine() + ((Node)conexoes[i].getNo2()).getNome() + scanner.nextLine() +"\n\n";
                    codigo += scanner.nextLine() + conexoes[i].getNome() + ";\n";
                    codigo += scanner.nextLine() + conexoes[i].getNome() + scanner.nextLine() + conexoes[i].getNome() + scanner.nextLine() + conexoes[i].getIdConexao() + scanner.nextLine()+"\n\n";

                    File ipv4 = new File("padroes/IPV4.txt");
                    scanner = new Scanner(ipv4);

                    codigo += scanner.nextLine() + "address_" + conexoes[i].getNome() + ";\n";
                    codigo += "\taddress_" + conexoes[i].getNome() + scanner.nextLine() + conexoes[i].getIp() + scanner.nextLine() + conexoes[i].getMascara() + scanner.nextLine()+"\n";
                    codigo += scanner.nextLine() + "interfaces_" + conexoes[i].getNome() + ";\n";
                    codigo += "\tinterfaces_" + conexoes[i].getNome() + " = " + "address_" + conexoes[i].getNome()+ scanner.nextLine() + "devices_" + conexoes[i].getNome() + scanner.nextLine() + "\n\n";

                    codigo += "\tinterfaces_"+ conexoes[i].getNome() + ".SetMetric( 0, " + conexoes[i].getMetrica() + ");\n";
                    codigo += "\tinterfaces_"+ conexoes[i].getNome() + ".SetMetric( 1, " + conexoes[i].getMetrica() + ");\n\n";
                    
                    
            }

            // Conexão Csma
            if(conexoes[i].getTipo().equals("csma")){

                File csma = new File("padroes/csma.txt");
                scanner = new Scanner(csma);

                //verifica se o ip ja esta sendo usado
                int uso = 1; // 0 -> esta sendo usado 1-> nao esta sendo usado  
                for(int j=0;j<100;j++){
                    if(conexoes[i].getIp().equals(ipsUsados[j]))
                            uso = 0;
                }

                //nova conexao 
                if(uso == 1){                            
                    codigo += scanner.nextLine() + conexoes[i].getNome() + ";\n";
                    codigo += "\t" + conexoes[i].getNome() + scanner.nextLine() + conexoes[i].getDataRate() + scanner.nextLine() + "\n";
                    codigo += "\t" + conexoes[i].getNome() + scanner.nextLine() + conexoes[i].getDelay() + scanner.nextLine()+"\n\n";
                    codigo += scanner.nextLine() + conexoes[i].getNome() + ";\n"; 
                    ipsUsados[i] = conexoes[i].getIp(); 

                    for(int j=0;j<Conexao.getQtde();j++){                            
                        if(conexoes[j].getIp().equals(ipsUsados[i])){
                            File csmaNode = new File("padroes/csmaNode.txt");
                                scanner = new Scanner(csmaNode);

                            if(((Node)conexoes[j].getNo1()).getTipo() == 0 || ((Node)conexoes[j].getNo1()).getTipo() == 3)
                                codigo += scanner.nextLine() + conexoes[i].getNome() + scanner.nextLine() + ((Node)conexoes[j].getNo1()).getNome() + " );\n";

                            else 
                                codigo += scanner.nextLine() + conexoes[i].getNome() + scanner.nextLine() + ((Node)conexoes[j].getNo2()).getNome() + " );\n";

                        } 
                    }

                    codigo += scanner.nextLine() + conexoes[i].getNome() + ";\n";
                    codigo += scanner.nextLine() + conexoes[i].getNome() + " = " + scanner.nextLine()  + conexoes[i].getIdConexao() + scanner.nextLine() + conexoes[i].getNome() + ");\n\n";

                    // Leitura do arquivo ipv4
                    File ipv4 = new File("padroes/IPV4.txt");
                    scanner = new Scanner(ipv4);

                    codigo += scanner.nextLine() + "address_" + conexoes[i].getNome() + ";\n";
                    codigo += "\taddress_" + conexoes[i].getNome() + scanner.nextLine() + conexoes[i].getIp() + scanner.nextLine() + conexoes[i].getMascara() + scanner.nextLine()+"\n";
                    codigo += scanner.nextLine() + "interfaces_" + conexoes[i].getNome() + ";\n";
                    codigo += "\tinterfaces_" + conexoes[i].getNome() + " = " + "address_" + conexoes[i].getNome()+ scanner.nextLine() + "devices_" + conexoes[i].getNome() + scanner.nextLine() + "\n\n";
                    
                    int aux = 0;
                    for(int j=0;j<Conexao.getQtde();j++){
                        if(conexoes[j].getIp().equals(ipsUsados[i])){
                            codigo += "\tinterfaces_"+ conexoes[i].getNome() + ".SetMetric( " + aux +", " + conexoes[i].getMetrica() + ");\n";
                            aux++;
                        }
                    }
                    
                    codigo += "\n";
                }    
            }
        }


        File echoS = new File("padroes/EchoServer.txt");
        File echoC = new File("padroes/EchoClient.txt");

        for(i=0;i<Aplicacao.getQtde();i++){
            if(aplicacoes[i].getTipo().equals("Echo")){
                String node1 = ((Node) aplicacoes[i].getNo1()).getNome();

                for(int n=0;n<Conexao.getQtde();n++){
                    if(node1.equals(((Node)conexoes[n].getNo1()).getNome()) || node1.equals(((Node)conexoes[n].getNo2()).getNome())){

                        String ip = conexoes[n].getIp();
                        scanner = new Scanner(echoS);
                        codigo += scanner.nextLine() + "echoServer_"+ i + " (" + aplicacoes[i].getPorta() +");\n";
                        codigo += scanner.nextLine() + "serverApp_" + i + " = " + "echoServer_" + i + scanner.nextLine() + ((Node)aplicacoes[i].getNo1()).getNome() + ");\n"; 
                        codigo += "\tserverApp_" + i + scanner.nextLine() + aplicacoes[i].getIniciar() + "));\n";
                        codigo += "\tserverApp_" + i + scanner.nextLine() + aplicacoes[i].getParar() + "));\n\n";

                        int k = 0;
                        String str = null;
                        ip = conexoes[n].getIp();
                        while(k<Conexao.getQtde()){
                            if(ip.equals(conexoes[k].getIp())){
                                str = conexoes[k].getNome();
                                break;
                            }
                            k++;
                        }

                        k = 0;
                        int j = 0;
                        int nc = 0;
                        while(k<Conexao.getQtde()){
                            
                            if(conexoes[k].getTipo().equals("pointToPoint")){
                                if(((Node)conexoes[k].getNo1()).getNome().equals(((Node)aplicacoes[i].getNo2()).getNome()))
                                    j = 0;
                                
                                else if(((Node)conexoes[k].getNo2()).getNome().equals(((Node)aplicacoes[i].getNo2()).getNome()))
                                    j = 1;
                                
                            }

                            else if(conexoes[k].getTipo().equals("csma")){   
                                if(((Node)conexoes[k].getNo1()).getNome().equals(((Node)aplicacoes[i].getNo2()).getNome()) || ((Node)conexoes[k].getNo2()).getNome().equals(((Node)aplicacoes[i].getNo2()).getNome()))
                                    j = nc;
                                 
                                nc++;
                            }
                            k++;
                        }

                        scanner = new Scanner(echoC);
                        codigo += scanner.nextLine() + "echoClient_" + i + " (" + "interfaces_" + str + ".GetAddress (" + j + ") ," + aplicacoes[i].getPorta() + " );\n";
                        codigo += "\techoClient_" + i + scanner.nextLine() + aplicacoes[i].getMaxPackets() + "));\n";
                        codigo += "\techoClient_" + i + scanner.nextLine() + aplicacoes[i].getInterval() + ")));\n";
                        codigo += "\techoClient_" + i + scanner.nextLine() + aplicacoes[i].getPacketSize() + "));\n\n";
                        codigo += scanner.nextLine() + "clientApp_" + i + " = " + "echoClient_" + i + scanner.nextLine() + ((Node)aplicacoes[i].getNo2()).getNome() + ");\n"; 
                        codigo += "\tclientApp_" + i + scanner.nextLine() + aplicacoes[i].getIniciar() + "));\n";
                        codigo += "\tclientApp_" + i + scanner.nextLine() + aplicacoes[i].getParar() + "));\n\n";

                    }
                }
            }

            File tcp = new File("padroes/Tcp.txt");

            if(aplicacoes[i].getTipo().equals("Tcp")){

                String node1 = ((Node) aplicacoes[i].getNo2()).getNome();
                
                for(int n=0;n<Conexao.getQtde();n++){
                    if(node1.equals(((Node)conexoes[n].getNo1()).getNome()) || node1.equals(((Node)conexoes[n].getNo2()).getNome())){


                        int k = 0;
                        String str = null;
                        String ip = conexoes[n].getIp();
                        while(k<Conexao.getQtde()){
                            if(ip.equals(conexoes[k].getIp())){
                                str = conexoes[k].getNome();
                                break;
                            }
                            k++;
                        }

                        k = 0;
                        int j = 0;
                        int nc = 0;
                        while(k<Conexao.getQtde()){
                            
                            if(conexoes[k].getTipo().equals("pointToPoint")){
                                if(((Node)conexoes[k].getNo1()).getNome().equals(((Node)aplicacoes[i].getNo2()).getNome()))
                                    j = 0;
                                
                                else if(((Node)conexoes[k].getNo2()).getNome().equals(((Node)aplicacoes[i].getNo2()).getNome()))
                                    j = 1;
                                
                            }

                            else if(conexoes[k].getTipo().equals("csma")){   
                                if(((Node)conexoes[k].getNo1()).getNome().equals(((Node)aplicacoes[i].getNo2()).getNome()) || ((Node)conexoes[k].getNo2()).getNome().equals(((Node)aplicacoes[i].getNo2()).getNome()))
                                    j = nc;
                                 
                                nc++;
                            }
                            k++;
                        }

                        scanner = new Scanner(tcp);

                        codigo += scanner.nextLine() + i + scanner.nextLine() + "interfaces_" + str + ".GetAddress (" + j + ") ," + aplicacoes[i].getPorta() + " )));\n";
                        aplicacoes[i].setDataRate();
                        codigo += "\tonoff_" + i + scanner.nextLine() + aplicacoes[i].getDataRate() + "Kbps\"));\n";
                        codigo += "\tonoff_" + i + scanner.nextLine() + aplicacoes[i].getPacketSize() + "));\n\n"; 
                        
                        codigo += scanner.nextLine() + i + " = " + "onoff_" + i + scanner.nextLine() + ((Node)aplicacoes[i].getNo1()).getNome() + ");\n"; 
                        codigo += "\tapps_" + i + scanner.nextLine() + aplicacoes[i].getIniciar() + "));\n";
                        codigo += "\tapps_" + i + scanner.nextLine() + aplicacoes[i].getParar() + "));\n\n";

                        codigo += scanner.nextLine() + i + scanner.nextLine() + aplicacoes[i].getPorta() + " )));\n";
                        codigo += "\tapps_" + i +" = " + "sink_" + i + scanner.nextLine() +((Node)aplicacoes[i].getNo2()).getNome() + ");\n";
                        codigo += "\tapps_" + i + scanner.nextLine() + aplicacoes[i].getIniciar() + "));\n";
                        codigo += "\tapps_" + i + scanner.nextLine() + aplicacoes[i].getParar() + "));\n\n";

                    }
                }                        
            }

            File udp = new File("padroes/Udp.txt");

            if(aplicacoes[i].getTipo().equals("Udp")){

                String node1 = ((Node) aplicacoes[i].getNo2()).getNome();

                for(int n=0;n<Conexao.getQtde();n++){
                    if(node1.equals(((Node)conexoes[n].getNo1()).getNome()) || node1.equals(((Node)conexoes[n].getNo2()).getNome())){


                        int k = 0;
                        String str = null;
                        String ip = conexoes[n].getIp();
                        while(k<Conexao.getQtde()){
                            if(ip.equals(conexoes[k].getIp())){
                                str = conexoes[k].getNome();
                                break;
                            }
                            k++;
                        }



                        k = 0;
                        int j = 0;
                        int nc = 0;
                        while(k<Conexao.getQtde()){
                            
                            if(conexoes[k].getTipo().equals("pointToPoint")){
                                if(((Node)conexoes[k].getNo1()).getNome().equals(((Node)aplicacoes[i].getNo2()).getNome()))
                                    j = 0;
                                
                                else if(((Node)conexoes[k].getNo2()).getNome().equals(((Node)aplicacoes[i].getNo2()).getNome()))
                                    j = 1;
                                
                            }

                            else if(conexoes[k].getTipo().equals("csma")){   
                                if(((Node)conexoes[k].getNo1()).getNome().equals(((Node)aplicacoes[i].getNo2()).getNome()) || ((Node)conexoes[k].getNo2()).getNome().equals(((Node)aplicacoes[i].getNo2()).getNome()))
                                    j = nc;
                                 
                                nc++;
                            }
                            k++;
                        }

                        scanner = new Scanner(udp);

                        codigo += scanner.nextLine() + i + scanner.nextLine() + "interfaces_" + str + ".GetAddress (" + j + ") ," + aplicacoes[i].getPorta() + " )));\n";
                        aplicacoes[i].setDataRate();
                        codigo += "\tonoff_" + i + scanner.nextLine() + aplicacoes[i].getDataRate() + "Kbps\"));\n";
                        codigo += "\tonoff_" + i + scanner.nextLine() + aplicacoes[i].getPacketSize() + "));\n\n"; 
                        
                        codigo += scanner.nextLine() + i + " = " + "onoff_" + i + scanner.nextLine() + ((Node)aplicacoes[i].getNo1()).getNome() + ");\n"; 
                        codigo += "\tapps_" + i + scanner.nextLine() + aplicacoes[i].getIniciar() + "));\n";
                        codigo += "\tapps_" + i + scanner.nextLine() + aplicacoes[i].getParar() + "));\n\n";

                        codigo += scanner.nextLine() + i + scanner.nextLine() + aplicacoes[i].getPorta() + " )));\n";
                        codigo += "\tapps_" + i +" = " + "sink_" + i + scanner.nextLine() +((Node)aplicacoes[i].getNo2()).getNome() + ");\n";
                        codigo += "\tapps_" + i + scanner.nextLine() + aplicacoes[i].getIniciar() + "));\n";
                        codigo += "\tapps_" + i + scanner.nextLine() + aplicacoes[i].getParar() + "));\n\n";

                    }
                }                        
            }
        }

        for(int n=0;n<Conexao.getQtde();n++){

            if(conexoes[n].getTipo().equals("pointToPoint")){

                codigo += "\t" + conexoes[n].getNome() + ".EnablePcap (\"" + ((Node)conexoes[n].getNo1()).getNome() + "\" , "+ ((Node)conexoes[n].getNo1()).getNome() +");\n" ;
                codigo += "\t" + conexoes[n].getNome() + ".EnablePcap (\"" + ((Node)conexoes[n].getNo2()).getNome() + "\" , "+ ((Node)conexoes[n].getNo2()).getNome() +");\n" ;
            }
            
            if(conexoes[n].getTipo().equals("csma") ){
                String ip = conexoes[n].getIp();
                index = conexoes[n].getCsmaIndex(conexoes, ip); 
                if(((Node)conexoes[n].getNo1()).getTipo() == 0 || ((Node)conexoes[n].getNo1()).getTipo() == 3)
                    codigo += "\t" + conexoes[index].getNome() + ".EnablePcap (\"" + ((Node)conexoes[n].getNo1()).getNome() + "\" , "+ ((Node)conexoes[n].getNo1()).getNome() +");\n" ;

                else 
                    codigo += "\t" + conexoes[index].getNome() + ".EnablePcap (\"" + ((Node)conexoes[n].getNo2()).getNome() + "\" , "+ ((Node)conexoes[n].getNo2()).getNome() +");\n" ;

            }

        }
        
        File route = new File("padroes/Route.txt");
        scanner = new Scanner(route);
        codigo += "\n" + scanner.nextLine() + "\n";
        codigo += scanner.nextLine() + "\n";
        codigo += scanner.nextLine() + "\n";
        codigo += scanner.nextLine() + "\n";


        File fim = new File("padroes/fim.txt");
        scan = new Scanner(fim);

        while(scan.hasNext()){
            codigo += scan.nextLine()+"\n";
        }
        pw.println(codigo);
        pw.close();
        JOptionPane.showMessageDialog(null,"Código gerado com sucesso.");
        //JOptionPane.showMessageDialog(null,"Código gerado com sucesso em "+jFCSalvar.getCurrentDirectory().getAbsolutePath()+".");
    
    }
    
    private void jMenuCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCodigoActionPerformed
        try {
            codigo = "";
            gerarCodigo(codigo);
        } catch (IOException ex) {
            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuCodigoActionPerformed

    private void cmbConexoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbConexoesActionPerformed
        configurarConexao(cmbConexoes.getSelectedIndex());
        conexoes[cmbConexoes.getSelectedIndex()].setCor(Color.blue);
        cmbConexoes.setSelectedItem(null);
    }//GEN-LAST:event_cmbConexoesActionPerformed

    private void criarConexao(java.awt.event.MouseEvent evt){

        if(flagLinha==1){
            int i;
            Conexao newConexao;
            Conexao aux;
            String tipoAux = null;

             Graphics2D g2d = (Graphics2D) panelAmbiente.getGraphics().create();
             float dash1[] = {10.0f};
             BasicStroke dashed = new BasicStroke(3.0f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER,10.0f, dash1, 0.0f);


            g2d.drawLine(linhaX, linhaY, (evt.getComponent().getX()+evt.getComponent().getHeight()/2), (evt.getComponent().getY()+evt.getComponent().getWidth()/2));
            g2d.dispose();

            if(tbtnP2P.isSelected()){
                tipoAux = "pointToPoint";
                ((Node)auxLink).setIsP2P(true);
                ((Node)evt.getComponent()).setIsP2P(true);
            }
            if(tbtnCSMA.isSelected()){
                tipoAux = "csma";
                ((Node)auxLink).setIsCsma(true);
                ((Node)evt.getComponent()).setIsCsma(true);

            }
            if(tbtnWifi.isSelected()){
                tipoAux = "wifi";
                ((Node)auxLink).setIsWifi(true);
                ((Node)evt.getComponent()).setIsWifi(true);
            }

            newConexao = new Conexao(auxLink,evt.getComponent(),tipoAux);
           
            
            if(newConexao.getTipo().equals("csma")){

                for(i=0;i<Conexao.getQtde()-1;i++){
                    if(conexoes[i].getTipo().equals("csma")){
                        if(((Node)auxLink).getTipo()==1){
                                    if(conexoes[i].getNo1()==((Node)auxLink) || conexoes[i].getNo2()==((Node)auxLink)){
                                        newConexao.setIp(conexoes[i].getIp());
                                        newConexao.setDataRate(conexoes[i].getDataRate());
                                        newConexao.setDelay(conexoes[i].getDelay());

                                    }
                        }
                        if(((Node)evt.getComponent()).getTipo()==1){
                                    if(conexoes[i].getNo1()==((Node)evt.getComponent()) || conexoes[i].getNo2()==((Node)evt.getComponent())){
                                        newConexao.setIp(conexoes[i].getIp());
                                        newConexao.setDataRate(conexoes[i].getDataRate());
                                        newConexao.setDelay(conexoes[i].getDelay());

                                    }
                        }
                    }
                }
            }

            conexoes[newConexao.getIdConexao()] = newConexao;
            configurarConexao(newConexao.getIdConexao());

            cmbConexoes.insertItemAt(newConexao.getNome(),newConexao.getIdConexao());

            auxLink = null;

            flagLinha=0;
            tbtnP2P.setSelected(false);
            tbtnCSMA.setSelected(false);
            tbtnWifi.setSelected(false);
        }
        if(tbtnP2P.isSelected()||tbtnCSMA.isSelected()||tbtnWifi.isSelected()){
            flagLinha++;
            auxLink = evt.getComponent();
            linhaX = (evt.getComponent().getX()+evt.getComponent().getHeight()/2);
            linhaY = (evt.getComponent().getY()+evt.getComponent().getWidth()/2);
        }
    }

    public void configurarConexao(int index){
        final JFrame configFrame = new JFrame();
        final Conexao aux = conexoes[index];

        JButton jBAplicarConfig = new JButton();
        JButton jBCancelarConfig = new JButton();
        JLabel jLConfigConexao = new JLabel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        final JTextField jTFDRConexao = new JTextField();
        final JTextField jTFDelayConexao = new JTextField();
        final JTextField jTFIp = new JTextField();
        final JTextField jTFMascara = new JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        configFrame.setSize(303, 241);
        aux.setCor(Color.BLUE);
        configFrame.setTitle("Conexão "+aux.getNome());

        jTFDRConexao.setText(String.valueOf(aux.getDataRate()));
        jTFDelayConexao.setText(String.valueOf(aux.getDelay()));
        jTFIp.setText(aux.getIp());
        jTFMascara.setText(aux.getMascara());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Mbps");
        jLabel4.setText("Delay");
        jLabel3.setText("DataRate");
        jLabel6.setText("ms");
        jLConfigConexao.setText("Configurações");
        jBAplicarConfig.setText("Aplicar");
        jBCancelarConfig.setText("Cancelar");
        jLabel1.setText("IP da Rede");
        jLabel2.setText("Mascara");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(configFrame.getContentPane());
        configFrame.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLConfigConexao))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFMascara, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(jTFDelayConexao, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(jTFIp, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(jTFDRConexao, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jBAplicarConfig)
                        .addGap(18, 18, 18)
                        .addComponent(jBCancelarConfig)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLConfigConexao)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFDRConexao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFDelayConexao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jTFIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTFMascara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelarConfig)
                    .addComponent(jBAplicarConfig))
                .addGap(21, 21, 21))
        );


        jBAplicarConfig.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt) {
                int i;

                aux.setDelay(Float.parseFloat(jTFDelayConexao.getText()));
                aux.setDataRate(Float.parseFloat(jTFDRConexao.getText()));
                aux.setIp(jTFIp.getText());
                aux.setMascara(jTFMascara.getText());
                aux.setCor(Color.BLACK);

                if(aux.getTipo().equals("csma")){
                    for(i=0;i<Conexao.getQtde();i++){
                        if(((Node)aux.getNo1()).getTipo()==1){
                            if(conexoes[i].getNo1()==aux.getNo1()||conexoes[i].getNo2()==aux.getNo1()){
                                conexoes[i].setDelay(Float.parseFloat(jTFDelayConexao.getText()));
                                conexoes[i].setDataRate(Float.parseFloat(jTFDRConexao.getText()));
                                conexoes[i].setIp(jTFIp.getText());
                                conexoes[i].setMascara(jTFMascara.getText());
                            }
                        }
                        if(((Node)aux.getNo2()).getTipo()==1){
                            if(conexoes[i].getNo1()==aux.getNo2()||conexoes[i].getNo2()==aux.getNo2()){
                                conexoes[i].setDelay(Float.parseFloat(jTFDelayConexao.getText()));
                                conexoes[i].setDataRate(Float.parseFloat(jTFDRConexao.getText()));
                                conexoes[i].setIp(jTFIp.getText());
                                conexoes[i].setMascara(jTFMascara.getText());
                            }
                        }
                    }
                }
                
                configFrame.setVisible(false);
                manterLinks();
            }
        });

        jBCancelarConfig.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt) {
                aux.setCor(Color.BLACK);
                configFrame.setVisible(false);
                manterLinks();
            }
        });

        configFrame.setVisible(true);

        manterLinks();
    }

    public void validarAplicacao(java.awt.event.MouseEvent evt){
        if(auxLink!=null){
            Aplicacao newAplicacao = null;
            if(tbtnTCP.isSelected()){
                newAplicacao = new Aplicacao(auxLink,evt.getComponent(),"Tcp");
                tbtnTCP.setSelected(false);
                //Seta no panel protocolo usado
                ((Node)auxLink).setIsTcp(true);
                ((Node)evt.getComponent()).setIsTcp(true);
                
                aplicacoes[Aplicacao.getQtde()-1] = newAplicacao;
                configurarAplicacao(newAplicacao.getIdAplicacao());
                cmbAplicacoes.insertItemAt(newAplicacao.getNome(),newAplicacao.getIdAplicacao());
            }
            if(tbtnUDP.isSelected()){
                newAplicacao = new Aplicacao(auxLink,evt.getComponent(),"Udp");
                tbtnUDP.setSelected(false);
                //Seta no panel protocolo usado
                ((Node)auxLink).setIsUdp(true);
                ((Node)evt.getComponent()).setIsUdp(true);
                
                aplicacoes[Aplicacao.getQtde()-1] = newAplicacao;
                configurarAplicacao(newAplicacao.getIdAplicacao());
                cmbAplicacoes.insertItemAt(newAplicacao.getNome(),newAplicacao.getIdAplicacao());
            }
            
            if(tbtnecho.isSelected()){
                newAplicacao = new Aplicacao(auxLink,evt.getComponent(),"Echo");
                tbtnecho.setSelected(false);
                //Seta no panel protocolo usado
                ((Node)auxLink).setIsUdp(true);
                ((Node)evt.getComponent()).setIsUdp(true);
                aplicacoes[Aplicacao.getQtde()-1] = newAplicacao;
                configurarAplicacao(newAplicacao.getIdAplicacao());
                cmbAplicacoes.insertItemAt(newAplicacao.getNome(),newAplicacao.getIdAplicacao());
            }

            auxLink=null;
        }
        else{
            auxLink = evt.getComponent();
         }
}

    public void configurarAplicacao(int index){
        final JFrame appFrame = new JFrame();
        final Aplicacao aux = aplicacoes[index];

        JTabbedPane jTabbedPane1 = new JTabbedPane();
        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        final JTextField jTFPorta = new JTextField();
        final JTextField jTFIniciar = new JTextField();
        final JTextField jTFParar = new JTextField();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        JPanel jPanel2 = new JPanel();
        JLabel jLabel7 = new JLabel();
        JLabel jLabel8 = new JLabel();
        JLabel jLabel9 = new JLabel();
        JLabel jLabel10 = new JLabel();
        final JTextField jTFMaxPackets = new JTextField();
        final JTextField jTFInterval = new JTextField();
        final JTextField jTFPacketSize = new JTextField();
        JLabel jLabel11 = new JLabel();
        JLabel jLabel12 = new JLabel();
        JButton jBAplicarApp = new JButton();
        JButton jBCancelarApp = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        appFrame.setTitle("Aplicação "+aux.getNome());
        jLabel1.setText("Configurações");
        jLabel2.setText("Porta");
        jLabel3.setText("Iniciar");
        jLabel4.setText("Parar");
        jLabel5.setText("s");
        jLabel6.setText("s");

        appFrame.setSize(247,298);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFParar)
                            .addComponent(jTFIniciar)
                            .addComponent(jTFPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFParar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Servidor", jPanel1);
        jLabel7.setText("Configurações");
        jLabel8.setText("Max Packets");
        jLabel9.setText("Interval");
        jLabel10.setText("Packet Size");
        jLabel11.setText("KBytes");
        jLabel12.setText("ms");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTFMaxPackets, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFInterval, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFPacketSize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTFMaxPackets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTFInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTFPacketSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jPanel2);

        jBAplicarApp.setText("Aplicar");

        jBCancelarApp.setText("Cancelar");

        jTFPorta.setText(aux.getPorta());
        jTFIniciar.setText(aux.getIniciar());
        jTFParar.setText(aux.getParar());
        jTFMaxPackets.setText(aux.getMaxPackets());
        jTFInterval.setText(aux.getInterval());
        jTFPacketSize.setText(aux.getPacketSize());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(appFrame.getContentPane());
        appFrame.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jBAplicarApp)
                .addGap(18, 18, 18)
                .addComponent(jBCancelarApp)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAplicarApp)
                    .addComponent(jBCancelarApp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBAplicarApp.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt) {
                aux.setPorta(jTFPorta.getText());
                aux.setIniciar(jTFIniciar.getText());
                aux.setParar(jTFParar.getText());
                aux.setMaxPackets(jTFMaxPackets.getText());
                aux.setInterval(jTFInterval.getText());
                aux.setPacketSize(jTFPacketSize.getText());
                appFrame.setVisible(false);
            }
        });

        jBCancelarApp.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt) {
                appFrame.setVisible(false);
            }
        });

        appFrame.setVisible(true);

    }
  
    public void manterLinks(){
        int i;
        Graphics2D g2d = (Graphics2D) panelAmbiente.getGraphics().create();
        g2d.setStroke(new BasicStroke(4));
        
        for(i=0;i<Conexao.getQtde();i++){
            Component no1 = conexoes[i].getNo1();
            Component no2 = conexoes[i].getNo2();
            g2d.setColor(conexoes[i].getCor());
            g2d.drawLine((no1.getX()+no1.getHeight()/2),(no1.getY()+no1.getWidth()/2),(no2.getX()+no2.getHeight()/2), (no2.getY()+no2.getWidth()/2));
        }
        g2d.dispose();
    }
    
    private void jMenuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAbrirActionPerformed
        AbrirFrame frame = new AbrirFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(javax.swing.JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_jMenuAbrirActionPerformed

    private void panelAmbienteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAmbienteMouseMoved
        manterLinks();
    }//GEN-LAST:event_panelAmbienteMouseMoved
		
	private void jMenuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuFecharActionPerformed

    private void cmbAplicacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAplicacoesActionPerformed
        configurarAplicacao(cmbAplicacoes.getSelectedIndex());
        cmbAplicacoes.setSelectedItem(null);
    }//GEN-LAST:event_cmbAplicacoesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        int i = 0;
        while(nodes[i] != null){
            nodes[i].setTable(); 
            i++;
        }
        
        abrir.setVisible(true);
        routerF = abrir.getFile();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_btnLimparActionPerformed
        
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accessPointMenu;
    private javax.swing.JTree arvore;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox cmbAplicacoes;
    private javax.swing.JComboBox cmbConexoes;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuAbrir;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCodigo;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenuItem jMenuExcluir;
    private javax.swing.JMenuItem jMenuFechar;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuNovo;
    private javax.swing.JPopupMenu jPopupMonitor;
    private javax.swing.JPopupMenu jPopupNotebook;
    private javax.swing.JLabel lblAplicacoes;
    private javax.swing.JLabel lblConexoes;
    private javax.swing.JLabel lblCriarAplicacao;
    private javax.swing.JLabel lblCriarConexao;
    private javax.swing.JPanel panelAmbiente;
    private javax.swing.JPanel panelComponentes;
    private javax.swing.JPanel panelConfiguracao;
    private javax.swing.JLabel routerMenu;
    private javax.swing.JScrollPane scrArvore;
    private javax.swing.JScrollPane scrComponentes;
    private javax.swing.JScrollPane scrPropriedades;
    private javax.swing.JLabel switchMenu;
    private javax.swing.JToggleButton tbtnCSMA;
    private javax.swing.JToggleButton tbtnP2P;
    private javax.swing.JToggleButton tbtnTCP;
    private javax.swing.JToggleButton tbtnUDP;
    private javax.swing.JToggleButton tbtnWifi;
    private javax.swing.JToggleButton tbtnecho;
    private javax.swing.JLabel terminalMenu;
    // End of variables declaration//GEN-END:variables
}
