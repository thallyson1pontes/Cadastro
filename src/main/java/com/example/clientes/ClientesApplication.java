package com.example.clientes;

import com.example.clientes.model.entity.Cliente;
import com.example.clientes.repository.ClienteRepository;
import org.springframework.aop.TargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class ClientesApplication {

	@Autowired
	ClienteRepository repository;

	@Bean
	public CommandLineRunner run(){
		return  args -> {
		Cliente cliente = Cliente.builder()
					.cpf("12345678945")
					.nome("Fulano")
					.build();
			repository.save(cliente);
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}

}
