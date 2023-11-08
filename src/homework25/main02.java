package homework25;

public class main02 {
  private int inkLevel;

  public void Main() {
    inkLevel = 1000;
  }

  public void write(String text) {
    int charactersToWrite = text.length();
    if (inkLevel >= charactersToWrite) {
      System.out.println(text);
      inkLevel -= charactersToWrite;
    } else {
      System.out.println("Ручке не хватает чернил!");
    }
  }

  public void refill() {
    inkLevel = 1000;
    System.out.println("Ручка перезаполнена.");
  }

  public void checkInk() {
    System.out.println("В ручке осталось " + inkLevel + " чернил.");
  }
}
