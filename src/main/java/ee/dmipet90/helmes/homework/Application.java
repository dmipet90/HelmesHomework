package ee.dmipet90.helmes.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import ee.dmipet90.helmes.homework.repository.SectorRepository;

@EnableCaching
@SpringBootApplication
public class Application {

	@Autowired
	SectorRepository sectorRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	/*
	@Bean
	InitializingBean sendDatabase() {
		return () -> {
			sectorRepository.save(new Sector("Manufacturing"));
			sectorRepository.save(new Sector("Construction materials"));
			sectorRepository.save(new Sector("Electronics and Optics"));
			sectorRepository.save(new Sector("Food and Beverage"));
			sectorRepository.save(new Sector("Bakery & confectionery products"));
			sectorRepository.save(new Sector("Beverages"));
			sectorRepository.save(new Sector("Fish & fish products"));
			sectorRepository.save(new Sector("Meat & meat products"));
			sectorRepository.save(new Sector("Milk & dairy products"));
			sectorRepository.save(new Sector("Other"));
			sectorRepository.save(new Sector("Sweets & snack food"));
			sectorRepository.save(new Sector("Furniture"));
			sectorRepository.save(new Sector("Bathroom/sauna"));
			sectorRepository.save(new Sector("Bedroom"));
			sectorRepository.save(new Sector("Children’s room"));
			sectorRepository.save(new Sector("Kitchen"));
			sectorRepository.save(new Sector("Living room"));
			sectorRepository.save(new Sector("Office"));
			sectorRepository.save(new Sector("Other (Furniture)"));
			sectorRepository.save(new Sector("Outdoor"));
			sectorRepository.save(new Sector("Project furniture"));
			sectorRepository.save(new Sector("Machinery"));
			sectorRepository.save(new Sector("Machinery components"));
			sectorRepository.save(new Sector("Machinery equipment/tools"));
			sectorRepository.save(new Sector("Manufacture of machinery "));
			sectorRepository.save(new Sector("Maritime"));
			sectorRepository.save(new Sector("Aluminium and steel workboats"));
			sectorRepository.save(new Sector("Boat/Yacht building"));
			sectorRepository.save(new Sector("Ship repair and conversion"));
			sectorRepository.save(new Sector("Other"));
			sectorRepository.save(new Sector("Repair and maintenance service"));
			sectorRepository.save(new Sector("Metalworking"));
			sectorRepository.save(new Sector("Construction of metal structures"));
			sectorRepository.save(new Sector("Houses and buildings"));
			sectorRepository.save(new Sector("Metal products"));
			sectorRepository.save(new Sector("Metal works"));
			sectorRepository.save(new Sector("CNC-machining"));
			sectorRepository.save(new Sector("Forgings, Fasteners"));
			sectorRepository.save(new Sector("Gas, Plasma, Laser cutting"));
			sectorRepository.save(new Sector("MIG, TIG, Aluminum welding"));
			sectorRepository.save(new Sector("Plastic and Rubber"));
			sectorRepository.save(new Sector("Packaging"));
			sectorRepository.save(new Sector("Plastic goods"));
			sectorRepository.save(new Sector("Plastic processing technology"));
			sectorRepository.save(new Sector("Blowing"));
			sectorRepository.save(new Sector("Plastics welding and processing"));
			sectorRepository.save(new Sector("Plastic profiles"));
			sectorRepository.save(new Sector("Printing"));
			sectorRepository.save(new Sector("Advertising"));
			sectorRepository.save(new Sector("Book/Periodicals "));
			sectorRepository.save(new Sector("Labelling and packaging printing"));
			sectorRepository.save(new Sector("Textile and Clothing"));
			sectorRepository.save(new Sector("Clothing"));
			sectorRepository.save(new Sector("Textile"));
			sectorRepository.save(new Sector("Wood"));
			sectorRepository.save(new Sector("Other (Wood)"));
			sectorRepository.save(new Sector("Wooden building materials"));
			sectorRepository.save(new Sector("Wooden houses"));
			sectorRepository.save(new Sector("Other"));
			sectorRepository.save(new Sector("Creative industries"));
			sectorRepository.save(new Sector("Energy technology"));
			sectorRepository.save(new Sector("Environment"));
			sectorRepository.save(new Sector("Service"));
			sectorRepository.save(new Sector("Business services"));
			sectorRepository.save(new Sector("Engineering"));
			sectorRepository.save(new Sector("Information Technology and Telecommunications"));
			sectorRepository.save(new Sector("Data processing, Web portals, E-marketing"));
			sectorRepository.save(new Sector("Programming, Consultancy"));
			sectorRepository.save(new Sector("Software, Hardware"));
			sectorRepository.save(new Sector("Telecommunications"));
			sectorRepository.save(new Sector("Tourism"));
			sectorRepository.save(new Sector("Translation services"));
			sectorRepository.save(new Sector("Transport and Logistics"));
			sectorRepository.save(new Sector("Air"));
			sectorRepository.save(new Sector("Rail"));
			sectorRepository.save(new Sector("Road"));
			sectorRepository.save(new Sector("Water"));	
		};
		*/
	}
