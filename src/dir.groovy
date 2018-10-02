/*
String dir = '\\projetos'
def hidden = []

new File(dir).eachFileRecurse {file ->
    if(file.isDirectory()){
        println file.name
    }

    if(file.isHidden()){
        hidden << file.name
    }
}

println "Hidden files: ${hidden}"
*/

/*
String dir = '\\projetos'
new File(dir).eachDirRecurse {subfolder ->
    println subfolder
}*/


/*
String dir = '\\projetos'
println new File(dir).directorySize()
*/

/*
new File('dummy').mkdir()
new File('folder/subfolder/subDoSub').mkdirs()
new File('folder/subfolder/IrmaoDosubDoSub').mkdirs()
*/

new File('dummy').deleteDir()