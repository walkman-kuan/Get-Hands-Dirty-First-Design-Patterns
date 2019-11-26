package main.strategy.behaviors;

public class Squeak implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("Rubber duckie squeak!");
  }
}
