package co.edu.uniquindio.patronesComportamiento.strategy.sorting;

// Contexto que utiliza la estrategia de ordenamiento
public class Sorter {
  private SortingStrategy sortingStrategy;

  public void setSortingStrategy(SortingStrategy sortingStrategy) {
    this.sortingStrategy = sortingStrategy;
  }

  public void sortArray(int[] array) {
    if (sortingStrategy == null) {
      System.out.println("Sorting strategy not set!");
      return;
    }
    sortingStrategy.sort(array);
  }

}
