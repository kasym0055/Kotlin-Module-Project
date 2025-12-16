fun noteCreatingScreen(archive:ArchiveData):Screen{
    println("Название: ")
    val title = readln()
    if (checkIsBlank(title,"Название")) return Screen.NoteCreating
    println("Текст:")
    val text = readln()
    if (checkIsBlank(text,"Текст")) return Screen.NoteCreating

    archive.notes.add(NoteData(title,text))
    println(archive.notes)
    return Screen.OpenArchive
}

fun checkIsBlank(str: String,title: String): Boolean{
    if (str.isBlank()){
        println("$title не можеть быть пустым")
        println("Нажмите Enter чтобы попробовать снова")
        readln()
        return true
    }
    return false
}