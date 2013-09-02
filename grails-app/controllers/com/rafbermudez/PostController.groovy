package com.rafbermudez

class PostController {

	def show(Integer year, Integer month, String title) {

		render(view:"${title}")
	}
}
