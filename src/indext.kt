fun main() {
    println(nameList(listOf("Achol","Adit","Akon","Adhiu","Garang","Riak","Yar","Mabior","Akuong","nyanyiik")))
var all=(others(listOf(3.8,2.4,2.4)))
    println(all)
    indivijual()
    println(Car(listOf(50,240,360,180)))

}

fun nameList(names:List<String>):List<String> {
    var b = mutableListOf<String>()
    for (name in names) {
        if (names.indexOf(name) % 2 == 0) {
            b.add(name)
        }
    }
    return b
}
data class Avgtatal(var avarage:Double,var add:Double)
fun others(peopleheight:List<Double>):Avgtatal{
    var total=peopleheight.sum()
    var Avg=peopleheight.average()
    var avgSum = Avgtatal(total,Avg)
    return avgSum
}





data class People(var name:String,var age:Int,var height:Double,var weight:Double)
fun indivijual() {
    var detail = mutableListOf(
        People("Achol", 20, 5.3, 65.5),
        People("dengdit", 30, 78.9, 70.0),
        People("Adit", 18, 2.5, 69.8)

    )
    detail.addAll(
        listOf(
            People("Kiir", 33, 3.5, 63.0),
            People("Ajang", 22, 23.3, 67.8),
        )
    )
    println(detail)
}


data class Car(var regestration:String,var mileage:Int)
fun Car (mileage:List<Int>):Int{
    var totalmileage=mileage.average().toInt()
    return totalmileage
}


