package ChallengeScala

object Introduction {
  def main(args: Array[String]): Unit = {

    // Operators
  println(4 + 8);  // addition(+)
  println(8 - 2);   // subtraction(-)
  println(5 * 8);   // multiplication(*)
  println(3 / 2);   // division(/)
  println(math.pow(5,2)); //5 ** 4);  // exponential(**)
  println(5 % 4);   // modulus(%)
  println((8/4).floor);  // Floor division operator(//)


  // Checking data types
  println(8.getClass);                                   // Int
  println(3.14.getClass);                                 // Float
  println("Bagga".getClass);                             // String
  println(x = classOf[List[Int]].isInstance(List[Int](4, 5, 6))); // List

}
}