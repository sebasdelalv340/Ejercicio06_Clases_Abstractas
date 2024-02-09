
/**
 * Clase abstracta que representa a un empleado.
 * @property nombre El nombre del empleado.
 * @property id El identificador único del empleado.
 */
abstract class Empleado(val nombre: String, val id: Int) {
    init{
        require(nombre.isNotBlank()) {"El nombre no puede estar vacío."}
        require(id > 0) {"El id debe ser mayor que cero."}
    }
    /**
     * Calcula el salario del empleado.
     * @return El salario del empleado.
     */
    abstract fun calcularSalario(): Double

    override fun toString(): String {
        return "$nombre con ID-${"%04d".format(id)} tiene un salario de ${"%.2f".format(calcularSalario())}€ al mes."
    }
}


/**
 * Clase que representa a un empleado que recibe un salario por hora trabajada.
 * @param nombre El nombre del empleado.
 * @param id El identificador único del empleado.
 * @param horasTrabajadas Las horas trabajadas por el empleado.
 * @param tarifaPorHoras La tarifa por horas del empleado.
 */
class EmpleadoPorHora(nombre: String, id: Int, val horasTrabajadas: Double, val tarifaPorHoras: Double): Empleado(nombre, id) {

    /**
     * Constructor secundario para permitir la entrada de horas trabajadas como Int.
     */
    constructor(nombre: String, id: Int, horasTrabajadas: Int, tarifaPorHoras: Double): this(nombre, id, horasTrabajadas.toDouble(), tarifaPorHoras)

    /**
     * Calcula el salario de EmpleadoPorHora.
     * @return El salario sobreescrito de EmpleadoPorHora.
     */
    override fun calcularSalario(): Double {
        return horasTrabajadas * tarifaPorHoras
    }
}


/**
 * Clase que representa a un empleado con un salario fijo.
 * @param nombre El nombre del empleado.
 * @param id El identificador único del empleado.
 * @param salarioFijo El salario fijo del empleado.
 * @param numPagas El número de pagas en las que se divide el salario fijo.
 */
class EmpleadoFijo(nombre: String, id: Int, val salarioFijo: Double, val numPagas: Int): Empleado(nombre, id) {

    /**
     * Constructor secundario para permitir la entrada de salario fijo como Int.
     */
    constructor(nombre: String, id: Int, salarioFijo: Int, numPagas: Int): this(nombre, id, salarioFijo.toDouble(), numPagas)

    /**
     * Calcula el salario de EmpleadoFijo
     * @return El salario sobreescrito de EmpleadoFijo
     */
    override fun calcularSalario(): Double {
        return salarioFijo / numPagas
    }

    override fun toString(): String {
        return super.toString()
    }
}


/**
 * Clase que representa un departamento que contiene una lista de empleados.
 * @property empleados La lista de empleados del departamento.
 */
class Departamento(val empleados: MutableList<Empleado>) {

    /**
     * Agrega un empleado a la lista de empleados del departamento.
     * @param empleado El empleado a agregar.
     */
    fun agregarEmpleado(empleado: Empleado) {
        empleados.add(empleado)
    }

    /**
     * Calcula el salario total de todos los empleados en el departamento.
     * @return El salario total del departamento.
     */
    fun calculaSalarioTotal() {
        empleados.sumOf { it.calcularSalario()}
    }
}