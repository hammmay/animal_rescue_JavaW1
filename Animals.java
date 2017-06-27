class Animals {
  public String mName;
  public String mSpecies;
  public int mAge;
  public String mColor;

//constructor for the class Animals above. The constructor is called in App.java on line 27
  public Animals(String name, String species, int age, String color) {
    mName = name;
    mSpecies = species;
    mAge = age;
    mColor = color;
  }


  public boolean youngAdopt(int maxAge){
    return (mAge <= maxAge);
  }
  public boolean rightSpecies(String specificSpecies){
    return (mSpecies.equals(specificSpecies));
  }
}
