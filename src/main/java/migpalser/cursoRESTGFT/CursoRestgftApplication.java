package migpalser.cursoRESTGFT;

import javax.annotation.Generated;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CursoRestgftApplication {

	@Generated(value="org.springframework.boot")
	public static void main(String[] args) {
		SpringApplication.run(CursoRestgftApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "Guorl") String name) {
		return String.format("Jelou %s!", name);
	}
	
	@GetMapping("/")
	public String root() {
		return "Bienvenido a este proyecto de prueba";
	}
	
	@GetMapping("/hellobean")
	public HelloBean afayaivos() {
		return new HelloBean("afayaivos!!");
	}
	
	@GetMapping("/hellobeanRE")
	public ResponseEntity<HelloBean> afayaivosRE() {
		HttpHeaders jed=new HttpHeaders();
		jed.add("Content-language", "ast");
		return new ResponseEntity<HelloBean>(new HelloBean("afayaivos!!"), jed, HttpStatus.OK);
	}
	
}
