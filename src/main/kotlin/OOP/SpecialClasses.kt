package OOP

// DATA CLASS

//data class User(val name: String, val id: Int) {           // 1
//    override fun equals(other: Any?) =
//        other is User && other.id == this.id               // 2
//}
//fun main() {
//    val user = User("Alex", 1)
//    println(user)                                          // 3
//
//    val secondUser = User("Alex", 1)
//    val thirdUser = User("Max", 2)
//
//    println("user == secondUser: ${user == secondUser}")   // 4
//    println("user == thirdUser: ${user == thirdUser}")
//
//    // hashCode() function
//    println(user.hashCode())                               // 5
//    println(secondUser.hashCode())
//    println(thirdUser.hashCode())
//
//    // copy() function
//    println(user.copy())                                   // 6
//    println(user === user.copy())                          // 7
//    println(user.copy("Max"))                              // 8
//    println(user.copy(id = 3))                             // 9
//
//    println("name = ${user.component1()}")                 // 10
//    println("id = ${user.component2()}")
//}

// ENUM CLASS

//enum class State {
//    IDLE, RUNNING, FINISHED                           // 1
//}
//
//fun main() {
//    val state = State.RUNNING                         // 2
//    val message = when (state) {                      // 3
//        State.IDLE -> "It's idle"
//        State.RUNNING -> "It's running"
//        State.FINISHED -> "It's finished"
//    }
//    println(message)
//}

//enum class Color(val rgb: Int) {                      // 1
//    RED(0xFF0000),                                    // 2
//    GREEN(0x00FF00),
//    BLUE(0x0000FF),
//    YELLOW(0xFFFF00);
//
//    fun containsRed() = (this.rgb and 0xFF0000 != 0)  // 3
//}
//
//fun main() {
//    val red = Color.RED
//    println(red)                                      // 4
//    println(red.containsRed())                        // 5
//    println(Color.BLUE.containsRed())                 // 6
//    println(Color.YELLOW.containsRed())               // 7
//}

// SEALED CLASS

//sealed class Mammal(val name: String)                                                   // 1
//
//class Cat(val catName: String) : Mammal(catName)                                        // 2
//class Human(val humanName: String, val job: String) : Mammal(humanName)
//
//fun greetMammal(mammal: Mammal): String {
//    when (mammal) {                                                                     // 3
//        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"    // 4
//        is Cat -> return "Hello ${mammal.name}"                                         // 5
//    }                                                                                   // 6
//}
//
//fun main() {
//    println(greetMammal(Cat("Snowy")))
//}

// OBJECT KEYWORD
//
//fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {  //1
//
//    val dayRates = object {                                                     //2
//        var standard: Int = 30 * standardDays
//        var festivity: Int = 50 * festivityDays
//        var special: Int = 100 * specialDays
//    }
//
//    val total = dayRates.standard + dayRates.festivity + dayRates.special       //3
//
//    print("Total price: $$total")                                               //4
//
//}
//
//fun main() {
//    rentPrice(10, 2, 1)                                                         //5
//}
//
//
//object DoAuth {                                                 //1
//    fun takeParams(username: String, password: String) {        //2
//        println("input Auth parameters = $username:$password")
//    }
//}
//
//fun main(){
//    DoAuth.takeParams("foo", "qwerty")                          //3
//}
//
//
//class BigBen {                                  //1
//    companion object Bonger {                   //2
//        fun getBongs(nTimes: Int) {             //3
//            for (i in 1 .. nTimes) {
//                print("BONG ")
//            }
//        }
//    }
//}
//
//fun main() {
//    BigBen.getBongs(12)                         //4
//}