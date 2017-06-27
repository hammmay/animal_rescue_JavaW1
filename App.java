import java.io.Console;

public class App {
 public static void main(String[] args) {
   Console myConsole = System.console();

/* The code below has been refactored into the dry constructor code starting on line 27
  Animals charlie = new Animals();
  charlie.mName = "Charlie The Cat";
  charlie.mSpecies = "Cat";
  charlie.mAge = 3;
  charlie.mColor = "Black";

  Animals wiggles = new Animals();
  wiggles.mName = "Wiggles The Dog";
  wiggles.mSpecies = "Dog";
  wiggles.mAge = 5;
  wiggles.mColor = "White";

  Animals tutu = new Animals();
  tutu.mName = "Tutu The Bird";
  tutu.mSpecies = "Bird";
  tutu.mAge = 18;
  tutu.mColor = "Green";
*/

Animals charlie = new Animals("Charlie The Cat", "Cat", 3, "Black");
Animals wiggles = new Animals("Wiggles The Dog", "Dog", 5, "White");
Animals tutu = new Animals("Tutu The Bird", "Bird", 18, "Green");

  Animals[] allAnimals = {charlie, wiggles, tutu};

  System.out.println("What is the oldest age of animal you are willing to adopt?");
  String stringUserOldestAge = myConsole.readLine();
  int userMaxAdge = Integer.parseInt(stringUserOldestAge);
  System.out.println("Do you want a Cat, a Dog, or a Bird for a pet?");
  String userSpecies = myConsole.readLine();
  System.out.println("Here are all the animals available that are within your specifications:");

  for (Animals individualAnimals : allAnimals) {
    if (individualAnimals.youngAdopt(userMaxAdge) && individualAnimals.rightSpecies(userSpecies)) {
      System.out.println("----------------------");
      System.out.println(individualAnimals.mName);
      System.out.println(individualAnimals.mSpecies);
      System.out.println(individualAnimals.mAge);
      System.out.println(individualAnimals.mColor);
    }
  }
 }
}
