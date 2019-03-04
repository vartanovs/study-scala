import scala.io.StdIn.{readLine}

object ScalaTutorial {
  def main(args: Array[String]) {
    val startNumber = 1;
    val endNumber = 10;
    val rnd = new scala.util.Random;
    val randNumber = startNumber + rnd.nextInt( (endNumber - startNumber) + 1 );

    var numberGuess = 0;
    do {
      print("Guess a number from " + startNumber + " to " + endNumber + " : ");
      numberGuess = readLine.toInt;
    } while (numberGuess != randNumber);

    println("You guessed the secret number!");
  }
}
