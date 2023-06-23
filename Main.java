public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.SumarPuertas();
        miCoche.SumarPuertas();
        miCoche.SumarPuertas();
        miCoche.SumarPuertas();
        System.out.println(miCoche.puertas);

        int resultado;
        resultado = suma(4, 6, 15);
        System.out.println(resultado);
        }

    public static int suma(int a, int b, int c) {
        return a + b + c;}

}


class Coche {
    public int puertas = 0;
    public void SumarPuertas() {
        this.puertas++;
    }
}