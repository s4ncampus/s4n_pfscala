
trait Direccion
case object Norte extends Direccion
case object Este  extends Direccion
case object Sur   extends Direccion
case object Oeste extends Direccion

type Jugador = (String,Direccion)

def girarIzq(jugador:Jugador):Jugador = ???
def girarDer(jugador:Jugador):Jugador = ???
