<%@ include file="../header.jsp"%>

<div class="row">
	<div class="">
		<div class="panel panel-success panel-hotel">
			<div class="panel-heading">Gerenciamento de Quartos</div>
			<div class="panel-body">
				<div class="panel panel-success">
					<div class="panel-body body-create">
						<%@ include file="form.jsp"%>
					</div>
					<div class="panel-heading label-create" style="cursor: pointer;">Criar</div>
					<input type="hidden" id="value-create" value="0"/>
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

		$('#example').DataTable({
			dom : "Bfrtip",
			ajax : {
				url : "http://localhost:8080/room",
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
			select : true
		});
		
		$.ajax({
	        url: "http://localhost:8080/roomType"
	    }).then(function(data) {
	       for (i = 0; i < data.length; i++) { 
	    	   $('#roomType').append('<option value="'+data[i].id+'">'+data[i].description+'</option>');
	    	}
	    });
		
		$(".body-create").hide();
		$(".label-create").click(function(){
			if($("#value-create").val() == 0){
				$(".body-create").fadeIn(300);
				$(".label-create").html("Cancelar");
				$("#value-create").val(1);
			}else{
				$(".body-create").fadeOut(300);
				$(".label-create").html("Criar");
				$("#value-create").val(0);
			}
		});
	});
</script>