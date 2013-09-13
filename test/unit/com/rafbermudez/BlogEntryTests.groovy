package com.rafbermudez



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(BlogEntry)
class BlogEntryTests {

	def entry

	@Before
	void setUp() {
		mockDomain(BlogEntry)
		entry = new BlogEntry()
	}

	void testShouldNotSaveEmptyEntry() {

		def result = entry.save()
		assertNull result
		assertNotNull entry.errors
	}

	void testShouldValidateFieldsTitleAndBody(){
		assertFalse entry.validate()
		assertNotNull entry.errors["title"]
		assertNotNull entry.errors["body"]
	}

	void testSaveCorrectEntry(){
		entry.author = "anonymous"
		entry.title = "Lorem ipsum dolor sit amet"
		entry.body = """Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
Proin congue dignissim elit, ut viverra elit blandit vel. Sed rhoncus ut metus a vestibulum. 
Duis sit amet urna iaculis, condimentum felis id, condimentum risus. 
Nulla dignissim scelerisque egestas. Sed faucibus eu eros at commodo. 
Praesent a lectus nisi. Curabitur ac neque sed augue aliquam scelerisque. 
Sed vel semper dolor, et gravida mauris. Sed porta mi at blandit pretium. 
Etiam ultrices nulla id mauris vestibulum molestie. """
		def result = entry.save()
		assertNotNull result
		
		def entryDB = BlogEntry.findByTitle("Lorem ipsum dolor sit amet")
		assertNotNull entryDB
		assertEquals entry,entryDB
	}
}
