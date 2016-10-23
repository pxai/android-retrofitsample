/**
 * 
 */
package io.pello.console.retrofitsample;

/**
 * @author PELLO_ALTADILL
 * Simple POJO representing an item
 */
public class Item {
	private Long id;
	private String name;
	private String description;
	private Integer status;
	
	public Item() {
	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param status
	 */
	public Item(Long id, String name, String description, Integer status) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.status = status;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", description=" + description + ", status=" + status + "]";
	}
	
	
	
}
