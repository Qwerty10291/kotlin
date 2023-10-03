package lab2.metanit4

open class OverridePerson(val name: String) {
    open val fullInfo: String
        get() = "Person $name - $age"

    open var age: Int = 1
        set(value){
            if(value > 0 && value < 110)
                field = value
        }

    open fun display(){
        println("Name: $name")
    }
}