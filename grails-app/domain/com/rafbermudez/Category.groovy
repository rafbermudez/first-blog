package com.rafbermudez

class Category {

	Integer id
	String name

	static belongsTo = BlogEntry
	static hasMany = [entries:BlogEntry]

	static constraints = { name blank:false }

	static mapping = {
		hasMany joinTable: [name: 'BlogEntryCategory']
	}
}
