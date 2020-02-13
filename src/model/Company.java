package model;

import java.util.ArrayList;

public class Company {

	private ArrayList<Client>clients;
	
	
	
	
	/**
	 * @param clients
	 */
	public Company() {
		
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

	public String searchClient( int id1) {
		boolean found = false;
		String msg = "";
		for (int i = 0; i < clients.size() || !found; i++) {
			if(clients.get(i).getId() == id1) {
				found = true;
				msg="the client is found : " + clients.get(i).getName() + " " + clients.get(i).getLastName() + "with the phone number: " + clients.get(i).getTelephone() ;
			}
			else {
				msg ="Not found";
			}
		}
		return msg;
	}	


}
