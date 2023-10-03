package lab2.metanit4

class OverrideEmployee(name: String, val company: String) : OverridePerson(name) {
    override val fullInfo: String
        get() = "Employee $name - $age"

    override var age: Int = 18
        set(value) {
            if (value > 17 && value < 110)
                field = value
        }

    override fun display() {
        println("Name: $name  |  Company: $company")
    }
}