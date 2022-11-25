package ChallengeScala

object VariablesBuiltinfunctions {

  def main(args: Array[String]): Unit = {

    // Variable in python
    var first_name: String = "Manpreet"
    var last_name: String = "Bagga"
    var country: String = "Denmark"
    var city: String = "Copenhagen"
    var age: Int = 25
    val is_married: Boolean = false
    val skill_set = List("Scala", "Python", "SQL")

    //Declaring variables
    println(first_name.getClass)
    println(is_married.getClass)
    println(age.getClass)
    println(first_name.length)


    //Declare 5 as num_one and 4 as num_two
    val num_one: Int = 5
    val num_two: Int = 4

    val total = num_one + num_two
    val diff = num_one - num_two
    val product = num_one * num_two
    val division = num_one / num_two
    val remainder = num_two % num_one
    val exp = math.pow(num_one, num_two)
    val floor_division = (num_one / num_two).floor

    //The radius of a circle is 30 meters.
    var rad: Int = 30
    val pi = 3.142
    var area_of_circle = pi * rad * rad
    println(f"Area of the circle of radius $rad%d is $area_of_circle%2.2f")
    var circumference_of_circle = 2 * pi * rad
    println(f"Circumference of the circle of radius $rad%d is $circumference_of_circle%2.2f")
    var radius = (scala.io.StdIn.readLine("Enter the radius of the circle ")).toInt
    area_of_circle = pi * radius * radius
    println(f"Area of the circle of radius $radius%d is $area_of_circle%2.2f")

    //Use the built -in input function to get first name , last name  , country and age from a user and store the value to their corresponding variable names
    first_name = scala.io.StdIn.readLine("Enter your first name: ")
    last_name = scala.io.StdIn.readLine("Enter your last name: ")
    country = scala.io.StdIn.readLine("Enter your country: ")
    age = (scala.io.StdIn.readLine("Enter your age: ").toInt)

  }
}