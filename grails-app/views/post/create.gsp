<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main" />
<title>RafBermudez.com</title>
<ckeditor:resources />
</head>
<body>
	<article>
		<header> New blog entry </header>
		<section>

			<g:form name="CreateBlogEntryForm" action="saveBlogEntry">
				<table>
					<tr>
						<td><label>Title</label></td>
						<td><g:textField name="title" value="" /></td>
					</tr>
					<tr>
						<td><label>Url title</label></td>
						<td><g:textField name="urlTitle" value="" /></td>
					</tr>
					<tr>
						<td><label>HashTags</label></td>
						<td><g:textField name="hashTags" value="" /></td>
					</tr>
					<tr>
						<td><label>Publicado</label></td>
						<td><g:checkBox name="published" value="${true}" /></td>
					</tr>
					<tr>
					<td colspan="2"><label>Body</label></td>
					</tr>
					<tr>
						<td colspan="2"><ckeditor:editor name="body" height="600px" width="100%"> Escribir aquí
</ckeditor:editor></td>
					</tr>
				</table>
				<g:submitButton name="CreateBlogEntryButton" value="Create" />
			</g:form>
		</section>
	</article>
</body>
</html>
