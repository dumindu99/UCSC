object Q1 extends App{

    def GCD(a:Int,b:Int):Int=b match{
        case 0 => a
        case x if x>a => GCD(x,a)
        case _ => GCD(b,a%b)
    }

    //Q1
    def prime(p:Int,n:Int=2):Boolean= n match {
        case x if(x==p) => true
        case x if GCD(p,x)>1 => false
        case x => prime(p,x+1)
    }

    //Q2
    def primeSeq(n:Int):Unit= n match{
        case x if x<2 =>{println()}
        case x if prime(x) =>{
            println(x)
            primeSeq(x-1)
        } 
        case _ => primeSeq(n-1)
    }

    //Q3
    def sum(n:Int):Int= n match{
        case x if x<1 => 0
        case _ => n+sum(n-1)
    }

    //Q4
    def isEven(n:Int):Boolean= n match{
        case 0 => true
        case _ => isOdd(n-1)
    }
    def isOdd(n:Int):Boolean = !(isEven(n))

    //Q5
    def sumEven(n:Int):Int= n match{
        case x if x<2 => 0
        case x if isEven(x)=> n + sumEven(n - 2)
        case _ => sumEven(n-1)
    }

    def fibonacci(n:Int):Int= n match{
        case 0 => 0
        case x if x==1 => 1
        case _ => fibonacci(n-1)+fibonacci(n-2)
    }

    //Q6
    def fibonacciSeq(n:Int):Unit= {
        if (n > 0){
            fibonacciSeq(n-1)
            println(fibonacci(n))
        }
    }

    //examples
    println("Q1")
    println("prime(13):")
    println(prime(13))
    println()

    println("Q2")
    println("primeSeq(13):")
    primeSeq(13)
    println()

    //Q3
    println("Q3")
    println("sum(10):")
    println(sum(10))
    println()

    //Q4
    println("Q4")
    println("isEven(10):")
    println(isEven(10))
    println()

    //Q5
    println("Q5")
    println("sumEven(10):")
    println(sumEven(10))
    println()

    //Q6
    println("Q6")
    println("fibonacciSeq(10):")
    fibonacciSeq(10)
    println()
}