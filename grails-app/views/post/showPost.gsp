<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main" />
<title>${entry.urlTitle}</title>
</head>
<body>
	<article>
		<header>
			<div class="post-date"><g:formatDate date="${entry.dateCreated}" type="date"/> por rafa</div>
			<h1>${entry.title}</h1>
		</header>
		<section>
		${entry.body}
		</section>
		<footer>
			<a href="https://twitter.com/share" class="twitter-share-button"
				data-url="http://rafbermudez.com/post/${entry.year}/${entry.month}/${entry.urlTitle}"
				data-text="${entry.urlTitle}"
				data-via="rafbermudez" data-lang="es" data-hashtags="${entry.hashTags}">Twittear</a>
			<script>
				!function(d, s, id) {
					var js, fjs = d.getElementsByTagName(s)[0], p = /^http:/
							.test(d.location) ? 'http' : 'https';
					if (!d.getElementById(id)) {
						js = d.createElement(s);
						js.id = id;
						js.src = p + '://platform.twitter.com/widgets.js';
						fjs.parentNode.insertBefore(js, fjs);
					}
				}(document, 'script', 'twitter-wjs');
			</script>
		</footer>
	</article>
</body>
</html>