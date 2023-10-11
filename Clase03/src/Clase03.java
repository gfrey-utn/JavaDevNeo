public class Clase03 {
  public static void main(String[] args) {
    System.out.println("------ EJERCICIOS CLASE 03 -------");

    System.out.println("1A)");
    Ejercicio1A ej1A = new Ejercicio1A();
    System.out.println(ej1A.cantidadAparicionesDeLetraEn("dificilisimo", 'i')); // 5
    System.out.println("----------");

    System.out.println("1B)");
    Ejercicio1B ej1B = new Ejercicio1B();
    System.out.println(ej1B.ordenar(true, 6, 4, 2)); // [2, 4, 6]
    System.out.println(ej1B.ordenar(false, 1, 2, 3)); // [3, 2, 1]
    System.out.println("----------");

    System.out.println("1C)");
    Ejercicio1C ej1C = new Ejercicio1C();
    double numeros[] = {4.0, 6.0, 5.0, 7.0};
    System.out.println(ej1C.sumarTodosLosMayoresA(5.0, numeros)); // 13.0
    System.out.println("----------");

    System.out.println("2)");
    Ejercicio2 ej2 = new Ejercicio2();
    String mensaje = "hola que tal";
    System.out.println("Mensaje original: " + mensaje);

    mensaje = ej2.codificar(mensaje, 2);
    System.out.println("Mensaje codificado: " + mensaje);

    mensaje = ej2.decodificar(mensaje, 2);
    System.out.println("Mensaje decodificado: " + mensaje);
    System.out.println("----------");

  }
}
