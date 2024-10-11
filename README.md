# KNN (K-Nearest Neighbors) en Java

Este proyecto implementa el algoritmo de **K-Nearest Neighbors (KNN)** en Java utilizando un enfoque orientado a objetos. El objetivo de este programa es clasificar un nuevo punto en función de sus vecinos más cercanos en un conjunto de datos de entrenamiento.

## Descripción

El algoritmo KNN es un método de clasificación supervisado que se basa en encontrar los `k` puntos más cercanos a un punto nuevo que queremos clasificar. Para este proyecto, hemos implementado las siguientes clases:

- `Punto`: Representa un punto en el espacio con sus coordenadas y su clase.
- `PuntoDistancia`: Calcula la distancia entre dos puntos.
- `KNN`: Implementa el algoritmo KNN para clasificar un nuevo punto.
- `Main`: Ejecuta el programa con un conjunto de datos de ejemplo y clasifica un nuevo punto.

### Características

- Implementación orientada a objetos en Java.
- Cálculo de distancia euclidiana entre puntos.
- Clasificación de nuevos puntos con los `k` vecinos más cercanos.

## Estructura del Proyecto

El proyecto incluye los siguientes archivos:

KNN TRYOUT/
│
├── KNN.java               # Implementación del algoritmo KNN
├── Punto.java             # Clase que representa un punto
├── PuntoDistancia.java    # Clase para calcular la distancia entre puntos
├── Main.java              # Clase principal que ejecuta el programa
└── README.md              # Este archivo


	3.	El programa clasificará un nuevo punto y mostrará la clase a la que pertenece en la salida de la consola.

Ejemplo de salida

El nuevo punto pertenece a la clase: B

Personalización

	•	Puedes cambiar el número de vecinos (k) modificando el parámetro en la clase Main donde se crea la instancia de KNN:

KNN knn = new KNN(puntosDeEntrenamiento, 3); // k = 3


	•	También puedes cambiar los puntos de entrenamiento para adaptarlo a tus propios datos.

Requisitos

	•	Java 8 o superior.

Autor

Ximena Carolina Fernandez Cardenas

Este proyecto fue creado como parte de un aprendizaje sobre algoritmos de machine learning en Java.
