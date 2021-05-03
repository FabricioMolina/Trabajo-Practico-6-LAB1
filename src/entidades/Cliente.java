/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author bebo_
 */
public class Cliente implements Comparable<Cliente>{
    private long dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String domicilio;

    public Cliente(long dni, String nombre, String apellido, String ciudad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
    }

    public Cliente(){
    }
    

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    

    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (this.dni ^ (this.dni >>> 32));
        return hash;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

    public int compareTo(Cliente t) {
        int aux=0;
        if (this.getDni()<t.getDni())
            aux=-1;
        if (this.getDni()==t.getDni())
            aux= 0;
        if (this.getDni()>t.getDni())
            aux=1;
        return aux;
    }  

    @Override
    public String toString() {
        return nombre;
    }
    
}
