fun main() {
    val empleado1 = EmpleadoPorHora("Juan", 1, 38, 9.58)
    val empleado2 = EmpleadoFijo("Ana", 2, 27600, 14)
    val empleado3 = EmpleadoPorHora("Juan", 3, 39.5, 11.34)
    val empleado4 = EmpleadoFijo("Alex", 4, 32000, 12)
    val empleado5 = EmpleadoPorHora("Juan", 5, 40, 12.13)

    val empleados: MutableList<Empleado> = mutableListOf(empleado1, empleado2, empleado3, empleado4, empleado5)


}
