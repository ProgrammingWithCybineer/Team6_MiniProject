class AnimalType{
 var name= ""
 var age=0
 var type=""

 def this(name:String, age: Int, type:String){
     this()
     this.name=name
     this.age=age
     this.animalType=animalType
 }
 
  override def toString():String={
     return this.name+": " + this.age+": " +this.animalType
 }

}