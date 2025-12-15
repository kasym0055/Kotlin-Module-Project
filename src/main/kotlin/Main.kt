fun main(args: Array<String>) {
    val newArcObj=Archive()
    val createArc=ArchiveCreatingScreen()
    var current = Screen.MainScreen
    var selectedArchive: ArchiveData? = null
    while (current!=Screen.Exit){
        current = when(current) {
            Screen.MainScreen -> mainScreen()
            Screen.ArchiveCreating -> createArc.creatingArcScreen(newArcObj)
            Screen.ArchiveChoice -> arcChoiceScreen(newArcObj){archive->
                selectedArchive=archive
            }

            Screen.OpenArchive -> archiveScreen(selectedArchive!!)
//            Screen.NoteChoice ->
            Screen.NoteCreating -> noteCreatingScreen(selectedArchive!!)
            Screen.NoteScreen -> showNotes(selectedArchive!!)
            Screen.Exit -> Screen.Exit

        }
    }


}