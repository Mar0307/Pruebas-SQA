package com.saucedemo.utils;

public class LogicaUtils {

    /**
     * Este metodo genera dot tipos de cadena de texto aleatorias:
     * 1. Cadena Alfanumerico entre Mayusculas, Minusculas y Numerico
     * 2. Cadena Numerica
     *
     * @param dimensionCadena numero entero que indica la dimension del texto
     * @param tipoCadena      indica la cadena que desea retornar (numerico o alfanumerica)
     * @return retorna cadena de texto aleatoria
     */
    public static String getCadenaAleatoria(int dimensionCadena, String tipoCadena) {
        int numeroAleatorio;
        String abecedarioMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        String abecedarioMinus = "abcdefghijklmnopqrstuvxyz";
        switch (tipoCadena.toLowerCase()) {
            case "numerico":
                abecedarioMayus = "";
                abecedarioMinus = "";
                break;
            case "texto":
                numeros = "";
                break;
            case "alfanumerico":
                break;
            default:
                break;
        }
        String cadenaAlfanumerica = abecedarioMayus
                + numeros
                + abecedarioMinus;

        StringBuilder textoAleatorio = new StringBuilder(dimensionCadena);

        for (int i = 0; i < dimensionCadena; i++) {
            numeroAleatorio = (int) (cadenaAlfanumerica.length() * Math.random());
            textoAleatorio.append(cadenaAlfanumerica.charAt(numeroAleatorio));
        }
        return textoAleatorio.toString();
    }
}
