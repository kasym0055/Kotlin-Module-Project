class ArchiveCreatingScreen {
    fun creatingArcScreen(newArcObj:Archive):Screen{
        println("Создание и добавление Архива")
        println("Название архива: ")
        val archiveName=readln()
        if (archiveName.isBlank()){
            println("Название архива не может быть пустым")
            println("Нажмите Enter чтобы попробовать снова")
            readln()
            return Screen.ArchiveCreating
        }
        val newArchive=ArchiveData(archiveName)
        newArchive.title=archiveName
        newArcObj.addArchive(newArchive)
        return Screen.MainScreen
    }
}
