fun main() {
    odd()
    println(nameLength("Juliet","Sindet","Dian","Faith","Pamera","Celine"))
    println(waiterRobot(6))
    checkNumbers()

}
fun odd() {
    for(num in 1..100){
        if (num%2 != 0){
            println(num)
        }
    }
}

fun nameLength(name1:String,name2:String,name3:String,name4:String,name5:String,name6:String): Int {
    var names = arrayOf(name1,name2,name3,name4,name5,name6)
    var checkNames = 0
    for (name in names){
        if (name.length > 5){
            checkNames++
        }
    }; return checkNames

}

fun waiterRobot(age:Int):String{
    if (age <= 6){
        return "Milk"
    }
    else if (age <= 15){
        return "Fanta Orange"
    }
    else{
        return "Coca Cola"
    }
}
fun checkNumbers(){
    for (number in 1..100){
        if (number%3==0 && number%5==0){
            println("FizzBuzz")
        }
        else if (number%3 == 0){
            println("Fizz")
        }
        else if(number%5 == 0){
            println("Buzz")
        }
        else {}
    }
}


