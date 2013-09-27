package com.rafbermudez

class BlogEntry {

	String author
	String title
	String urlTitle
	String body
	String hashTags //comma separated twitter button hashtags
	Boolean published = false
	
	//automatic time stamps
	Date dateCreated
	Date lastUpdated


	static constraints = {
		title blank:false
		urlTitle blank:false
		body blank:false
		hashTags nullable:true
	}

	static mapping = {
		body type:"text"
		cache true
	}
}
