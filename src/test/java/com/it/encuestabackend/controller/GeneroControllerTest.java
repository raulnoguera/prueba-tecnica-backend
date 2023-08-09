package com.it.encuestabackend.controller;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.it.encuestabackend.service.GeneroService;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GeneroController.class)
class GeneroControllerTest {
	@Autowired
    private MockMvc mockMvc;
	@Mock
    private GeneroService generoService;

    @InjectMocks
    private GeneroController generoController;
	@Test
    public void testVerificarEmailExistente() throws Exception {
        when(generoService.verificarEmailExistente("test@example.com")).thenReturn(true);

        mockMvc.perform(MockMvcRequestBuilders.get("/verificaremail")
                .param("email", "test@example.com"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$").value(true));
    }
	@Test
    public void testContarUsuariosPorName() throws Exception {
        when(generoService.countByGenero("Rock")).thenReturn(3L);

        mockMvc.perform(MockMvcRequestBuilders.get("/contar-por-genero")
                .param("genero", "Rock"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("3"));
    }


	@Test
	public void testObtenerConteoGeneros() throws Exception {
		mockMvc.perform(get("/conteo"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.length()").value(3));
	}

}
