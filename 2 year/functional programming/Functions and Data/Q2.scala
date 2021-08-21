object Q2 extends App{
    
    class Account(id:String,n: Int, b: Double) {
        val nic:String=id
        val acnumber: Int = n
        var balance: Double = b

        override def toString = "["+nic+":"+acnumber +":"+ balance+"]"

        def withdraw(a:Double) = this.balance=this.balance-a
        def deposit(a:Double) = this.balance=this.balance+a
        def transfer(a:Account,b:Double)= {
            a.balance += b
            this.balance -= b
        }
    }

    var bank:List[Account]=List(
        new Account("970806501V",4601,-45.0),
        new Account("970806502V",4602,100.0),
        new Account("970806503V",4603,87.0),
        new Account("970806504V",4604,24.0)
    )

    //Q1. List of Accounts with negative balances
    val overdraft=(b:List[Account])=> b.filter((x) => x.balance < 0.0)

    //Q2. Total of all account balances
    val balance=(b:List[Account])=> b.map((z) => z.balance).reduce((x,y) => x + y)

    //Q3
    //If balance is positive deposit interest is .05 
    //If balance is negative interest is .1
    val interest=(b:List[Account])=>b.map( (x) => x.balance match{
        case 0 => new Account(x.nic, x.acnumber, x.balance)
        case y if y<0.0 => new Account(x.nic, x.acnumber, x.balance + x.balance*0.1)
        case y if y>0.0 => new Account(x.nic, x.acnumber, x.balance + x.balance*0.05)
    })

    println("overdraft:")
    println(overdraft(bank))

    println("sum:")
    println(balance(bank))

    println("after interest:")
    println(interest(bank))

}