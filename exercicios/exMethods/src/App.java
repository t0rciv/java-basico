public class App {
    public static void main(String[] args) throws Exception {
        Calc.operations(10, 5);

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: "+ areaQuadrado);
        
        double areaRetangulo = Quadrilatero.area(5, 5);
        System.out.println("Área do retângulo: "+ areaRetangulo);
                
        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Área do trapezio: "+ areaTrapezio);
    }
}

