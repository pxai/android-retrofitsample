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
	private String url;

	private ItemApiClient itemApiClient; 
	
	/**
	 * constructor, inits itemApiClient
	 */
	public ItemManager (String url) {
		this.url = url;
		Retrofit retrofit = new Retrofit.Builder()
			    .baseUrl(this.url)
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

	/**
	 * uses retrofit API client to create a new item
	 * @param item
	 * @return
	 */
	public String createItem(Item item) {
		Call<String> itemApiCall = itemApiClient.create(item);
		String result = "";
		
		try {
			result = itemApiCall.execute().body();
		} catch (IOException e) {
			System.err.println("Error calling item API");
		} 
		
		return result;
	}

	/**
	 * uses retrofit API client to update an item
	 * @param item
	 * @return
	 */
	public String updateItem(Item item) {
		Call<String> itemApiCall = itemApiClient.update(item);
		String result = "";
		
		try {
			result = itemApiCall.execute().body();
		} catch (IOException e) {
			System.err.println("Error calling item API");
		} 
		
		return result;
	}
	
	/**
	 * uses retrofit API client to delete item by id
	 * @param id
	 * @return
	 */
	public String deleteItem(Long id) {
		Call<String> itemApiCall = itemApiClient.delete(id);
		String result = null;
		
		try {
			result = itemApiCall.execute().body();
		} catch (IOException e) {
			System.err.println("Error calling item API");
		} 
		
		return result;
	}
}
