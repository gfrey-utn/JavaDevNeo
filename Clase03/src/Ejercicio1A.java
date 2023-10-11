public class Ejercicio1A {

  public int cantidadAparicionesDeLetraEn(String palabra, char letra) {
    int apariciones = 0;
    for (int n = 0; n < palabra.length(); n++) {
      if (palabra.charAt(n) == letra) {
        apariciones++;
      }
    }
    return apariciones;
  }

}
