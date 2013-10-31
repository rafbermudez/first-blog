class UrlMappings {

	static mappings = {
		
		"/post/$year/$month/$urlTitle"(controller:'post', action:'show')
		
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(controller:"post",action:"list")
		"500"(view:'/error')
	}
}
