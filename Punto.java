public class Punto {
    double x, y;
    String etiqueta; // La clase del punto

    public Punto(double x, double y, String etiqueta) {
        this.x = x;
        this.y = y;
        this.etiqueta = etiqueta;
    }

    // Método para calcular la distancia entre dos puntos
    public double calcularDistancia(Punto otro) {
        return Math.sqrt(Math.pow((otro.x - this.x), 2) + Math.pow((otro.y - this.y), 2));
    }
}