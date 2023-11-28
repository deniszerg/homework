package homework33;

public class Main01 {
  public static void changeSigns(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = -array[i];
    }
  }

  public static void main(String[] args) {
    int[] array = {1, 5, 7, -4, 8, -3, -6};

    System.out.println("Исходный массив:");
    printArray(array);

    changeSigns(array);

    System.out.println("\nМассив после изменения знаков:");
    printArray(array);
  }

  public static void printArray(int[] array) {
    for (int num : array) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}