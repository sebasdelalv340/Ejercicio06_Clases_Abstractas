fun main() {

    val circulo: Figura = Circulo("rojo", 3.5)
    val rectangulo: Figura = Rectangulo("verde", 7.5, 8.2)
    val triangulo: Figura = Triangulo("amarillo", 4.1, 6.3, 4.1, 5.0, 3.6)

    // Compruebo que cada objeto realiza correctamente los métodos.
    println(circulo)
    println(circulo.area())
    println(circulo.perimetro())

    println(rectangulo)
    println(rectangulo.area())
    println(rectangulo.perimetro())

    println(triangulo)
    println(triangulo.area())
    println(triangulo.perimetro())


    // Creo 5 empledados disferentes (fijo o por horas).
    val empleado1 = EmpleadoPorHora("Juan", 1, 38, 9.58)
    val empleado2 = EmpleadoFijo("Ana", 2, 27600, 14)
    val empleado3 = EmpleadoPorHora("Juan", 3, 39.5, 11.34)
    val empleado4 = EmpleadoFijo("Alex", 4, 32000, 12)
    val empleado5 = EmpleadoPorHora("Juan", 5, 40, 12.13)

    // Creo una lista con todos los empleados.
    val empleados: MutableList<Empleado> = mutableListOf(empleado1, empleado2, empleado3, empleado4, empleado5)

    // Recorre el departamento imprimiendo la información de cada empleado.
    empleados.map { println(it.toString())}
}
