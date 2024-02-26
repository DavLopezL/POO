package ejerciciopropuestono17;

public class EjercicioPropuestoNo17 {

    public static void main(String[] args) {
        double radio, area, longitud;
        radio = 8;
        area = Math.PI*Math.pow(radio, 2);
        longitud = 2*Math.PI*radio;
        System.out.println("Para un círculo con radio " + radio);
        System.out.println("Su área es: " + area);
        System.out.println("y su longitud es: " + longitud);
    }
}
