package  lab2.metanit4

class Employee(opnName: String, val company: String): OpenPerson(opnName){
    fun printCompany(){
        println(company)
    }
}
