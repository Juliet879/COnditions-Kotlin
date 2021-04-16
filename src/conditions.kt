import java.util.*
import kotlin.collections.ArrayList

fun main() {
//    odd()
   nameLength("Juliet","Sindet","Diana","Faith")

//    println(waiterRobot(24))
  //  checkNumbers()
//    var names = arrayOf("Juliet","Pamera","Diana","Sindet")
//    checkNumbers()
//    println(waiterRobot(24))
}
fun odd() {
    for(num in 1..100){
        if (num%2 != 0){
            println(num)
        }
    }
}

fun nameLength(name1:String,name2:String,name3:String,name4:String) {
    var names = arrayOf(name1,name2,name3,name4)
        for (name in names.size)
}

fun waiterRobot(age:Int):String{
    if (age < 6){
        return "Milk"
    }
    else if (age < 15){
        return "Fanta Orange"
    }
    else{
        return "Coca Cola"
    }
}
fun checkNumbers(){
    for (number in 1..100){
        if (number%3 == 0){
            println("Fizz")
        }
        else if(number%5 == 0){
            println("Buzz")
        }
        else if (number%3==0 && number%5==0){
            println("FizzBuzz")
        }
        else{}
    }
}


