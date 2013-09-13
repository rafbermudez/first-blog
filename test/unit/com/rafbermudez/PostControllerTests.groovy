package com.rafbermudez



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(PostController)
@Mock(BlogEntry)

class PostControllerTests {
	
	def entry

	@Before	void setUp() {
		entry = new BlogEntry(
				published:true,
				title: "title",
				body: "body",
				author: "author")
		
		mockDomain(BlogEntry, [entry])
	}

	void testListAction()  {
		
		def model = controller.list()
		assertNotNull model.entries
		assertEquals 1, model.totalEntries
	}
}
