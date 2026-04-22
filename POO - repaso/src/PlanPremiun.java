public class PlanPremiun extends Suscripcion implements Renovable {

    private String fechaVencimiento;

    public PlanPremiun(String usuario, String fechaVencimiento){
        super(usuario, 24.90);
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("=== PLAN PREMIUN === ");
        System.out.println("Usuario:" + getUsuario());
        System.out.println("Precio: S/" + getPrecio());
        System.out.println("4 Pantallas | Con descargas | 4k");
    }

    //CONTRATO
    @Override
    public void renovar(int meses) {
        System.out.println("Plan renovado por " + meses + " mes(es).");
    }

    @Override
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
}
