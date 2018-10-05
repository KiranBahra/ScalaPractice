var age:Int =0
var certificate = ""
age = 4
if (age >= 4 && age <8){
  certificate= "U"
  println("Certificate is "+ certificate)
}else if (age >=8 && age <12){
  certificate= "PG"
  println("Certificate is "+ certificate)
}else if (age >=12 && age <15){
  certificate= "12A"
  println("Certificate is "+ certificate)
}else if (age >=15&& age <18){
  certificate= "15"
  println("Certificate is "+ certificate)
}else if (age >=18){
  certificate= "18"
  println("Certificate is "+ certificate)
}else{
  println("too young for any film")
}



