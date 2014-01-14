package com.rafbermudez

class BlogEntry {

	Integer id
	String author
	String title
	String urlTitle
	String body
	String hashTags //comma separated twitter button hashtags
	Boolean published = false
	
	//automatic time stamps
	Date dateCreated 
	//Date lastUpdated // disable autoTimestamp temporarily
	
	static transients = ["year","month"]
	
	static hasMany = [categorys:Category]


	static constraints = {
		title blank:false
		urlTitle blank:false
		body blank:false
		hashTags nullable:true
	}

	static mapping = {
		body type:"text"
		cache true
		autoTimestamp false // disable autoTimestamp temporarily
	}
	
	String getYear(){
		return (this.dateCreated.year+1900).toString()
	}
	
	String getMonth(){
		def realMonth = this.dateCreated.month+1
		return (realMonth.toString().size().equals(1)?"0"+realMonth.toString():realMonth.toString())
	}
}
