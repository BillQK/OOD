public class Espresso implements Coffee {

  @Override
  public double getPrice() {
    return 2.5;
  }

  @Override
  public String getDescription() {
    return "espresso";
  }
}
