package model.data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Espectaculo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idEspectaculo;
	private String titulo;
	private String descripcion;
	private ArrayList<String> categorias;
	private int localidadesDisponibles;
	private String tipoEspectaculo;
	private ArrayList<Long> funciones;
	
	
	
	
	public Espectaculo(Long idEspectaculo, String titulo, String descripcion, ArrayList<String> categorias,
			int localidadesDisponibles, String tipoEspectaculo) {
		super();
		this.idEspectaculo = idEspectaculo;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.categorias = categorias;
		this.localidadesDisponibles = localidadesDisponibles;
		this.tipoEspectaculo = tipoEspectaculo;
	}
	public Long getIdEspectaculo() {
		return idEspectaculo;
	}
	public void setIdEspectaculo(Long idEspectaculo) {
		this.idEspectaculo = idEspectaculo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public ArrayList<String> getCategorias() {
		return categorias;
	}
	public void setCategorias(ArrayList<String> categorias) {
		this.categorias = categorias;
	}
	public int getLocalidadesDisponibles() {
		return localidadesDisponibles;
	}
	public void setLocalidadesDisponibles(int localidadesRestantes) {
		this.localidadesDisponibles = localidadesRestantes;
	}
	public String getTipoEspectaculo() {
		return tipoEspectaculo;
	}
	public void setTipoEspectaculo(String tipoEspectaculo) {
		this.tipoEspectaculo = tipoEspectaculo;
	}
	public ArrayList<Long> getFunciones() {
		return funciones;
	}
	public void setFunciones(ArrayList<Long> funciones) {
		this.funciones = funciones;
	}
	
	public void addFuncion(Long nuevaFuncion) {
		funciones.add(nuevaFuncion);

	}
	
}
