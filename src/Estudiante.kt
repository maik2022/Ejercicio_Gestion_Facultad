class Estudiante (var nombre: String, var Apellido:String, var numIdentificacion:Int, var estadoCivil:String, var curso:Int) {

    fun imprimirEstudiante(){
        println("""
        Nombre: $nombre
        Apellido: $Apellido
        Estado civil: $estadoCivil
        Curso: $curso
        *************
        """.trimMargin())
    }

    fun imprimirTodo(){
        println("""
        Nombre: $nombre
        Apellido: $Apellido
        Número identificación: $numIdentificacion
        Estado civil: $estadoCivil
        Curso: $curso
        *************
        """.trimMargin())
    }

    fun cambioCurso(cursoNew: Int){
        curso = cursoNew;
        println("!!!Cambio Hecho!!!")
        imprimirEstudiante()
    }

    fun cambioEstado(estadoNew: String){
        estadoCivil = estadoNew;
        println("!!!Cambio Hecho!!!")
        imprimirEstudiante()
    }
}