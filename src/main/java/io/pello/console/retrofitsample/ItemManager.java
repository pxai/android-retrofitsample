/**
 * 
 */
package io.pello.console.retrofitsample;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author PELLO_ALTADILL
 * Manages interaction between user and api calls
 */
public class ItemManager {

	private ItemApiClient itemApiClient; 
	
	/**
	 * constructor, inits itemApiClient
	 */
	public ItemManager () {
		Retrofit retrofit = new Retrofit.Builder()
			    .baseUrl("http://bizgen.co/")
			    .addConverterFactory(GsonConverterFactory.create())
			    .build();	
	
		itemApiClient = retrofit.create(ItemApiClient.class);
	}
	
	/**
	 * uses retrofit API client to get items
	 */
	public List<Item> getItems() {
		Call<List<Item>> itemsApiCall = itemApiClient.items();
		List<Item> items = null;
		
		try {
			 items = itemsApiCall.execute().body();
		} catch (IOException e) {
			System.err.println("Error calling items API");
		} 
		
		return items;
	}
	
	

	/**
	 * uses retrofit API client to get one item by id
	 * @param id
	 * @return
	 */
	public Item getItem(Long id) {
		Call<Item> itemApiCall = itemApiClient.item(id);
		Item item = null;
		
		try {
			 item = itemApiCall.execute().body();
		} catch (IOException e) {
			System.err.println("Error calling item API");
		} 
		
		return item;
	}


}
