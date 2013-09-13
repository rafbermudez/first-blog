package com.rafbermudez

class PostController {

	def show(Integer year, Integer month, String title) {

		render(view:"${title}")
	}
	
	def list() {
		
		def entries
		def totalEntries
		
		entries = BlogEntry.findAllByPublished(true,[max:5, cache:true, offset:params.offset, order:"desc", sort:"dateCreated"])
		totalEntries = BlogEntry.countByPublished(true, [cache:true])
		
		[entries:entries, totalEntries:totalEntries]
	}
}
