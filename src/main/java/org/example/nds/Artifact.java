package org.example.nds;

public class Artifact {
  int number;
  String culture;
  int century;

  public Artifact(int number) {
    this.number = number;
  }

  public Artifact(int number, String culture) {
    this.number = number;
    this.culture = culture;
  }

  public Artifact(int number, String culture, int century) {
    this.number = number;
    this.culture = culture;
    this.century = century;
  }

  public static void main(String[] args) {
    Artifact first = new Artifact(21212);
    Artifact second = new Artifact(21212, "Ацтеки");
    Artifact third = new Artifact(21212, "Ацтеки", 9);
    System.out.println(first.number);
    System.out.println(second.number + " " + second.culture);
    System.out.println(third.number + " " + third.culture + " " + third.century);
  }

}
