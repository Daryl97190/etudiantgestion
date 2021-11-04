package com.m2i.etudiantgestion;

// import com.m2i.etudiantgestion.entity.Student;
import com.m2i.etudiantgestion.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EtudiantgestionApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EtudiantgestionApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

		// Student student1 = new Student("Daryl", "Livio", "daryl.livio@gmail.com");
		// Student student2 = new Student("Esther", "Livio", "zzz");
		// Student student3 = new Student("Dylan", "Livio", "aa");
		// studentRepository.save(student1);
		// studentRepository.save(student2);
		// studentRepository.save(student3);
	}

}
