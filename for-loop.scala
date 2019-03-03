object ScalaTutorial {
  def main(args: Array[String]){
    for (num <- 1 to 10) {
      println(num);
    }

    val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    for (index <- 0 until randLetters.length) {
      println(randLetters(index));

    }
  }
}
