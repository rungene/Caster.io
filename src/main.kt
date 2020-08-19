fun main(){

    //var user = User(firstName = "Rungene",lastName = "Nyambura")

    val user = User.createUser("Sonnie","Magdar")
    println(user)

    val users = User.createUsers(5)

   /* println(users)
    users.forEach { println(it) }*/
    val user2 = User.users
    user2.forEach { println(it) }



}




