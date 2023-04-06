open class Car {
    var color : String = ""
    var speed : Int = 0
    
    open fun upSpeed(value : Int){
        if(speed+value >= 200){
            speed = 200
        }else{
            speed += value;
        }
    }
     open fun DownSpeed(value : Int){
        if(speed-value <= 0){
            speed = 0
        }else{
            speed -= value;
        }
    }
}

class Automobile : Car {
    var seatNum : Int = 0
    
    constructor(){
       
    }
    fun countSeatNum() : Int {
        return seatNum
    }
    
    override fun upSpeed(value : Int){
        if(speed + value >= 300){
            speed = 300
        }else{
            speed += value
        }
    }
}

fun main(){
    
    var auto : Automobile = Automobile()
    auto.upSpeed(250)
    println("승용차의 속도는 : " + auto.speed + "km 입니다.")
  
}
