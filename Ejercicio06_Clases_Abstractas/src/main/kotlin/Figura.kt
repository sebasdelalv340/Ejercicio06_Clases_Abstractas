import kotlin.math.PI

/**
 * Clase abstracta que representa una figura geométrica.
 * @property color El color de la figura.
 */
abstract class Figura(val color: String) {

    /**
     * Calcula el área de la figura.
     * @return El área de la figura.
     */
    abstract fun area(): Double

    /**
     * Calcula el perímetro de la figura.
     * @return El perímetro de la figura.
     */
    abstract fun perimetro(): Double
}


/**
 * Clase que representa un círculo.
 * @param color El color del círculo.
 * @param radio El radio del círculo.
 */
class Circulo(color: String, val radio: Double): Figura(color) {

    /**
     * Calcula el área sobreescrita de Círculo.
     * @return El área sobreescrita de Círculo.
     */
    override fun area(): Double {
        return PI * (radio * radio)
    }

    /**
     * Calcula el perímetro sobreescrito de Círculo.
     * @return El perímetro sobreescrito de Círculo.
     */
    override fun perimetro(): Double {
        return 2 * PI * radio
    }
}


/**
 * Clase abstracta que representa un rectángulo.
 * @param color El color del rectángulo.
 * @param base La base del rectángulo.
 * @param altura La altura del rectángulo.
 */
class Rectangulo(color: String, val base: Double, val altura: Double): Figura(color) {

    /**
     * Calcula el área sobreescrita de Rectángulo.
     * @return El área sobreescrita de Rectángulo.
     */
    override fun area(): Double {
        return base * altura
    }

    /**
     * Calcula el perímetro sobreescrito de Rectángulo.
     * @return El perímetro sobreescrito de Rectángulo.
     */
    override fun perimetro(): Double {
        return (base + altura) * 2
    }
}


/**
 * Clase que representa un triángulo.
 * @param color El color del triángulo.
 * @param base La base del triángulo.
 * @param altura La altura del triángulo.
 * @param lado1 La longitud del primer lado del triángulo.
 * @param lado2 La longitud del segundo lado del triángulo.
 * @param lado3 La longitud del tercer lado del triángulo.
 */
class Triangulo(color: String, val base: Double, val altura: Double, val lado1: Double, val lado2: Double, val lado3: Double): Figura(color) { // Hereda de Rectángulo porque tienen las propiedades en común.

    /**
     * Calcula el área sobreescrita de Triángulo.
     * @return El área sobreescrita de Triángulo.
     */
    override fun area(): Double {
        return (base * altura) / 2
    }

    /**
     * Calcula el perímetro sobreescrito de Triángulo.
     * @return El perímetro sobreescrito de Triángulo.
     */
    override fun perimetro(): Double {
        return lado1 + lado2 + lado3
    }
}