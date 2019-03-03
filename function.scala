object ScalaTutorial {
  def main(args: Array[String]) {
    def printPrimes() {
      val primeList = List(1, 2, 3, 5, 7, 11);
      for (n <- primeList) {
        if (n == 11) {
          return // simulates a break statement
        }
        if (n != 1) {
          println(n); // simulates a continue at n == 1
        }
      }
    }

    printPrimes; // invokes function
  }
}