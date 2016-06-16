
<form:form role="form" method="post" action="${baseURL}/roomtype" modelAttribute="roomtype">
	<input type="hidden" class="form-control" id="id" name="id" value="${roomType.id}">
	<div class="form-group">
		<div class="row">
			<div class="col-md-7">
				<label for="type">Tipo:</label> <input type="text"
					class="form-control" id="type" name="type" value="${roomType.type}">
			</div>
			<div class="col-md-11">
				<label for="description">Descrição:</label>
				<textarea class="form-control" rows="5" id="description"
					name="description">${roomType.description}</textarea>
			</div>
		</div>
	</div>
	<div class="form-group">
		<div class="row">
			<c:choose>
			    <c:when test="${roomType.id >= 0}">
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

<form id="formEdit" method="post" action="${baseURL}/roomTypeEdit">
	<input type="hidden" id="idEdit" name="idEdit" />
</form>

<form id="formRemove" method="post" action="${baseURL}/roomRemove">
	<input type="hidden" class="form-control" id="idRemove" name="idRemove" value="${room.id}">
</form>