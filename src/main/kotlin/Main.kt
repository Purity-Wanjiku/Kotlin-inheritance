fun main() {
var car = Car("Lexus","s350","navy-blue",3)
    car.carry(5)
    car.identity()
    var result = car.calculateParkingFees(4)
    println(result)

    var bus = Bus("Scania","v8","grey",2)
    var result1 = bus.maxTripFare(100.0)
    println(result1)
var result2 = bus.calculateParkingFees(6)
    println(result2)


}
open class Car(var make:String,var model:String,var color:String,var capacity:Int){

    fun carry(people:Int){
        var x = (people - capacity)
        if (people <= capacity) {
            println("Carrying $people passengers")
        }else if(people > capacity){
        println("Over capacity by $x people")
        }
         }
        fun identity(){
            println("I am a $color $make $model")
        }
 open fun calculateParkingFees(hours:Int):Int{
    var calc = hours * 20
    return calc
} }
class Bus(make:String,model:String,color:String,capacity:Int):Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        var calcu = capacity * fare
        return calcu
    }

    override fun calculateParkingFees(hours: Int): Int {
        var product = capacity * hours
        return  product
    }

    }


