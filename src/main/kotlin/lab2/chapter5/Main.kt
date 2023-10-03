package lab2.chapter5

class Chapter() {
    fun Run(args: Array<String>) {
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

    }
}

