fun main(){
    array("rita","wendy","trishia","amaya")
    order()
    println(strings("ryan","alicia","tamara"))
    integers()

}
fun array(name1:String,name2:String,name3:String,name4:String){
      var string= arrayOf(name1,name2,name3,name4)
      println(string.contentToString())
}

fun order(){
    val cities= arrayOf("harare","mumbai","dodoma","jakarta")
    for (city in cities ){
        println(city.capitalize())}
}

fun integers(){
    var numbers= intArrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var nums=numbers[2]+numbers[5]
    println(nums)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}

    fun strings(nam1:String,nam2: String,nam3: String):String{
        var word= arrayOf(nam1, nam2, nam3)
        return word.contentToString()

    }
