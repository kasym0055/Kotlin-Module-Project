data class ArchiveData(
    var title: String,
    val notes: MutableList<NoteData> = mutableListOf(),
)