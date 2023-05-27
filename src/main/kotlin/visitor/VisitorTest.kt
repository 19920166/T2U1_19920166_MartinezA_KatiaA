package visitor

import java.io.ByteArrayOutputStream
import java.io.PrintStream

fun main() {
    testVisitorPattern()
    println("Proceso finalizado con éxito")
}
fun testVisitorPattern() {
    val client = Client()
    val visitorA = ConcreteVisitorA()
    val visitorB = ConcreteVisitorB()

    val outputA = captureOutput { client.visitElements(visitorA) }
    val outputB = captureOutput { client.visitElements(visitorB) }

    val expectedOutputA = "Visitor A visitando el Elemento A\n" +
            "Visitor A visitando el Elemento B\n"
    val expectedOutputB = "Visitor B visitando el Elemento A\n" +
            "Visitor B visitando el Elemento B\n"

    assert(expectedOutputA == outputA)
    assert(expectedOutputB == outputB)
}

private fun captureOutput(block: () -> Unit): String {
    val outputStream = System.out
    val byteArrayOutputStream = ByteArrayOutputStream()
    System.setOut(PrintStream(byteArrayOutputStream))

    block()

    System.setOut(outputStream)
    return byteArrayOutputStream.toString()
}
