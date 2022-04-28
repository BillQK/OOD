public class WithMilk extends CoffeeDecorator {

  protected WithMilk(Coffee toBeDecorated) {
    super(toBeDecorated);
  }

  @Override
  public double getPrice() {
    return 0.25 + super.getPrice();
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", with milk";
  }
}
