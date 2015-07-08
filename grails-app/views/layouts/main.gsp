<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title><g:layoutTitle default="RafBermudez.com" /></title>
<meta name="description"
	content="Página personal y blog de Rafael Bermúdez Míguez: Ingeniería del software, Groovy & Grails, opinión...¡y mucho más!">
<meta name="keywords"
	content="rafbermudez, rafael bermúdez, rafael bermúdez míguez, ingeniería del software, programación, blog, , opinión, groovy, grails, java, html5">
<meta name="viewport" content="width=device-width">
<link rel="shortcut icon"
	href="${resource(dir: 'images', file: 'favicon.ico')}"
	type="image/x-icon">

<link type="text/plain" rel="author" href="/rafbermudez/humans.txt" />
<asset:stylesheet src="application.css"/>
<asset:javascript src="application.js"/>
<g:layoutHead />
<r:layoutResources />
</head>
<body>
	<div class="header-container">
		<header class="wrapper clearfix">
			<a href="${createLink(uri: '/')}"><img
				src="${resource(dir: 'images', file: 'logo.png')}"
				alt="RafBermudez.com logo" /></a>
			<nav>
				<ul>
					<li><span><a
							href="https://twitter.com/rafbermudez"><img
								src="${resource(dir: 'images', file: 'twitter-bird-white-on-blue.png')}"
								alt="logo link rafbermudez twitter" width="30" height="30"></a></span>
					</li>
					<li><span><a
							href="https://plus.google.com/103992033757559510407"><img
								src="${resource(dir: 'images', file: 'gplus-64.png')}"
								alt="logo link rafbermudez gplus" width="30" height="30"></a></span>
					</li>
					<li><span><a
							href="http://es.linkedin.com/pub/rafael-bermudez-miguez/54/219/468/"><img
								src="${resource(dir: 'images', file: 'LinkedIn_Logo60px.png')}"
								alt="logo link rafbermudez linkedin" width="36" height="30"></a></span>
					</li>
					<li><span><a class="mail"
							href="mailto:rafa@rafbermudez.com">rafa@rafbermudez.com</a></span></li>

				</ul>
			</nav>
		</header>
	</div>
	<div class="main-container">
		<div class="main wrapper clearfix">
			<div id="site-content">
				<g:layoutBody />
			</div>
			
			<sec:ifLoggedIn>
			<aside>
				<h4>Menú interno</h4>
				<ul>
					<li><g:link controller="post" action="entryManager">Gestionar entradas</g:link></li>
					<li><g:link controller="post" action="create">Nueva entrada</g:link></li>
					<li><g:link controller="logout" action="index">Cerrar sesión</g:link></li>
				</ul>
			</aside>
			</sec:ifLoggedIn>
			
			<aside>
				<h4>Mi nombre es Rafael Bermúdez, entusiasta de la
					programación, la gestión de procesos y la Ingeniería del Software.</h4>
				<ul>
					<li><a href="${createLink(uri: '/', absolute: true)}">Groovy/Grails</a></li>
					<li><a href="${createLink(uri: '/', absolute: true)}">Personal</a></li>
				</ul>
			</aside>
		</div>
		<!-- #main -->
	</div>
	<!-- #main-container -->

	<div class="footer-container">
		<footer class="wrapper"></footer>
	</div>

	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>

	<script>
		var _gaq = [ [ '_setAccount', 'UA-43181153-1' ], [ '_trackPageview' ] ];
		(function(d, t) {
			var g = d.createElement(t), s = d.getElementsByTagName(t)[0];
			g.src = '//www.google-analytics.com/ga.js';
			s.parentNode.insertBefore(g, s)
		}(document, 'script'));
	</script>

	<r:layoutResources />
</body>
</html>
