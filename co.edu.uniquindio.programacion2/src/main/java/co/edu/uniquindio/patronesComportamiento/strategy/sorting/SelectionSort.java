package co.edu.uniquindio.patronesComportamiento.strategy.sorting;

// Estrategia concreta: Ordenamiento por Selección
public class SelectionSort extends SortingStrategy {
  @Override
  public void sort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
      int minIdx = i;
      for (int j = i + 1; j < n; j++) {
        if (array[j] < array[minIdx]) {
          minIdx = j;
        }
      }
      // Intercambio
      int temp = array[minIdx];
      array[minIdx] = array[i];
      array[i] = temp;
    }
    System.out.println("Array sorted using Selection Sort: " + arrayToString(array));
  }
}
