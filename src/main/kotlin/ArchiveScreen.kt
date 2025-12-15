fun archiveScreen(archive:ArchiveData):Screen{
    println("Вы в архиве ${archive.title}")
    println("Список заметок:")
    println("0- Создать заметку")
    println("1- Это мой уже созданная заметка")
    println("2- Выход")
    val choice = readln()
    return when(choice){
        "0"->Screen.NoteCreating
        "1"->Screen.NoteScreen
        "2"->Screen.MainScreen
        else -> Screen.OpenArchive
    }
}

