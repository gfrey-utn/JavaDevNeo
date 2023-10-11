public class Ejercicio1C {

  public double sumarTodosLosMayoresA(double x, double[] vector) {

    int suma = 0;

    for(double numero : vector) {
      if (numero > x) {
        suma += numero;
      }
    }

    return suma;
  }
}
