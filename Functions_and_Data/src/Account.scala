class Account ( x:String , y:Int , z:Double){

  val Name : String = x
  val accountNo : Int = y
  var balance : Double = z

  def withdraw( amount:Double ) = this.balance -= amount

  def deposit ( amount:Double ) = this.balance += amount

  def transfer( amount:Double , that:Account ): Unit = {
    this.balance =  this.balance - amount
    that.balance = that.balance + amount
  }


  @Override
  override def toString() : String = "Name : " + this.Name + "\n Account Number : " + this.accountNo + "\n Balance : " + this.balance + "\n\n"

}
