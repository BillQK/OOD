public class Model implements IModel {
  private String input;

  public Model() {
    input = "";
  }

  @Override
  public String getString() {
    return input;
  }

  @Override
  public void setString(String i) {
    input = i;
  }
}