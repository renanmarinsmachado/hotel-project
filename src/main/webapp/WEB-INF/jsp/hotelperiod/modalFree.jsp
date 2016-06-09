<!-- Button HTML (to Trigger Modal) -->
<a href="#modalFree" id="btnModalFree" class="btn btn-lg btn-primary" data-toggle="modal">Launch Demo Modal</a>

<!-- Modal HTML -->
<div id="modalFree" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
        	<form id="formSavePeriod" method="post" class="form-inline" action="${baseURL}/hotelperiod">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title">Reservar Quarto</h4>
                </div>
	                <div class="modal-body">
	                    <div class="panel">
							<div class="panel-heading">Dados do Cliente</div>
							<div class="panel-body">
									<div class="row">
										<div class="col-md-6">
											<label for="roomType">Selecionar Cliente:</label>
											<select class="form-control" name="clientSelect" id="clientSelect">
												<option value="">Selecione</option>
											</select>
										</div>
										<div class="col-md-4">
											<a href="/client">Cadastrar novo usuário?</a>
										</div>
									</div>
							</div>
						</div>
	                </div>
	                <div class="modal-footer">
	                    <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
	                    <button type="submit" class="btn btn-primary btnSavePeriod">Salvar</button>
	                </div>
                </form>
           </div>
       </div>
</div>