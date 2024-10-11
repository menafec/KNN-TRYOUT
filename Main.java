import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear puntos de entrenamiento
        List<Punto> puntosDeEntrenamiento = new ArrayList<>();
        puntosDeEntrenamiento.add(new Punto(1, 2, "A"));
        puntosDeEntrenamiento.add(new Punto(2, 3, "A"));
        puntosDeEntrenamiento.add(new Punto(3, 3, "B"));
        puntosDeEntrenamiento.add(new Punto(5, 2, "B"));

        // Crear el clasificador KNN con k = 3
        KNN knn = new KNN(puntosDeEntrenamiento, 3);

        // Clasificar un nuevo punto
        Punto nuevoPunto = new Punto(4, 3, null);
        String clasePredicha = knn.clasificar(nuevoPunto);

        System.out.println("El nuevo punto pertenece a la clase: " + clasePredicha);
    }
}