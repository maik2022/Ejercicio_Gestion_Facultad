class Profesor (var nombre: String, var Apellido:String, var numIdentificacion:Int, var estadoCivil:String, var departamento:String, var ingreso:Int, var despacho:Int) {

    fun imprimirProfesor(){
        println("""
        Nombre: $nombre
        Apellido: $Apellido
        Estado civil: $estadoCivil
        Departamento: $departamento
        Despacho: $despacho
        *************
        """.trimMargin())
    }

    fun imprimirTodo(){
        println("""
        Nombre: $nombre
        Apellido: $Apellido
        Número identificación: $numIdentificacion
        Estado civil: $estadoCivil
        Departamento: $departamento
        Ingreso: $ingreso
        Despacho: $despacho
        
        *************
        """.trimMargin())
    }

    fun cambioDepartamento(departamentoNew: String){
        departamento = departamentoNew;
        println("!!!Cambio Hecho!!!")
        imprimirProfesor()
    }

    fun cambioDespacho(despachoNew: Int){
        despacho = despachoNew;
        println("!!!Cambio Hecho!!!")
        imprimirProfesor()
    }

    fun cambioEstado(estadoNew: String){
        estadoCivil = estadoNew;
        println("!!!Cambio Hecho!!!")
        imprimirProfesor()
    }
}