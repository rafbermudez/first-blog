import com.rafbermudez.BlogEntry

class BootStrap {

    def init = { servletContext ->
		
		def b = new BlogEntry(author:"An�nimo",title:"desconocido",body:"cuerpaco")
		b.save()
		
		println b.title
		
    }
    def destroy = {
    }
}
