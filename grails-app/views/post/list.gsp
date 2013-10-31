<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main" />
<title>RafBermudez.com</title>
</head>
<body>
	<g:each var="entry" in="${entries}">
		<article>
			<header>
				<div class="post-date"><g:formatDate date="${entry.dateCreated}" type="date"/> por ${entry.author}</div>
				<a href="post/2013/10/${entry.urlTitle}">
					<h1>${entry.title}</h1>
				</a>
			</header>
			<section>
		${entry.body}
		</section>
		</article>
	</g:each>
</body>
</html>
