package lab2.metanit4

class ModifiedPerson(val name: String) {
    private var age = 1
    var ageValue: Int
        set(value){
            if((value > 0) and (value < 110))
                age = value
        }
        get() = age
}