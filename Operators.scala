package  ChallengeScala

object Operators {

  def main(args: Array[String]): Unit = {

    val age: Int = 25
    var height: Double = 1.90


    //triangle calculations
    val base = scala.io.StdIn.readLine("Enter base: ").toInt
    val height1 = scala.io.StdIn.readLine("Enter height: ").toInt
    val area_triangle = 0.5 * base * height1
    println("The area of the triangle is: " + (area_triangle))


    val side_a = scala.io.StdIn.readLine("Enter side a:").toInt
    val side_b = scala.io.StdIn.readLine("Enter side b:").toInt
    val side_c = scala.io.StdIn.readLine("Enter side c:").toInt
    val perimeter_triangle = side_a + side_b + side_c
    println("The perimeter of the triangle is " + (perimeter_triangle))

    //Rectangle calculations
    val length = scala.io.StdIn.readLine("Enter the length:").toInt
    val width = scala.io.StdIn.readLine("Enter width:").toInt
    val area_rectangle = length * width
    val perimeter_rectangle = 2 * (length + width)
    println("The perimeter of the rectangle is " + (perimeter_rectangle))
    println("The area of the rectangle is " + (area_rectangle))

    //Circle calculation
    val radius = scala.io.StdIn.readLine("Enter the radius of the circle:").toInt
    val pi = 3.142
    val area_circle = pi * radius * radius
    println("The area of the circle is " + (area_circle))

    //Equation of a line
    val x_zero = 0;
    var y_intercept = 2 * x_zero - 2;

    val y_zero = 0;
    var x_intercept = (y_zero + 2) / 2

    val slope = (x_zero - y_intercept) / (x_intercept - y_zero)
    print("The slope is ", slope)
    print("The x-intercept is ", x_intercept)
    print("The y-intercept is ", y_intercept)

    val y2 = 2
    val y1 = 2
    val x2 = 6
    val x1 = 10
    val m2 = (y2 - y1) / (x2 - x1)
    val d = math.sqrt((math.pow((x2 - x1), 2)) + (math.pow((x2 - x1), 2)))

    println("The slope is " + m2)
    println("The euclidean distance is " + d)

    if (slope > m2) {
      println("slope in task 8 is greater than slope in task 9")
    }
    else {
      println("slope in task 8 is less than slope in task 9");
    }


    var proceed: Boolean = true
    while (proceed) {
      val x = scala.io.StdIn.readLine("Enter the value of x").toInt
      val y = math.pow(x, 2) + (6 * x) + 9
      if (y == 0) {
        println("y is zero when x is ", x)
        proceed = false
      }
      println("The value of y: " + y)
    }

    //python and dragon
    var python = "python"
    var dragon = "dragon"
    println(python.length > dragon.length)

    var word_len = python.length
    var f_word_len = word_len.toFloat
    var s_word_len = f_word_len.toString

    // modulus
    val rem = 8 % 2

    //floor division
    val f_div = (7 / 3).floor
    val num = 2.7
    println((num.toInt) == f_div)

    //comparisons
    println(("10").getClass == (10).getClass)

    val z = (9.8).toInt
    println((z) == 10)

    //Prompt scripts
    val hours = scala.io.StdIn.readLine("Enter hours: ").toInt
    val rate = scala.io.StdIn.readLine("Enter rate per hours: ").toInt

    println("Your weekly earning is: " + (hours * rate))

    val years = scala.io.StdIn.readLine("Enter number of years you have lived: ").toInt
    println("You have : " + (years * 365 * 24 * 60 * 60))

    //Form a table
    println(1, 1, 1, 1, 1)
    println(2, 1, 2, 4, 8)
    println(3, 1, 3, 9, 27)
    println(4, 1, 4, 16, 64)
    println(5, 1, 5, 25, 125)
  }
}