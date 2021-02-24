
//scala- Options (some or none)
//https://www.youtube.com/watch?v=EqnXU4_fQmo&list=PLS1QulWo1RIagob5D6kMIAvu7DQC5VTh3&index=26&ab_channel=ProgrammingKnowledge
object OptionsEx {

  val myLst: List[Int] = List(1, 2, 3, 4, 5)
  val myMap: Map[Int, String] = Map(1 -> "ram", 2 -> "shyam", 3 -> "govind")

  val opt: Option[Int]=None
  def main(args: Array[String]) {
   println(myLst.find(_ > 6)) // find anything > 6 return options- None
   println(myLst.find(_ > 2)) // find anything > 6 return options- Some(3)
   println(myLst.find(_ > 2).get) // find anything > 6 return options- Some(3)
    
   println(myMap.get(1))
   println(myMap.get(1).get)
   println(myMap.get(5).getOrElse("No_name_found"))//no error if key dose not exist
   
   println(opt.isEmpty)
  }
}