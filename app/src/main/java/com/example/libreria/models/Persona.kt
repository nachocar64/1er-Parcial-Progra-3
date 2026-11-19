package com.example.libreria.models

abstract class Persona(
    protected open val id: Int,
    protected open val nombre: String,
    protected open val apellido: String,
    protected open val telefono: String
) {
    fun nombreCompleto(): String {
        return "$nombre $apellido"
    }
}
