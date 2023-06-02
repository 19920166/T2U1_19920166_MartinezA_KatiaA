package state

class RunningState : AbstractServerState() {
    override fun start(server: Server) {
        println("Server is already running")
    }

    override fun stop(server: Server) {
        println("Stopping the server")
        server.setState(StoppedState())
    }

    override fun restart(server: Server) {
        println("Restarting the server")
        server.setState(RunningState())
    }

    override fun processMessage(server: Server, message: String) {
        val messageProcess = MessageProcess()
        messageProcess.processMessage(message)
    }
}
