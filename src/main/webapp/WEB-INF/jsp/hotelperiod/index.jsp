<%@ include file="../header.jsp"%>

<div id="content">
		<div class="row">
			<div class="panel panel-success panel-hotel">
				<div class="panel-heading">Estádias</div>
				<div class="panel-body">
					
					<br>
					<button type="button" class="btn btn-info" id="btnFree">Livre</button>
					<button type="button" class="btn btn-info" id="btnProgress">Em Andamento</button>
					<br>
					<br>
					<div id="period-content">
						
					</div>
				</div>
			</div>
		</div>
	</div>

<%@ include file="../footer.jsp"%>

<script>

	$(document).ready(function() {

		accordion();
		edit();
		
		$('#btnFree').click(function(){
			$.ajax({
		        url: $("#baseURL").val()+"/ed/room"
		    }).then(function(data) {
		    	$('#period-content').html('');
		       	for (i = 0; i < data.length; i++) { 
		    	   	$('#period-content').append('<div class="panel panel-default panel-period-free"><div class="row"><div class="col-md-3">Quarto: '+data[i].name+'</div><div class="col-md-3">Descrição: '+data[i].description+'</div><div class="col-md-3">Valor: '+data[i].diaryValue+'</div><div class="col-md-3">Tipo: '+data[i].roomType.description+'</div></div></div>');
		    	}
		    });
		});
		
		$('#btnProgress').click(function(){
			$.ajax({
		        url: $("#baseURL").val()+"/ed/hotelperiod/json"
		    }).then(function(dataStr) {
		    	$('#period-content').html('');
		    	var data = JSON.parse(dataStr);
		       	for (i = 0; i < data.length; i++) { 
		    	   	$('#period-content').append('<div class="panel panel-default panel-period-progress"><div class="row"><div class="col-md-3">Quarto: '+data[i].room.name+'</div><div class="col-md-3">Descrição: '+data[i].room.description+'</div><div class="col-md-3">Valor: '+data[i].room.diaryValue+'</div><div class="col-md-3">Tipo: '+data[i].room.roomType.description+'</div></div><hr><div class="row"><div class="col-md-3">Cliente: '+data[i].client.name+'</div><div class="col-md-3">Telefone: '+data[i].client.phone+'</div><div class="col-md-3">E-mail: '+data[i].client.email+'</div><div class="col-md-3">Data da entrada: '+data[i].entryDate+'</div></div></div>');
		    	}
		    });
		});
	});
</script>