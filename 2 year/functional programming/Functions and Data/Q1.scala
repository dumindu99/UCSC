object Q1 extends App{
    class Rational(x: Int, y: Int) {
        def numer = x
        def denom = y

        //Q2
        def sub(r: Rational) = new Rational(numer * r.denom - r.numer * denom,denom * r.denom)

        //Q1
        def neg() = new Rational(numer * -1, denom)

        override def toString = numer + "/" + denom
    }

    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    println("x-y-z=" + x.sub(y.sub(z)).toString())

    println("-x="+x.neg())
}