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