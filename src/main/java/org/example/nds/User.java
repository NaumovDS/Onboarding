package org.example.nds;

public class User {

  String name;
  short age;
  int height;

  public User(String name, short age, int height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }

  public User(String name, int height, short age) {
    this.name = name;
    this.height = height;
    this.age = age;
  }

  public User(short age, int height, String name) {
    this.age = age;
    this.height = height;
    this.name = name;
  }

  public User(short age, String name, int height) {
    this.age = age;
    this.name = name;
    this.height = height;

  }

  public User(int height, short age, String name) {
    this.height = height;
    this.age = age;
    this.name = name;
  }

  public User(int height, String name, short age) {
    this.height = height;
    this.name = name;
    this.age = age;

  }

  public static void Main(String[] args) {
    User first = new User("Вася", (short) 20, 180);
    User second = new User("Петя", 177, (short) 25);
    User third = new User((short) 22, 187, "Коля");
    User fourth = new User((short) 40, "Вася", 170);
    User fifth = new User(160, (short) 24, "Вася");
    User sixth = new User(181, "Вася", (short) 50);

    System.out.println(first.name + " " + first.age + " " + first.height);
    System.out.println(second.name + " " + second.age + " " + second.height);
    System.out.println(third.name + " " + third.age + " " + third.height);
    System.out.println(fourth.name + " " + fourth.age + " " + fourth.height);
    System.out.println(fifth.name + " " + fifth.age + " " + fifth.height);
    System.out.println(sixth.name + " " + sixth.age + " " + sixth.height);

  }

}
