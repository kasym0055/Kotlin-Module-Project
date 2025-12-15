class ArchiveCreatingScreen {
    fun creatingArcScreen(newArcObj:Archive):Screen{
        println("Создание и добавление Архива")
        println("Название архива: ")
        val archiveName=readln()
        val newArchive=ArchiveData(archiveName)
        newArchive.title=archiveName
        newArcObj.addArchive(newArchive)
        return Screen.MainScreen
    }
}
