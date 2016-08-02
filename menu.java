package conexion;

import java.sql.SQLException;
import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class menu{
    
public static void main (String [] args) throws SQLException{
String dni=(JOptionPane.showInputDialog(null, "ingresa tu DNI: "));
String nombre=(JOptionPane.showInputDialog(null, "ingresa tu nombre: "));
String edad=(JOptionPane.showInputDialog(null, "ingresa tu edad: "));
Conexion cn= new Conexion();
       persona p1= new persona(dni,nombre,edad); 
cn.insertar(p1);

}
}
