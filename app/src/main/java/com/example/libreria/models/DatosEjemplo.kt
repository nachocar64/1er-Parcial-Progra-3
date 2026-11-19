package com.example.libreria.models

object DatosEjemplo {
    val autores: List<Autor> = listOf(
        Autor(id = 1, nombre = "Gabriel García Márquez", nacionalidad = "Colombiana"),
        Autor(id = 2, nombre = "Isabel Allende", nacionalidad = "Chilena"),
        Autor(id = 3, nombre = "Mario Vargas Llosa", nacionalidad = "Peruana")
    )

    val clientes: List<Cliente> = listOf(
        Cliente(id = 1, nombre = "Juan", apellido = "Pérez", telefono = "555-0101", email = "juan.perez@email.com", puntos = 120),
        Cliente(id = 2, nombre = "María", apellido = "Gómez", telefono = "555-0102", email = "maria.gomez@email.com", puntos = 85),
        Cliente(id = 3, nombre = "Carlos", apellido = "López", telefono = "555-0103", email = "carlos.lopez@email.com", puntos = 200)
    )

    val libros: List<Libro> = listOf(
        Libro(
            id = 1,
            titulo = "Cien años de soledad",
            isbn = "978-0307474728",
            precio = 25.50,
            stock = 15,
            anioPublicacion = 1967,
            autor = autores[0],
            categoria = Categoria.NOVELA
        ),
        Libro(
            id = 2,
            titulo = "El amor en los tiempos del cólera",
            isbn = "978-0307387264",
            precio = 22.00,
            stock = 10,
            anioPublicacion = 1985,
            autor = autores[0],
            categoria = Categoria.NOVELA
        ),
        Libro(
            id = 3,
            titulo = "La casa de los espíritus",
            isbn = "978-0307474742",
            precio = 20.00,
            stock = 8,
            anioPublicacion = 1982,
            autor = autores[1],
            categoria = Categoria.NOVELA
        ),
        Libro(
            id = 4,
            titulo = "La ciudad y los perros",
            isbn = "978-8420471839",
            precio = 18.90,
            stock = 12,
            anioPublicacion = 1963,
            autor = autores[2],
            categoria = Categoria.NOVELA
        ),
        Libro(
            id = 5,
            titulo = "Breve historia del tiempo",
            isbn = "978-0553380163",
            precio = 30.00,
            stock = 5,
            anioPublicacion = 1988,
            autor = Autor(id = 4, nombre = "Stephen Hawking", nacionalidad = "Británica"),
            categoria = Categoria.CIENCIA
        )
    )

    val empleados: List<Empleado> = listOf(
        Empleado(id = 1, nombre = "Ana", apellido = "Martínez", telefono = "555-0201", cargo = "Vendedora", salario = 1500.0),
        Empleado(id = 2, nombre = "Luis", apellido = "Rodríguez", telefono = "555-0202", cargo = "Gerente", salario = 2500.0)
    )

    val ventas: List<Venta> = listOf(
        Venta(
            id = 1,
            fecha = "2023-10-15",
            cliente = clientes[0],
            empleado = empleados[0],
            detalles = mutableListOf(
                DetalleVenta(libro = libros[0], cantidad = 2),
                DetalleVenta(libro = libros[2], cantidad = 1)
            )
        )
    )
}
