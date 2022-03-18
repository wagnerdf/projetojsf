package br.com.projetojsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.bean.ViewScoped;



@ViewScoped 
@ManagedBean(name = "pessoaBean")
public class PessoaBean {

	private String nome;
	
		
	private List<String> nomes = new ArrayList<String>();
	
	public String addNome() {
		nomes.add(nome);
		
		if(nomes.size() > 3) {
			commandButton.setDisabled(true);
			return "paginanavegada";
		}
		
		return ""; // null ou vazio fica na mesma página -> outcome
	}
	
	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		
private HtmlCommandButton commandButton;
	
	public void setCommandButton(HtmlCommandButton commandButton) {
		this.commandButton = commandButton;
	}
	
	public HtmlCommandButton getCommandButton() {
		return commandButton;
	}
	
	
}
