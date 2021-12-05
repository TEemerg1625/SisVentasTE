
package Modelo;


public class Empleado {
    int id;
    String dni;
    String nom;
    String tel;
    String depto;
    String user;

    public Empleado() {
    }

    public Empleado(int id, String dni, String nom, String tel, String depto, String user) {
        this.id = id;
        this.dni = dni;
        this.nom = nom;
        this.tel = tel;
        this.depto = depto;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    
    
}
