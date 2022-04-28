package cs3500.food;

public class NutritionFacts {
  private final String name;
  private final int calories;
  private final int caloriesFromFat;

//  public void setCaloriesFromFat(int caloriesFromFat) {
//    this.caloriesFromFat = caloriesFromFat;
//  }
//
//  public void setSugar(float sugar) {
//    this.sugar = sugar;
//  }

  private final float sugar;
  private final float protein;
  private final float magnesium;

//  private NutritionFacts(String name, int calories, int caloriesFromFat, float sugar, float protein,
//      float magnesium) {
//    this.name = name;
//    this.calories = calories;
//    this.caloriesFromFat = caloriesFromFat;
//    this.sugar = sugar;
//    this.protein = protein;
//    this.magnesium = magnesium;
//  }
//
//  private NutritionFacts(String name, int calories) {
//    this(name, calories, 0, 0, 0, 0);
//  }

  private NutritionFacts(Builder b) {
    // validate

    this.name = b.name;
    this.calories = b.calories;
    this.caloriesFromFat = b.caloriesFromFat;
    this.sugar = b.sugar;
    this.protein = b.protein;
    this.magnesium = b.magnesium;
  }

  public static Builder builder(String name, int calories) {
    return new Builder(name, calories);
  }

  public static class Builder {
    private final String name;  // required
    private final int calories;
    private int caloriesFromFat;
    private float sugar;
    private float protein;
    private float magnesium;

    private Builder(String name, int calories) {
      // validate inputs
      this.name = name;
      this.calories = calories;
      this.caloriesFromFat = 0;
      sugar = 0;
      protein = 0;
      magnesium = 0;
    }

    public Builder caloriesFromFat(int c) {
      this.caloriesFromFat = c;
      return this;
    }

    public Builder sugar(float s) {
      sugar = s;
      return this;
    }

    public Builder protein(float p) {
      protein = p;
      return this;
    }

    public Builder magnesium(float m) {
      magnesium = m;
      return this;
    }

    public NutritionFacts build() {
      return new NutritionFacts(this);
    }
  }

}
