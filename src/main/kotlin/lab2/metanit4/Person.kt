package lab2.metanit4

open class Person(_name: String) {
    val name = _name
    var age: Int = 0
    var company: String = "Undefined"

    constructor(_name: String, _age: Int) : this(_name) {
        age = _age
    }

    constructor(_name: String, _age: Int, _comp: String) : this(_name, _age) {
        company = _comp
    }

    open fun sayHello(){
        println("Hi, my name is $name")
    }
}