
<form:form role="form" method="post" action="${baseURL}/menu" modelAttribute="menu">
	<input type="hidden" class="form-control" id="id" name="id" value="${menu.id}">
	<div class="form-group">
		<div class="row">
			<div class="col-md-7">
				<label for="name">Nome:</label> <input type="text"
					class="form-control" id="name" name="name" value="${menu.name}">
			</div>
		</div>
	</div>
	<div class="form-group">
		<div class="row">
			<div class="col-md-3">
				<label for="diaryValue">Valor:</label> <input type="number" step="any"
					class="form-control" id="value" name="value" value="${menu.value}">
			</div>
		</div>
	</div>
	<div class="form-group">
		<div class="row">
			<c:choose>
			    <c:when test="${menu.id >= 0}">
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

<form id="formEdit" method="post" action="${baseURL}/menuEdit">
	<input type="hidden" id="idEdit" name="idEdit" />
</form>

<form id="formRemove" method="post" action="${baseURL}/menuRemove">
	<input type="hidden" class="form-control" id="idRemove" name="idRemove" value="${menu.id}">
</form>