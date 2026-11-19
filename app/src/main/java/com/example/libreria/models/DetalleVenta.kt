package com.example.libreria.models

data class DetalleVenta(
    val libro: Libro,
    val cantidad: Int,
    val precioUnitario: Double = libro.precio
) {
    fun calcularSubtotal(): Double {
        return cantidad * precioUnitario
    }
}
