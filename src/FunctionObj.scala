import java.util.Date


object FunctionObj {

  def main(args: Array[String]) {
    
    var addition= (x1 : Int,y1 : Int)=>x1 + y1; //Anonymous Functions
    println(addition(5,6));

    println(add(3, 7));
    println(sub(3, 7));
    println(multiply(3, 7));
    println(div(3, 7));

    println(Math.add(3, 7));
    println(Math.square(7));
    println(Math square 7);
    println(Math sub 7);
    println(Math.print(4,6))
    Math.print(4,6)
    println(Math.+(4,7));
    var r=3 + 5;//here + is not operator in scala its function
    
    var hr=math(4,6,(x,y)=>x*y);
    println("higher defination function result is ="+hr);
    println(math(4,6,(x,y)=>x min y))
    println(mathv1(4,6,1,(x,y)=>x min y))
    println(math(4,6, _+_))// wild card add something with something
    
    //Partially Applied Functions
    var sum=(x:Int,y:Int,z:Int)=>x+y+z //fully applied
    var sumv1=sum(10,20,_:Int) //partially applied Function
    println(sumv1(5));
    var dat=new Date;
    var newlog=log(dat,_:String)
    newlog("hello");
    
    println(addc1(4)(5))//currying calling
    var sum40=addc1(40)
    println(sum40(100))
    println(addc2(20)(66))
    val sum50=addc2(50)_ //_ says other argument pass in feature
    println(sum50(100))
    
    
  }

  def add(no1: Int, no2: Int): Int = {
    return no1 + no2;
  }

  def sub(no1: Int, no2: Int): Int = {
    no1 - no2;
  }

  def multiply(no1: Int, no2: Int): Int = no1 * no2
  def div(no1: Int, no2: Int): Int = no1 / no2

  object Math {
    def +(no1: Int, no2: Int): Int = {
      return no1 + no2;
    }
    def add(no1: Int, no2: Int): Int = {
      return no1 + no2;
    }
    def sub(no1: Int, no2: Int=5): Int = {//default value
      return no1 - no2;
    }
   
    def square(no1: Int): Int = no1 * no1
    
    def print(x:Int,y:Int):Unit={//return type equivalant to void
      println(x+y)
    }
  }
  
  //higher order function: function as argument & return function
  //https://www.youtube.com/watch?v=ohKDVmCMKEg&list=PLS1QulWo1RIagob5D6kMIAvu7DQC5VTh3&index=16&ab_channel=ProgrammingKnowledge
  def math(x: Double,y: Double,f:(Double,Double)=>Double)=f(x,y)
  def mathv1(x: Double,y: Double,z: Double, f:(Double,Double)=>Double)=f(f(x,y),z)
  
  //--
  def log(date: Date, message:String)={
    println(date +" "+message)
  }
  
  
  //Function Currying in Scala
  //Currying is technique of transforming of a function 
  //that takes multiple argument a function
  //that takes single argument a function
  def addc1(x:Int)=(y:Int)=>x+y
  def addc2(x:Int)(y:Int)=x+y
  
}