<!-- Button HTML (to Trigger Modal) -->
<a href="#modalProgress" id="btnModalProgress" class="btn btn-lg btn-primary" data-toggle="modal">Launch Demo Modal</a>

<!-- Modal HTML -->
<div id="modalProgress" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title">Adicionar Itens do Cardápio</h4>
                </div>
	                <div class="modal-body">
						
						<!-- Nav tabs -->
						<ul class="nav nav-tabs" role="tablist">
						  <li role="presentation" class="active"><a href="#menu" aria-controls="menu" role="tab" data-toggle="tab">Cardápio</a></li>
						  <li role="presentation"><a href="#finish-period" aria-controls="finish-period" role="tab" data-toggle="tab">Finalizar Estádia</a></li>
						</ul>
						
						<!-- Tab panes -->
						<div class="tab-content">
						  <div role="tabpanel" class="tab-pane active" id="menu">
						  	<div class="panel panel-menu">
								<div class="panel-heading"><h3>Cardápio</h3></div>
								<div class="panel-body">
										<div class="row">
											<div class="col-md-6">
												<label for="roomType">Itens:</label>
												<div id="itens-menu"></div>
											</div>
											<div class="col-md-6">
												<a href="/menu">Cadastrar item no cardápio?</a>
											</div>
										</div>
								</div>
							</div>
							<div class="modal-footer">
			                    <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
			                    <button type="button" id="btnItensMenu" class="btn btn-primary btnSavePeriod">Salvar</button>
			                </div>
						  </div>
						  <div role="tabpanel" class="tab-pane" id="finish-period">
						  	<div class="panel panel-finish-period">
								<div class="panel-body">
									<div class="modal-footer">
					                    <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
					                    <button type="submit" class="btn btn-primary btnSavePeriod">Finalizar Estádia</button>
					                </div>
								</div>
							</div>
						  </div>
						</div>
	               </div>