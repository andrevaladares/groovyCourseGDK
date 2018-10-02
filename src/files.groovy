/*
//create new file
def file = new File('dummy.txt')
file.write('this is some text\n')

//new File('dummy.txt').text='....'

file.append('I am some more text\n')

List lines = file.readLines()
lines.each {line ->
    println line
}*/

//read files from dir
/*
String dir = '\\projetos'
new File(dir).eachFileRecurse {file ->
    println file.name
}
*/

new File('.').eachFile { file ->
    if(file.name.endsWith('.groovy')){
        println file.name
    }
}
