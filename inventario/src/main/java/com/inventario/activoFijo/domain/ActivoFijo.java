package com.inventario.activoFijo.domain;


import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ActivoFijo {
	private Long id;
	private String codigo;
	private String descripcion;
	private String tipo;
	private String serial;
	private String num_int_inv;
	private Double peso;
	private Double alto;
	private Double ancho;
	private Double largo;
	private Double valor_compra;
	private Date fecha_compra;
	private Date fecha_baja;
	private String estado_actual;

	/*** Constructor Por Defecto ***/
	public ActivoFijo() {
	}

	/*** Sobre carga de Constructor ***/
	public ActivoFijo(Long id, String codigo, String descripcion, String tipo,
			String serial, String num_int_inv, Double peso, Double alto,
			Double ancho, Double largo, Double valor_compra,
			Date fecha_compra, Date fecha_baja, String estado_actual) {
		this.id = id;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.serial = serial;
		this.num_int_inv = num_int_inv;
		this.peso = peso;
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
		this.valor_compra = valor_compra;
		this.fecha_compra = fecha_compra;
		this.fecha_baja = fecha_baja;
		this.estado_actual = estado_actual;
	}



	/************** METODOS SET ****************/

	public void setId(Long id) {
		this.id = id;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public void setNum_int_inv(String num_int_inv) {
		this.num_int_inv = num_int_inv;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public void setAlto(Double alto) {
		this.alto = alto;
	}

	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}

	public void setLargo(Double largo) {
		this.largo = largo;
	}

	public void setValor_compra(Double valor_compra) {
		this.valor_compra = valor_compra;
	}

	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}

	public void setFecha_baja(Date fecha_baja) {
		this.fecha_baja = fecha_baja;
	}

	public void setEstado_actual(String estado_actual) {
		this.estado_actual = estado_actual;
	}

	/************** METODOS GET **************/

	public Long getId() {
		return id;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public String getSerial() {
		return serial;
	}

	public String getNum_int_inv() {
		return num_int_inv;
	}

	public Double getPeso() {
		return peso;
	}

	public Double getAlto() {
		return alto;
	}

	public Double getAncho() {
		return ancho;
	}

	public Double getLargo() {
		return largo;
	}

	public Double getValor_compra() {
		return valor_compra;
	}
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getFecha_compra() {
		return fecha_compra;
	}
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getFecha_baja() {
		return fecha_baja;
	}

	public String getEstado_actual() {
		return estado_actual;
	}


}