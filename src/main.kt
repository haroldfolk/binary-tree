fun main(args:Array<String>){

    var miArbol=Arbol()
    miArbol.addNodo(Nodo(18))
    miArbol.addNodo(Nodo(12))
    miArbol.addNodo(Nodo(28))
    miArbol.addNodo(Nodo(35))
    miArbol.addNodo(Nodo(5))
    miArbol.addNodo(Nodo(9))
    miArbol.addNodo(Nodo(20))
    println(miArbol.recPreorden())
    println(miArbol.recInorden())
    println(miArbol.recPostorden())
}