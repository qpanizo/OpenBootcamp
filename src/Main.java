 /*  Ejercicio 1

 public class Main {
    public static void main(String[] args)
    {
        int num1 = 3;
        int num2 = 3;
        int num3 = 2;


      int resultado = num1 + num2 + num3;

        System.out.println("Resultado : " + resultado);
    }
}



  */

/* Ejercicio 2

public class Main {

    public static void main(String[] args){
        suma(10,20);
    }

    public static void suma( int a, int b) {
        System.out.println(a+b);
    }
}

 */

 //Ejercicio Coche
public class Main {

    public static void main(String[] args){
        Coche micoche = new Coche();
        micoche.SumarPuertas();
        micoche.SumarPuertas();
        System.out.println(micoche.num_puertas);
    }
}

class Coche {

    public int num_puertas = 0;

    public void SumarPuertas() {
        this.num_puertas++;
    }

}