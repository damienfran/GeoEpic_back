package dev.bitByte.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dev.bitByte.entities.Client;
import dev.bitByte.entities.Item;
import dev.bitByte.entities.Location;
import dev.bitByte.services.GeoEpicServices;

@Component
@Controller
public class GeoEpicController {

	@Autowired
	GeoEpicServices ges;
	
	//SUCCESSFUL
//	public Client login(String username, String password);
	@CrossOrigin(origins = {"http://localhost:4200"})
	@ResponseBody	//Spring will automatically turn objects onto JSONS
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Client login(@RequestBody Client client) {
		return ges.login(client.getUsername(), client.getPassword());
	}
	
	
	//SUCCESSFUL 
	//	public Client createClient(String username, String password); // only to create clients, not managers
	@CrossOrigin(origins = {"http://localhost:4200"})
	@ResponseBody	//Spring will automatically turn objects onto JSONS
	@RequestMapping(value = "/createClient", method = RequestMethod.POST)
//	public Client createClient (@RequestParam("username") String username, @RequestParam("password") String password) {
	public Client createClient (@RequestBody Client client) {
		return ges.createClient(client.getUsername(), client.getPassword());
	}
	
	//SUCCESSFULL 
//	public List<Client> getAllClients();
	@CrossOrigin(origins = {"http://localhost:4200"})
	@ResponseBody	//Spring will automatically turn objects onto JSONS
	@RequestMapping(value = "/getAllClients",method = RequestMethod.GET)
	public List<Client> getAllClients(){
		return ges.getAllClients();
	}
	

	//SUCCESSFULL 
//	public Item createItem(Item item);
	@CrossOrigin(origins = {"http://localhost:4200"})
	@ResponseBody	//Spring will automatically turn objects onto JSONS
	@RequestMapping(value = "/createItem", method = RequestMethod.POST)
	public Item createItem(@RequestBody Item item) {
		return ges.createItem(item);
	}
	
	
	//SUCCESSFUL 
	//	public Item getItemById(int id);
	@CrossOrigin(origins = {"http://localhost:4200"})
	@ResponseBody	//Spring will automatically turn objects onto JSONS
	@RequestMapping(value = "/getItemById", method = RequestMethod.POST)
	public Item getItemById(@RequestBody Item item) {
		return ges.getItemById(item.getiId());
	}	
	
	//SUCCESSFUL 
//	public List<Item> getItemsForLocation(int location);
	@CrossOrigin(origins = {"http://localhost:4200"})
	@ResponseBody	//Spring will automatically turn objects onto JSONS
	@RequestMapping(value = "/getItemsForLocation", method = RequestMethod.POST)
	public List<Item> getItemsForLocation(@RequestBody Location location) {
		return ges.getItemsForLocation(location.getlId());
	}
	
	//SUCCESSFUL 
//	public List<Item> getItemsForClient(Client client);
	@CrossOrigin(origins = {"http://localhost:4200"})
	@ResponseBody	//Spring will automatically turn objects onto JSONS
	@RequestMapping(value = "/getItemsForClient", method = RequestMethod.POST)
	public List<Item> getItemsForClient(@RequestBody Client client) {
		return ges.getItemsForClient(client);
	}
	
	
	//SUCCESSFUL 
	//	public Item updateItem(Item item); // can be used for Item swap
	@CrossOrigin(origins = {"http://localhost:4200"})
	@ResponseBody	//Spring will automatically turn objects onto JSONS
	@RequestMapping(value = "/updateItem", method = RequestMethod.POST)
	public Item updateItem(@RequestBody Item item) {
		return ges.updateItem(item);
	}
	
	//SUCCESSFUL 
	//	public List<Item> getAllItems();
	@CrossOrigin(origins = {"http://localhost:4200"})
	@ResponseBody	//Spring will automatically turn objects onto JSONS
	@RequestMapping(value = "/getAllItems",method = RequestMethod.GET)
	public List<Item> getAllItems(){
		return ges.getAllItems();
	}
	
	//SUCCESSFUL 
//	public Item deleteItem(Item item);
	@CrossOrigin(origins = {"http://localhost:4200"})
	@ResponseBody	//Spring will automatically turn objects onto JSONS
	@RequestMapping(value = "/deleteItem", method = RequestMethod.POST)
	public Item deleteItem(@RequestBody Item item) {
		return ges.deleteItem(item);
	}
	
	//SUCCESSFUL 
//	public Location createLocation(Location location);
	@CrossOrigin(origins = {"http://localhost:4200"})
	@ResponseBody	//Spring will automatically turn objects onto JSONS
	@RequestMapping(value = "/createLocation", method = RequestMethod.POST)
	public Location createLocation(@RequestBody Location location) {
		return ges.createLocation(location);
	}
	

	//SUCCESSFUL 
	//	public String getLocationById(int id);
	@CrossOrigin(origins = {"http://localhost:4200"})
	@ResponseBody	//Spring will automatically turn objects onto JSONS
	@RequestMapping(value = "/getLocationById", method = RequestMethod.POST)
	public Location getLocationById(@RequestBody Location location) {
		return ges.getLocationById(location.getlId());
	}
	
	
	//SUCCESSFUL
	//	public Location updateLocation(Location location); // can use for changing the clue, and for moving the location
	@CrossOrigin(origins = {"http://localhost:4200"})
	@ResponseBody	//Spring will automatically turn objects onto JSONS
	@RequestMapping(value = "/updateLocation", method = RequestMethod.POST)
	public Location updateLocation(@RequestBody Location location) {
		return ges.updateLocation(location);
	}
	
	//SUCCESSFUL
	@CrossOrigin(origins = {"http://localhost:4200"})
	@ResponseBody	//Spring will automatically turn objects onto JSONS
	@RequestMapping(value = "/getAllLocations", method = RequestMethod.GET)
	public List<Location> getAllLocations() {
		return ges.getAllLocations();
	}
	
	//
	@CrossOrigin(origins = {"http://localhost:4200"})
	@ResponseBody	//Spring will automatically turn objects onto JSONS
	@RequestMapping(value = "/getClientById", method = RequestMethod.POST)
	public Client getClientById(@RequestBody Client client) {
		return ges.getClientById(client.getcId());
	}
	
	
	
}
