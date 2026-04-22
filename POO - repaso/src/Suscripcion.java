public abstract class Suscripcion {

    private String usuario;
    private double precio;

    public Suscripcion(){

    }

    public Suscripcion(String usuario, double precio){
        this.usuario = usuario;
        this.precio = precio;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void activar(){
        System.out.println("Suscripcion activada para: " + usuario);
    }

    public  void cancelar(){
        System.out.println("Suscripcion cancelada para: " + usuario);
    }

    public abstract void mostrarInfo();

}
