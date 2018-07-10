package com.inventario.activoFijo.controller;


import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import com.inventario.activoFijo.domain.ActivoFijo;
import com.inventario.activoFijo.service.ActivoFijoService;


@Controller
@RestController
@CrossOrigin("*")
@RequestMapping("/activoFijo")
public class ActivoFijoController {
	Logger logger = Logger.getLogger(getClass());
	@Autowired
	private ActivoFijoService activoFijoService;

	@PostMapping("/registrar")
	@Consumes(MediaType.APPLICATION_JSON)
	public ActivoFijo registrar(@RequestBody ActivoFijo activoFijo) {
		try {
			activoFijoService.registrar(activoFijo);
			return activoFijo;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}


	@GetMapping("/listar")
	public List<ActivoFijo> listar(@RequestParam Map<String, Object> parametros) {
		List<ActivoFijo> lista = new LinkedList<ActivoFijo>();
		try {
			lista = activoFijoService.listar(parametros);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	@GetMapping("/consultar")
	@Consumes(MediaType.APPLICATION_JSON)
	public ActivoFijo consultar(@RequestParam Long id) {
		ActivoFijo activoFijo = new ActivoFijo();
		try {
			activoFijo.setId(id);
			activoFijo = activoFijoService.consultar(activoFijo);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return activoFijo;
	}

	@CrossOrigin("*")
	@PutMapping("/actualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	public Integer actualizar(@RequestBody ActivoFijo activoFijo) {
		try {
			
			return activoFijoService.actualizar(activoFijo);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	@CrossOrigin("*")
	@DeleteMapping("/eliminar")
	public void eliminar(@RequestParam Long id) {
		logger.info("objeto a eliminar>>>>"+id);
		  activoFijoService.eliminar(id);
	}

}
