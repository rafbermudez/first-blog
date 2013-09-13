package com.rafbermudez

class BlogEntry {

	String author
	String title
	String body
	Boolean published = false
	
	//automatic time stamps
	Date dateCreated
	Date lastUpdated


	static constraints = {
		title blank:false
		body blank:false
	}

	static mapping = {
		body type:"text"
		cache true
	}
}
