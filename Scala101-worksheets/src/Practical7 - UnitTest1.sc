def fizzBuzz (a :Int) : String={
  if (a % 3 ==0){
    return "fizz"
  }
  if (a % 5 ==0){
    return "Buzz"
  }
  if (a % 3 ==0 && a % 5== 0){
    return "fizzBuzz"
  }
  return ""
}


