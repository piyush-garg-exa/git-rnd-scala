

class Strict{
  val s={
    println("strict")
    9
  }
}

class Lazy{
  lazy val l={
    println("lazy");
    8
  }
}


object LazyEvaluationEx {
  def method1(n:Int){
    println("method1")
    println(n)
  }
  def method2(n: =>Int){//call by value
    println("method2")
    println(n)
  }
  
  
  def main(args:Array[String]){
    val s=new Strict
    val l=new Lazy //its not call because its lazy
    println("____")
    println(s.s)
    println(l.l)
    
    val add=(a:Int,b:Int)=>{
      println("add")
      a+b
    }
    
    method1(add(4,6))
    method2(add(7,4))
  }
}