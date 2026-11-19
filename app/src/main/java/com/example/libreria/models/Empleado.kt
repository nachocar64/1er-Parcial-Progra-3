package com.example.libreria.models

class Empleado(
    id: Int,
    nombre: String,
    apellido: String,
    telefono: String,
    val cargo: String,
    val salario: Double
) : Persona(id, nombre, apellido, telefono)
