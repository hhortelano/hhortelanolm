package TEMA4;

public class Ejercicio1 {

    public static void main(String[] args) {

        System.out.println(signo(-3.5));
        System.out.println(signo(0));
        System.out.println(signo(8.2));
    }



    public static int signo(double numero){
        if (numero < 0 ) {
            return -1;
        } else if (numero > 0){
            return 1;
        } else  {
            return 0;
        }
    }
}
