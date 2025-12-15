fun showNotes(archiveData: ArchiveData):Screen{
    println("Заметки:")
    archiveData.notes.forEachIndexed { ind, elem->
        println("${ind+1}. ${elem.title}")
        println("содержание : ${elem.text}")
    }

    return Screen.ArchiveChoice
}