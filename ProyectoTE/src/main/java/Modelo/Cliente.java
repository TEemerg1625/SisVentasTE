
package Modelo;


public class Cliente {
    
    int IdCliente;
    String dni;
    String nom;
    String dir;
    String depto;

    public Cliente() {
    }

    public Cliente(int IdCliente, String dni, String nom, String dir, String depto) {
        this.IdCliente = IdCliente;
        this.dni = dni;
        this.nom = nom;
        this.dir = dir;
        this.depto = depto;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }
    
    
    
    
}
