class Person( val firstName: String = "Paula", val lastName: String = "UwU"){

     var nickName: String? = null
        set(value) {
            field = value
            println("the new nickname is $value")
        }


    fun printInfo() {
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName ($nickNameToPrint) $lastName")
    }

}
