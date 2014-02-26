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
		render(view:"createEditBlogEntry")
	}
	
	def saveBlogEntry(){
		
		def entry 
		if (params.id){
			entry = BlogEntry.findById(params.id)
			entry.properties = params
		}
		else{
			entry = new BlogEntry(params)
			entry.author = "rafa"
			entry.dateCreated = new Date()
		}
		
		if (!entry.save()) {
			entry.errors.each {
				println it
			}
		}
		redirect(action:"list")
	}
	
	def entryManager(){
		
		def entries
		def totalEntries
		
		entries = BlogEntry.findAll([max:10, cache:true, offset:params.offset, order:"desc", sort:"dateCreated"])
		totalEntries = BlogEntry.count()
		println entries
		println totalEntries
		[entries:entries, totalEntries:totalEntries]
	}
	
	def edit(Integer id){
		
		def entry = BlogEntry.findById(id)
		render(view:"createEditBlogEntry", model:[entry:entry])
	}
}
