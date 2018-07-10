package com.inventario.activoFijo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventario.activoFijo.domain.ActivoFijo;
import com.inventario.activoFijo.mapper.ActivoFijoMapper;

@Service
public class ActivoFijoService {

	@Autowired
	private ActivoFijoMapper activoFijoMapper;

	public List<ActivoFijo> listar(Map<String, Object> parametros) {
		return activoFijoMapper.listar(parametros);
	}

	public ActivoFijo consultar(ActivoFijo activoFijo) {
		try {
			activoFijo = activoFijoMapper.consultar(activoFijo);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return activoFijo;
	}

	public ActivoFijo registrar(ActivoFijo activoFijo) {
		try {
			activoFijoMapper.registrar(activoFijo);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

		return activoFijo;
	}

	public Integer actualizar(ActivoFijo activoFijo) {
		return activoFijoMapper.actualizar(activoFijo);
	}

	public void eliminar(Long id) {
		 activoFijoMapper.eliminar(id);

	}

}
