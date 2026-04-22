public class Main {
    public static void main(String[] args) {


//        Suscripcion miSuscripcion = new Suscripcion();
//        System.out.println(miSuscripcion.toString());
//
//
//        Suscripcion miSuscripcion2 = new Suscripcion("Usuario2", 9.90);
//        System.out.println(miSuscripcion2.toString());


//        PlanBasico pBasico = new PlanBasico();
//        pBasico.setUsuario("usuario1");
//        System.out.println(pBasico.getUsuario());

//        PlanBasico planBasico2 = new PlanBasico("usuario15", 9.90);
//        System.out.println(planBasico2.usuario);
//        System.out.println(planBasico2.precio);


//        Suscripcion s = new Suscripcion("cbeltran@gmail.com", 19.90);
//        s.setPrecio(20.00);
//        s.setUsuario("usuario2");
//        System.out.println(s.getPrecio());
//        s.activar();
//        s.mostrarInfo();

//    PlanBasico pb = new PlanBasico("calarcon@gmail.com");
//    pb.mostrarInfo();
//    pb.activar();
//
//    PlanPremiun pp = new PlanPremiun("usuario1@gmail.com");
//    pp.mostrarInfo();
//    pp.cancelar();

//        PlanBasico pb = new PlanBasico("usuario1@gmail.com");
//        PlanEstandar pe = new PlanEstandar("usuario2@gmail.com");
//        PlanPremiun pp = new PlanPremiun("usuario3@gmail.com");
//
//        pb.mostrarInfo();
//        pe.mostrarInfo();
//        pp.mostrarInfo();

//        Suscripcion s1 = new PlanBasico("usuario4@gmail.com");
//        Suscripcion s2 = new PlanEstandar("usuario5@gmail.com");
//        Suscripcion s3 = new PlanPremiun("usuario6@gmail.com");
//
//        s1.mostrarInfo();
//        s2.mostrarInfo();
//        s3.mostrarInfo();

        PlanPremiun pp = new PlanPremiun("carlos@gmail.com", "21/05/2026");
        pp.mostrarInfo();
        pp.renovar(1);
        System.out.println("Vence: " + pp.getFechaVencimiento());




    }
}
