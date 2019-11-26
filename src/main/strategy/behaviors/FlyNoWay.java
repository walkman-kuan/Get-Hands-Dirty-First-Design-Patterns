package main.strategy.behaviors;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;

public class FlyNoWay implements FlyBehavior {
  LinkedHashSet lhs;
  HashSet hs;
  Queue<Integer> minHeap = new PriorityQueue<>();

  @Override
  public void fly() {
    minHeap.offer(1);
    System.out.println("I don't fly...");
  }
}
