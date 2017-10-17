

object CalciApp {
 
  def main(args: Array[String]): Unit = {

    val calc: Calculator = new Calculator

    //Using calculator for whole number operations
    println( "56 + 36 = "+ calc.add(56,36) )

    println( "98 - 53 = "+ calc.sub(98,53) )

    println( "5 x 9 = "+ calc.prod(5,9) )

    println( "81 ÷ 9 = "+ calc.div(81,9) )

    // Using calculator for rational number operations.
    
    println( "2/4 + 1/6 = "+ calc.add((2,4),(1,6)).productIterator.toList.mkString("","/","") )

    println( "1/3 - 6/7 = "+ calc.sub((1,3),(6,7)).productIterator.toList.mkString("","/",""))

    println( "9/5 x 15/9 = "+ calc.prod((9,5),(15,9)).productIterator.toList.mkString("","/","") )

    println( "7/9 ÷ 3/2 = "+ calc.div((7,9),(3,2)).productIterator.toList.mkString("","/","") )
  }
}


