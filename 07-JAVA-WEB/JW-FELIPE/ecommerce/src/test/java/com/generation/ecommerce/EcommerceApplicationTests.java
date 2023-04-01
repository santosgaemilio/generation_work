package com.generation.ecommerce;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.generation.ecommerce.model.*;


@SpringBootTest
@AutoConfigureMockMvc
class EcommerceApplicationTests {
	
	@Autowired
	private MockMvc mvc;
	
	
	@Test
	public void pruebaGet() throws Exception {
		this.mvc.perform(get("/miOtzo/productos/"))
						.andDo(print())
						.andExpect(status().isOk())
						.andExpect(content().string(
								containsString("cocaCola.jpg")
								));
	}//pruebaGet
	
	@Test
	@Disabled("Desabilitado por que ya lo probé")
	public void pruebaDelete() throws Exception{
		this.mvc.perform(delete("/miOtzo/productos/3"))
						.andDo(print())
						.andExpect(status().isOk());
	}//pruebaDelete
	
	@Test
	@Disabled("Se quita por que ya puse esta madre")
	public void pruebaPOST() throws Exception {
		Producto p = new Producto();
		p.setNombre("Pepe pipi");
		p.setDescripcion("pepe pe pipio psps psps");
		p.setPrecio(123.34d);
		p.setURL_Imagen("gato.png");
		
		this.mvc.perform(post("/miOtzo/productos/")
						.contentType(MediaType.APPLICATION_JSON)
						.content(asJsonString(p)))
						.andDo(print())
						.andExpect(status().isOk());
	}
	
	
	private static String asJsonString(final Object obj) {
        try {
          return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
          throw new RuntimeException(e);
        }//catch
     } // asJsonString
	
	@Test
	public void pruebaPut() throws Exception {
		this.mvc.perform(put("/miOtzo/productos/5")
						.queryParam("URL_Imagen", "gatetes.jpg"))
						.andDo(print())
						.andExpect(status().isOk());
	}//pruebaGet

}
