package modelo;

import java.util.Date;

public class Libro {
    
    //Atributos
    private int id;
    private String titulo;
    private String autores;
    private String ISBN;
    private int solicitante;
    private int proveedor;
    private String fechaPedido;
    private String fechaEntregado;
    private String precio;
    
    /*Contructor
   ` public Libro(){
        this.id = 0;
        this.titulo = "";
        this.autores = "";
        this.ISBN = "";
        this.solicitante = 0;
        this.proveedor = 0;
        this.fechaPedido = "";
        this.fechaEntregado = "";
        this.precio = "";
    }*/

    public Libro() {
    }

    public Libro(int id, String titulo, String autores, String ISBN, int solicitante, int proveedor, String fechaPedido, String fechaEntregado, String precio) {
        this.id = id;
        this.titulo = titulo;
        this.autores = autores;
        this.ISBN = ISBN;
        this.solicitante = solicitante;
        this.proveedor = proveedor;
        this.fechaPedido = fechaPedido;
        this.fechaEntregado = fechaEntregado;
        this.precio = precio;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(int solicitante) {
        this.solicitante = solicitante;
    }

    public int getProveedor() {
        return proveedor;
    }

    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getFechaEntregado() {
        return fechaEntregado;
    }

    public void setFechaEntregado(String fechaEntregado) {
        this.fechaEntregado = fechaEntregado;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    
    
    

    

    
}
