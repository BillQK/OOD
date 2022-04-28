import static org.junit.Assert.*;

import cs3500.food.NutritionFacts;
import cs3500.food.NutritionFacts.Builder;
import org.junit.Before;

public class NutritionFactsTest {

  private NutritionFacts nf;

  @Before
  public void setUp() {
    //nf = new NutritionFacts("Candy" ,10, 0, 0, 0, 0);
    //NutritionFacts nf2 = new NutritionFacts("Water", 0);

    //NutritionFacts.Builder builder = new NutritionFacts.Builder("Bread", 100);
    NutritionFacts.Builder builder = NutritionFacts.builder("Bread", 100)
        .protein(3.2F).magnesium(700F).caloriesFromFat(20);
    nf = builder.build();

    NutritionFacts.Builder builder1 = NutritionFacts.builder("Corn", 100).caloriesFromFat(4).magnesium(3).protein(4.3F).magnesium(3);

  }


}
