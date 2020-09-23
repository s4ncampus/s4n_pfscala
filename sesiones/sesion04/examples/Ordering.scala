trait Ordering
case object GT extends Ordering
case object LT extends Ordering
case object EQ extends Ordering

def ordering(v1: Int, v2: Int):Ordering = (v1,v2) match {
case (v1,v2) if (v1 > v2) => GT
case (v1,v2) if (v1 < v2) => LT
case _                    => EQ
}
