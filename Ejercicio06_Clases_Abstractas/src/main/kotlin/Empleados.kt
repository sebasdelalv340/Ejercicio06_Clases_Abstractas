

abstract class Empleado(val nombre: String, val id: Int) {
    abstract fun calcularSalario(): Double
}

class EmpleadoPorHora(nombre: String, id: Int, val horasTrabajadas: Double, val tarifaPorHoras: Double): Empleado(nombre, id) {

    constructor(nombre: String, id: Int, horasTrabajadas: Int, tarifaPorHoras: Double): this(nombre, id, horasTrabajadas.toDouble(), tarifaPorHoras)

    override fun calcularSalario(): Double {
        return horasTrabajadas * tarifaPorHoras
    }
}

class EmpleadoFijo(nombre: String, id: Int, val salarioFijo: Double, val numPagas: Int): Empleado(nombre, id) {

    constructor(nombre: String, id: Int, salarioFijo: Int, numPagas: Int): this(nombre, id, salarioFijo.toDouble(), numPagas)

    override fun calcularSalario(): Double {
        return salarioFijo / numPagas
    }
}

class Departamento(val empleados: MutableList<Empleado>) {
    fun agregarEmpleado(empleado: Empleado) {
        empleados.add(empleado)
    }

    fun calculaSalarioTotal() {
        empleados.sumOf { it.calcularSalario()}
    }
}