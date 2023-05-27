package visitor

class ConcreteElementB : Element {
    override fun accept(visitor: IVisitor) {
        visitor.visitElementB(this)
    }

    fun operationB() {
        println("Operación en el Elemento B")
    }
}
