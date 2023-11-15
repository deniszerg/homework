package homework27.task01;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      if (name != null && !name.isEmpty()) {
        this.name = name;
      } else {
        System.out.println("Invalid name");
      }
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      if (age >= 0 && age <= 150) {
        this.age = age;
      } else {
        System.out.println("Invalid age");
      }
    }

    public void introduce() {
      System.out.println("Hello, my name is " + name + ", I'm " + age + " years old");
    }
  }

