object Q extends App{
    case class Point(a: Int, b: Int) {
        def x: Int = a
        def y: Int = b
    }

    def add(a:Point, b:Point):Point = Point(a.x+b.x, a.y+b.y)

    def move(a:Point, dx:Int, dy:Int):Point = Point(a.x+dx, a.y+dy)

    def distance(a:Point, b:Point) = math.sqrt(math.pow(a.x - b.x,2) + math.pow(a.y - b.y,2))

    def invert(a:Point):Point = Point(a.y, a.x) 

    val m = Point(4, 5)
    val n = Point(10, 20)

    println("A = "+m+" B = "+n)

    println("Move A by (5,6) = " + move(m, 5, 6))

    println("Invert B = " +invert(n))

    println("Distance between A and B = " +distance(m,n))
}