
package trabajopractico6;
import entidades.*;

public class TrabajoPractico6 {

    
    public static void main(String[] args) {
        Cliente facha = new Cliente(44530760, "Fabri", "xd", "ciudad");
        Directorio directorio = new Directorio();
        
        directorio.agregarCliente(266400460, facha);
        directorio.getAll();
        System.out.println("__________________");
        directorio.borrarCliente(44530760);
        System.out.println(directorio.buscarCliente(266400460));
        
    }
    
}
