package ejerciciopropuestono12;

public class EjercicioPropuestoNo12 {

    public static void main(String[] args) {
            double horasemana, pagohora, salariobruto, salarioneto, retencion;  
            horasemana = 48;
            pagohora = 5000;
            salariobruto = horasemana*pagohora;
            retencion = salariobruto*(12.5/100);
            salarioneto = salariobruto - retencion;
            System.out.println("Las horas trabajadas a la semana son: " + horasemana);
            System.out.println("El pago por hora es: " + pagohora);
            System.out.println("El salario bruto es: " + salariobruto);
            System.out.println("La retención es: " + retencion);
            System.out.println("El salario neto es: " + salarioneto);
    }
}
