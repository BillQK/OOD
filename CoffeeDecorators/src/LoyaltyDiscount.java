public class LoyaltyDiscount extends CoffeeDecorator {

  protected LoyaltyDiscount(Coffee toBeDecorated) {
    super(toBeDecorated);
  }

  @Override
  public double getPrice() {
    return super.getPrice() * .9;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", with discount";
  }
}
