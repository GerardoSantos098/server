package gera.actividad;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentoController {
	
	DocumentoService documentoService = new DocumentoService();
	
	@GetMapping
	@RequestMapping("/consulta")
    public Documento buscarPalabra(@RequestParam(value = "palabra") String name) {
		
        return documentoService.buscarPalabra(name);
    }

}
