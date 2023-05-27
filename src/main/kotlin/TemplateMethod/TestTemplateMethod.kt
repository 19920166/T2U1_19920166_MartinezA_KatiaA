package TemplateMethod

import TemplateMethod.DrugstoreFileProcess
import TemplateMethod.GroceryFileProcess
import java.io.File

fun main(){
    val logDir = "/Users/Katia/IdeaProjects/TerceraUnidad/logs"
    val processDir = "/Users/Katia/IdeaProjects/TerceraUnidad/process"
    val files = arrayOf("/Users/Katia/IdeaProjects/TerceraUnidad/abc.drug",
        "/Users/Katia/IdeaProjects/TerceraUnidad/123.gry" )
    println("> Monitoring start")

    val fileDrug = File(files[0])

    DrugstoreFileProcess(fileDrug, logDir, processDir).execute()

    println("File processed  > " + fileDrug.name)

    val fileGry = File(files[1])
    GroceryFileProcess(fileGry, logDir, processDir).execute()
    println("File processed  > " + fileGry.name)

}