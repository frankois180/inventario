package com.inventario.activoFijo.mapper;



import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.inventario.activoFijo.domain.Usuario;


@Mapper
public interface UsuarioMapper {
	public List<Usuario> listar(Map<String, Object> parametros);
}
