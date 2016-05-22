
if ($("#value-create").val() == 0) {
	$(".body-create").hide();
	$(".label-create").html("Criar");
} else {
	$(".body-create").show();
	$(".label-create").html("Cancelar");
}
$(".label-create").click(function() {
	if ($("#value-create").val() == 0) {
		$(".body-create").fadeIn(300);
		$(".label-create").html("Cancelar");
		$("#value-create").val(1);
	} else {
		$(".body-create").fadeOut(300);
		$(".label-create").html("Criar");
		$("#value-create").val(0);
	}
});

$('#data-table').on('click', 'tbody tr', function(e) {
	var id = $(this).find("td:eq(0)").html();
	$("#idEdit").val(id);
	$("#formEdit").submit();
});