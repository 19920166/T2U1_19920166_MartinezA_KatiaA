package visitor

interface IVisitor {
    fun visitElementA(element: ConcreteElementA)
    fun visitElementB(element: ConcreteElementB)
}
