package state

// Interfaz del estado
interface State {
    fun doAction(context: Context)
}

// Estados concretos
class StateA : State {
    override fun doAction(context: Context) {
        println("Estado A")
        context.state = this
    }
}

class StateB : State {
    override fun doAction(context: Context) {
        println("Estado B")
        context.state = this
    }
}
