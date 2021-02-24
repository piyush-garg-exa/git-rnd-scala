

object StringEx {
  val no1=10
  val no2=14.5
  
  val str1:String="Hello World"
  var str2:String=" may"
  def main(args: Array[String]){
    println(str1.length())
    println(str1.concat(str2))
    println(str1+str2)
    
    val result=printf("(%d -- %f -- %s)",no1,no2,str1)
    println(result)
    printf("(%d -- %f -- %s)",no1,no2,str1)
    println()
    println("(%d -- %f -- %s)".format(no1,no2,str1))  
    
    println("hello".map(_.toUpper))
    
  }
}