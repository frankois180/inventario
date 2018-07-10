package com.inventario.activoFijo.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inventario.activoFijo.domain.Usuario;
import com.inventario.activoFijo.service.UsuarioService;

@Controller
@RestController
@CrossOrigin("*")
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	Logger logger = Logger.getLogger(getClass());
	@GetMapping("/listar")
	public List<Usuario> listar(@RequestParam Map<String, Object> parametros) {
		List<Usuario> lista = new LinkedList<Usuario>();
		try {
			lista = usuarioService.listar(parametros);
			logger.info("lista de datos ------->"+lista);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

}
