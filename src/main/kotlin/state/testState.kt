package state

fun main() {
    val server = Server()
    server.start()
    server.processMessage("Hello, World!")
    server.stop()
    server.processMessage("This message won't be processed")
    server.restart()
    server.processMessage("Hello again!")
}
