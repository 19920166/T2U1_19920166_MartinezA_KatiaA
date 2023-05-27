package visitor

class ConcreteElementA : Element {
    override fun accept(visitor: IVisitor) {
        visitor.visitElementA(this)
    }

    fun operationA() {
        println("Operación en el Elemento A")
    }
}
