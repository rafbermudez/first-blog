<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main" />
<title>RafBermudez.com</title>
<ckeditor:resources />
</head>
<body>
	<article>
		<header> 
			<g:if test="${entry?.id}">
				<h1>Edit blog entry</h1>
			</g:if>
			<g:else>
				<h1>New blog entry</h1>
			</g:else>
		</header>
		<section>

			<g:form name="SaveBlogEntryForm" action="saveBlogEntry" id="${entry?.id}">
				<table>
					<tr>
						<td><label>Title</label></td>
						<td><g:textField name="title" value="${entry?.title}" /></td>
					</tr>
					<tr>
						<td><label>Url title</label></td>
						<td><g:textField name="urlTitle" value="${entry?.urlTitle}" /></td>
					</tr>
					<tr>
						<td><label>HashTags</label></td>
						<td><g:textField name="hashTags" value="${entry?.hashTags}" /></td>
					</tr>
					<tr>
						<td><label>Publicado</label></td>
						<td><g:checkBox name="published" value="${true}" /></td>
					</tr>
					<tr>
						<td colspan="2"><label>Body</label></td>
					</tr>
					<tr>
						<td colspan="2"><ckeditor:editor name="body" height="600px"
								width="100%"> ${entry?.body?:"Escribe aquí..."}
</ckeditor:editor></td>
					</tr>
				</table>
				<g:submitButton name="SaveBlogEntryButton" value="Save" />
			</g:form>
		</section>
	</article>
</body>
</html>
