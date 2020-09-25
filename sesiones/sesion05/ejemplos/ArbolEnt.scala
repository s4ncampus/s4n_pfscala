import scala.math._

trait ArbolEnt
case object ArbolVacio extends ArbolEnt
case class  HojaEnt(e:Int) extends ArbolEnt
case class  Bin(i:ArbolEnt,d:ArbolEnt) extends ArbolEnt

def alturaArbolEnt(a:ArbolEnt):Int = a match {
  case ArbolVacio => 0
  case HojaEnt(_) => 1
  case Bin(i,d)   => max(alturaArbolEnt(i), alturaArbolEnt(d)) + 1
}

def sumaArbolEnt(a:ArbolEnt):Int = ???
