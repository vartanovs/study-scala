import scala.collection.mutable.ArrayBuffer;

object ScalaTutorial {
  def main(args: Array[String]){
    val friends = Array("Scott", "Sage");
    friends(1) = "Ben";
    println("My friends are " + friends(0) + " and " + friends(1));

    val places = ArrayBuffer[String]();
    places.insert(0, "Tokyo");
    places += "Paris";
    places ++= Array("New York", "Chicago", "Houston", "San Fransisco", "Los Angeles");
    places.insert(1, "Seoul", "Beijing", "Shanghai");
    places.remove(6, 2);
    print("My favorite places are ");
    for (place <- places) {
      print(place + ", ");
    };
    print("\n");

    val favNums = new Array[Int](20);
    for (j <- 0 until favNums.length ) {
      favNums(j) = j + 1;
    }
    val favNumsTimes2 = for (num <- favNums) yield num * 2;
    val favNumsDiv4 = for (num <- favNums if num % 4 == 0) yield num;
    println("My favorite numbers are " + favNums(0) + ", " + favNumsTimes2(0) + ", and " + favNumsDiv4(0));

    val sortedNums = favNumsTimes2.sortWith(_>_);
    println("Here's a list of descending even nums: " + sortedNums.deep.mkString(", "));
  }
}