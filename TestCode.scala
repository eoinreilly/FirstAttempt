/**
  * Created by reillye on 06-Sep-16.
  */
object HelloWorld {

  def main (args: Array[String]): Unit =
  {

    val fname :String = scala.io.StdIn.readLine("Please enter your name: ")
    val firstNum = scala.io.StdIn.readLine("Please enter a number: ")
    val secondNum = scala.io.StdIn.readLine("Please enter a second number: ")

    val a = firstNum.toInt
    val b = secondNum.toInt

    testMethod(fname)
    val sum = calculate(a, b)

    println("The sum of the two numbers is : " + sum)


  }

  def testMethod(name :String): Unit =
  {
    println(name)
    //val count = name.count(_ == 'e' )
    val count = name.length()
    System.out.println("There are " + count + " letters in your name")
  }

  def calculate (x : Int, y : Int): Int =
  {
    x+y
  }

}
