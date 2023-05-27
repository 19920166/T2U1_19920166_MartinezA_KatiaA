package visitor

class Client {
    fun visitElements(visitor: IVisitor) {
        val elementA: Element = ConcreteElementA()
        val elementB: Element = ConcreteElementB()

        elementA.accept(visitor)
        elementB.accept(visitor)
    }
}
