def multAux(x:Int, t:Int, a:Int):Int = t match {
  case 1 => a
  case _ => multAux(x,t-1,a+x)
}

def mult(x:Int, y:Int):Int = { 
  
     multAux(x,y,x)
}
