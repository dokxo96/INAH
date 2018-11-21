package Clases;
import Clases.BD;
//import Datos.*;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.Clip;
import javax.swing.JComboBox;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oliveros.Carlos
 */
public class Metodos {
BD bd = new BD();
//Acciones a = new Acciones();
//Usuario u = new Usuario();
private Connection conexion = null;
private Statement comando = null;    
private ResultSet resultados = null;
String time,date;
public Metodos()
{}

public void llenarCB(JComboBox cb,String firstItem,String query,int column) throws Exception{
    /*se llena comboBox
      recibe 4 parametros
        la variable del comboBox
        El valor inicial que se va a mostrar en el combo box
        consulta a la base de datos select
        el numero de la columna del registro retornado por la consulta
    */
        cb.removeAllItems();
        cb.addItem(firstItem);
        ResultSet m;

        m = bd.select(query);
         while (m.next())
        {
            cb.addItem(m.getString(column));
            
        } 
    
         
}

public String  extraeHora(){
        Calendar fecha = new GregorianCalendar();
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
        time=hora+":"+minuto+":"+segundo;
        return time;
    }
public int getHora()
{
Calendar fecha = new GregorianCalendar();
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        return hora;
}
public int getMin()
{
Calendar fecha = new GregorianCalendar();
        int minuto = fecha.get(Calendar.MINUTE);
        return minuto;
}
public String extraeFecha(){
        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        date= año+ "-" + (mes+1) + "-" + dia;
        return date;
    }
public int getAño()
{
Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        return año;
}

public int getMes()
{
Calendar fecha = new GregorianCalendar();
        int mes = fecha.get(Calendar.MONTH);
        return mes;
}
public void llenaTabla(JTable tbl,String query) throws Exception{
    //Copiar este método y ajustarlo al JTable deseado
    DefaultTableModel tm;
    tm = (DefaultTableModel)tbl.getModel();
        tm.setRowCount(0);
        //query consulta para seleccionar los datos para llenar el JTable
        resultados = bd.select(query);
        while (resultados.next())
        {
            //agrega en el JTable las columnas seleccionadas de la consulta.
            tm.addRow(new Object[]{resultados.getString("nombre_usuario"),resultados.getString("contrasena")});
        }    
}
public int[] getTiempo(String cad,int z){
    //se divide el String del tiempo en dos para poder calcular, se convierte de 24hrs a 12 hrs
    //argumento 1, se calcula el tiempo restante segun la hora del sistema 
String[] partes = cad.split(":");
if(z==1){
    System.out.println("Reservacion");
int horas = Integer.parseInt(partes[0]);
int minutos = Integer.parseInt(partes[1]);
int []t={horas-getHora(),minutos-getMin()-1};
return t;
}
else
    if(z==2)
{
    System.out.println("Pedido");
int horas = Integer.parseInt(partes[0]);
int minutos = Integer.parseInt(partes[1]);
int []t={horas,minutos-1};

       System.out.println(t[0]+" aqui 1");
       
       System.out.println(t[1]+" aqui 2");
return t;
}
return null;
}
public void playSound()
{
try {
            
            // Se obtiene un Clip de sonido
            Clip sonido = AudioSystem.getClip();
            
            // Se carga con un fichero wav
            sonido.open(AudioSystem.getAudioInputStream(new File("src\\componentes\\sound.wav")));
            
            // Comienza la reproducción
            sonido.start();
            
        } catch (Exception e) {
            System.out.println("" + e);
        }
}

}