/**
 * 
 */
package io.pello.console.retrofitsample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
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
	@GET("/2dam-project-multisite/web/app_dev.php/admin/api/item")
    Call<List<Item>> items ();
	
	@Headers("Accept: application/json")
	@GET("/2dam-project-multisite/web/app_dev.php/admin/api/item/detail/{id}")
    Call<Item> item (
        @Path("id") Long id);
	
	@Headers("Accept: application/json")
	@POST("/2dam-project-multisite/web/app_dev.php/admin/api/item/create")
    Call<Void> create (@Body ItemPost item);
	
	@PUT("/2dam-project-multisite/web/app_dev.php/admin/api/item/update")
    Call<String> update (Item item);
	
	@DELETE("/admin/api/item/delete/{id}")
    Call<String> delete (
        @Path("id") Long id);
}
