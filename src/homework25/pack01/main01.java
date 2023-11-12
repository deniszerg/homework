package homework25.pack01;

public class main01 {
  private String name;
  private int age;
  public void Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void introduce() {
    System.out.println("Привет, меня зовут " + name + ", мне " + age + "!");
  }
}

/*public class main {
  public <Human> main(String[] args) {
    Human person1 = new Human("Настя", 36);
    Human person2 = new Human("Вадим", 19);
    Human person3 = new Human("Мария", 28);

    person1.clone();
    person2.clone();
    person3.clone();
  }
}*/
