package state

class Server {
    private var state: AbstractServerState = StoppedState()

    fun setState(state: AbstractServerState) {
        this.state = state
    }

    fun start() {
        state.start(this)
    }

    fun stop() {
        state.stop(this)
    }

    fun restart() {
        state.restart(this)
    }

    fun processMessage(message: String) {
        state.processMessage(this, message)
    }
}
