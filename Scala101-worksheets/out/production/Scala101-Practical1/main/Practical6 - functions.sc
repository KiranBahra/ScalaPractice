class Number(num:Int){
  def add (otherNum:Int): Int = {
    num + otherNum
  }
}
val x = new Number(6)
val y = x.add(4)
val z= x.add(5)
// x value contains the intialised class with a default value of num= 6


  def priceIncludingVAT(price: BigDecimal): BigDecimal = {
    val vatRate = BigDecimal(1.2)
    price * vatRate
  }

def PriceIncludingVAT(price: BigDecimal): BigDecimal =
  price * BigDecimal(1.2)


val computeExcVAT = BigDecimal(1000)
val computeIncVAT = priceIncludingVAT(computeExcVAT)

/**
  * Let’s create a method called getBigVal that takes in two Integers called input1 and input2 and returns a String.
  * The method should return the value “first” if input1 is greater (>) than intput2.
  * The method should return the value “second” if input1 is smaller (<) than input2.
  * The method should return the value “same” if input1 is equal to (==) than input2.
  */


def getBigVal( a:Int , b:Int ): String ={
  if (a>b){
    return "First"

  }else if (a<b) {
    return "second"
  }else if ( a ==b ){
    return "Same"
  }else{
    return ""
  }
}



val a = getBigVal(2,3)
println(a)

/*nameLength that takes in two Strings called firstName and surname and returns an Integer.
The result of the method should return the length/size of the name which is greater than the other.
If both names are the same length return 0

 */

def nameLength (firstName: String, surname: String): Int ={
val a: Int = firstName.size
  val b = surname.length
  if (a == b){
    println("First and surname are the same length" )
    return 0
  }else if (a>b){
    println("String length of a is " + a )
return a
  }else{
    println("String length of a is " + b )
    return b
  }

}

val c = nameLength("Kiran", "Bahra")

val d = nameLength("Arnold", "Swartzeneggar")
val e= nameLength("Bruce", "Lee")
val f= nameLength("Ethan", "Hawke")

