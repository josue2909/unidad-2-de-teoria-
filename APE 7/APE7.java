import java.util.Scanner; 

public class APE7 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        
        float evaluacionIndividual, trabajoGrupal, evaluacionFinal, notaFinal = 0.0f;
        String nivelDesempeno = "";
        
        System.out.println("=== CÁLCULO DE NOTA FINAL - UNIDAD 1 ===");
        
        System.out.print("Ingrese la nota de la Evaluación Individual (0 a 10): ");
        evaluacionIndividual = sc.nextFloat();
        
        System.out.print("Ingrese la nota del Trabajo Grupal (0 a 10): ");
        trabajoGrupal = sc.nextFloat();
        
        System.out.print("Ingrese la nota de la Evaluación Final (0 a 10): ");
        evaluacionFinal = sc.nextFloat();
        
        // Validación con switch para verificar que todas las calificaciones estén en el rango de 0 a 10
        int validacion = ((evaluacionIndividual >= 0.0f && evaluacionIndividual <= 10.0f) &&
                          (trabajoGrupal >= 0.0f && trabajoGrupal <= 10.0f) &&
                          (evaluacionFinal >= 0.0f && evaluacionFinal <= 10.0f)) ? 1 : 0;
        
        switch (validacion) {
            case 0:
                System.out.println("\nError: Todas las calificaciones deben encontrarse estrictamente en el rango de 0 a 10.");
                break;
                
            case 1:
                notaFinal = (evaluacionIndividual * 0.30f) + (trabajoGrupal * 0.30f) + (evaluacionFinal * 0.40f);
                
                int categoria = (int) notaFinal;
                switch (categoria) {
                    case 10:
                    case 9:
                        nivelDesempeno = "Excelente";
                        break;
                    case 8:
                        nivelDesempeno = "Muy bueno";
                        break;
                    case 7:
                        nivelDesempeno = "Bueno";
                        break;
                    case 6:
                    case 5:
                        nivelDesempeno = "Regular";
                        break;
                    default:
                        nivelDesempeno = "Deficiente";
                        break;
                }
                
                System.out.println("\n----------------------------------------");
                System.out.printf("Nota Final Ponderada: %.2f\n", notaFinal);
                System.out.println("Nivel de Desempeño: " + nivelDesempeno);
                
                int estadoAprobacion = (notaFinal < 7.0f) ? 0 : 1;
                switch (estadoAprobacion) {
                    case 0:
                        System.out.println("El estudiante requiere refuerzo académico");
                        System.out.println("Estado: REPROBADO (Nota mínima de aprobación: 7.0)");
                        break;
                    case 1:
                        System.out.println("Estado: APROBADO");
                        break;
                }
                
                int esSobresaliente = (notaFinal >= 9.0f) ? 1 : 0;
                switch (esSobresaliente) {
                    case 1:
                        System.out.println("¡Felicitaciones! Rendimiento sobresaliente");
                        break;
                }
                System.out.println("----------------------------------------");
                break;
        }
        
        sc.close();
    }
}