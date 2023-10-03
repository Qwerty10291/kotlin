package lab2.chapter6

class Chapter() {
    fun Run() {
        val animals = arrayOf(Wolf(), Hippo())

        for (animal in animals) {
            animal.roam()
            animal.eat()
        }

        val vet = Vet()
        val wolf = Wolf()
        val hippo = Hippo()

        vet.giveShot(wolf)
        vet.giveShot(hippo)

        val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
        for (item in roamables) {
            item.roam()
            if (item is Animal) {
                item.eat()
            }
        }

    }
}
