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

    printPrimes(); // invokes function

    def getSumPrompt() : Unit = {
      println("Now for a math problem:");
    }

    getSumPrompt; // invokes procedure

    def getSum(num1: Int = 1, num2: Int = 1): Int = {
      return num1 + num2;
    }

    println("5 + 4 = " + getSum(5, 4));

    def sumTotal(nums: Int*): Int = {
      var sum: Int = 0;
      for (num <- nums) {
        sum += num;
      }
      return sum;
    }

    println("Sum total of 1 thru 6: " + sumTotal(1, 2, 3, 4, 5, 6));

    def factorial(num: BigInt): BigInt = {
      if (num <= 1) return num;
      return num * factorial(num - 1);
    }

    println("12 factorial is: " + factorial(12))
  }
}