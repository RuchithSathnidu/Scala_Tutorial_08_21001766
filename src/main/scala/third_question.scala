object third_question {

  def main(args: Array[String]): Unit = {
    var names:List[String] = List("Benny", "Niroshan", "Saman", "Kumara")
    var formats:List[String] = List("all_U_C", "F_2_U_C", "all_L_C", "F&L_U_C")
    var i:Int = 0
    while(i<names.length){
      println("original : " + names(i) + " => After format : "  + formatNames(names(i),formats(i)))
      i=i+1
    }:Unit
  }

  def toUpper(input: String): String = {
    input.toUpperCase()
  }

  def toLower(input: String): String = {
    input.toLowerCase()
  }

  def formatNames(name: String, format: String): String = {

    def formatNamesFunction: String => String = {
      case x if x=="all_U_C" => toUpper(name)
      case x if x=="F_2_U_C" => toUpper(name.substring(0, 2)) + toLower(name.substring(2,name.length))
      case x if x=="all_L_C" => toLower(name)
      case x if x=="F&L_U_C" => toUpper(name.head.toString) + toLower(name.substring(1,name.length-1)) + toUpper(name.substring(name.length-1))
      case _ => "Format is not defined"
    }

    formatNamesFunction(format)
  }

}


