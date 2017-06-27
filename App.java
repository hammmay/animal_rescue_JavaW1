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

  System.out.println("Welcome to New Friends animal shelter. What would you like to do? Enter one of the following options: See All Animals or See Available Animals or Search By Trait or Create Animal Profile");
  String navigationChoice = myConsole.readLine();

  if (navigationChoice.equals("See All Animals")){
      for (Animals individualAnimals : allAnimals) {
          System.out.println("----------------------");
          System.out.println(individualAnimals.mName);
          System.out.println(individualAnimals.mSpecies);
          System.out.println(individualAnimals.mAge);
          System.out.println(individualAnimals.mColor);
          System.out.println("Would you like to adopt " + individualAnimals.mName + " ?");
          String adoptionQuestion = myConsole.readLine().toLowerCase().trim();
          if (adoptionQuestion.equals("yes")) {
            individualAnimals.adoptionStatus();
            System.out.println(individualAnimals.mAdopted);
            System.out.println("Thank you for adopting " + individualAnimals.mName + ".");
          } else {
            System.out.println("Thank you for considering to adopt " + individualAnimals.mName + ".");
          }
        }
    } else if (navigationChoice.equals("See Available Animals")) {
        for (Animals individualAnimals : allAnimals) {
            System.out.println("----------------------");
            System.out.println(individualAnimals.mName);
            System.out.println(individualAnimals.mSpecies);
            System.out.println(individualAnimals.mAge);
            System.out.println(individualAnimals.mColor);
        }
      }
    }
  }

/*   } else if (navigationChoice.equals("Search By Trait")) {
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
        } else if (navigationChoice.equals("Create Animal Profile")) {
            System.out.println("What is the animal's name?");
            String userNewName = myConsole.readLine();
            System.out.println("Cute name! What species is the animal?");
            String userNewSpecies = myConsole.readLine();
            System.out.println("We've adopted out some of those before. How many years old is the animal?");
            int userNewAge = Integer.parseInt(myConsole.readLine());
            System.out.println("We have young and old animals here. Lastly, what color is the animal?");
            String userNewColor = myConsole.readLine();
            Animals userAnimals = new Animals(userNewName, userNewSpecies, userNewAge, userNewColor);
            System.out.println("Here's our newest shelter buddy:");
            System.out.println("----------------------");
            System.out.println(userAnimals.mName);
            System.out.println(userAnimals.mSpecies);
            System.out.println(userAnimals.mAge);
            System.out.println(userAnimals.mColor);
          }
        }

        } else {
          System.out.println("I'm sorry, we don't recognize your input");
        }
  */
