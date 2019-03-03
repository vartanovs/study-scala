object ScalaTutorial {
  def main(args: Array[String]) {
    val myList = List(1, 2, 3, 4, 5);
    for (item <- myList) {
      println("List Items: " + item)
    }
  }
}
