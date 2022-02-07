import java.util.Scanner
import scala.collection.mutable.ArrayBuffer

object animalProject {
   def main(args: Array[String]): Unit = {
    var num = 3
    //var sc = new Scanner(System.in)
    var arr = ArrayBuffer[String]()
    while(num != 0) {
        println("Enter animal's type: ")
        var animalType = readLine()
        println("Enter animal's name: ")
        var name = readLine()
        println("Enter animal's age: ")
        var age = readInt()
        
        var animal1 = new AnimalType(name, age, animalType)
        //println(animal1.toString)
        arr +=animal1.toString()
        num -= 1
    }

    println("\nAll animals:")
    arr.foreach {println}




   }
}










/*try {
    var usrIn = scanner.nextline()
        if (animal == Int)
            println("Please enter a animal: ")
            throw new BadUserInputException

        } catch {
            case bui: BadUserInputException => {
                println("Invalid entry!")
                bui.printStackTrace()

*/