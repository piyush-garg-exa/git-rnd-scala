//scala closure
//a closure is a function which uses one or more variable declared out side this function

object ClosureEx {
  val no=10;
  def add(x:Int)={//in pure closure we can not change the value of out side variable
    x+no;
    //no=x+no; // error in case of val reassignment to val
  }
  
  def main(args: Array[String]){
    //val vs var val can not be change the value of closure and var can be
    println(add(5));
  }
}