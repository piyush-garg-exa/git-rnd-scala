

object LoopExampel {
  def main(args: Array[String]) {
    matchex();
  }

  def matchex(){
    var age=20 ;
    
    age match {
      case 28=> println(28);
      case 20=> println(20);
      case _=> println("default case");
    }
    
    var ltr="1";
     ltr match {
      case "1"=> println("one");
      case "2"=> println("two");
      case _=> println("no match");
    }
    
    var ltrs="1";
     var result=ltr match {
      case "1"=> 1;
      case "2"=> 2;
      case _=> -1;
    }
     
     println(result);
     
     var no=7;
     
     no match{
       case 1 | 3 | 5 | 7 | 9 => println("odd");
       case 2 | 4 | 6 | 8 | 9 => println("even");
     }
     
    
  }
  
  def forloop(){
        for(i<- 1.to(5)){//<=
      println(i);
    }
    
    for(i<- 1 until 5) {//<
      println("until "+i);
    }
    
    for(i<-1 to 6; j<-1 to 3) {//nested loop
      println(s"i=$i  j=$j");
    }

    var lst=List(1,2,3,4,5,6,7,88);
    for(i<- lst){//<=
      println(i);
    }

    for(i<- lst; if i<6){//<=
      println(i);
    }

    var result= for{i<- lst; if i<6} yield{//as expression
      i*i;
    }
    
    println("as expression " +result);

      var result1= for{
        i<- lst
        if i<6
        } yield{//as expression
      i*i;
    }
     println("as expression " +result);
 
    
  }
}