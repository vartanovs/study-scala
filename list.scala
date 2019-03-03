object ScalaTutorial {
  def main(args: Array[String]) {
    val myList = List(1, 2, 3, 4, 5);
    for (item <- myList) {
      println("List Items: " + item)
    }

    var evenList = for { num <- 1 to 20 if (num % 2) == 0 } yield num;
    println(evenList);
  }
}
