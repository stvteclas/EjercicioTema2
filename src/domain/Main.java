package domain;

public class Main {
    public static void main(String[] args) {

        Double precio = 3000.00;
        Double iva = 1.21;

        Double precioConIva = calculoIva(precio,iva);
        System.out.println("El precio con Iva(21%) incluido es = " + precioConIva);
    }
    public static Double calculoIva(Double precio, Double iva){
        return precio * iva;
    }

}