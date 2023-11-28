package homework33;

public class Main02 {
  public static char[] getEnglishAlphabet() {
    char[] alphabet = new char[26]; // Создаем массив из 26 символов для хранения алфавита

    for (int i = 0; i < 26; ++i) {
      alphabet[i] = (char) ('a' + i); // Заполняем массив буквами от 'a' до 'z' по ASCII кодам
    }

    return alphabet;
  }

  public static void main(String[] args) {
    char[] alphabetArray = getEnglishAlphabet();

    // Выводим массив на экран
    System.out.println("English Alphabet in Lowercase:");
    for (char letter : alphabetArray) {
      System.out.print(letter + " ");
    }
  }
}
