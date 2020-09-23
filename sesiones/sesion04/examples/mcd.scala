
def mcd(a:Int, b:Int):Int = b match {
case 0 => a
case _ => mcd(b, a % b)
}
