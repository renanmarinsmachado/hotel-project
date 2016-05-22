
<form:form role="form" method="post" action="http://localhost:8080/room.html" modelAttribute="room">
	<input type="hidden" class="form-control" id="id" name="id" value="${room.id}">
	<div class="form-group">
		<div class="row">
			<div class="col-md-7">
				<label for="name">Nome:</label> <input type="text"
					class="form-control" id="name" name="name" value="${room.name}">
			</div>
		</div>
	</div>
	<div class="form-group">
		<div class="row">
			<div class="col-md-3">
				<label for="diaryValue">Valor da Diária:</label> <input type="number"
					class="form-control" id="diaryValue" name="diaryValue" value="${room.diaryValue}">
			</div>
			<div class="col-md-4 col-md-offset-1">
				<label for="roomType">Tipo do Quarto:</label> <select class="form-control"
					id="roomType" name=roomType>
					<option value="">Selecione</option>
				</select>
				<input type="hidden" id="roomTypeId" value="${room.roomType.id}">
			</div>
		</div>
	</div>
	<div class="form-group">
		<div class="row">
			<div class="col-md-11">
				<label for="description">Descrição:</label>
				<textarea class="form-control" rows="5" id="description"
					name="description">${room.description}</textarea>
		</div>
			</div>
	</div>
	<div class="form-group">
		<div class="row">
			<div class="col-md-offset-10">
				<button style="margin-right: 2px;" type="submit" class="btn btn-default">Salvar</button>
			</div>
		</div>
	</div>
</form:form>

<form id="formEdit" method="post" action="http://localhost:8080/roomEdit">
	<input type="hidden" id="idEdit" name="idEdit" />
</form>