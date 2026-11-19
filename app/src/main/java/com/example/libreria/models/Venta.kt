package com.example.libreria.models

class Venta(
    val id: Int,
    val fecha: String,
    val cliente: Cliente? = null,
    val empleado: Empleado? = null,
    val detalles: MutableList<DetalleVenta> = mutableListOf()
) {
    fun agregarDetalle(detalle: DetalleVenta) {
        detalles.add(detalle)
    }

    fun calcularTotal(): Double {
        return detalles.sumOf { it.calcularSubtotal() }
    }
}
