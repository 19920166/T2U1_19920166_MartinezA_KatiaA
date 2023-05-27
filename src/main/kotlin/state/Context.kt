package state

// Contexto
class Context(var state: State) {
    init {
        state.doAction(this)
    }

    fun doAction() {
        state.doAction(this)
    }
}
