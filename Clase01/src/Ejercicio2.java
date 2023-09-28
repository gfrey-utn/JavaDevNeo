public class Ejercicio2 {
  public static void main(String[] args) {
    System.out.println("--- CLASE 01 ---");
    System.out.println("Ejercicio 2.\n");

    float ingresos = 2999000;
    int superficie = 20;
    int energia = 900;

    if (ingresos <= 748382.07 && superficie <= 30 && energia <= 3330) {
      System.out.println("Categoría A");
    } else if (ingresos <= 1112459.83 && superficie <= 45 && energia <= 5000) {
      System.out.println("Categoría B");
    } else if (ingresos <= 1557443.75 && superficie <= 60 && energia <= 6700) {
      System.out.println("Categoría C");
    } else if (ingresos <= 1934273.04 && superficie <= 85 && energia <= 10000) {
      System.out.println("Categoría D");
    } else if (ingresos <= 2277684.56 && superficie <= 110 && energia <= 13000) {
      System.out.println("Categoría E");
    } else if (ingresos <= 2847105.70 && superficie <= 150 && energia <= 16500) {
      System.out.println("Categoría F");
    } else if (ingresos <= 3416526.83 && superficie <= 200 && energia <= 20000) {
      System.out.println("Categoría G");
    } else if (ingresos <= 4229985.60 && superficie <= 200 && energia <= 20000) {
      System.out.println("Categoría H");
    }

  }
}
