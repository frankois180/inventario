package com.inventario.activoFijo.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventario.activoFijo.domain.Usuario;
import com.inventario.activoFijo.mapper.UsuarioMapper;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioMapper usuarioMapper;
	
	public List<Usuario> listar(Map<String, Object> parametros){
		return usuarioMapper.listar(parametros);
	}
	
}
