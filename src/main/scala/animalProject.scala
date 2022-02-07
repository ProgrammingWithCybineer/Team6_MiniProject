import java.util.Scanner
import scala.collection.mutable.ArrayBuffer

object animalProject {
   def main(args: Array[String]): Unit = {
   
    var sc = new Scanner(System.in)
    var arr = ArrayBuffer()

    println("Enter animal's type: ")
    var animalType = sc.nextLine()
    println("Enter animal's name: ")
    var name = sc.nextLine()
    println("Enter animal's age: ")
    var age = sc.nextInt()
    
    var animal1 = new AnimalType(name, age, animalType)
    println(animal1.toString)




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