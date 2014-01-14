<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main" />
<title>RafBermudez.com</title>
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
						<td><label>Body</label></td>
						<td><g:textArea name="body" value="" rows="5" cols="40" /></td>
					</tr>
				</table>
				<g:submitButton name="CreateBlogEntryButton" value="Create" />
			</g:form>
		</section>
	</article>
</body>
</html>
