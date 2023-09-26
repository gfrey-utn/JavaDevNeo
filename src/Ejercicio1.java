public class Ejercicio1 {
  public static void main(String[] args) {
    System.out.println("--- CLASE 01 ---");
    System.out.println("Ejercicio 1A.\n");

    int numeroInicio = 5;
    int numeroFin = 14;

    while(numeroInicio <= numeroFin) {
      System.out.println(numeroInicio);
      numeroInicio++;
    }

    System.out.println("Ejercicio 1B.\n");
    numeroInicio = 5;

    while(numeroInicio <= numeroFin) {
      if (numeroInicio % 2 == 0) {
        System.out.println(numeroInicio);
      }
      numeroInicio++;
    }

    System.out.println("Ejercicio 1C.\n");
    numeroInicio = 5;
    boolean mostrarNumerosPares = true;

    while (numeroInicio <= numeroFin) {
      if (mostrarNumerosPares) {
        if (numeroInicio % 2 == 0) {
          System.out.println(numeroInicio);
        }
      } else {
        if (numeroInicio % 2 != 0) {
          System.out.println(numeroInicio);
        }
      }
    }

    System.out.println("Ejercicio 1D.\n");
    numeroInicio = 5;
    for(int x = 15; x >= numeroInicio; x--) {
      if (x % 2 == 0) {
        System.out.println(x);
      }
    }

  }
}
