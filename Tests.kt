
fun greetingAnimal (greeting:String, animals:Array<String>) {
    animals.forEach { animal ->
        println("$greeting $animal")

    }

}


fun main () {
    val animalsList = arrayOf("Dog", "Milly Milwaukee Millerson Jr. III of the Cats", "Duck")
    greetingAnimal("Hi", animalsList)

}