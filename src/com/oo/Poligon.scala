package com.oo

class Poligon {
  def area:Double=0.0
}

object Polygon{
  def main(args:Array[String]){
    var poly=new Poligon
    printArea(poly)
    var rect=new Rectangel(55.5,8)
    printArea(rect)
  }
  
  def printArea(p:Poligon){
    println(p.area)
  }
}