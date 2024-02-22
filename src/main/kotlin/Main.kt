//fun main() {
////    addTwoNumbers(87, 89)
////    addTwoNumbers(45, 78)
////    addTwoNumbers(54, 76)
//    printMyname()
//
//}
//
//fun printMyname( name: string){
//    println("Nakato")
//
//}
//
//fun modulus(){
//    var num1 =80
//    var num2 =38
//    var modulus = num1 % num2
//    println(modulus)
//}
//fun countChar(){
//    var word ="avacado"
//    var wordlen = word.length
//    println(wordlen)
//}
////fun addTwoNumbers(num1: Int, num2: Int){
////    var sum = num1+num2
////    println(sum)
//}


//THIRD LECTURE OF KOTLIN: RETURN

fun main() {
// addTwoNumbers(90, 80)
//    modulus(56,4)
//    countchar("banana")
//    countchar("nakatoZainaMusana")
//    areaOfCircle(6, 7)
    var result = addTwoNumbers(7,8)
    println(result)
}
fun addTwoNumbers(num1: Int, num2: Int){
    var sum = num1+num2
    println(sum)

}
fun modulus( num1: Int, num2: Int){
    var modulus = num1 % num2
    println(modulus)
}
fun countchar( word:String){
    println(word.length)
}
fun areaOfCircle(diameter: Float){
    var result = 3.142 * (diameter * diameter)
    println(result)

//}the return practice
        fun subtract(num2: Int,num1: Int): Int{
            var subtract = num2-num1
            println(subtract)
            return subtract
        }
     fun avgWeight(weights: Array<Double>):Double{
         var sum = avgWeight(weights)
         var avg =sum/31
         return avg


     }
     fun squaresum(num2: Int, num1: Int): Int{
         var sum = num1+num2
         var square = sum * sum
         println(square)
         return square

     }     }
