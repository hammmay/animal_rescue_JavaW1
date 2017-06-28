import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
 public static void main(String[] args) {
   Console myConsole = System.console();

Animals charlie = new Animals("Charlie The Cat", "Cat", 3, "Black");
Animals wiggles = new Animals("Wiggles The Dog", "Dog", 5, "White");
Animals tutu = new Animals("Tutu The Bird", "Bird", 18, "Green");

/*Note: Below is the old array that could not be altered, ArrayList was added below to replace it
Animals[] allAnimals = {charlie, wiggles, tutu};
*/

List<Animals> allAnimals = new ArrayList<Animals>();
allAnimals.add(charlie);
allAnimals.add(wiggles);
allAnimals.add(tutu);

boolean programRunning = true;

while(programRunning){
  System.out.println("Welcome to New Friends animal shelter. What would you like to do? Enter one of the following options: See All Animals, See Available Animals, Search By Trait, Create Animal Profile, or Exit");
  String navigationChoice = myConsole.readLine();

//Why doesn't this keep listing all the animals?
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
            if (individualAnimals.mAdopted.equals(false)) {
              System.out.println("----------------------");
              System.out.println(individualAnimals.mName);
              System.out.println(individualAnimals.mSpecies);
              System.out.println(individualAnimals.mAge);
              System.out.println(individualAnimals.mColor);
              }
          }
        } else if (navigationChoice.equals("Search By Trait")) {
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
              String userName = myConsole.readLine();
              System.out.println("Cute name! Is it a Cat, a Dog, or a Bird?");
              String userSpecies = myConsole.readLine();
              System.out.println("We've adopted out some of those before. How many years old is the animal?");
              int userAge = Integer.parseInt(myConsole.readLine());
              System.out.println("We have young and old animals here. Lastly, what color is the animal?");
              String userColor = myConsole.readLine();
              Animals userAnimals = new Animals(userName, userSpecies, userAge, userColor);
              allAnimals.add(userAnimals);
              System.out.println("Here's our newest shelter buddy:");
              System.out.println("----------------------");
              System.out.println(userAnimals.mName);
              System.out.println(userAnimals.mSpecies);
              System.out.println(userAnimals.mAge);
              System.out.println(userAnimals.mColor);
            } else if (navigationChoice.equals("Exit")) {
              programRunning = false;
              } else {
                System.out.println("I'm sorry, we don't recognize your input");
            }
          }
        }
      }
