package com.rafbermudez

class PostController {

	def show(Integer year, Integer month, String urlTitle) {
		
		def dateInitMonth = new Date().parse("yyyy/MM/dd", "${year}/${month}/01")
		
		def nextMonth = (month+1).equals(13)? 1 : month+1
		def nextMonthYear = nextMonth.equals(1)? year+1 : year
		def dateInitNextMonth = new Date().parse("yyyy/MM/dd", "${nextMonthYear}/${nextMonth}/01")
		
		def entry = BlogEntry.findByUrlTitleAndDateCreatedGreaterThanEqualsAndDateCreatedLessThanEqualsAndPublished(urlTitle,
			dateInitMonth,dateInitNextMonth,true)

		render(view:"showPost", model:[entry:entry])
	}
	
	def list() {
		
		def entries
		def totalEntries
		
		entries = BlogEntry.findAllByPublished(true,[max:10, cache:true, offset:params.offset, order:"desc", sort:"dateCreated"])
		totalEntries = BlogEntry.countByPublished(true, [cache:true])
		println entries
		println totalEntries
		[entries:entries, totalEntries:totalEntries]
	}
	
	def create(){
		
	}
	
	def saveBlogEntry(){
		
		def entry = new BlogEntry(params)
		entry.author = "rafa"
		entry.dateCreated = new Date()
		if (!entry.save()) {
			entry.errors.each {
				println it
			}
		}
		redirect(action:"list")
	}
}
