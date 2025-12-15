fun arcChoiceScreen(
    arcObject: Archive,
    onSelect: (ArchiveData) -> Unit
): Screen {

    println("Список архивов")
    arcObject.getArchives().forEachIndexed { ind, elem ->
        println("${ind + 1}. ${elem.title}")
    }

    val chosenArchive = chooseArchive(arcObject.getArchives())
    onSelect(chosenArchive)

    return Screen.OpenArchive
}


fun chooseArchive(archives: List<ArchiveData>): ArchiveData {
    print("Выберите архив: ")
    while (true) {

        val input = readln().toIntOrNull()

        if (input != null && input in 1..archives.size) {

            return archives[input - 1]
        }

        println("Неверный выбор, попробуйте снова")
    }
}

