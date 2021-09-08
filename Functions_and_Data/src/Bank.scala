object Bank extends App{

  var bank : List[Account] = List( new Account("Michael" , 10028 , -500) , new Account("Praneeth" , 10035 , 3000) )

  val find = ( n:Int , b:List[Account]) => b.filter( x => x.accountNo.equals( n ))

  val overdraft = ( b:List[Account] ) => b.filter( x => x.balance < 0)

  val sum = ( b:List[Account] ) => b.map( x => (x,x.balance) ).reduce( (a , c) => ( c._1 , a._2 + c._2) )

  val interest = ( b:List[Account] ) => b.map( x => {
    x.balance match {
      case a if a >= 0 => x deposit (x.balance * 0.05)
      case _ => x withdraw Math.abs(x.balance) * 0.1

    }
    x
  })


  println("bank " + bank )
  println()
//  println("find " + find( 10035 , bank) )
//  println()
  println("overdraft " + overdraft( bank ) )
  println()
  println("sum " + sum( bank )._2 )
  println()

  bank = interest( bank )

  println("bank " + bank )
  println()
  println("sum " + sum( bank )._2 )
  println()

}
