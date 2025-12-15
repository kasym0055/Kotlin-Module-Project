fun noteCreatingScreen(archive:ArchiveData):Screen{
    println("Название: ")
    val title = readln()
    println("Текст:")
    val text = readln()

    archive.notes.add(NoteData(title,text))
    println(archive.notes)
    return Screen.OpenArchive
}