public class Ejercicio1B {

  public double[] ordenar(boolean ascendente, double numero1, double numero2, double numero3) {

    double primero, segundo, tercero;

    if (ascendente) {
      if (numero1 <= numero2) {
        primero = numero1;
        segundo = numero2;
      } else {
        primero = numero2;
        segundo = numero1;
      }
      if (numero3 <= segundo) {
        tercero = segundo;
        if (numero3 <= primero) {
          segundo = primero;
          primero = numero3;
        } else {
          segundo = numero3;
        }
      } else {
        tercero = numero3;
      }
    } else {
      if (numero1 >= numero2) {
        primero = numero1;
        segundo = numero2;
      } else {
        primero = numero2;
        segundo = numero1;
      }
      if (numero3 >= segundo) {
        tercero = segundo;
        if (numero3 >= primero) {
          segundo = primero;
          primero = numero3;
        } else {
          segundo = numero3;
        }
      } else {
        tercero = numero3;
      }
    }

    double[] array = {primero, segundo, tercero};
    return array;
  }
}
