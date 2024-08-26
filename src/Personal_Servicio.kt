class Personal_Servicio (var nombre: String, var Apellido:String, var numIdentificacion:Int, var estadoCivil:String, var seccion:String, var ingreso:Int, var despacho:Int) {

    fun imprimirPersonal(){
        println("""
        Nombre: $nombre
        Apellido: $Apellido
        Estado civil: $estadoCivil
        Sección: $seccion
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
        Sección: $seccion
        Ingreso: $ingreso
        Despacho: $despacho
        *************
        """.trimMargin())
    }

    fun cambioDespacho(despachoNew: Int){
        despacho = despachoNew;
        println("!!!Cambio Hecho!!!")
        imprimirPersonal()
    }

    fun cambioEstado(estadoNew: String){
        estadoCivil = estadoNew;
        println("!!!Cambio Hecho!!!")
        imprimirPersonal()
    }
}