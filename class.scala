object ScalaTutorial {
  def main(args: Array[String]){
    val rover = new Animal;
    rover.setName("Rover");
    rover.setSound("woof!");
    printf("%s says %s\n", rover.getName, rover.getSound);

    val whiskers = new Animal("Whiskers", "meow!");
    println(s"${whiskers.getName} with id ${whiskers.id} says ${whiskers.getSound}");

    val spike = new Dog("Spike", "Woof", "Grrr!");
    spike.setName("Spikey");
    println(s"${spike.getName} with id ${spike.id} says ${spike.getSound} and ${spike.getGrowl}");

    val fang = new Wolf("Fang");
    fang.moveSpeed = 38.0;
    println(fang.move);
  }

  class Animal(var name: String, var sound: String) {
    this.setName(name)

    var id = Animal.newIdNum;

    def getName(): String = name;
    def getSound(): String = sound;

    def setName(name: String) {
      if(!(name.matches(".*\\d+.*"))) {
        this.name = name
      } else {
        this.name = "No Name";
      }
    }

    def setSound(sound: String) {
      this.sound = sound;
    }

    def this(name: String) {
      this("No Name", "No Sound");
      this.setName(name);
    }

    def this() {
      this("No Name", "No Sound");
    }
  }

  object Animal {
    private var idNumber = 0;
    private def newIdNum = {idNumber += 1; idNumber};
  }

  class Dog(name: String, sound: String, growl: String) extends Animal(name, sound) {
    def getGrowl(): String = growl;

    def this(name: String, sound: String) {
      this("No Name", sound, "No Growl");
      this.setName(name);
    }

    def this(name: String) {
      this("No Name", "No Sound", "No Growl");
      this.setName(name);
    }

    def this() {
      this("No Name", "No Sound", "No Growl");
    }

  }

  abstract class Mammal(val name: String) {
    var moveSpeed: Double;
    def move: String
  }

  class Wolf(name: String) extends Mammal(name) {
    var moveSpeed = 35.0;
    def move = "The wolf %s runs %.2f mph.".format(this.name, this.moveSpeed);
  }

}