def potAux(x:Int, t:Int, a:Int):Int = t match {
  case 0 => 1
  case 1 => a
  case _ => potAux(x,t-1,a*x)
}

def pot(x:Int, y:Int):Int = {
   potAux(x,y,x)
}
