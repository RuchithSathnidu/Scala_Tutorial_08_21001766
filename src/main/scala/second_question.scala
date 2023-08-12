object second_question {

  def main(args: Array[String]): Unit = {
    for (arg <- args) {
      println(arg.toInt + " = " + PatternMatching(arg.toInt))
    }
  }

  def PatternMatching(number: Int): String =  {

    def patternMatchingFunction: Int => String = {
      case number if number < 0 => "Negative Number"
      case number if number == 0 => "Zero"
      case number if number % 2 == 0 => "Even Number"
      case _ => "Odd Number"
    }

    patternMatchingFunction(number)

  }
}
