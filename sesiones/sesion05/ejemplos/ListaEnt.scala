trait ListaEnt
case object Vacia extends ListaEnt
case class ConsEnt(elem:Int, lista:ListaEnt) extends ListaEnt

def longitudListaEnt(lst:ListaEnt):Int = lst match {
   case Vacia => 0
   case ConsEnt(e,lstp) => 1 + longitudListaEnt(lstp)
}

def sumaListaEnt(lst:ListaEnt):Int = ???
