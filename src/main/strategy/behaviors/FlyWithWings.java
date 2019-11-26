package main.strategy.behaviors;

public class FlyWithWings implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("Fly with wings!");
  }
}
