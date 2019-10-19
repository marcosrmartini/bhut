package br.com.bhut.desafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bhut.desafio.model.Log;
import br.com.bhut.desafio.payload.CarPayload;
import br.com.bhut.desafio.service.CarService;

@RestController
@RequestMapping("/api")
public class CarController {

	@Autowired
	private CarService service;
	
	@GetMapping("/listCars")
	public List<CarPayload> litagem(){
		return service.listagem();
	}
	
	@PostMapping("/createCar")
	public CarPayload salvar(@RequestBody CarPayload car) {
		return service.salvar(car);
	}
	
	@GetMapping("/log")
	public List<Log> log(){
		return service.log();
	}
	
}
