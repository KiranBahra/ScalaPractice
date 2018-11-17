def fizzBuzz (a :Int) : String={
  if (a % 3 ==0 && a %5==0){
    return "fizzBuzz"
  }
  if (a % 5 ==0){
    return "Buzz"
  }
  if (a % 3 ==0){
    return "fizz"
  }
  return ""
}


val a = fizzBuzz(15)