package com.project.dao;

import java.util.List;


public class User {
    private Integer id;
    private String name;
    private List<String> books;
    User(){
    	System.out.println("user");
    }
    
	/**
	 * @return the books
	 */
	public List<String> getBooks() {
		return books;
	}
	/**
	 * @param pBooks the books to set
	 */
	public void setBooks(List<String> pBooks) {
		books = pBooks;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param pId the id to set
	 */
	public void setId(Integer pId) {
		id = pId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param pName the name to set
	 */
	public void setName(String pName) {
		name = pName;
	}
    
    public class InnerUser{
    	private Integer innerId;

		public Integer getInnerId() {
			return innerId;
		}

		public void setInnerId(Integer pInnerId) {
			innerId = pInnerId;
		}
    	
    }
}
