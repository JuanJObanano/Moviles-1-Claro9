public class CarroEjercicio {
    private String marca;
    private String modelo;
    private int añoFabricacion;
    private String color;
    private double capacidadCarga; 
    private String tipoCombustible;
    private int numeroEjes;
    private double kilometraje;
    private double precio;
    private String estado; 

    
    public CarroEjercicio(String marca, String modelo, int añoFabricacion, String color,double capacidadCarga, String tipoCombustible, int numeroEjes,double kilometraje, double precio, String estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.color = color;
        this.capacidadCarga = capacidadCarga;
        this.tipoCombustible = tipoCombustible;
        this.numeroEjes = numeroEjes;
        this.kilometraje = kilometraje;
        this.precio = precio;
        this.estado = estado;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de Fabricación: " + añoFabricacion);
        System.out.println("Color: " + color);
        System.out.println("Capacidad de Carga: " + capacidadCarga + " toneladas");
        System.out.println("Tipo de Combustible: " + tipoCombustible);
        System.out.println("Número de Ejes: " + numeroEjes);
        System.out.println("Kilometraje: " + kilometraje + " km");
        System.out.println("Precio: $" + precio);
        System.out.println("Estado: " + estado);
    }

    public double calcularDepreciacion() {
        int añoActual = 2025;
        int edad = añoActual - añoFabricacion;
        double depreciacion = (edad * 0.05 + kilometraje / 100000 * 0.10) * precio;
        return depreciacion;
    }

    public void verificarMantenimiento() {
        if (kilometraje > 100000) {
            System.out.println("Recomendación: Este vehículo necesita mantenimiento.");
        } else {
            System.out.println("El vehículo no requiere mantenimiento por ahora.");
        }
    }

    public void aplicarDescuento() {
        double descuento = 0;

        if (estado.equalsIgnoreCase("usado")) {
            descuento += 0.10; 
        } else if (estado.equalsIgnoreCase("mantenimiento")) {
            descuento += 0.15; 
        }

        int añoActual = 2025;
        int edad = añoActual - añoFabricacion;
        if (edad > 5) {
            descuento += 0.05; 
        }

        double precioFinal = precio * (1 - descuento);
        System.out.println("Precio con descuento aplicado: $" + precioFinal);
    }

    
    public static void main(String[] args) {
        CarroEjercicio carrohijo = new CarroEjercicio("Chevrolet", "Camaro SS", 2015, "Blanco", 2,
                                  "Gasolina", 4, 140000, 95000, "tuneado");

        carrohijo.mostrarInformacion();
        System.out.println("Depreciación estimada: $" + carrohijo.calcularDepreciacion());
        carrohijo.verificarMantenimiento();
        carrohijo.aplicarDescuento();
    }
}