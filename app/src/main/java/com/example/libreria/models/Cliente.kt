package com.example.libreria.models

class Cliente(
    id: Int,
    nombre: String,
    apellido: String,
    telefono: String,
    val email: String,
    var puntos: Int = 0
) : Persona(id, nombre, apellido, telefono) {

    fun acumularPuntos(monto: Double) {
        if (monto > 0) {
            puntos += (monto / 10).toInt()
        }
    }
}
