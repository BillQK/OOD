public abstract class CoffeeDecorator implements Coffee {

  protected final Coffee toBeDecorated;

  protected CoffeeDecorator(Coffee toBeDecorated) {
    this.toBeDecorated = toBeDecorated;
  }

  @Override
  public double getPrice() {
    return toBeDecorated.getPrice();
  }

  @Override
  public String getDescription() {
    return toBeDecorated.getDescription();
  }
}
