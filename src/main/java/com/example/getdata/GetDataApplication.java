package com.example.getdata;

import com.example.getdata.controller.FetchData;
import com.example.getdata.model.Marks;
import com.example.getdata.repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class GetDataApplication implements CommandLineRunner {
@Autowired
	MarksRepository marksRepository;
	public static void main(String[] args) {
		SpringApplication.run(GetDataApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		Marks marks=new Marks("123",90,80,70,50);
		marksRepository.save(marks);

		System.out.println("***********");

		List<Marks> marksL=marksRepository.findAll();
		FetchData fetchData =new FetchData();
		for(Marks m: marksL){
			System.out.println(fetchData.toString());
			System.out.println(m.toString());
		}
	}
}
