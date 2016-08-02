package conexion;
public class persona {
private String Nombre,Apellido,Telefono;
public persona(){
}
public persona (String nombre,String apellido,String telefono){
this.Nombre=nombre;
this.Apellido=apellido;
this.Telefono=telefono;
}
public String getNombre(){
return Nombre;
}
public void setNombre(String Nombre){
this.Nombre=Nombre;
}
public String getApellido(){
return Apellido;
}
public void setApellido(String Apellido){
this.Apellido=Apellido;
}
public String getTelefono(){
return Telefono;
}
public void setTelefono (String Telefono){
this.Telefono=Telefono;
}
}