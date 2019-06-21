/*
class Hello extends App {
  public static void main(String[] args) {
    println("Hello World")
  }
}
*/
object Hello extends App {
  /* Variables
      var / val (for final variables)

      Declare a variable with type
      var name : type = whatever;
   */

  /* Interesting Differences
      var adder : Int = (1).+(4); //Operators are methods
      println(adder);
   */

  /* String Interpolation
      println(s"The answer is $adder");

      or, to have more complex expressions
      println(s"Three times ten is ${3 * 10}");

      or use printf
   */

    /* Methods
        -Methods that return a value must have an equal sign before the body of the method
        -Methods that have either a return statement or are recursive must declare a return type

        def Multiply(x : Int, y : Int) : Int = {
          return x * y;
        }

        -When result type is inferred
        def Multiply(x : Int, y : Int) = {
          x * y
        }

        -Curly braces are optional on one line methods
        def Multiply(x : Int, y : Int) = x * y
     */

    /* Anonymous Functions
        -Function that takes a function as the parameter
        def yeet(f: (Int,Int) => Int) = {
          f(1,2)                            //takes in a function(Int, Int) and returns and Int
        }

        -Explicit Type Declaration
        val yeet1 = yeet((x: Int, y : Int) => x + y)

        -Implicit Type (because the types of the function argument have already been defined)
        val yeet2 = yeet((x,y) => x + y)

        -Magic Type
        val yeet3 = yeet( _ + _ )
     */

    /* Returning Multiple Variables
      def swap( a : String, b : String) = ( b , a )
      val (c,d) = swap("World","Hello")               //> Hello World
     */

    /* While Loops
      var i,total = 0
      while ( i < 10 ) {
        total += i          //no support for ++ or -- operators
      }

      println(total)
     */

    /* For Loops
      var sum = 0
      for ( i <- 0 until 10 ) {
        sum += i
      }

      println(sum)

      //Doing it the functional way  ->  Look more into this (interesting)

      ( 0 until 10 ).sum
     */

    /* if statements
      Same as other languages
     */

    /* Switch / "Match" Statements
      selection match {
        case "One" => println("You selected option one!")
        case "Two" => println("You selected option two!")
        case _ => println("You selected something else: ")
      }
     */

    /* Arrays
      Array declaration
        var intArr = Array(2,4,6)

      Modify Items
        intArr(1) = 5 //> Array(2,5,6)

      Prepend, Append
        var prependedArr = 4 +: intArr  //> Array(4,2,5,6)
        var appendedArr = intArr +: 4   //> Array(2,5,6,4)

      Concat
        use ++ operator
        Array(1,2) ++ Array(3,4) //> Array(1,2,3,4)

      Get Index
        array.indexOf(value) //> outputs index with that value (if any)
     */

    // _._1 calls the method _1 on the wildcard parameter _, which gets the first element of a tuple.

    /*

     */


  println("Hello");
}