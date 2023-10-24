import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        boolean Volver = true;
        String RESPUESTA;
        while (Volver) {
            System.out.println("Se le presentara un menu con las siguientes opciones");

            System.out.println(
                    "1)Verificar si dos matrices son iguales \n 2)Sumar 2 matrices\n 3)generar una Matriz de 0 n a m\n 4)Obtener el inverso aditivo de una Matriz n a m ");
            System.out.println(
                    "5)Restar 2 matrices\n 6)Multiplicar un escalar por una Matriz n a m \n 7)Multiplicar 2 matrices compatibles\n 8)Matriz identidad \n 9) inversa\n 10)Determinante");

            int elegir = lector.nextInt();

            int fila1, columna1, fila2, columna2, intentos = 0, determinante, n;

            switch (elegir) {
                case 1:

                    System.out.println(
                            "Para verificar si dos matrices son iguales ambas deben tener el mismo numero de\n filas b columnas");

                    System.out.println("Digite cantidad de fila Matriz A");
                    fila1 = lector.nextInt();
                    while (fila1 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las filas de nuevo");
                        fila1 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    System.out.println("Digite Numero de Columna Matriz A ");
                    columna1 = lector.nextInt();
                    while (columna1 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las columna de nuevo");
                        columna1 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    System.out.println(" Digite numero de filas para la Matriz B");
                    fila2 = lector.nextInt();
                    while (fila2 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las filas de nuevo");
                        fila2 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    System.out.println("Digite  numero de columnas para la Matriz B");
                    columna2 = lector.nextInt();
                    while (columna2 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las columna de nuevo");
                        columna2 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    int matrizA[][] = new int[fila1][columna1];
                    int matrizB[][] = new int[fila2][columna2];

                    if (fila1 != fila2 && columna1 != columna2) {
                        System.out.println("Las Matrices  a y b son diferentes ");
                        break;

                    } else {
                        System.out.println("Las Matrices a y b son iguales ");
                    }

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            System.out.println(
                                    "Cual es el valor de la Matriz a  : " + "[" + (i + 1) + "][" + (j + 1) + "]");
                            matrizA[i][j] = lector.nextInt();
                        }
                    }

                    for (int a = 0; a < fila1; a++) {
                        for (int b = 0; b < columna1; b++) {

                            System.out
                                    .println("Cual es el valor de la Matriz b : " + "[" + (a + 1) + "][" + (b + 1)
                                            + "]");
                            matrizB[a][b] = lector.nextInt();
                        }
                    }

                    System.out.println("La Matriz a es");

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            System.out.print(matrizA[i][j] + " ");

                        }
                        System.out.println(" ");
                    }

                    System.out.println("La Matriz b es ");

                    for (int a = 0; a < fila1; a++) {
                        for (int b = 0; b < columna1; b++) {

                            System.out.print(matrizB[a][b] + " ");
                        }
                        System.out.println(" ");
                    }

                    System.out.println("Desea Volver el programa?(Si o No)");
                    RESPUESTA = lector.next();
                    if (RESPUESTA.equalsIgnoreCase("No")) {
                        Volver = false;
                    }

                    break;

                case 2:

                    System.out.println("Para sumar 2 matrices tanto las columnas como las filas necesitan ser iguales");

                    System.out.println("Cual es el numero de filas para la Matriz a");
                    fila1 = lector.nextInt();
                    while (fila1 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las filas de nuevo");
                        fila1 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    System.out.println("Cual es el numero de columnas para la Matriz a ");
                    columna1 = lector.nextInt();
                    while (columna1 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las columnas de nuevo");
                        columna1 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    System.out.println("Cual es numero de filas para la Matriz b");
                    fila2 = lector.nextInt();
                    while (fila2 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las filas de nuevo");
                        fila2 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    System.out.println("Cual es el numero de columnas para la Matriz b");
                    columna2 = lector.nextInt();
                    while (columna2 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las columnas de nuevo");
                        columna2 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    int matrizA1[][] = new int[fila1][columna1];
                    int matrizB1[][] = new int[fila2][columna2];

                    if (fila1 != fila2 && columna1 != columna2) {
                        System.out.println("Las filas o las columnas no son iguales no se puede sumar ");
                        break;

                    } else {
                        System.out.println(
                                "Las filas de la Matriz a b b son iguales\n las columnas de la Matriz a Y b son iguales ");
                    }

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            System.out.println(
                                    "Cual es el valor de la Matriz a  : " + "[" + (i + 1) + "][" + (j + 1) + "]");
                            matrizA1[i][j] = lector.nextInt();

                        }
                    }

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            System.out
                                    .println("Cual es el valor de la Matriz b : " + "[" + (i + 1) + "][" + (j + 1)
                                            + "]");
                            matrizB1[i][j] = lector.nextInt();
                        }
                    }
                    int resultado[][] = new int[fila1][columna1];

                    for (int i = 0; i < matrizA1.length; i++) {
                        for (int j = 0; j < matrizB1.length; j++) {

                            resultado[i][j] = matrizA1[i][j] + matrizB1[i][j];

                        }
                    }

                    System.out.println("La Matriz a es");

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            System.out.print(matrizA1[i][j] + " ");

                        }
                        System.out.println(" ");
                    }

                    System.out.println("La Matriz b es ");

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            System.out.print(matrizB1[i][j] + " ");

                        }
                        System.out.println(" ");
                    }

                    System.out.println("La suma de las matrices es ");

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {
                            System.out.print(resultado[i][j] + " ");
                        }
                        System.out.println("");
                    }

                    System.out.println("Desea Volver el programa?(Si o No)");
                    RESPUESTA = lector.next();
                    if (RESPUESTA.equalsIgnoreCase("No")) {
                        Volver = false;
                    }

                    break;

                case 3:

                    System.out.println(
                            "Para generar una Matriz 0 de n a m \n solo se nexesita pedir la cantidad de filas b columnas ");

                    System.out.println("Cual es la cantidad de filas que va a tener la Matriz");
                    fila1 = lector.nextInt();
                    while (fila1 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las filas de nuevo");
                        fila1 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    System.out.println("Cual es la cantidad de columnas que va a tener la Matriz");
                    columna1 = lector.nextInt();
                    while (columna1 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las columna de nuevo");
                        columna1 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    int matrizA2[][] = new int[fila1][columna1];

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            matrizA2[i][j] = 0;

                        }

                    }

                    System.out.println();

                    System.out.println("La Matriz de ceros n a m es ");

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            System.out.print(matrizA2[i][j] + " ");
                        }
                        System.out.println();
                    }

                    System.out.println("Desea Volver el programa?(Si o No)");
                    RESPUESTA = lector.next();
                    if (RESPUESTA.equalsIgnoreCase("No")) {
                        Volver = false;
                    }

                    break;

                case 4:

                    System.out.println("Para sacar la mtriz inversa aditiva solo se necesitan las columnas b filas ");

                    System.out.println("Cual es la cantidad de filas de la mnatriz");
                    fila1 = lector.nextInt();
                    while (fila1 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las filas de nuevo");
                        fila1 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    System.out.println("Cual es la cantida de columnas para la Matriz");
                    columna1 = lector.nextInt();
                    while (columna1 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las columnas de nuevo");
                        columna1 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    int matrizA3[][] = new int[fila1][columna1];

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            System.out.println("Cual es el valor de : " + "[" + (i + 1) + "][" + (j + 1) + "]");
                            matrizA3[i][j] = lector.nextInt();

                        }

                    }
                    int matrizA3A[][] = new int[fila1][columna1];

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            matrizA3A[i][j] = -matrizA3[i][j];

                        }

                    }

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            System.out.print(matrizA3A[i][j] + " ");

                        }
                        System.out.println();
                    }

                    System.out.println("Desea Volver el programa?(Si o No)");
                    RESPUESTA = lector.next();
                    if (RESPUESTA.equalsIgnoreCase("No")) {
                        Volver = false;
                    }

                    break;

                case 5:

                    System.out.println(
                            "Para restar 2 matrices de n a m se necesitan las filas b las coolumnas b que ambas sean iguales\nSi las columnas b filas son diferentes no se pueden restar");

                    System.out.println("Cual es el numero de filas para la Matriz a");
                    fila1 = lector.nextInt();
                    while (fila1 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las filas de nuevo");
                        fila1 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    System.out.println("Cual es el numero de columnas para la Matriz a ");
                    columna1 = lector.nextInt();
                    while (columna1 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las columnas de nuevo");
                        columna1 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    System.out.println("Cual es numero de filas para la Matriz b");
                    fila2 = lector.nextInt();
                    while (fila2 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las filas de nuevo");
                        fila2 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    System.out.println("Cual es el numero de columnas para la Matriz b");
                    columna2 = lector.nextInt();
                    while (columna2 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las columna de nuevo");
                        columna2 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    int matrizA5[][] = new int[fila1][columna1];
                    int matrizB5[][] = new int[fila2][columna2];

                    if (fila1 != fila2 && columna1 != columna2) {
                        System.out.println("Las filas o las columnas no son iguales no se puede sumar ");
                        break;

                    } else {
                        System.out.println(
                                "Las filas de la Matriz a b b son iguales\n las columnas de la Matriz a b b son iguales ");
                    }

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            System.out.println(
                                    "Cual es el valor de la Matriz a  : " + "[" + (i + 1) + "][" + (j + 1) + "]");
                            matrizA5[i][j] = lector.nextInt();

                        }
                    }

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            System.out
                                    .println("Cual es el valor de la Matriz b : " + "[" + (i + 1) + "][" + (j + 1)
                                            + "]");
                            matrizB5[i][j] = lector.nextInt();
                        }
                    }
                    int resultado5[][] = new int[fila1][columna1];

                    for (int i = 0; i < matrizA5.length; i++) {
                        for (int j = 0; j < matrizB5.length; j++) {

                            resultado5[i][j] = matrizA5[i][j] - matrizB5[i][j];

                        }
                    }

                    System.out.println("La Matriz a es");

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            System.out.print(matrizA5[i][j] + " ");

                        }
                        System.out.println(" ");
                    }

                    System.out.println("La Matriz b es ");

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            System.out.print(matrizB5[i][j] + " ");

                        }
                        System.out.println(" ");
                    }

                    System.out.println("La suma de las matrices es ");

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {
                            System.out.print(resultado5[i][j] + " ");
                        }
                        System.out.println("");
                    }

                    System.out.println("Desea Volver el programa?(Si o No)");
                    RESPUESTA = lector.next();
                    if (RESPUESTA.equalsIgnoreCase("No")) {
                        Volver = false;
                    }

                    break;

                case 6:

                    System.out.println(
                            "Para multiplicar un escalar por una Matriz n a \n se nevcesitan el escalar filas b columnas");

                    System.out.println("Cual es el numero de filas para la Matriz a");
                    fila1 = lector.nextInt();
                    while (fila1 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las filas de nuevo");
                        fila1 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    System.out.println("Cual es el numero de columnas para la Matriz a ");
                    columna1 = lector.nextInt();
                    while (columna1 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las columna de nuevo");
                        columna1 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    System.out.println("Cual es el valor del escalar");
                    int escalar = lector.nextInt();
                    while (escalar <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor del escalar de nuevo");
                        escalar = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    int matrizA6[][] = new int[fila1][columna1];

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            System.out.println(
                                    "Cual es el valor de la Matriz a  : " + "[" + (i + 1) + "][" + (j + 1) + "]");
                            matrizA6[i][j] = lector.nextInt();

                        }
                    }

                    int resultado6[][] = new int[fila1][columna1];

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            resultado6[i][j] = escalar * matrizA6[i][j];

                        }
                    }

                    System.out.println("La multiplicacion de un escalar por una Matriz n a m es ");

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {
                            System.out.print(resultado6[i][j] + " ");
                        }
                        System.out.println("");
                    }

                    System.out.println("Desea Volver el programa?(Si o No)");
                    RESPUESTA = lector.next();
                    if (RESPUESTA.equalsIgnoreCase("No")) {
                        Volver = false;
                    }

                    break;

                case 7:

                    System.out.println(
                            "Para multiplicar 2 matrices compatibles\n Para ello se necesitan las filas b las columnas");

                    System.out.println("Cual es el numero de filas para la Matriz a");
                    fila1 = lector.nextInt();
                    while (fila1 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las filas de nuevo");
                        fila1 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    System.out.println("Cual es el numero de columnas para la Matriz a ");
                    columna1 = lector.nextInt();
                    while (columna1 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las columna de nuevo");
                        columna1 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    System.out.println("Cual es numero de filas para la Matriz b");
                    fila2 = lector.nextInt();
                    while (fila2 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las filas de nuevo");
                        fila2 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    System.out.println("Cual es el numero de columnas para la Matriz b");
                    columna2 = lector.nextInt();
                    while (columna2 <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las columna de nuevo");
                        columna2 = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    int matrizA7[][] = new int[fila1][columna1];
                    int matrizB7[][] = new int[fila2][columna2];

                    if (fila1 != fila2 && columna1 != columna2) {
                        System.out.println("Las filas o las columnas no son iguales no se puede multiplicar ");
                        break;

                    } else if (fila1 == fila2 && columna1 == columna2) {
                        System.out.println(
                                "Las filas de la Matriz a b b son iguales\n las columnas de la Matriz a b b son iguales ");
                    }

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            System.out.println(
                                    "Cual es el valor de la Matriz a  : " + "[" + (i + 1) + "][" + (j + 1) + "]");
                            matrizA7[i][j] = lector.nextInt();

                        }
                    }

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            System.out
                                    .println("Cual es el valor de la Matriz b : " + "[" + (i + 1) + "][" + (j + 1)
                                            + "]");
                            matrizB7[i][j] = lector.nextInt();
                        }
                    }
                    int resultado7[][] = new int[fila1][columna1];

                    for (int i = 0; i < matrizA7.length; i++) {
                        for (int j = 0; j < matrizB7.length; j++) {

                            resultado7[i][j] = matrizA7[i][j] * matrizB7[i][j];

                        }
                    }

                    System.out.println("La Matriz a es");

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            System.out.print(matrizA7[i][j] + " ");

                        }
                        System.out.println(" ");
                    }

                    System.out.println("La Matriz b es ");

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {

                            System.out.print(matrizB7[i][j] + " ");

                        }
                        System.out.println(" ");
                    }

                    System.out.println("La multiplicacion de las matrices es ");

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < columna1; j++) {
                            System.out.print(resultado7[i][j] + " ");
                        }
                        System.out.println("");
                    }
                     System.out.println("Desea Volver el programa?(Si o No)");
                    RESPUESTA = lector.next();
                    if (RESPUESTA.equalsIgnoreCase("No")) {
                        Volver = false;
                    }

                    break;

                case 8:
                    System.out.print("Ingrese el número de filas: ");
                    int filas = lector.nextInt();
                    while (filas <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las filas de nuevo");
                        filas = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    System.out.print("Ingrese el número de columnas: ");
                    int columnas = lector.nextInt();
                    while (columnas <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las columnas de nuevo");
                        columnas = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    int[][] Matriz = new int[filas][columnas];

                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            if (i == j) {
                                Matriz[i][j] = 1;
                            } else {
                                Matriz[i][j] = 0;
                            }
                        }
                    }

                    System.out.println("Matriz Identidad " + filas + "a" + columnas + ":");
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            System.out.print(Matriz[i][j] + " ");
                        }
                        System.out.println();
                    }
                     System.out.println("Desea Volver el programa?(Si o No)");
                    RESPUESTA = lector.next();
                    if (RESPUESTA.equalsIgnoreCase("No")) {
                        Volver = false;
                    }

                    break;

                case 9:
                    // ingrese numero de fila y columna por que la matriz debe de ser cuadrada
                    System.out.println("Ingrese el número de filas y columnas: ");
                    n = lector.nextInt();
                    while (n <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las filas de nuevo");
                        n = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("intentos maximos");
                        break;
                    }
                    int[][] MATRIZ1 = new int[n][n];
                    int[][] inv = new int[n][n];

                    System.out.println("Ingrese los elementos de la MATRIZ1: ");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            MATRIZ1[i][j] = lector.nextInt();
                        }
                    }

                    determinante = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (j == i) {
                                determinante += MATRIZ1[j][i];
                            }
                        }
                    }

                    if (determinante != 0) {
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                if (j != i) {
                                    determinante -= MATRIZ1[j][i] * MATRIZ1[j][i];
                                }
                            }
                        }

                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                if (i != j) {
                                    determinante /= (MATRIZ1[i][i] * MATRIZ1[j][j]);
                                }
                            }
                        }

                        System.out.println("El determinante de la MATRIZ1 es: " + determinante);

                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                if (i == j) {
                                    inv[i][j] = MATRIZ1[j][i];
                                } else {
                                    inv[i][j] = MATRIZ1[j][i] * MATRIZ1[i][i];
                                }
                            }
                        }

                        System.out.println("La MATRIZ1 es: ");
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                System.out.print("[" + inv[i][j] + "]");
                            }
                            System.out.println(" ");
                        }
                    } else {
                        System.out.println("No tiene inversa.");
                    }
                     System.out.println("Desea Volver el programa?(Si o No)");
                    RESPUESTA = lector.next();
                    if (RESPUESTA.equalsIgnoreCase("No")) {
                        Volver = false;
                    }

                    break;
                case 10:

                    System.out.println("Ingrese el número de filas de la matriz:");
                    filas = lector.nextInt();
                    while (filas <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las filas de nuevo");
                        filas = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    System.out.println("Ingrese el número de columnas de la matriz:");
                    columnas = lector.nextInt();
                    while (columnas <= 0 && intentos < 3) {
                        intentos++;
                        System.out.println("No se puedes digitar numeros negativos");
                        System.out.println("Digite el valor de las columnas de nuevo");
                        columnas = lector.nextInt();
                    }
                    if (intentos == 3) {
                        System.out.println("Ha intentado muchas veces, regresa mas tarde");
                        break;
                    }

                    if (filas != columnas) {
                        System.out.println("La matriz no es cuadrada. Debe tener el mismo número de filas b columnas.");
                        return;
                    }

                    int[][] matriz = new int[filas][columnas];

                    System.out.println("Ingrese los elementos de la matriz:");
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            matriz[i][j] = lector.nextInt();
                        }
                    }

                    System.out.println("La matriz ingresada es:");
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            System.out.print(matriz[i][j] + " ");
                        }
                        System.out.println();
                    }

                    int det = 0;

                    if (filas == 2) {
                        det = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);

                    } else if (filas == 3) {
                        det = (matriz[0][0] * matriz[1][1] * matriz[2][2])
                                + (matriz[0][1] * matriz[1][2] * matriz[2][0])
                                + (matriz[0][2] * matriz[1][0] * matriz[2][1])
                                - (matriz[2][0] * matriz[1][1] * matriz[0][2])
                                - (matriz[2][1] * matriz[1][2] * matriz[0][0])
                                - (matriz[2][2] * matriz[1][0] * matriz[0][1]);
                    } else {
                        for (int j = 0; j < filas; j++) {
                            int[][] submatriz = new int[filas - 1][filas - 1];
                            for (int k = 1; k < filas; k++) {
                                int lIdx = 0;
                                for (int l = 0; l < filas; l++) {
                                    if (l != j) {
                                        submatriz[k - 1][lIdx++] = matriz[k][l];
                                    }
                                }
                            }
                            det += Math.pow(-1, j) * matriz[0][j] * det;
                        }
                    }

                    System.out.println("El determinante de la matriz es: " + det);

                    System.out.println("Desea Volver el programa?(Si o No)");
                    RESPUESTA = lector.next();
                    if (RESPUESTA.equalsIgnoreCase("No")) {
                        Volver = false;
                    }
                     System.out.println("Desea Volver el programa?(Si o No)");
                    RESPUESTA = lector.next();
                    if (RESPUESTA.equalsIgnoreCase("No")) {
                        Volver = false;
                    }

                    break;

                default:

                    System.out.println("Fin del programa");

                    break;
            }
        }
        lector.close();
    }

}
