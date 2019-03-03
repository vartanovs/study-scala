object ScalaTutorial {
  def main(args: Array[String]){

    var i = 0;
    for (i <- 1 to 10) {
      println(i);
    }

    val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    for (i <- 0 until randLetters.length) {
      println(randLetters(i));
      
    }
  }
}