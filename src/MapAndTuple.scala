

object MapAndTuple {
  val studs:Map[Int,String]=Map(801->"ram",802->"shyam",803->"govind") 
  val studs2:Map[Int,String]=Map(801->"ram g",804->"shyam g",805->"govind g") 
  
  val myTuple=(1,2,"Ram",true)//immutable
  val myTuple1=new Tuple3(1,"Ram",true)//valid declaration, in map key val paire is tuple
  val myTuple2=new Tuple2(1,"Ram")//valid declaration 2 denote no. of element, 22 element can store in tuple not more than 
  val myTuple3=new Tuple3(1,"ram",("a",2))
  def main(args: Array[String]){
    println(studs)
    println(studs(803))
    println(studs.keys)
    println(studs.values)
    println(studs.isEmpty)
    
    println(studs.contains(801))
    println(studs ++ studs2)
    
    //===========tuple
    println(myTuple)
    println(myTuple._1)
    println(myTuple._2)
    println(myTuple._3)
    println(myTuple._4)
    
    myTuple.productIterator.foreach{
      i=>println(i)
    }
    
    println(1->"ram"->true)// its create first two value and
    println(myTuple3._3._1)
    
    println(studs.map(x=>"hi"+x))
    println(studs.mapValues(x=>"hi"+x))
    
  }
}