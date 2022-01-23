package pt.up.fe.ldts.patterns.bar.client;

import pt.up.fe.ldts.patterns.StringDrink;
import pt.up.fe.ldts.patterns.StringRecipe;
import pt.up.fe.ldts.patterns.bar.Bar;
import pt.up.fe.ldts.patterns.bar.StringBar;
import pt.up.fe.ldts.patterns.bar.strategy.OrderingStrategy;

public abstract class AlienClient implements Client {
  private OrderingStrategy strategy;

  public AlienClient() {
      this.strategy = createOrderingStrategy();
  }

  @Override
  public void happyHourStarted(Bar bar) {
      strategy.happyHourStarted((StringBar) bar);
  }

  @Override
  public void happyHourEnded(Bar bar) {
      strategy.happyHourEnded((StringBar) bar);
  }

  @Override
  public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
      strategy.wants(drink, recipe, bar);
  }

  protected abstract  OrderingStrategy createOrderingStrategy();
}
