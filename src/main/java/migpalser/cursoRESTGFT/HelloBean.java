package migpalser.cursoRESTGFT;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HelloBean {

	String message;

	public HelloBean(String string) {
		this.message=string;
	}
	
	public HelloBean() {
		this.message="";
	}

	@JsonProperty("MensajeToGuapo")
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
