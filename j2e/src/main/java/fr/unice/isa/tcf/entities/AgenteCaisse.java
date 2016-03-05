/**
 * 
 */
package fr.unice.isa.tcf.entities;

/**
 * @author islamefelipefernandes
 *
 */
public class AgenteCaisse {
	private String name;
	private String id;
	private String telefone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public AgenteCaisse(String name, String id, String telefone) {
		super();
		this.name = name;
		this.id = id;
		this.telefone = telefone;
	}
	
	
}
