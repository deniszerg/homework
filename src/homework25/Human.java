package homework25;

public class main01 {
  private String name;
  private int age;
  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void introduce() {
    System.out.println("Привет, меня зовут " + name + ", мне " + age + "!");
  }
}

public class Main {
  public static void main(String[] args) {
    Human person1 = new Human("Настя", 36);
    Human person2 = new Human("Вадим", 19);
    Human person3 = new Human("Мария", 28);

    person1.introduce();
    person2.introduce();
    person3.introduce();
  }
}
}
