public class articulo{

    String marca;
    double precio;
    String descripcion;


    public articulo(String marca, double precio, String descripcion) {
        this.marca = marca;
        this.precio = precio;
        this.descripcion = descripcion;
    }


    public articulo() {
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    

    


}