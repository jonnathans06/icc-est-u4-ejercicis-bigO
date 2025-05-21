package main.ejercicio2;

public class RespuestasOptimizadas {
    // El estudiante debe escribir aquí las versiones optimizadas y las
    // complejidades

    // 1. Versión optimizada de tieneDuplicados (Complejidad anotada en la variable)
    public static String tieneDuplicadosComplejidad = ""; // Ej: "O(n)"

    public static boolean tieneDuplicadosOpt(int[] arr) {
        int max = arr.length;
        boolean[] duplicado = new boolean[max];

        for (int num : arr){
            if(duplicado[num]) return true;
            duplicado[num] = true;
        }
        return false;
    }

    // 2. Versión optimizada de contarMayores (Complejidad anotada en la variable)
    public static String contarMayoresComplejidad = ""; // Ej: "O(n)"
  
    public static int contarMayoresOpt(int[] arr, int x) {
            int contador = 0;
            for (int num : arr){
                if(num > x) {
                    contador++;
                }
            }
        return contador;
    }

    // 3. Versión optimizada de encontrarMaximo (Complejidad anotada en la variable)
    public static String encontrarMaximoComplejidad = ""; // Ej: "O(n)"

   public static int encontrarMaximoOpt(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("El arreglo no debe estar vacío");
        }

        int maximo = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximo) {
                maximo = arr[i];
            }
        }
        return maximo;
    }
}
