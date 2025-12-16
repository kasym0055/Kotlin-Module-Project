class Archive {
    private val archiveList: MutableList<ArchiveData> = mutableListOf()

    fun addArchive(archive:ArchiveData){
        archiveList.add(archive)
        println(archiveList.toString())
    }

    fun getArchives(): List<ArchiveData> = archiveList
}