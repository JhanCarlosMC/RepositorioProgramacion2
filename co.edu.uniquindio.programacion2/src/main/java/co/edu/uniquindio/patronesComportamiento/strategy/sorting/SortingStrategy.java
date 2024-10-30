package co.edu.uniquindio.patronesComportamiento.strategy.sorting;

// Clase base para las estrategias de ordenamiento
public abstract class SortingStrategy {
  public abstract void sort(int[] array);

  protected String arrayToString(int[] array) {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0; i < array.length; i++) {
      sb.append(array[i]);
      if (i < array.length - 1) {
        sb.append(", ");
      }
    }
    sb.append("]");
    return sb.toString();
  }
}
