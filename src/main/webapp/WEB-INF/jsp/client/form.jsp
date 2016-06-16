
<form:form role="form" method="post" action="${baseURL}/client" modelAttribute="client">
	<input type="hidden" class="form-control" id="id" name="id" value="${client.id}">
	<div class="form-group">
		<div class="row">
			<div class="col-md-7">
				<label for="name">Nome:</label> <input type="text"
					class="form-control" id="name" name="name" value="${client.name}">
			</div>
		</div>
		<div class="row">
			<div class="col-md-7">
				<label for="endereco">Endereço:</label> <input type="text"
					class="form-control" id="endereco" name="endereco" value="${client.endereco}">
			</div>
		</div>
	</div>
	<div class="form-group">
		<div class="row">
			<div class="col-md-4">
				<label for="phone">Telefone:</label> <input type="text"
					class="form-control" id="phone" name="phone" value="${client.phone}">
			</div>
			<div class="col-md-4 col-md-offset-1">
				<label for="email">Email:</label> <input type="text"
					class="form-control" id="email" name="email" value="${client.email}">
			</div>
		</div>
	</div>
	<div class="form-group">
		<div class="row">
			<c:choose>
			    <c:when test="${client.id >= 0}">
			    	<div class="col-md-offset-9">
						<button style="margin-right: 2px;" type="submit" class="btn button-link">Salvar</button>
						<a class="btn button-link" onclick="removeItem()">Excluir</a>
			    	</div>
			    </c:when>
			    <c:otherwise>
			    	<div class="col-md-offset-10">
						<button style="margin-right: 2px;" type="submit" class="btn btn-default">Salvar</button>
			    	</div>
			    </c:otherwise>
			</c:choose>
		</div>
	</div>
</form:form>

<form id="formEdit" method="post" action="${baseURL}/clientEdit">
	<input type="hidden" id="idEdit" name="idEdit" />
</form>

<form id="formRemove" method="post" action="${baseURL}/clientRemove">
	<input type="hidden" class="form-control" id="idRemove" name="idRemove" value="${client.id}">
</form>