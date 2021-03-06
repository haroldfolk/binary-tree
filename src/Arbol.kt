class Arbol(var raiz: Nodo? = null) {
    private fun addNodo(newNodo: Nodo, raiz: Nodo?) {
        if (raiz == null) {
            this.raiz = newNodo
        } else {
            if (newNodo.value <= raiz!!.value) {
                if (raiz!!.hijoIzq == null) {
                    raiz!!.hijoIzq = newNodo
                } else {
                    addNodo(newNodo, raiz.hijoIzq)
                }
            } else {
                if (raiz.hijoDer == null) {
                    raiz.hijoDer = newNodo
                } else {
                    addNodo(newNodo, raiz.hijoDer)
                }

            }
        }
    }

    fun addNodo(newNodo: Nodo) {
        this.addNodo(newNodo, this.raiz)
    }

    private fun recPreorden(list: MutableList<Int>, nodoRaiz: Nodo?): MutableList<Int> {
//        RID
        if (nodoRaiz != null) {
            list.add(nodoRaiz.value)
            recPreorden(list, nodoRaiz.hijoIzq)
            recPreorden(list, nodoRaiz.hijoDer)
        }
        return list
    }
    fun recPreorden(): MutableList<Int> {
        var list:MutableList<Int> = mutableListOf()

        return recPreorden(list, this.raiz!!)
    }


    private fun recInorden(list: MutableList<Int>, nodoRaiz: Nodo?): MutableList<Int> {
        if (nodoRaiz != null) {
            recInorden(list, nodoRaiz.hijoIzq)
            list.add(nodoRaiz.value)
            recInorden(list, nodoRaiz.hijoDer)
        }
        return list
    }

    fun recInorden(): MutableList<Int> {
        var list: MutableList<Int> = mutableListOf()

        return recInorden(list, this.raiz!!)
    }

    private fun recPostorden(list: MutableList<Int>, nodoRaiz: Nodo?): MutableList<Int> {
        if (nodoRaiz != null) {
            recPostorden(list, nodoRaiz.hijoIzq)
            recPostorden(list, nodoRaiz.hijoDer)
            list.add(nodoRaiz.value)

        }
        return list
    }

    fun recPostorden(): MutableList<Int> {
        var list: MutableList<Int> = mutableListOf()

        return recPostorden(list, this.raiz!!)
    }
}