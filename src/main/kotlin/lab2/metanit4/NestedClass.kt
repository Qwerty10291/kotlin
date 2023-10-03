package lab2.metanit4

class NestedClass(username: String, password: String){

    private val account: Account = Account(username, password)

    private class Account(val username: String, val password: String)

    fun showAccountDetails(){
        println("UserName: ${account.username}  Password: $account.password")
    }
}
