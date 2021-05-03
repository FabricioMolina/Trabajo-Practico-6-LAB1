/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.*;

public class Directorio {
    private TreeMap<Long,Cliente> cl = new TreeMap<>();
    
    public TreeMap<Long, Cliente> getAll(){
        Set<Long> clave = cl.keySet();
        for(long a: clave){
            System.out.println("Numero: " + a);
            System.out.println("Cliente: " + cl.get(a));
            System.out.println("_______________");
        }
        return null;
    }
  
    public void agregarCliente(long tel, Cliente cliente){
        if(buscarCliente(tel) != null){
            System.out.println("El cliente ya esta registrado.");
        }else{
            cl.put(tel, cliente);
        }
    }
//    buscarCliente() que en base al nro de teléfono retorna el Cliente asociado al
//    mismo.
    public Cliente buscarCliente(long tel){
        return cl.get(tel);
    }
//   buscarTeléfono() que en base a un apellido nos devuelve una lista con los nros de
//teléfono asociados a dicho apellido
    public Set<Long> buscarTelefono(String apellido){
        Set<Long> aux = new HashSet<>();
        Set<Long> xd = cl.keySet();
        for(long i:xd){
            if(cl.get(i).getApellido().equals(apellido)){
                aux.add(i);
            }
        }
        
        return aux;
    }
    
//    buscarClientes() que en base a una ciudad nos devuelve una lista con los Clientes
//asociados a dicha ciudad.
    public Set<Cliente> buscarClientes(String ciudad){
        Set<Cliente> aux = new HashSet<>();
        Set<Long> xd = cl.keySet();
        for(long i:xd){
            if(cl.get(i).getCiudad().equals(ciudad)){
                aux.add(cl.get(i));
            }
        }
        return aux;
    }
    
//    borrarCliente() que en base a un dni elimina el cliente del directorio
        public TreeMap<Long,Cliente> borrarCliente(long dni){
        TreeMap<Long,Cliente> aux = new TreeMap<>();
        for(long i:cl.keySet()){
            if(cl.get(i).getDni()==dni){
                aux.put(i, cl.get(i));
                cl.remove(i);
            }
    }
        
        return aux;
        
    }
    
}
