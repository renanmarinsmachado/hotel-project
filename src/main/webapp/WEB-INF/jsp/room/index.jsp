<%@ include file="../header.jsp"%>

	<div id="content">
		<div class="row">
			<div class="panel panel-success panel-hotel">
				<div class="panel-heading">Gerenciamento de Quartos</div>
				<div class="panel-body">
					<div class="panel panel-success">
						<div class="panel-body body-create">
							<%@ include file="form.jsp"%>
						</div>
						<div class="panel-heading label-create" style="cursor: pointer;">Criar</div>
						
						<c:choose>
						    <c:when test="${openCreate eq ''}">
						       <c:set var="openCreate" value="0"/>
						    </c:when>
						</c:choose>
						<input type="hidden" id="value-create" value="${openCreate}"/>
					</div>
					<div class="panel panel-default">
						<div class="panel-body">
							<%@ include file="datatable.jsp"%>
						</div>
					</div>
	
				</div>
			</div>
		</div>
	</div>


<%@ include file="../footer.jsp"%>

<script>
	var editor = [];

	$(document).ready(function() {

		accordion();
		edit();
// 		remove();
		
		$('#data-table').DataTable({
			dom : "Bfrtip",
			ajax : {
				url : $("#baseURL").val()+"/ed/room",
				type : 'GET',
				dataSrc : ''
			},
			columns : [ {
				data : "id"
			}, {
				data : "name"
			}, {
				data : "diaryValue"
			}, {
				data : "roomType.description"
			}, {
				data : "description"
			} ],
			buttons : [

			],
			select : true,
			searching: false
		});
		
		$.ajax({
	        url: $("#baseURL").val()+"/ed/roomType"
	    }).then(function(data) {
	    	var selected = "";
	       	for (i = 0; i < data.length; i++) { 
	    	   	if(data[i].id == $("#roomTypeId").val()){
	    	   		selected = "selected";
	    	   	}else{
	    	   		selected = "";
	    	   	}
	    	   	$('#roomType').append('<option value="'+data[i].id+'" '+selected+'>'+data[i].type+'</option>');
	    	}
	    });
	});
</script>