public class Main {
    public static void main(String[] args) {

        //1
        int numeroIf = 0;

        if (numeroIf < 0) System.out.println("El numero es negativo");
        else System.out.println("El numero es positivo");


        //2
        int numeroWhile = 0;
        while (numeroWhile < 3){
            numeroWhile++;
            //System.out.println(numeroWhile);
        }

        //3
        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
        }while (numeroDoWhile < 3);

        //System.out.println(numeroDoWhile);


        //4
        for (int numeroFor = 0; numeroFor <= 3 ; numeroFor++) {
            System.out.println(numeroFor);
        }

        //5

        String estacion = "Verano";

        switch (estacion){
            case "Verano":
                System.out.println("la estacion es verano");
                break;
            case "otonio":
                System.out.println("la estacion es otoño");
                break;
            case "Primavera":
                System.out.println("la estacion es Primavera");
                break;
            case "Invierno":
                System.out.println("la estacion es Invierno");
                break;
            default:
                System.out.println("NO es una estacion");
        }

    }
}