import java.util.Scanner;

public class APE6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declaración de variables
        float monto_compra;
        int annios_clienta;
        int tipo_membresia;  // 1 = bronce, 2 = silver, 3 = gold
        float factor = 1.0f;
        float puntos_base, puntos_extras, puntos_total;
        
        int puntos_por_dolar = 1;
        int bono_annios = 50;
        
        System.out.print("Ingrese el valor del monto de compra: ");
        monto_compra = sc.nextFloat();
        
        System.out.print("Ingrese los annios como clienta: ");
        annios_clienta = sc.nextInt();
        
        System.out.print("Tipo de membresia (1 = bronce, 2 = silver, 3 = gold): ");
        tipo_membresia = sc.nextInt();
        
        // Selección del factor usando switch
        switch (tipo_membresia) {
            case 1:
                factor = 1.0f;
                break;
            case 2:
                factor = 1.5f;
                break;
            case 3:
                factor = 2.0f;
                break;
            default:
                factor = 1.0f; // Valor por defecto si ingresa otra opción
                break;
        }
        
        puntos_base = monto_compra * puntos_por_dolar;
        puntos_extras = annios_clienta * bono_annios;
        puntos_total = (puntos_base + puntos_extras) * factor;
        
        System.out.printf("Los puntos totales de fidelidad son: %.2f\n", puntos_total);
                
        sc.close();
    }
}