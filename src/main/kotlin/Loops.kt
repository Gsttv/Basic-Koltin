//fun main(){
//    val cakes = listOf("carrot", "cheese", "chocolate")
//
//    for (cake in cakes) {
//        println("Yummy, it's a $cake cake!")
//    }
//}
//
//fun eatACake() = println("Eat a Cake")
//fun bakeACake() = println("Bake a Cake")
//
//fun main() {
//    var cakesEaten = 0
//    var cakesBaked = 0
//
//    while (cakesEaten < 5) {                    // 1
//        eatACake()
//        cakesEaten ++
//    }
//
//    do {                                        // 2
//        bakeACake()
//        cakesBaked++
//    } while (cakesBaked < 5)
//
//}

//class Animal(val name: String)
//
//class Zoo(val animals: List<Animal>) {
//
//    operator fun iterator(): Iterator<Animal> {             // 1
//        return animals.iterator()                           // 2
//    }
//}
//
//fun main() {
//
//    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
//
//    for (animal in zoo) {                                   // 3
//        println("Watch out, it's a ${animal.name}")
//    }
//
//}
//fun main() {
//    for (i in 0..3) {             // 1
//        print(i)
//    }
//    print(" ")
//
//    for (i in 0 until 3) {        // 2
//        print(i)
//    }
//    print(" ")
//
//    for (i in 2..8 step 2) {      // 3
//        print(i)
//    }
//    print(" ")
//
//    for (i in 3 downTo 0) {      // 4
//        print(i)
//    }
//    print(" ")
//
//    for (c in 'a'..'d') {        // 1
//        print(c)
//    }
//    print(" ")
//
//    for (c in 'z' downTo 's' step 2) { // 2
//        print(c)
//    }
//    print(" ")
//}

fun main(){
    val autores = listOf('1','2');
    val autoes2 = listOf('2','1');
    println(autores.equals(autoes2))
    println(autoes2 === autores)
}