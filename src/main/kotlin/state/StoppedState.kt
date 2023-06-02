package state

class StoppedState : AbstractServerState() {
    override fun start(server: Server) {
        println("Starting the server")
        server.setState(RunningState())
    }

    override fun stop(server: Server) {
        println("Server is already stopped")
    }

    override fun restart(server: Server) {
        println("Cannot restart. Server is stopped")
    }

    override fun processMessage(server: Server, message: String) {
        println("Cannot process message. Server is stopped")
    }
}
