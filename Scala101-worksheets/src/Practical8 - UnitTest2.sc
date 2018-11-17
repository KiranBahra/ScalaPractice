/*
Create a function called calculateTax that takes an Int and returns 10% of the total value as an int
If the input greater than 10,000, instead return 15% of the total value
If the input is greater than 50,000, instead return 20% of the total value
If the input is greater than 100,000, instead return 40% of the total value

 */
def calculateTax (a: Int): Int={
  if(a>10000){

   // println("condition met")
   val b= a * 15/100
    println(b.toString)
    return b

  }else if (a > 50000){
   val b= a * 20/100
    println(b.toString)
    return b


  }else if (a > 100000){

    val b = a * 40 / 100
    println(b.toString)
    return b
  } else

 //   println("condition not met")
    return 0

}

val a= calculateTax(100001)

val b= calculateTax(10001)
val c= calculateTax(50001)