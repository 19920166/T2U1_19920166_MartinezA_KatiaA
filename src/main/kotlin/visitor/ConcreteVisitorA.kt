package visitor

class ConcreteVisitorA : IVisitor {
    override fun visitElementA(element: ConcreteElementA) {
        println("Visitor A visitando el Elemento A")
    }

    override fun visitElementB(element: ConcreteElementB) {
        println("Visitor A visitando el Elemento B")
    }
}
