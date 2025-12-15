fun mainScreen():Screen{
    println("Список архивов:")
    println("0- Создать архив")
    println("1- Это мой уже созданный архив")
    println("2- Выход")
    val choice = readln()

    return when(choice){
        "0"->Screen.ArchiveCreating
        "1"->Screen.ArchiveChoice
        "2" -> Screen.Exit
        else -> Screen.MainScreen
    }

}
