package inah.dsm;
import Clases.*;
import Componentes.slidePanel;
import static javax.swing.JOptionPane.showMessageDialog;
public class Registro_Tramite extends javax.swing.JPanel {
Metodos M = new Metodos();
slidePanel pnl2;
    /**
     * Creates new form Registro_Tramite
     */
    public Registro_Tramite(String nombre){}
    public Registro_Tramite() throws Exception{
                
        
        initComponents();
        String sm = "SELECCIONAR MUNICIPIO";
        String query_M = "SELECT * FROM MUNICIPIOS";
        String so = "SELECCIONAR OPERADOR";
        String query_O = "SELECT * FROM PERSONA";
        String st = "SELECCIONAR TIPO DE TRAMITE";
        String query_T = "SELECT * FROM TIPOS_TRAMITES";
        M.llenarCB(cbMunicipios,sm,query_M,2);
        M.llenarCB(cbOperadores,so,query_O,2);
        M.llenarCB(cbTipoTramite,st,query_T,1);
        pnl2 = new slidePanel(1,"INAH-01-001");
        pnl2.setBounds(400,200,700,400);
        add(pnl2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cbMunicipios = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        cbOperadores = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDir = new javax.swing.JTextField();
        txtCel = new javax.swing.JTextField();
        cbTipoTramite = new javax.swing.JComboBox<>();

        jLabel2.setText("jLabel2");

        setBackground(new java.awt.Color(255, 255, 255));

        cbMunicipios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMunicipios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMunicipiosActionPerformed(evt);
            }
        });

        jLabel1.setText("NOMBRE");

        jLabel3.setText("ASUNTO");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        cbOperadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("DIRECCIÓN");

        jLabel5.setText("NUMERO DE CELULAR");

        cbTipoTramite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTipoTramite.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTipoTramiteItemStateChanged(evt);
            }
        });
        cbTipoTramite.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                cbTipoTramiteComponentHidden(evt);
            }
            public void componentResized(java.awt.event.ComponentEvent evt) {
                cbTipoTramiteComponentResized(evt);
            }
        });
        cbTipoTramite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoTramiteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                    .addComponent(txtNombre))
                                .addGap(47, 47, 47)
                                .addComponent(cbMunicipios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(cbOperadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(cbTipoTramite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(531, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(txtDir)
                            .addComponent(txtCel, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMunicipios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbOperadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoTramite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbMunicipiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMunicipiosActionPerformed
    
    }//GEN-LAST:event_cbMunicipiosActionPerformed

    private void cbTipoTramiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoTramiteActionPerformed
    Object TT = cbTipoTramite.getSelectedItem();
    if(TT!="SELECCIONAR TIPO DE TRAMITE")
        if(TT!=null){
            showMessageDialog(null,"aqui");
    pnl2 = null;
    pnl2 = new slidePanel(1,TT.toString());
    pnl2.setBounds(400,200,700,400);
    add(pnl2);}
    //if(TT.equals("SELECCIONAR TIPO DE TRAMITE"))
   
    }//GEN-LAST:event_cbTipoTramiteActionPerformed

    private void cbTipoTramiteComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_cbTipoTramiteComponentHidden
 
    }//GEN-LAST:event_cbTipoTramiteComponentHidden

    private void cbTipoTramiteComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_cbTipoTramiteComponentResized
   
    }//GEN-LAST:event_cbTipoTramiteComponentResized

    private void cbTipoTramiteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoTramiteItemStateChanged
    
    }//GEN-LAST:event_cbTipoTramiteItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbMunicipios;
    private javax.swing.JComboBox<String> cbOperadores;
    private javax.swing.JComboBox<String> cbTipoTramite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
