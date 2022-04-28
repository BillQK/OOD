public class WithSprinkles extends CoffeeDecorator {

  protected WithSprinkles(Coffee toBeDecorated) {
    super(toBeDecorated);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", with sprinkles";
  }
}
