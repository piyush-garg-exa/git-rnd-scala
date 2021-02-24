import Array._

object ArrayEx {
  var myArray:Array[Int]=new Array[Int](4) //4 is size of array
  var myArray1=Array(1,2,3,4,5,6)
  
  def main(args: Array[String]){
    myArray(0)=20
    myArray(1)=30
    myArray(2)=40
    myArray(3)=50

    for(x <-myArray){
      println(x)
    }
    
    for(i<- 0 to (myArray.length-1)){
      println(myArray(i))
    }
    
    //concatenate array
    val result=concat(myArray,myArray1)
    println(result)
    for(x<-result){
      println(x)
    }
    
  }
}