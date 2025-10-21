public class Circulo {
    private double raio = 1.0;
    private String cor = "Branco";
    private static double PI = Math.PI;

    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {

    }

    public double calcArea() {
        return PI * (raio * raio);
    }

    public double calcCircuferencia() {
        return 2 * PI * raio;
    }

    public static double calcAreaEstatico(double raio) {
        return PI * (raio * raio);
    }

    public static double calcCircuferenciaEstatico(double raio) {
        return 2 * PI * raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public String getCor() {
        return this.cor;
    }

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo(5);
        Circulo circulo3 = new Circulo(7, "Azul");

        System.out.println("Circulo1 - \nRaio: " + circulo1.getRaio() + " \nCor: " + circulo1.getCor() + " \nÁrea: " + circulo1.calcArea() + " \nCircuferencia: " + circulo1.calcCircuferencia());

        System.out.println("\nCirculo2 - \nRaio: " + circulo2.getRaio() + " \nCor: " + circulo2.getCor() + " \nÁrea: " + circulo2.calcArea() + " \nCircuferencia: " + circulo2.calcCircuferencia());

        System.out.println("\nCirculo3 - \nRaio: " + circulo3.getRaio() + " \nCor: " + circulo3.getCor() + " \nÁrea: " + circulo3.calcArea() + " \nCircuferencia: " + circulo3.calcCircuferencia());

        System.out.println("\nÁrea (método estático, raio = 10): " + Circulo.calcAreaEstatico(10));
        System.out.println("Circunferência (método estático, raio = 10): " + Circulo.calcCircuferenciaEstatico(10));
    }
}
