

object PatternMatchEx {
  //1 switch on steoried
  var no=44;
  no match {
    case 1=>"first"
    case 2=>"second"
    case 3=>"third"
    case _=>no+"th"
  }
  
  //2 - case class deconstruction
  case class Person(name:String,age:Int)
  var p=Person("ram",33)
  val pgreeting=p match{
    case Person(n,a)=>s"hi my name is $n and age is $a"
  }
  
  //trick #1 list extractor
  val noLst=List(1,2,3,4)
  val mustHave3=noLst match{
    case List(_, _, 3, somethingElse) => s"list have 3rd element 3 so 4th element is $somethingElse"
  }
  
  //trick #2
  val startwith1=noLst match{
    case 1 :: tail => s"list start with 1, tail is $tail"
  }
  
  def process(lst:List[Int])= noLst match{
    case Nil=>"list is empty"
    case head :: tail => s"List start with $head and end with $tail"
  }
  
  def main(args: Array[String]){
    
  }
}