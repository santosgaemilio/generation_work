package com.generation.ecommerce.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generation.ecommerce.model.Producto;
//	Indicamos que extendemos de la interface JpaRepository, y que manejamos la 
//	entidad llamada Producto indentificandola por su atributo Long id

//	Usaré queries predefinidas del JPA Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
	//Esta anotacion nos indica que podemos realizar una consulta personalizada 
	//a la base de datos. En este caso, obtenemos un producto por su nombre. 
	//Dicha consulta esta escrita en JPQL (Java Persistence Query Language) 
	//que es un lenguaje orientado a objetos que permite relizar consultas a 
	//bases de datos relacionales.

////////////////////////////////////////////////////////////////////////////
//	Crear mis propias consultas: 
	@Query("SELECT p FROM Producto p WHERE p.nombre=?1")
	//El uno te dice que empieza desde el primer valor
	
	//La forma resuelta de la Query en Java viene abajo, es lo que dice Optional:
	
	//Metodo que realiza la consulta personalizada definida anteriormente. 
	//Retorna un Optional que puede contener un objeto Producto si se encuentra 
	//en la base con el nombre especificado, o un Optional vacio si no existe.
	Optional<Producto> findByNombre(String nombre);
////////////////////////////////////////////////////////////////////////////
}
