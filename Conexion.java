package conexion;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.color.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.border.Border;
public class Conexion{
private PreparedStatement psInsertar;
private Statement stmnt;
private Connection con;
public void insertar (persona p) throws SQLException{
    
String url = "jdbc:mysql://localhost:3306/ejemplo?user=root&password=root";
con = DriverManager.getConnection(url);
stmnt=con.createStatement();
psInsertar=con.prepareStatement ("insert into alumno (DNI,nombre,edad)"+"values (?,?,?)");
psInsertar.setString(1,p.getNombre());
psInsertar.setString(2,p.getApellido());
psInsertar.setString(3,p.getTelefono());
psInsertar.executeUpdate();
}
}