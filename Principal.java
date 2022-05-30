public class Principal {
    public static void main (String[] args){
        Quadrado quadrado = new Quadrado();
        Quadrilatero quadrilatero = new Quadrilatero();
        Losango losango = new Losango();
        Retangulo retangulo = new Retangulo();
        Trapezio trapezio = new Trapezio();

        quadrado.calcularArea();
        quadrilatero.calcularArea();
        losango.calcularArea();
        retangulo.calcularArea();
        trapezio.calcularArea();
    }
}

