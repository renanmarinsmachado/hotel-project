<!-- Button HTML (to Trigger Modal) -->
<a href="#modalProgress" id="btnModalProgress" class="btn btn-lg btn-primary" data-toggle="modal">Launch Demo Modal</a>

<!-- Modal HTML -->
<div id="modalProgress" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
        	<form id="formSaveMenu" method="post" class="form-inline" action="${baseURL}/hotelperiod/menu">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title">Adicionar Itens do Cardápio</h4>
                </div>
	                <div class="modal-body">
	                    <div class="panel">
							<div class="panel-heading"><h3>Cardápio</h3></div>
							<div class="panel-body">
									<div class="row">
										<div class="col-md-6">
											<label for="roomType">Itens:</label>
<!-- 											<select class="form-control" name="menuSelect" id="menuSelect"> -->
<!-- 												<option value="">Selecione</option> -->
<!-- 											</select> -->
											<div id="itens-menu"></div>
										</div>
										<div class="col-md-6">
											<a href="/menu">Cadastrar item no cardápio?</a>
										</div>
									</div>
<!-- 									<div class="row"> -->
<!-- 										<h3>Itens a adicionar:</h3></br> -->
<!-- 										<div id="itens-menu-info"> -->
										
<!-- 										</div> -->
<!-- 										<br/> -->
<!-- 										<br/> -->
<!-- 										<label id="totalMenu" value="0"></label> -->
<!-- 									</div> -->
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