/**
 * 
 */
package io.pello.console.retrofitsample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * @author PELLO_ALTADILL
 *
 */
public interface ItemApiClient {
	
	@Headers("Accept: application/json")
	@GET("/web/admin/api/item")
    Call<List<Item>> items ();
	
	@Headers("Accept: application/json")
	@GET("/web/admin/api/item/detail/{id}")
    Call<Item> item (
        @Path("id") Long id);
	
	@POST("/web/admin/api/item/create/")
    Call<String> create (Item item);
	
	@PUT("/web/admin/api/item/update/")
    Call<String> update (Item item);
	
	@DELETE("/web/admin/api/item/delete/{id}")
    Call<String> delete (
        @Path("id") Long id);
}
