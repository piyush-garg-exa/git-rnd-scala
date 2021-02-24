package com.oo

//var getter & setter availabe
//val getter 
//default no getter and setter

class User;
//class User1(var name:String,var age:Int);//var means we can overwrite value of variable
class User1(var name:String,var age:Int){//default/primary constructors
  def this(){//Auxiliary constructors 
    this("govind",22)
  }
  def this(name:String){//Auxiliary constructors
    this(name,32)
  }
  
  def printName(){
    println(name)
  }
};
//class User1(val name:String,val age:Int);
//class User1(name:String,age:Int);// it will give error not member variable name or age

object Demo {//this is singleton class
  def main(args: Array[String]){
    val usr=new User() 
    val usr1=new User1("ram",25) 
    usr1.name="shyam"
    usr1.age=22
    usr1.printName()
  }
}