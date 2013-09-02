class UrlMappings {

	static mappings = {
		
		"/post/$year/$month/$title"(controller:'post', action:'show')
		
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
