
trait Direccion
case object Norte extends Direccion
case object Este  extends Direccion
case object Sur   extends Direccion
case object Oeste extends Direccion

type Jugador = (String,Direccion)

def girarIzq(jugador:Jugador):Jugador = jugador match {
  case (n,Norte) => (n,Oeste)
  case (n,Este)  => (n,Norte)
  case (n,Sur)   => (n,Este)
  case (n,Oeste) => (n,Sur)
}

def girarDer(jugador:Jugador):Jugador = jugador match {
  case (n,Norte) => (n,Este)
  case (n,Este)  => (n,Sur)
  case (n,Sur)   => (n,Oeste)
  case (n,Oeste) => (n,Norte)
}
