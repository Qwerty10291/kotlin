package lab2.metanit4

import lab2.metanit4.email.send as sendEmail
import lab2.metanit4.email.Message as EmailMessage
import lab2.metanit4.sms.send as sendSms
import lab2.metanit4.sms.Message as SmsMessage

class Chapter{
    fun Run() {
        println("Constructors")
        println("------------------------------------------------")

        val tom = Person("Tommy")
        val bob = Person("Bobby", 41)
        val sam = Person("Din", 32, "JetBtains")

        println("Name: ${tom.name}  Age: ${tom.age}  Company: ${tom.company}")
        println("Name: ${bob.name}  Age: ${bob.age}  Company: ${bob.company}")
        println("Name: ${sam.name}  Age: ${sam.age}  Company: ${sam.company}")

        println()
        println("Packages")
        println("------------------------------------------------")

        val myEmailMessage = EmailMessage("Hello Kotlin")
        sendEmail(myEmailMessage, "tom@gmail.com")

        val mySmsMessage = SmsMessage("Hello Kotlin")
        sendSms(mySmsMessage, "+1234567890")

        println()
        println("Open Class")
        println("------------------------------------------------")

        val marge: Employee = Employee("Marge", "Bakery")
        marge.printName()
        marge.printCompany()

        println()
        println("Get/Set Class")
        println("------------------------------------------------")

        val oleg = ModifiedPerson("Oleg")
        oleg.ageValue = 50
        println(oleg.ageValue)
        oleg.ageValue = 345
        println(oleg.ageValue)

        println()
        println("Override Class")
        println("------------------------------------------------")

        val jack = OverridePerson("Jack")
        jack.display()
        val martin = OverrideEmployee("Martin", "Dr. Martness corp.")
        martin.display()

        println()
        println("Abstract Class")
        println("------------------------------------------------")

        val square = Rectangle(10f, 10f)
        println(square.perimeter())
        println(square.area())

        println()
        println("Interface Class")
        println("------------------------------------------------")

        val mercedes: Car = Car("Mercedes", "М333НТ16")
        println(mercedes.model)
        println(mercedes.number)

        mercedes.move()
        mercedes.stop()

        println()
        println("Nested Class")
        println("------------------------------------------------")

        val mark = NestedClass("qwerty", "123456");
        mark.showAccountDetails()

        println()
        println("Inner Class")
        println("------------------------------------------------")

        val acc = BankAccount(3400);
        acc.Transaction(2400).pay()

        println()
        println("Data Class")
        println("------------------------------------------------")

        val mary: PersonDataClass = PersonDataClass("Mary", 24)
        val kate = mary.copy(name = "Kate")
        println(mary.toString())
        println(kate.toString())

        println()
        println("Enum Class")
        println("------------------------------------------------")

        val day1: enumClass = enumClass.MONDAY
        println(day1.name)
        println(day1.ordinal)

        println()

        DateTime.DAY.printName()
        DateTime.NIGHT.printName()

        println()
        println("Delegate Class")
        println("------------------------------------------------")

        val telegram = InstantMessenger("Telegram")
        val photoCamera = PhotoCamera()
        val iphone = SmartPhone("Iphone", telegram, photoCamera)
        iphone.send("Wassup Bro")
        iphone.takePhoto()

        println()
        println("ANONYMOS")
        println("------------------------------------------------")

        val artur = object : Person("Artur"){

            val corp = "Google"
            override fun sayHello(){
                println("Hi, my name is $name. I work in $corp")
            }
        }

        artur.sayHello()

    }
}
