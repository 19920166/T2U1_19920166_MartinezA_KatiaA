package state

// Test del patrón State
fun main() {
    val context = Context(StateA())
    context.doAction() // Cambiará al Estado B
    context.doAction() // Cambiará nuevamente al Estado B

    // Salida esperada:
    // Estado A
    // Estado B
    // Estado B
}
