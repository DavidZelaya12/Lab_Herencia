package Herencia;

public class Planiphone extends Plan{

    private String email;

    public Planiphone(int telefono, String nombre, String correo) {
        super(telefono, nombre);
        this.email =correo;
    }

    
    public double PagoMensual(int mins, int msgs){
        double total = 22+(0.4 * mins) +(0.1*msgs);
        return total;
    }
    
    public void print(){
        super.Print();
        System.out.println("Email: "+email);
    }
    
    public String getEmail(){
        return email;
    }
    
    
}
