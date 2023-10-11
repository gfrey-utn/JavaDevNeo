public class Ejercicio2 {

  public String codificar(String mensaje, int desplazamiento) {
    String mensajeCodificado = "";
    char caracterCodificado;

    for(int x = 0; x < mensaje.length(); x++) {
      caracterCodificado = caracterCodificado(mensaje.charAt(x), desplazamiento);
      mensajeCodificado = mensajeCodificado + caracterCodificado;
    }

    return mensajeCodificado;
  }

  private char caracterCodificado(char caracter, int desplazamiento) {
    String abecedario = "abcdefghijklmnñopqrstuvwxyz ";
    int nuevaPosicion = (abecedario.indexOf(caracter) + desplazamiento) % abecedario.length();
    char caracterCodificado = abecedario.charAt(nuevaPosicion);
    return caracterCodificado;
  }

  public String decodificar(String mensaje, int desplazamiento) {
    String mensajeDecodificado = "";
    char caracterDecodificado;

    for (int x = 0; x < mensaje.length(); x++) {
      caracterDecodificado = caracterDecodificado(mensaje.charAt(x), desplazamiento);
      mensajeDecodificado = mensajeDecodificado + caracterDecodificado;
    }

    return mensajeDecodificado;
  }

  private char caracterDecodificado(char caracter, int desplazamiento) {
    String abecedario = "abcdefghijklmnñopqrstuvwxyz ";
    int nuevaPosicion = Math.floorMod(abecedario.indexOf(caracter) - desplazamiento, abecedario.length());
    char caracterDecodificado = abecedario.charAt(nuevaPosicion);
    return caracterDecodificado;
  }
}
