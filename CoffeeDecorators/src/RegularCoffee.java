public class RegularCoffee implements Coffee {

  @Override
  public double getPrice() {
    return 2;
  }

  @Override
  public String getDescription() {
    return "regular coffee";
  }
}
