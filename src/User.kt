class User (var firstName:String,var lastName:String){

    companion object{
        val users = mutableListOf<User>()

        fun createUsers(count:Int):List<User>{

            for (i in 0..count){
                users.add(User("Firstname $i","lastName $i"))
            }

            return users
        }

        fun createUser(firstName: String,lastName: String):User{
            return User(firstName, lastName)
        }
    }
/*
    fun fullName():String = "$firstName $lastName"

    fun fullNameLength():Int = fullName().length
    fun updateFirstNameWithSuffix(suffix:String):String = "$suffix $firstName"*/


}