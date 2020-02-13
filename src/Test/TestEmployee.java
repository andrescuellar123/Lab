package Test;
import model.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEmployee {
	
	private Employee e1;
	private Employee e2;
	private Client c1;
	
	public void setup1() throws AlreadyExcistException {
		int id = 1234;
		String typeId = "Cedula";
		String name = "Pepe";
		String lastName = "Perez";
		int telephone = 12345;
		String address = "calle 12";
		e1  = new Employee();
		e1.addClient(id, typeId, name, lastName, telephone, address);
		c1 = new Client(id, typeId, name, lastName, telephone, address);
		Client nu= null;
		e1.addClient(0, "", "", "", 0, "");
		
	}
	
	
	public void setup2() throws AlreadyExcistException {
		int id = 1234;
		String typeId = "Cedula";
		String name = "Pepe";
		String lastName = "Perez";
		int telephone = 12345;
		String address = "calle 12";
		e1  = new Employee();
		e1.addClient(id, typeId, name, lastName, telephone, address);
		e2= new Employee();
		
		
		
		
	}
	@Test
	public void testAddClient() throws AlreadyExcistException {
		setup1();
		assertTrue(e1.getClients().get(0).getId()==c1.getId());
		assertTrue(e1.getClients().get(1).getId()==0);
	}
	
	@Test
	public void testSearchClient() throws AlreadyExcistException,IndexOutOfBoundsException,NullPointerException {
		setup2();
		assertTrue(e1.searchClient( 1234).equals("the client is found : " + "Pepe"+" "+"Perez"+"with the phone number: "+12345));
		assertTrue(e1.searchClient(1111).equals("Not found"));
		assertTrue(e2.searchClient(1111).equals("None found"));
		
	} 
	

}
