var grade = ""
var percent: Int = 0
percent =90
if (percent >=90){
  grade="A"
  println(grade)
}else if (percent >=80 && percent <90){
  grade = "B"
  println(grade)
}else if (percent >=70 && percent <80){
  grade = "C"
  println(grade)
}else if (percent>= 60 && percent <70){
  grade = "D"
  println(grade)
}else if (percent>= 50 && percent <60) {
  grade = "E"
  println(grade)
}else if(percent <=49) {
  grade = "F"
  println(grade)
}
