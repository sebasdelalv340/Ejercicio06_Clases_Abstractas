import kotlin.math.PI

abstract class Figura(val color: String) {
    abstract fun area(): Double
    abstract fun perimetro(): Double
}

class Circulo(color: String, val radio: Double): Figura(color) {
    override fun area(): Double {
        return PI * (radio * radio)
    }

    override fun perimetro(): Double {
        return 2 * PI * radio
    }
}

abstract class Rectangulo(color: String, val base: Double, val altura: Double): Figura(color) {
    override fun area(): Double {
        return base * altura
    }

    override fun perimetro(): Double {
        return (base + altura) * 2
    }
}

class Triangulo(color: String, base: Double, altura: Double, val lado1: Double, val lado2: Double, val lado3: Double): Rectangulo(color, base, altura) {
    override fun area(): Double {
        return (base * altura) / 2
    }

    override fun perimetro(): Double {
        return lado1 + lado2 + lado3
    }
}