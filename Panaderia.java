public class Panaderia {
    public String nombre;
    private String direccion;
    private String dueno;
    private int añoFundacion;
    private int empleados;
    private String especialidad;
    private double capacidadProduccion; 
    private String horario;
    private int domiciliosDiarios; 
    private String telefono;

    public Panaderia(String nombre, String direccion, String dueno, int añoFundacion, int empleados,
                     String especialidad, double capacidadProduccion, String horario, int domiciliosDiarios, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dueno = dueno;
        this.añoFundacion = añoFundacion;
        this.empleados = empleados;
        this.especialidad = especialidad;
        this.capacidadProduccion = capacidadProduccion;
        this.horario = horario;
        this.domiciliosDiarios = domiciliosDiarios;
        this.telefono = telefono;
    }

    public void mostrarInfo() {
        System.out.println("Panadería: " + nombre + "\nUbicación: " + direccion +
                "\nDueño: " + dueno + "\nFundada en: " + añoFundacion +
                "\nEmpleados: " + empleados + "\nEspecialidad: " + especialidad +
                "\nCapacidad diaria: " + capacidadProduccion + " kg" +
                "\nHorario: " + horario + "\nDomicilios por día: " + domiciliosDiarios +
                "\nTeléfono: " + telefono);
    }

    public static class PanaderiaArtesanal extends Panaderia {
        private String tipoHarina;
        private int productosIntegrales; 

        public PanaderiaArtesanal(String nombre, String direccion, String dueno, int añoFundacion, int empleados,
                                  String especialidad, double capacidadProduccion, String horario, int domiciliosDiarios,
                                  String telefono, String tipoHarina, int productosIntegrales) {
            super(nombre, direccion, dueno, añoFundacion, empleados, especialidad,
                    capacidadProduccion, horario, domiciliosDiarios, telefono);
            this.tipoHarina = tipoHarina;
            this.productosIntegrales = productosIntegrales;
        }

        public void mostrarEstilo() {
            System.out.println("Esta panadería usa harina de tipo: " + tipoHarina +
                    " y ofrece " + productosIntegrales + " tipos de productos integrales.");
        }
    }

    public static class PanaderiaIndustrial extends Panaderia {
        private String maquinariaPrincipal;

        public PanaderiaIndustrial(String nombre, String direccion, String dueno, int añoFundacion, int empleados,
                                   String especialidad, double capacidadProduccion, String horario, int domiciliosDiarios,
                                   String telefono, String maquinariaPrincipal) {
            super(nombre, direccion, dueno, añoFundacion, empleados, especialidad,
                    capacidadProduccion, horario, domiciliosDiarios, telefono);
            this.maquinariaPrincipal = maquinariaPrincipal;
        }

        @Override
        public void mostrarInfo() {
            System.out.println("Soy la panadería industrial '" + nombre + "', uso maquinaria avanzada: " + maquinariaPrincipal +
                    " y produzco grandes cantidades de pan diariamente!");
        }
    }

    public static void main(String[] args) {
        System.out.println("PANADERIA DELICIAS HORNEADAS");
        PanaderiaArtesanal caracteristicas2 = new PanaderiaArtesanal("Panaderia Delicias Horneadas", "Calle 10 #8-55", "Juan Gonzalez", 2015, 4,
                "Pan y galletas", 50.0, "7am - 8pm", 10, "3205678912", "Harina de avena", 8);
        caracteristicas2.mostrarInfo();
        caracteristicas2.mostrarEstilo();
    }
}
