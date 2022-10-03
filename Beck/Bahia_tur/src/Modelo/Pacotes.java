package Modelo;

import java.math.BigDecimal;

public class Pacotes {
  private int id_pacotes;
  private String servisos;
  private BigDecimal precos;
  
  public Pacotes() {
	  
  }

public Pacotes(int id_pacotes, String servisos, BigDecimal precos) {
	super();
	this.id_pacotes = id_pacotes;
	this.servisos = servisos;
	this.precos = precos;
}

public int getId_pacotes() {
	return id_pacotes;
}

public void setId_pacotes(int id_pacotes) {
	this.id_pacotes = id_pacotes;
}

public String getServisos() {
	return servisos;
}

public void setServisos(String servisos) {
	this.servisos = servisos;
}

public BigDecimal getPrecos() {
	return precos;
}

public void setPrecos(BigDecimal precos) {
	this.precos = precos;
}

public void setDestinos(String string) {
	
	
}

public void setQuantidade(boolean boolean1) {
	
	
}

public boolean getQuantidade() {
	
	return false;
}

public String getDestinos() {
	
	return null;
}
	  
}
