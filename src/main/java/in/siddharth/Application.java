package in.siddharth;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.siddharth.entity.Book;
import in.siddharth.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cntxt = SpringApplication.run(Application.class, args);

		BookRepository repo = cntxt.getBean(BookRepository.class);

		/*Book b = new Book();
		b.setBookId(101);
		b.setBookName("Spring");
		b.setBookPrice(300.00);
		
		repo.save(b);*/
		
		
		
		
		/*Book b = new Book();
		b.setBookId(102);
		b.setBookName("MicroServices");
		b.setBookPrice(650.00);
		
		Book b1 = new Book();
		b1.setBookId(103);
		b1.setBookName("AWS");
		b1.setBookPrice(900.00);
		
		Book b2 = new Book();
		b2.setBookId(104);
		b2.setBookName("DevOps");
		b2.setBookPrice(1200.00);
		
		repo.saveAll(Arrays.asList(b,b1,b2));*/
		
		
		
		
		/*Iterable<Book> data = repo.findAll();
		System.out.println(data);*/
		
		
		
		
		Optional<Book> data =repo.findById(101);
		System.out.println(data);
	}

}
