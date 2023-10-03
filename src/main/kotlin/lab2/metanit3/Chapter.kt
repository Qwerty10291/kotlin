package lab2.metanit3

class Chapter {
    fun Run() {
        showMessage("Hello Kotlin")
        showMessage("Привет Kotlin")
        showMessage("Salut Kotlin")

        displayUser("Tom", 23)
        displayUser("Alice", 19)
        displayUser("Kate", 25)

        displayUser2("Tom", 23, "Manager")
        displayUser2("Alice", 21)
        displayUser2("Kate")

        displayUser2("Tom", position="Manager", age=28)
        displayUser2(age=21, name="Alice")
        displayUser2("Kate", position="Middle Developer")

        var nums = intArrayOf(4, 5, 6)
        double(nums)
        println("Значение в функции main: ${nums[0]}")

        printStrings("Tom", "Bob", "Sam")
        printStrings("Kotlin", "JavaScript", "Java", "C#", "C++")

        sum(1, 2, 3, 4, 5)
        sum(1, 2, 3, 4, 5, 6, 7, 8, 9)

        printUserGroup(3, "Tom", "Bob", "Alice")

        printUserGroup2("KT-091", "Tom", "Bob", "Alice", count=3)

        val nums2 = intArrayOf(1, 2, 3, 4)
        changeNumbers(*nums2, koef=2)

        val a = sum2(4, 3)
        val b = sum2(5, 6)
        val c = sum2(6, 9)
        println("a=$a  b=$b  c=$c")

        checkAge(-10)
        checkAge(10)

        val a2 = square(5)
        val b2 = square(6)
        println("a=$a2  b=$b2")

        compareAge(20, 23)
        compareAge(-3, 20)
        compareAge(34, 134)
        compareAge(15, 8)

        val a6 = sum3(1, 2)
        val b6 = sum3(1.5, 2.5)
        val c6 = sum3(1, 2, 3)
        val d6 = sum3(2, 1.5)
        val e6 = sum3(1.5, 2)

        val message: () -> Unit
        message = ::hello2
        message()
    }

    fun showMessage(message: String){
        println(message)
    }

    fun displayUser(name: String, age: Int){
        println("Name: $name   Age: $age")
    }

    fun displayUser2(name: String, age: Int = 18, position: String="unemployed"){
        println("Name: $name   Age: $age  Position: $position")
    }

    fun double(numbers: IntArray){
        numbers[0] = numbers[0] * 2
        println("Значение в функции double: ${numbers[0]}")
    }

    fun printStrings(vararg strings: String){
        for(str in strings)
            println(str)
    }

    fun sum(vararg numbers: Int){
        var result=0
        for(n in numbers)
            result += n
        println("Сумма чисел равна $result")
    }

    fun printUserGroup(count:Int, vararg users: String){
        println("Count: $count")
        for(user in users)
            println(user)
    }

    fun printUserGroup2(group: String, vararg users: String, count:Int){
        println("Group: $group")
        println("Count: $count")
        for(user in users)
            println(user)
    }

    fun changeNumbers(vararg numbers: Int, koef: Int){
        for(number in numbers)
            println(number * koef)
    }

    fun sum2(x:Int, y:Int): Int{

        return x + y
    }

    fun checkAge(age: Int){
        if(age < 0 || age > 110){
            println("Invalid age")
            return
        }
        println("Age is valid")
    }

    fun square(x: Int) = x * x

    fun compareAge(age1: Int, age2: Int){

        fun ageIsValid(age: Int): Boolean{
            return age > 0 && age < 111
        }
        if( !ageIsValid(age1) || !ageIsValid(age2)) {
            println("Invalid age")
            return
        }

        when {
            age1 == age2 -> println("age1 == age2")
            age1 > age2 -> println("age1 > age2")
            age1 < age2 -> println("age1 < age2")
        }
    }

    fun sum3(a: Int, b: Int) : Int{
        return a + b
    }
    fun sum3(a: Double, b: Double) : Double{
        return a + b
    }
    fun sum3(a: Int, b: Int, c: Int) : Int{
        return a + b + c
    }
    fun sum3(a: Int, b: Double) : Double{
        return a + b
    }
    fun sum3(a: Double, b: Int) : Double{
        return a + b
    }

    fun hello2(){
        println("Hello Kotlin")
    }

}