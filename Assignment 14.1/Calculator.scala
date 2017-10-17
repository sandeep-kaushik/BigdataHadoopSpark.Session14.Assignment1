class Calculator () {
   
  //Methods for whole numbers
  def add(x:Int, y:Int): Int = {    //returns the sum  of whole numbers 
    x+y
  }

  def sub(x:Int, y:Int): Int = {    //subtract the whole numbers 
    x-y
  }

  def prod(x:Int, y:Int): Int = {   // multiply the whole numbers
    x*y
  }

  def div(x:Int, y:Int): Int = {    //divide the whole numbers
    x/y
  }

//Methods for rational numbers
  
  
  // addition of rational number
  def add(x:(Int, Int), y:(Int, Int)): (Int, Int) = {
    simplify( (x._1*y._2)+(y._1*x._2) , x._2*y._2)
  }
  // subtraction of rational numbers 
  def sub(x:(Int, Int), y:(Int, Int)):  (Int, Int) = {
    simplify( (x._1*y._2)-(y._1*x._2) , x._2*y._2)
  }
  //Multiply the rational numbers
  def prod(x:(Int, Int), y:(Int, Int)):  (Int, Int) = {
    simplify(x._1*y._1 , x._2*y._2)
  }

  // divide the rational numbers  
  def div(x:(Int, Int), y:(Int, Int)):  (Int, Int) = {
    simplify(x._1 * y._2, x._2 * y._1)
  }

 // GCD of rational numbers
  def gcd(x:Int, y:Int): Int = {

    val end:Int = if (x < y) x+1 else y+1
    
    val div1 = List.range(1, end).filter(x%_==0)
    val div2 = List.range(1, end).filter(y%_==0)
    
    (for{
      n <- div2 if div1.contains(n)   //gives every number in div2 which is present in div1 as a list
    } yield n).max                   //Maximum of this list is returned
  }

  //This simplifies the results of rational number functions to their simplest form.
    
  def simplify (x:Int, y:Int): (Int, Int) = {

    val gcdValue:Int = gcd(Math.abs(x),Math.abs(y)) //Absolute values are passed in case any param is negative
    (x/gcdValue, y/gcdValue)
  }
  

}