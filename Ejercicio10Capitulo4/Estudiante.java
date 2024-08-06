public class Estudiante {
    int NumeroInscripcion,Estrato;
    String Nombre;
    double Patrimonio,Pago;
    Estudiante(int NumeroInscripcion, String Nombre, double Patrimonio, int Estrato) {
        this.NumeroInscripcion = NumeroInscripcion;
        this.Nombre = Nombre;
        this.Patrimonio = Patrimonio;
        this.Estrato = Estrato;
        } //Constructor del estudiante
    
    double calcularPago(){
        if(Patrimonio>2000000 && Estrato>3)
            Pago = 50000 + (Patrimonio*0.03);
        else
            Pago = 50000;
        return Pago;
    }
}
