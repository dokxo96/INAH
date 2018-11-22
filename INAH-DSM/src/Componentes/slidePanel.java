package Componentes;
import Clases.BD;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.RadioButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlos
 */
public class slidePanel extends JScrollPane {
BD bd = new BD();
private int t1,t2,t3;
String id;
String x;
slidePanel()
{
}

public slidePanel(int p, String x)
{
    this.x = x;
    try {
        String query = "select count(TT.ID_TIPO_TRAMITE) as numero\n" +
                        "from TIPOS_TRAMITES TT, TIPOS_TRAMITES_REQUISITOS TTR, REQUISITOS R\n" +
                        "where TT.ID_TIPO_TRAMITE = TTR.ID_TIPO_TRAMITE\n" +
                        "AND TTR.ID_REQUISITO = R.ID_REQUISITO\n" +
                        "AND TT.ID_TIPO_TRAMITE = 'INAH-02-002-A';";
        ResultSet max1 = bd.select(query);
        while(max1.next()){t1=max1.getInt(1);}
        
        switch(p){
            case 1:
                PanelRequisitos(t1,t1,2,20,20);
                break;
            case 2:
                PanelRequisitos(t2,t2,2,20,20);
                break;
            case 3:
                PanelRequisitos(t3,t3,2,20,20);
                break;
        }   } catch (Exception ex) {
        Logger.getLogger(slidePanel.class.getName()).log(Level.SEVERE, null, ex);
    }
}

//variables
private GridLayout GL;//El panel tiene que estar en forma te tabla
private JLabel []lbs;
public JCheckBox []chb1;
public JSpinner []spnr;
public JSpinner []spnr2;
private JPanel pnl;


    
public void PanelRequisitos    (int t,int f,int c,int m,int m2){
    try {
        pnl = new JPanel();
        pnl.setBackground(new Color(255,255,255));
        lbs = new JLabel[t];
        chb1 = new JCheckBox[t];
        String query2 = "select TT.ID_TIPO_TRAMITE,R.DESCRIPCION_REQUISITO \n" +
                        "from TIPOS_TRAMITES TT, TIPOS_TRAMITES_REQUISITOS TTR, REQUISITOS R\n" +
                        "where TT.ID_TIPO_TRAMITE = TTR.ID_TIPO_TRAMITE\n" +
                        "AND TTR.ID_REQUISITO = R.ID_REQUISITO\n" +
                        "AND TT.ID_TIPO_TRAMITE = '"+x+"';";        
        ResultSet equipo = bd.select(query2);
        int i =0;
        while (equipo.next())
        {
            lbs[i] = new JLabel(equipo.getString("DESCRIPCION_REQUISITO"));chb1[i] = new JCheckBox();
            chb1[i].setName(equipo.getString(1));
            pnl.add(chb1[i]);pnl.add(lbs[i]);
            i++;
        }
        pnl.setLayout(new GridLayout(f,c,m,m2));
        pnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        this.setViewportView(pnl);
        //FRAME-----------------------------------------------------------------
        this.setVisible(true);
        repaint();
    } catch (SQLException ex) {
        Logger.getLogger(slidePanel.class.getName()).log(Level.SEVERE, null, ex);
    } catch (Exception ex) {
        Logger.getLogger(slidePanel.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void getSelected1() throws Exception{
    
    for(int i=0;i<t1;i++){
        if( chb1[i].isSelected())
            {
            System.out.println("ID_TIPO_TRAMITE "+chb1[i].getName());
            ResultSet x = bd.select("select * from TIPOS_TRAMITES");
            while(x.next())
            {
            id=x.getString(1);
                System.out.println("id_pedido "+id);
//                v.setIDPedido(id);
            }
/*            bd.insertar("pedido_equipo(id_pedido, id_equipo_laboratorio)\n" +
"	VALUES ("+id+","+chb1[i].getName()+");");*/
System.out.println("INSERTAR EN BD");
            } 
    }
}
/*public void getSelected2() throws Exception{
    for(int i=0;i<t2;i++){
        if( (int)spnr[i].getValue()!=0)
            {
            System.out.println("material "+spnr[i].getName()+" "+spnr[i].getValue());
            ResultSet x = consultas.select("select * from pedido");
            while(x.next())
            {
            id=x.getInt(1);
                System.out.println("id_pedido "+id);
                v.setIDPedido(id);
            }
            consultas.insertar("pedido_material(id_pedido, id_material, cantidad)\n" +
                               "VALUES ("+id+","+spnr[i].getName()+","+spnr[i].getValue()+");");
            }
    }
}*/


public static void main(String arg[]){
new slidePanel().setVisible(true);
}
}
