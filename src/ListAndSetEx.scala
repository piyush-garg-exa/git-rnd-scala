


object ListEx {
  val myLst:List[Int]=List(1,2,3,4,5)
  val names:List[String]=List("ram","shyam","govind","damodar")
  val lst1:List[String]=List("A","B","C")
  
  //val mySet:scala.collection.mutable.Set[Int]=scala.collection.mutable.Set(1,2,3,4,5)//can change value
  val mySet:Set[Int]=Set(1,2,3,4,5)
  val mySet2:Set[Int]=Set(6,9,3,4)
  val nams:Set[String]=Set("ram","shyam","govind","damodar")

  
  def main(args: Array[String]){
    //myList(0)=5 error the value update is not member of list : list is immutable its linklist
    println(0 :: myLst)  //:: cons symbol
    println(myLst)
    println(names)
    println(Nil)
    println(1:: 3:: 6:: Nil)
    println(names.head)
    println(names.tail)
    println(myLst.tail)
    println(names.isEmpty)
    println(myLst.reverse)
    println(List.fill(5)(3))
    println(myLst.max)
    
    //iterate
    myLst.foreach(println)
    
    var sum:Int=0
    myLst.foreach(sum+=_)
    println(sum)
    
    for(name <- names){
      println(name)
    }
    
    println(names(2))
    
    println(myLst.map(_ * 2))
    println(myLst.map(x=> x+ 2))
    println(myLst.map(x=> "hi"+ x))
    println(myLst.map(x=> "hi"* x))
    
    println(List(List(1,2,3,4),List(6,7,8)).flatten)
    println(myLst.map(x=>List(x,x+1)))
    println(myLst.flatMap(x=>List(x,x+1)))
    
    println(myLst.filter(x=>x%2==0))
    
    
    //reduce fold or scan (left/right)
    println(myLst.reduceLeft(_+_))
    println(lst1.reduceLeft(_+_))
    println(myLst.reduceLeft((x,y)=>{println(x+" , "+y); x+y   }))
    
    println(myLst.foldLeft(10)(_+_)) // 10 added in sum of element
    println(myLst.scanLeft(10)(_+_)) // its return intermediat result
    //======================Set 
    println(mySet)
    println(mySet+10)//in scala set is not order
    println(mySet)
    
    println(mySet(8))
    println(mySet(5))
    println(mySet.head)
    println(mySet.tail)
    println(mySet.isEmpty)
    
    println(mySet ++ mySet2)//unique element
    println(mySet.++(mySet2))//unique elelement
    
    println(mySet.&(mySet2))
    println(mySet.intersect(mySet2))
    println(mySet.min)
    println(mySet.max)
    
    mySet.foreach(println)
    for(name<-nams){
      println(name)
    }
    
  }
}