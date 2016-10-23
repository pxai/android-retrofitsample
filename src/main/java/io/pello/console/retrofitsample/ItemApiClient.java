/**
 * 
 */
package io.pello.console.retrofitsample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * @author PELLO_ALTADILL
 *
 */
public interface ItemApiClient {
	
	@GET("/web/admin/api/item")
    Call<List<Item>> items ();
	
	@GET("/web/admin/api/item/detail/{id}")
    Call<Item> item (
        @Path("id") Long id);
}
