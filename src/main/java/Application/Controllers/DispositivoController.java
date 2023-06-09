package Application.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Application.Entities.Dispositivo;
import Application.Payloads.DispositivoPayload;
import Application.Services.DispositivoService;

@RestController
@RequestMapping("/dispositivi")
public class DispositivoController {

	@Autowired
	DispositivoService ds;

	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Dispositivo createDispositivo(@RequestBody DispositivoPayload dp) {
		return ds.createDispositivo(dp);
	}
}
