package ejercicio18capitulo3;

public class Empleado {
    int codigo;
    String nombre;
    double numHorasTrabajadas, valorHora, porcentajeRetencion; //Atributos de la clase Empleado
    
    Empleado(int codigo, String nombre, double numHorasTrabajadas, double valorHora, double porcentajeRetencion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numHorasTrabajadas = numHorasTrabajadas;
        this.valorHora = valorHora;
        this.porcentajeRetencion = porcentajeRetencion;
        } //Constructor del empleado
    
    double calcularSalarioBruto() {
        return numHorasTrabajadas*valorHora;
        } //Método que calcula el salario bruto del empleado
    
    double calcularRetencion() {
        return calcularSalarioBruto()*(porcentajeRetencion/100);
        } //Método que calcula la retención del empleado
    
    double calcularSalarioNeto() {
        return calcularSalarioBruto()-calcularRetencion();
        } //Método que calcula el salario neto del empleado
}
