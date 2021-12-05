
package Modelo;


public class Producto {
    
    int IdProducto;
    String nom;
    float precio;
    String stock;
    String depto;

    public Producto() {
    }

    public Producto(int IdProducto, String nom, float precio, String stock, String depto) {
        this.IdProducto = IdProducto;
        this.nom = nom;
        this.precio = precio;
        this.stock = stock;
        this.depto = depto;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    
    
    
}
