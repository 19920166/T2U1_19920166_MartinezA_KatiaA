package visitor

class ConcreteVisitorB : IVisitor {
    override fun visitElementA(element: ConcreteElementA) {
        println("Visitor B visitando el Elemento A")
    }

    override fun visitElementB(element: ConcreteElementB) {
        println("Visitor B visitando el Elemento B")
    }
}
