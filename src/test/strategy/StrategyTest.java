package test.strategy;

import main.strategy.behaviors.FlyNoWay;
import main.strategy.behaviors.FlyWithWings;
import main.strategy.behaviors.Quack;
import main.strategy.models.Duck;
import main.strategy.models.MallardDuck;

public class StrategyTest {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck(new FlyNoWay(), new Quack());
    mallard.display();
    mallard.performFly();
    mallard.performQuack();

    // Change behavior dynamically at runtime
    System.out.println("Human being modify my gene! Suddenly, I can");
    mallard.setFlyBehavior(new FlyWithWings());
    mallard.performFly();
  }
}
