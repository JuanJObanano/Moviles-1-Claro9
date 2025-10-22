public class Carro {
    private String marca;
    private int atributos;
    private String tipo;
    private String color;


public Carro(String marcacarro,int atributos, String tipocarro,String colorcarro){
    this.atributos=atributos;
    this.marca=marcacarro;
    this.tipo=tipocarro;
    this.color=colorcarro;
}

public Carro(String marca2, String modelo, int añoFabricacion, String color2, double capacidadCarga,
        String tipoCombustible, int numeroEjes, double kilometraje, double precio, String estado) {
    //TODO Auto-generated constructor stub
}

public void Marca(){
    System.out.println("Soy un "+marca+"! con "+atributos+" caballos de fuerza, soy de tipo "+tipo+"! y mi color es "+color+"!");
}

public static void main(String[] args){

    Carro carropequeño=new Carro("Mazda", 700, "Camioneta", "negro");
    carropequeño.Marca();

}

public void mostrarInformacion() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'mostrarInformacion'");
}

public String getModelo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getModelo'");
}

public double getPrecio() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPrecio'");
}

public Object getEstado() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getEstado'");
}

public int getKilometraje() {
    throw new UnsupportedOperationException("Unimplemented method 'getKilometraje'");
}

public String getMarca() {
    throw new UnsupportedOperationException("Unimplemented method 'getMarca'");
}
}

