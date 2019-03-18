import scala.io.StdIn.{readLine}
import java.io.PrintWriter
import scala.io.Source

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

    val writer = new PrintWriter("test.txt")
    writer.write("Just some sample text\nSome more sample text");
    writer.close()

    val textFromFile = Source.fromFile("test.txt", "UTF-8")

    val lineIterator = textFromFile.getLines

    for(line <- lineIterator) {
      println(line);
    }

    textFromFile.close()

  }
}
