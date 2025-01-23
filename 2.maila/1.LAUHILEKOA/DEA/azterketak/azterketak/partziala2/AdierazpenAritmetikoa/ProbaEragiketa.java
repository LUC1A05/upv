package AdierazpenAritmetikoa;

public class ProbaEragiketa {
    public static void main(String[] args) {
        AdierazpenAritmetikoa ad = new AdierazpenAritmetikoa();
        
        // Expresiones de prueba
        System.out.println("Ebaluazioa: ((1+2)) = " + ad.ebaluatu("((1+2))")); // Esperado: 3.0
        System.out.println("Ebaluazioa: ((3-2)) = " + ad.ebaluatu("((3-2))")); // Esperado: 1.0
        System.out.println("Ebaluazioa: ((2*3)) = " + ad.ebaluatu("((2*3))")); // Esperado: 6.0
        System.out.println("Ebaluazioa: ((8/4)) = " + ad.ebaluatu("((8/4))")); // Esperado: 2.0

        // Operaciones anidadas
        System.out.println("Ebaluazioa: ((1+(2*3))) = " + ad.ebaluatu("((1+(2*3)))")); // Esperado: 7.0
        System.out.println("Ebaluazioa: (((4/2)+(3*2))) = " + ad.ebaluatu("(((4/2)+(3*2)))")); // Esperado: 8.0
        System.out.println("Ebaluazioa: (((3+5)*(2-1))) = " + ad.ebaluatu("(((3+5)*(2-1)))")); // Esperado: 8.0
        System.out.println("Ebaluazioa: (((10/2)-(3*2))) = " + ad.ebaluatu("(((10/2)-(3*2)))")); // Esperado: -1.0
        System.out.println("Ebaluazioa: (((10/5))) = " + ad.ebaluatu("(((10/5)))")); // Esperado: -4.0

        // Caso de prueba con división por cero (esperar excepción o Infinity)
        try {
            System.out.println("Ebaluazioa: ((4/0)) = " + ad.ebaluatu("((4/0))"));
        } catch (ArithmeticException e) {
            System.out.println("Errorea: Division by zero.");
        }

        // Caso de prueba con expresión vacía
        try {
            System.out.println("Ebaluazioa: () = " + ad.ebaluatu(""));
        } catch (Exception e) {
            System.out.println("Errorea: Expresión vacía.");
        }
    }
}

