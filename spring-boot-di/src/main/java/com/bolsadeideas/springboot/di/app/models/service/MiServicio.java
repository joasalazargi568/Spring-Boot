package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Service("miServicioSimple")
//@Primary
public class MiServicio implements IServicio{
	
	@Override
	public String operacion() {
		return "Ejecutando algún proceso importante simple....";
	}

}
