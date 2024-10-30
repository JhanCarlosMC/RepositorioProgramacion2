package co.edu.uniquindio.patronesComportamiento.strategy.sorting;

public class MainStrategy {
  public static void main(String[] args) {
    Sorter sorter = new Sorter();

    int[] array1 = {5, 2, 9, 1, 5, 6};
    int[] array2 = {3, 7, 8, 5, 2, 1};

    // Usar ordenamiento por burbuja
    sorter.setSortingStrategy(new BubbleSort());
    sorter.sortArray(array1);

    // Usar ordenamiento por selección
    sorter.setSortingStrategy(new SelectionSort());
    sorter.sortArray(array2);
  }
}
