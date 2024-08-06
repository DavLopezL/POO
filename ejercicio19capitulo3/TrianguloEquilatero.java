package ejercicio19capitulo3;

public class TrianguloEquilatero {
    double lado; //Atributo del lado del triángulo equilatero
    
    TrianguloEquilatero(double lado) {
        this.lado = lado;
        } //Constructor del triángulo equilatero
    
    double calcularArea() {
        return (Math.pow(lado,2)*Math.sqrt(3))/4;
        } //Método que cálcula el área del triángulo equilatero
    
    double calcularAltura() {
        return (lado*Math.sqrt(3))/2;
        } //Método que cálcula la altura del triángulo equilatero
    
    double calcularPerimetro() {
        return 3*lado;
        } //Método que calcula el perímetro del triángulo equilatero
}
