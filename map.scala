object ScalaTutorial {
  def main(args: Array[String]){
    val employees = Map("Manager" -> "Bob Smith", "Accountant" -> "Sue Brown"); // Immutable
    println("The manager is " + employees("Manager"));

    val customers = collection.mutable.Map(1 -> "Paul Walker", 2 -> "Sally Smith");
    printf("The first customer is %s\n", customers(1));
    customers(1) = "Johnny Walker"; // Cannot reassign if immutable
    customers(3) = "Meghan Black"; // Cannot add if immutable

    for((key, value) <- customers) {
      printf("Customer %d: %s\n", key, value);
    }
  }
}