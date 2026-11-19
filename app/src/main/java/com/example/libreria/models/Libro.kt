package com.example.libreria.models

data class Libro(
    val id: Int,
    val titulo: String,
    val isbn: String,
    val precio: Double,
    var stock: Int,
    val anioPublicacion: Int,
    val autor: Autor,
    val categoria: Categoria
) {
    fun hayStock(cantidad: Int): Boolean {
        return stock >= cantidad
    }

    fun reducirStock(cantidad: Int) {
        if (hayStock(cantidad)) {
            stock -= cantidad
        }
    }

    fun aumentarStock(cantidad: Int) {
        if (cantidad > 0) {
            stock += cantidad
        }
    }
}
