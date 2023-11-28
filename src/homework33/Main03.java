package homework33;

public class Main03 {
  public static int[] generateFibonacci(int n) {
    if (n <= 0) {
      return new int[0];
    }

    int[] fibonacciSequence = new int[n];
    fibonacciSequence[0] = 0;
    if (n > 1) {
      fibonacciSequence[1] = 1;
      for (int i = 2; i < n; i++) {
        fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
      }
    }

    return fibonacciSequence;
  }

  public static void main(String[] args) {
    int n = 10; // Задаем количество чисел Фибоначчи для генерации
    int[] result = generateFibonacci(n);

    System.out.print("Первые " + n + " чисел последовательности Фибоначчи: ");
    for (int num : result) {
      System.out.print(num + " ");
    }
  }
}
