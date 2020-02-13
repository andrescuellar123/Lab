package model;

import java.util.ArrayList;

public class Employee {
private ArrayList <Client> clients;

/**
 * @param clients
 * @param pass
 */
public Employee() {
	clients=new ArrayList<Client>();
	
}
/**
 * @return the clients
 */
public ArrayList<Client> getClients() {
	return clients;
}
/**
 * @param clients the clients to set
 */
public void setClients(ArrayList<Client> clients) {
	this.clients = clients;
}



public void addClient(int id, String typeId, String name, String lastName, int telephone, String address ) throws AlreadyExcistException{
	clients.add(new Client (id,typeId, name , lastName , telephone , address));
}

public String searchClient( int id1)throws IndexOutOfBoundsException, NullPointerException{
	boolean found = false;
	String msg = "";
	try {
		for (int i = 0; i < clients.size() || !found; i++) {
			if(clients.get(i).getId() == id1) {
				found = true;
				msg="the client is found : " + clients.get(i).getName() + " " + clients.get(i).getLastName() + "with the phone number: " + clients.get(i).getTelephone() ;
			}
		
		}
		
	}
	catch(IndexOutOfBoundsException e) {
		msg="Not found";
		
		
	}
	catch(NullPointerException e) {
		msg="None found";
	}
	return msg;
	}
		



}
