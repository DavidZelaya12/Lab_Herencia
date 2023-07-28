package Herencia;
import java.util.ArrayList;
        
public class Tigo {
    
    ArrayList<PlanSamsung> listasamsung = new ArrayList();
    ArrayList<Planiphone> listaiphone = new ArrayList();
    
    public void agregarPlan(int numerotel, String nombre, String extra, String tipo){
        if (tipo.equals("Samsung")){
            listasamsung.add(new PlanSamsung(numerotel,nombre,extra));
        } else if (tipo.equals("iPhone")){
            listaiphone.add(new Planiphone(numerotel,nombre, extra));
        }
    }
    
    public boolean busqueda(int numero, String extra, String tipo, int i){
        if (tipo.equals("Samsung")){
            if(i<listasamsung.size()){
                if(numero==listasamsung.get(i).getNumero() || extra.equals(listasamsung.get(i).getPin())){
                    return true;
                }
                return busqueda(numero,extra,tipo,i-1);
            }
        } else if (tipo.equals("iPhone")){
            if(i<listaiphone.size()){
                if(numero==listaiphone.get(i).getNumero() || extra.equals(listaiphone.get(i).getEmail())){
                    return true;
                }
                return busqueda(numero,extra,tipo,i-1);
            }
        }
        return false;
    }
}
