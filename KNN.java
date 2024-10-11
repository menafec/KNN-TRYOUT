import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KNN {
    private List<Punto> puntosDeEntrenamiento;
    private int k;

    public KNN(List<Punto> puntosDeEntrenamiento, int k) {
        this.puntosDeEntrenamiento = puntosDeEntrenamiento;
        this.k = k;
    }

    // Método para clasificar un nuevo punto
    public String clasificar(Punto nuevoPunto) {
        List<PuntoDistancia> distancias = new ArrayList<>();

        // Calcular la distancia desde el nuevo punto a cada punto de entrenamiento
        for (Punto punto : puntosDeEntrenamiento) {
            double distancia = nuevoPunto.calcularDistancia(punto);
            distancias.add(new PuntoDistancia(punto, distancia));
        }

        // Ordenar por distancia
        Collections.sort(distancias, Comparator.comparingDouble(PuntoDistancia::getDistancia));

        // Tomar los k vecinos más cercanos
        List<Punto> kVecinos = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            kVecinos.add(distancias.get(i).punto);
        }

        // Contar la frecuencia de cada etiqueta
        int contadorClaseA = 0, contadorClaseB = 0;
        for (Punto vecino : kVecinos) {
            if (vecino.etiqueta.equals("A")) {
                contadorClaseA++;
            } else if (vecino.etiqueta.equals("B")) {
                contadorClaseB++;
            }
        }

        // Retornar la etiqueta con mayor frecuencia
        return contadorClaseA > contadorClaseB ? "A" : "B";
    }
}