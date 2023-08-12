import scala.io.StdIn
object first_question {

     def main(args: Array[String]) : Unit = {
       val DepositAmount = StdIn.readLine("Enter the depositAmount : ").toDouble
       val AnnualInterest = Interest(DepositAmount)
       println("The deposit amount : " + DepositAmount)
       println("The annual interest : " + AnnualInterest)

       }

  def Interest(DepositAmount: Double): Double = {

    def calculateInterest: Double => Double = {
      case deposit if deposit <= 20000 => deposit * 0.02
      case deposit if deposit <= 200000 => deposit * 0.04
      case deposit if deposit <= 2000000 => deposit * 0.035
      case deposit => deposit * 0.065
    }

    calculateInterest(DepositAmount)
  }

}
