package co.edu.uniquindio.patronesComportamiento.strategy.sorting;

// Estrategia concreta: Ordenamiento por Burbuja
public class BubbleSort extends SortingStrategy {
  @Override
  public void sort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          // Intercambio
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
    System.out.println("Array sorted using Bubble Sort: " + arrayToString(array));
  }
}
