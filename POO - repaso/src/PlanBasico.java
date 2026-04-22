public class PlanBasico extends Suscripcion{

    public PlanBasico(String usuario){
        super(usuario, 9.90);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== PLAN BASICO === ");
        System.out.println("Usuario:" + getUsuario());
        System.out.println("Precio: S/" + getPrecio());
        System.out.println("1 pantalla | Sin descargas | SD");
    }

//    @Override
//    public void mostrarInfo(){
//        System.out.println("=== PLAN BASICO === ");
//        System.out.println("Usuario:" + getUsuario());
//        System.out.println("Precio: S/" + getPrecio());
//        System.out.println("1 pantalla | Sin descargas | SD");
//    }

}
