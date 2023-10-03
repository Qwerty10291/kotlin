package  lab2.metanit4.email

class Message(val text: String)

fun send(message: Message, address: String) {
    println("Message `${message.text}` has been sent to $address")
}
