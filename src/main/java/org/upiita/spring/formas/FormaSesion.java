package org.upiita.spring.formas;

import java.io.Serializable;



//@Scope("session")
public class FormaSesion implements Serializable {
	
	private Integer itemsComprados = 0;
	
	public Integer getItemsComprados() {
		return itemsComprados;
	}
	
	public void setItemsComprados(Integer itemsComprados) {
		this.itemsComprados = itemsComprados;
	}

}
