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
				    <%@ include file="modalFree.jsp"%>
				    <%@ include file="modalProgress.jsp"%>
				    <input type="hidden" id="idRoom" name="idRoom" value=""/>
				</div>
			</div>
		</div>
	</div>

<%@ include file="../footer.jsp"%>

<script>

	$(document).ready(function() {

		accordion();
		edit();
		
		$('#btnModalFree').hide();
		$('#btnModalProgress').hide();
		
		$('#btnFree').click(function(){
			$.ajax({
		        url: $("#baseURL").val()+"/ed/room/available"
		    }).then(function(data) {
		    	$('#period-content').html('');
		       	for (i = 0; i < data.length; i++) { 
		    	   	$('#period-content').append('<div style="cursor: pointer;" class="panel panel-default panel-period-free"><input type="hidden" class="idRoom" value="'+data[i].id+'"><div class="row"><div class="col-md-3">Quarto: '+data[i].name+'</div><div class="col-md-3">Descrição: '+data[i].description+'</div><div class="col-md-3">Valor: '+data[i].diaryValue+'</div><div class="col-md-3">Tipo: '+data[i].roomType.description+'</div></div></div>');
		    	}
		       	
		       	if(!data || data.length == 0){
		    		alert('Nenhum quarto disponível.');
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
		    	   	$('#period-content').append('<div style="cursor: pointer;" class="panel panel-default panel-period-progress"><input type="hidden" class="idRoom" value="'+data[i].id+'"><div class="row"><div class="col-md-3">Quarto: '+data[i].room.name+'</div><div class="col-md-3">Descrição: '+data[i].room.description+'</div><div class="col-md-3">Valor: '+data[i].room.diaryValue+'</div><div class="col-md-3">Tipo: '+data[i].room.roomType.description+'</div></div><hr><div class="row"><div class="col-md-3">Cliente: '+data[i].client.name+'</div><div class="col-md-3">Telefone: '+data[i].client.phone+'</div><div class="col-md-3">E-mail: '+data[i].client.email+'</div><div class="col-md-3">Data da entrada: '+data[i].entryDate+'</div></div></div>');
		    	}
		    	
		    	if(!data || data.length == 0){
		    		alert('Nenhuma estádia locada.');
		    	}
		    });
		});
		
		$('#period-content').on('click', '.panel-period-free', function(e) {
			var id = $(this).find('.idRoom').val();
			
			$('#idRoom').val(id);
			$('#btnModalFree').trigger( "click" );
		});
		
		$('#period-content').on('click', '.panel-period-progress', function(e) {
			var id = $(this).find('.idRoom').val();
			
			$('#idRoom').val(id);
			$('#btnModalProgress').trigger( "click" );
		});
		
		$.ajax({
	        url: $("#baseURL").val()+"/ed/client"
	    }).then(function(data) {
	    	var selected = "";
	       	for (i = 0; i < data.length; i++) {
	    	   	$('#clientSelect').append('<option value="'+data[i].id+'">'+data[i].name+'</option>');
	    	}
	    });
		
		$.ajax({
	        url: $("#baseURL").val()+"/ed/menu"
	    }).then(function(dataStr) {
	    	var selected = "";
	    	var data = JSON.parse(dataStr);
	       	for (i = 0; i < data.length; i++) {
	       		$('#itens-menu').append('<div class="item-menu-add row"><input type="hidden" class="item-menu-id" value="'+data[i].id+'" /><div class="col-md-8"><label class"item-menu-label"><span class="item-menu-name">'+data[i].id+' - '+data[i].name+'</span> - R$ <span class="item-menu-price">'+data[i].value+'</span></label></div><div class="col-md-1"><input style="width:40px;" name="qtdItensAdd-'+data[i].id+'" type="number" class="qtd-itens-add" /></div></div>');
	    	}
	       	
	       	$('#btnItensMenu').click(function(){
	       		
	       		var idRoom = $('#idRoom').val();
	       		
				$('#itens-menu').find('.item-menu-add').each( function( index, element ){
				    var idItem = $( this ).find('.item-menu-id').val();
				    var qtdItem = $( this ).find('.qtd-itens-add').val();
				    
				    var jsonData = JSON.parse('{"idRoom":'+idRoom+',"idItem":'+idItem+',"qtdItem":'+qtdItem+'}');
				    
				    $.ajax({
				    	type: "POST",
				    	url: $("#baseURL").val()+"/ed/hotelperiod/menu",
				        contentType: "application/json",
				        data : JSON.stringify(jsonData),
						dataType : 'json',
						timeout : 100000,
				    }).then(function(data) {
				    	alert(data);
				    });
				});
			});
	    });
		
	});
</script>