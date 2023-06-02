package state

abstract class AbstractServerState {
    open fun start(server: Server) {}
    open fun stop(server: Server) {}
    open fun restart(server: Server) {}
    open fun processMessage(server: Server, message: String) {}
}
