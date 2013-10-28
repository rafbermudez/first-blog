import com.rafbermudez.BlogEntry

class BootStrap {

	def init = { servletContext ->

		def b1 = new BlogEntry()
		b1.author = "rafa"
		b1.title = "Hello, world"
		b1.urlTitle = "hello-world"
		b1.body = """<section>
			<p>Como marca la tradición*, no habría mejor manera de titular
				este post. Evitaré presentarme, mis enlaces a las diferentes redes
				sociales lo harán mejor.</p>
		
			<h2>¿Qué me encontraré en este blog?</h2>
			<p>
				La temática principal será el <b>mundo IT y sus procesos</b>, la <b>programación</b>
				y la <b>Ingeniería del Software</b> (sí, con mayúsculas). Todo esto
				enfocado desde un punto de vista personal.
			</p>
		</section>
		<section>
			<h2>¿Por qué mi propio site?</h2>
			<p>"Los informáticos" muchas veces nos mostramos opacos, hasta
				entre nosotros. Compartir, aprender, trabajarse, mejorar... difícil
				época para héroes solitarios. Estamos en la era social, el trabajo
				cooperativo y multidisciplinar. No tiene sentido aislarse y perder
				las ventajas de este mundo hiperconectado.</p>
			<p>Hablar de equipo y crear una marca personal. Parece
				contradictorio...</p>
			<ul>
				<li>Potencia la conectividad y comunicación con los demás.</li>
				<li>Mejora las habilidades sociales, la empatía.</li>
				<li>Da visibilidad al trabajo y opiniones propias ,
					proporcionando feedback y aprendizaje mutuo y contínuo.</li>
				<li>Exponerse, es una buena forma de obligarse a mantener
					cierta calidad y mejorar día a día.</li>
				<li>...</li>
			</ul>
			<p>¿Sigues pensando que es contradictorio?</p>
		</section>

		<section>
			<h2>¿Por qué ahora?</h2>
			<p>
				Porque esperando el momento ideal, nunca llega. Y ya debía haber
				sido hace tiempo. <br /> ¡Basta ya!¡No más excusas! Un mashup de
				conocimientos técnicos y metodológicos y vamos con una salida digna.
			</p>
		</section>
		<section>
			<h4>Referencias</h4>
			<p>* "hello, world", claro ejemplo de programa funcional. 1ª
				aparición en "The C Programming Language", 1978.</p>
		</section>"""
		b1.save()
		
		def b2 = new BlogEntry()
		b2.author = "rafa"
		b2.title = "5 maneras de conocer mejor este blog"
		b2.urlTitle = "5-maneras-de-conocer-mejor-este-blog"
		b2.body = """<section>
			<h2>1. Esto no es wordpress...</h2>
			<p>Ni joomla...ni drupal. Me siento un privilegiado con los CMS.
				Tuve la suerte de trabajar varios meses full time con estos 3 y son
				muy buenos.</p>
			<p>Pero aquí intentaré dar un toque personal y diferente: no sólo
				un medio de comunicación, sino también un espacio para mis
				proyectos.</p>
		</section>
		<section>
			<h2>2. Un proyecto libre.</h2>
			<p>
				Cualquiera puede acceder libremente al código del proyecto, está
				localizado en <a href="https://github.com/rafbermudez/rafbermudez">mi
					repositorio de github</a>. Contiene las clásicas 2 ramas:
				develop(desarrollo) y master , la cuál se corresponde siempre con la
				desplegada en <a href="http://rafbermudez.com">rafbermudez.com</a>.
			</p>
			<p>Estoy abierto a sugerencias, colaboraciones, o iniciar algún
				proyecto conjunto en base a esta experiencia.</p>
		</section>
		<section>
			<h2>3. Iterativo e incremental.</h2>
			<p>Esta primera versión sólo hace énfasis en el frontend: html5,
				css3 y SEO.</p>
			<p>
				Utilicé el famoso <a href="http://html5boilerplate.com">html5boilerplate</a>
				. Existe mucha información sobre este template en la red, si te
				interesa aprender de código de calidad, revísalo a fondo.
			</p>
			<p>En este caso partí de una preconfiguración custom responsive,
				y aunque parezca trivial, hay más trabajo del que parece en
				adaptarlo a lo que quería.</p>
		</section>
		<section>
			<h2>4. Aquí, sysadmin</h2>
			<p>Con esta declaración de principios, el proyecto abarca la
				gestión y administración completa del VPS y la relación con el
				proveedor (dominios, correo, ...).Nunca está de más trabajar algunos
				conocimientos básicos.</p>
		</section>
		<section>
			<h2>5. Grails</h2>
			<p>Si me conoces un poco, sabes que pronunciaría esta tecnología.
				Adelanto que el núcleo del backend estará implementado en Grails, la
				idea es que también conviva con otras tecnologías alternativas.</p>
		</section>"""
		b2.save()

		def b3 = new BlogEntry()
		b3.author = "rafa"
		b3.title = "Aprendiendo groovy"
		b3.urlTitle = "aprendiendo-groovy"
		b3.body = """<section>
			<p>Groovy es uno de los lenguajes JVM más conocido y popular. Es
				dinámico y aporta características modernas de programación. Además,
				para desarrolladores Java la curva de aprendizaje es casi nula.
				Llevo varios años utilizándolo y actualmente es mi lenguaje
				favorito.</p>
		</section>
		<section>
			<h2>¿Por qué?</h2>
			<p>
				Más potente y limpio. En resumen, <b>código más fácil de
					escribir, leer y mantener</b>. Sin duda fué un gran descrubrimiento, la
				productividad de los proyectos aumentó considerablemente, y por si
				fuera poco...
			</p>
			<ul>
				<li>integra a la perfección con todas las clases y las
					bibliotecas Java existentes.</li>
				<li>compila directamente a código de bytes de Java para que
					puedas utilizarlo en cualquier lugar dónde se puede utilizar Java.
				</li>
			</ul>
			<p>Existen múltitud de debates sobre su rendimiento. Y en cierto
				modo es un falso mito, siguiendo la línea del mito del pobre
				rendimiento de Java. Sencillamente depende qué quieras hacer con él.
			</p>
			<p>No sé que tipo de programas desarrollas, pero basándome en mi
				experiencia no he notado ninguna diferencia apreciable con Java.
				Diré que ha funcionado a la perfección en aplicaciones con miles de
				usuarios. En cualquier proyecto que la restricciones lo permiten, lo
				utilizo.</p>
		</section>
		<section>
			<h2>¿Por dónde empezar?</h2>
			<p>Merece la pena echarle un vistazo. A simple vista puede no ser
				obvio apreciar todo su potencial, pero en la batalla del día a día,
				ves claramente los beneficios que te ofrece.
			<p>Como primera referencia aconsejo siempre la
				documentacióaprendienn oficial:</p>
			<ul>
				<li><a href="http://groovy.codehaus.org/Beginners+Tutorial">Tutorial
						oficial en inglés (muy bueno)</a></li>
			</ul>
			<p>
				Y si vienes del mundo Java, no te olvides de revisar la sección: <a
					href="http://groovy.codehaus.org/Differences+from+Java">Differences
					from Java</a>
			</p>
			<p>En cuanto a libros, existen varios. El imprescindible (en
				inglés) : Groovy in action (2nd edition)</p>
			<p>
				Y para acabar, dejo un par de <b>tutoriales en español</b> para un
				vistazo rápido o inicial. Aunque simples, son de calidad:
			</p>

			<ul>
				<li>De <a href="http://davidmarco.es">davidmarco.es</a> ->
					Introducción a Groovy [ <a
					href="http://davidmarco.es/blog/entrada.php?id=181">1</a> | <a
					href="http://davidmarco.es/blog/entrada.php?id=211">2</a> | <a
					href="http://davidmarco.es/blog/entrada.php?id=225">3</a> | <a
					href="http://davidmarco.es/blog/entrada.php?id=226">4</a> | <a
					href="http://davidmarco.es/blog/entrada.php?id=227">5</a> | <a
					href="http://davidmarco.es/tutoriales/anexos/anexo_introduccion_groovy.html">Anexo</a>
					]
				</li>
				<li>De <a href="http://www.dosideas.com">www.dosideas.com</a>
					-> <a href="http://www.dosideas.com/cursos/course/view.php?id=9">Tutorial
						de groovy</a>
				</li>
			</ul>
			</p>
		</section>"""
		b3.save()
		
		def b4 = new BlogEntry()
		b4.author = "rafa"
		b4.title = "Popularidad: Libros por ámbito, un enfoque SEO"
		b4.urlTitle = "popularidad-libros-por-ambito-un-enfoque-seo"
		b4.body = """<section>
			<p>
				Antes de la aparición de twitter, incluso antes de la indexación de
				google y sus referidos, ya existía una medida (muchas veces
				empírica) de popularidad sobre cualquier temática o rama en un
				entorno profesional: <b>los libros</b>.
			</p>
			<p>
				En su estimación influye la <b>cantidad</b>,<b>calidad</b>,<b>recomendaciones</b>
				y <b>reputación</b>. ¿Qué similar al SEO no?
			</p>
		</section>
		<section>
			<h2>Cantidad: ¿Cuántos libros existen sobre ...?</h2>
			<p>La cantidad de libros escritos sobre una temática es
				proporcional al interés que esta despierta. Y esta propiedad se
				retroalimenta: a mayor cantidad, más probable que aparezca alguno
				más ( ya sea actualización, revisión, reedición o completamente
				novedoso).</p>
			<p>En menor medida, el año de publicación debería tenerse en
				cuenta (aunque menos importante que la fecha de sus
				recomendaciones).</p>
		</section>
		<section>
			<h2>Calidad: Calidad de un libro</h2>
			<p>Un profesor de la facultad siempre decía:</p>
			<p>
				<i>"el peor de los libros es mejor que el mejor de los apuntes"</i>
			</p>
			<p>Aunque en su día no lo compartía, pues para aprobar su
				asignatura unos apuntes podían ser más adecuados, cuando en algún
				momento posterior me surgió la necesidad de formarme solidamente en
				algún ámbito acudí a los libros. El hombre tenía más razón que un
				santo, aquellos apuntes eran demasiado incompletos o desenfocados
				para lo que necesitaba. Cuando se va más allá de lo puntual, la
				calidad y propósito del texto es fundamental.</p>
			<p>Como todo en la vida, hay mejores y peores libros. A veces es
				subjetivo. Pero la calidad en su proceso de elaboración, desde
				concretar el temario, hasta la revisión, pasando por su desarrollo,
				marcan la diferencia respecto a los apuntes, panfletos, blogs o
				foros.</p>
		</section>
		<section>
			<h2>Recomendaciones</h2>
			<p>¿Tiene muchas recomendaciones un libro? ¿Quién se hace eco o
				recomienda un libro? ¿En qué círculos se recomienda? ¿Fecha de la
				recomendación?</p>
			<p>El tiempo coloca a cada uno en su lugar. Cuanto mejor es un
				libro, mejores y más recursivas en el tiempo suelen ser sus
				recomendaciones.</p>
		</section>
		<section>
			<h2>Reputación</h2>
			<p>Es aplicable individualmente a los puntos anteriores y a la
				vez transversal a ellos. Lo pondera todo:</p>
			<ul>
				<li><u>Reputación de una recomendación</u>: puede considerarse
					la reputación del recomendador en ese ámbito.</li>
				<li><u>Reputación de un libro:</u> en ella influye la calidad
					del libro, la reputación del autor y la reputación de las
					recomendaciones recibidas.</li>
				<li><u>Reputación de un ámbito o tema:</u> formada por la
					cantidad de libros de esa temática y la reputación de los mismos.</li>
			</ul>
		</section>
		<section>
			<h2>Conclusiones</h2>
			<p>El elevado coste de elaboración de cada libro, así como unas
				espectativas de retorno mayores, hace que globalmente sean menos
				proclives a proliferación por fanatismos, modas pasajeras o en
				entornos inestables (especialmente en tecnologías).</p>
			<p>Por ello, uno de los mejores estimadores de popularidad y
				madurez sobre un ámbito profesional la aportan sus libros.
				Problablemente el mejor indicador para este propósito a día de hoy.
			</p>
			<p>Elabora tus propias conclusiones... ¿Te será útil para futuras
				decisiones?</p>
		</section>"""
		
		b4.save()

		
	}
	def destroy = {
	}
}
