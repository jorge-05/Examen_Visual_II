package modelo;

public class Proveedor {

    private int id;
    private String empresa;
    private String direccion;
    private String telefono;
    private String fax;

    public Proveedor() {
        this.id = 0;
        this.empresa = "";
        this.direccion = "";
        this.telefono = "";
        this.fax = "";
    }

    public Proveedor(int id, String empresa, String direccion, String telefono, String fax) {
        this.id = id;
        this.empresa = empresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fax = fax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}
