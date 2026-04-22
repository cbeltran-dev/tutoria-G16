public class PlanEstandar extends Suscripcion {
    public PlanEstandar(String usuario){
        super(usuario, 16.90);
    }

    @Override
    public void mostrarInfo(){
        System.out.println("=== PLAN ESTANDAR === ");
        System.out.println("Usuario:" + getUsuario());
        System.out.println("Precio: S/" + getPrecio());
        System.out.println("2 pantallas | Con descargas | HD");
    }
}
