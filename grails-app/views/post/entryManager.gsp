<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main" />
<title>Gestionar entradas</title>
</head>
<body>
	<article>
		<header>
			<h1>Gestionar entradas</h1>
		</header>
		<section>
			<table>
				<tr>
					<th>Id</th>
					<th>Título</th>
					<th>Publicado</th>
					<th>Fecha</th>
				</tr>

				<g:each var="entry" in="${entries}">
					<tr>
						<td>
							${entry.id}
						</td>
						<td>
							<g:link action="edit" id="${entry.id}">${entry.title}</g:link>
						</td>
						<td>
							${entry.published}
						</td>
						<td>
							<g:formatDate date="${entry.dateCreated}" type="datetime" style="SHORT"/>
						</td>
					</tr>
				</g:each>
			</table>
		</section>
	</article>
</body>
</html>