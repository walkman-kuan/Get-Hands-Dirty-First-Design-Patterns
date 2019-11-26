package main.strategy.models;

import main.strategy.behaviors.FlyBehavior;
import main.strategy.behaviors.QuackBehavior;

public abstract class Duck {
  /**
   * 1. Program to interface
   */
  protected FlyBehavior flyBehavior;
  protected QuackBehavior quackBehavior;
  // More behaviors

  public Duck() {
    // Do Nothing
  }

  public abstract void display();

  public void swim() {
    System.out.println("Duck swimming!");
  }

  /**
   * 2. Favor composition over inheritance (behavior delegation)
   */
  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}
