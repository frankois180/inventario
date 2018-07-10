package com.inventario.activoFijo.mapper;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.inventario.activoFijo.domain.ActivoFijo;

@Mapper
public interface ActivoFijoMapper {
	
	void registrar(ActivoFijo activoFijo);

	public List<ActivoFijo> listar(Map<String, Object> parametros);

	public ActivoFijo consultar(ActivoFijo activoFijo);
	
	public Integer actualizar(ActivoFijo activoFijo);

	public Integer eliminar(Long id);

}
