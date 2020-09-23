
def factorial(v: Int):Int = v match {
case 0 => 1
case 1 => 1
case n => n * factorial(n-1)
}
