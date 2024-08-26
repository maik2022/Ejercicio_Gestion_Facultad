fun main() {

    // Creación de objetos
    val estudiante_1 = Estudiante("Marco", "Rodriguez", 100236,"Soltero", 11)
    val estudiante_2 = Estudiante("Margarita", "Rodriguez", 44536,"Casada", 10)
    val profesor_1 = Profesor("Freddy", "Sanchez", 10023,"Casado", "Matematicas", 2012, 5)
    val profesor_2 = Profesor("Martha", "Gonzalez", 2323,"Viuda", "Lenguajes", 2018, 3)
    val personalServicio_1 = Personal_Servicio("Maria", "Lopez", 1245454, "Casado", "Biblioteca", 2023, 4)
    val personalServicio_2 = Personal_Servicio("Pedro", "Fernandez", 98763, "Casado", "Administrativo",2012, 5)

    // Creación de variables
    var opcion: Int = 0
    var opcionCurso: Int = 0
    var opcionEstudiante: Int = 0
    var opcionProfesor: Int = 0
    var opcionProfe: String = ""
    var opcionPersonal: Int = 0
    var opcionPersonalSer: String = ""
    var opcionDespacho: Int = 0
    var opcionPersona: Int = 0
    var opcionPersonales: String = ""

    while (opcion != 7){

        println("""Menú Principal
        1. Cambio del estado civil de una persona
        2. Reasignación de despacho a un empleado
        3. Matricula de un estudiante en un nuevo curso
        4. Cambio de departamento de un profesor
        5. Traslado de sección de un empleado del personal de servicio
        6. Imprimir toda la información de todos los individuos 
        7. Salir
        """.trimMargin())
        print("Elige una opción: ")
        opcion = readln().toInt()

        when(opcion){
            1 -> {
                profesor_1.imprimirProfesor()
                profesor_2.imprimirProfesor()
                personalServicio_1.imprimirPersonal()
                personalServicio_2.imprimirPersonal()
                estudiante_1.imprimirEstudiante()
                estudiante_2.imprimirEstudiante()
                print("Escoge la persona: ")
                opcionPersona = readln().toInt()

                when(opcionPersona){
                    1 -> {
                        print("Digite el nuevo estado civil: ")
                        opcionPersonales = readln().toString()
                        profesor_1.cambioEstado(opcionPersonales)
                    }
                    2 -> {
                        print("Digite el nuevo estado civil: ")
                        opcionPersonales = readln().toString()
                        profesor_2.cambioEstado(opcionPersonales)
                    }
                    3 -> {
                        print("Digite el nuevo estado civil: ")
                        opcionPersonales = readln().toString()
                        personalServicio_1.cambioEstado(opcionPersonales)
                    }
                    4 ->{
                        print("Digite el nuevo estado civil: ")
                        opcionPersonales = readln().toString()
                        personalServicio_2.cambioEstado(opcionPersonales)
                    }
                    5 -> {
                        print("Digite el nuevo estado civil: ")
                        opcionPersonales = readln().toString()
                        estudiante_1.cambioEstado(opcionPersonales)
                    }
                    6 -> {
                        print("Digite el nuevo estado civil: ")
                        opcionPersonales = readln().toString()
                        estudiante_2.cambioEstado(opcionPersonales)
                    }
                    else -> println("No escogió una opción valida")
                }
            }
            2 -> {
                profesor_1.imprimirProfesor()
                profesor_2.imprimirProfesor()
                personalServicio_1.imprimirPersonal()
                personalServicio_2.imprimirPersonal()
                print("Escoge el empleado: ")
                opcionDespacho = readln().toInt()

                when(opcionDespacho){
                    1 -> {
                        print("Digite el nuevo despacho: ")
                        opcionDespacho = readln().toInt()
                        profesor_1.cambioDespacho(opcionDespacho)
                    }
                    2 -> {
                        print("Digite el nuevo despacho: ")
                        opcionDespacho = readln().toInt()
                        profesor_2.cambioDespacho(opcionDespacho)
                    }
                    3 -> {
                        print("Digite el nuevo despacho: ")
                        opcionDespacho = readln().toInt()
                        personalServicio_1.cambioDespacho(opcionDespacho)
                    }
                    4 ->{
                        print("Digite el nuevo despacho: ")
                        opcionDespacho = readln().toInt()
                        personalServicio_2.cambioDespacho(opcionDespacho)
                    }
                    else -> println("No escogió una opción valida")
                }
            }
            3 -> {
                estudiante_1.imprimirEstudiante()
                estudiante_2.imprimirEstudiante()
                print("Escoge el estudiante: ")
                opcionEstudiante = readln().toInt()


                when(opcionEstudiante){
                    1 -> {
                        print("Digite el nuevo curso: ")
                        opcionEstudiante = readln().toInt()
                        estudiante_1.cambioCurso(opcionEstudiante)
                    }
                    2 -> {
                        print("Digite el nuevo curso: ")
                        opcionEstudiante = readln().toInt()
                        estudiante_2.cambioCurso(opcionEstudiante)
                    }
                    else -> println("No escogió una opción valida")
                }
            }
            4 -> {
                profesor_1.imprimirProfesor()
                profesor_2.imprimirProfesor()
                print("Escoge el profesor:")
                opcionProfesor = readln().toInt()

                when(opcionProfesor){
                    1 -> {
                        print("Digite el departamento: ")
                        opcionProfe = readln().toString()
                        profesor_1.cambioDepartamento(opcionProfe)
                    }
                    2 -> {
                        print("Digite el departamento: ")
                        opcionProfe = readln().toString()
                        profesor_2.cambioDepartamento(opcionProfe)
                    }
                    else -> println("No escogió una opción valida")
                }
            }
            5  ->{
                personalServicio_1.imprimirPersonal()
                personalServicio_2.imprimirPersonal()
                print("Escoge el pesonal:")
                opcionPersonal = readln().toInt()

                when(opcionPersonal){
                    1 -> {
                        print("Digite la sección: ")
                        opcionPersonalSer = readln().toString()
                        profesor_1.cambioDepartamento(opcionPersonalSer)
                    }
                    2 -> {
                        print("Digite la sección: ")
                        opcionPersonalSer = readln().toString()
                        profesor_2.cambioDepartamento(opcionPersonalSer)
                    }
                    else -> println("No escogió una opción valida")
                }
            }
            6 -> {
                estudiante_1.imprimirTodo()
                estudiante_2.imprimirTodo()
                profesor_1.imprimirTodo()
                profesor_2.imprimirTodo()
                personalServicio_1.imprimirTodo()
            }
            7 -> opcion = 7 // Para poder salir del ciclo
            else -> println("No eligio una opción valida")
        }
    }

}