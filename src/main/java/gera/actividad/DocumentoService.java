package gera.actividad;

import java.util.ArrayList;
import java.util.List;

public class DocumentoService {

	public Documento buscarPalabra(String palabra) {
		Documento documento = new Documento();
		documento.setPalabra(palabra);
		
		List<String> rutas = new ArrayList<>();
		
		int numero1 = (int) (Math.random() * 10);
		
        for(int i = 1; i<numero1; i++){
            int numero2 =(int) (Math.random() * 9 + 1);
            int numero3 =(int) (Math.random() * 9 + 1);
            int numero4 =(int) (Math.random() * 5 + 1);
            rutas.add("C:/Files/Consolidados/"+numero4+numero3+numero2+".txt");
        }
        
		documento.setRutas(rutas);
		return documento;
	}
}
