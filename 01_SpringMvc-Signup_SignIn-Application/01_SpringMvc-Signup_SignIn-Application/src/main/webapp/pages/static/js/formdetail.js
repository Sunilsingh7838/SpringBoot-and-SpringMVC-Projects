
document.getElementById("refreshBtn").addEventListener("click", function() { location.reload(true) });
$(document).ready(function() {
	getRegisterationDetail();
});

function getRegisterationDetail() {

	$.ajax({
		url: "/getRegisterationDetail",
		type: "GET",
		dataType: "json",
		contentType: "application/json",
		success: function(response) {
			console.log(response);
			let tableBody = $('#table-body');
			$.each(response.data, function(index, item) {
			var doB = item.doB.split('-').reverse().join('-');
				let row = '<tr>'
					+ '<td></td>'
					+ '<td><input type="checkbox" name="checkboxId"></td>'
					+ '<td>' + '<span>' + item.id + '</span>' + '</td>'
					+ '<td>' + '<span>' + item.firstName + '</span>' + '</td>'
					+ '<td>' + '<span>' + item.lastName + '</span>' + '</td>'
					+ '<td>' + '<span>' + item.contact + '</span>' + '</td>'
					+ '<td>' + '<span>' + item.email + '</span>' + '</td>'
					+ '<td>' + '<span>' + item.password+ '</span>' + '</td>'
					+ '<td>' + '<span>' +doB+ '</span>' + '</td>'
					+ '<td>' + '<span>' + item.gender + '</span>' + '</td>'
					+ '<td>' + '<span>' + item.pinCode + '</span>' + '</td>'
					+ '<td>' + '<span>' + item.address + '</span>' + '</td>'
					+ '<td>' + '<span>' + item.state + '</span>' + '</td>'
					+ '<td>' + '<span>' + item.country + '</span>' + '</td>'

					//+ '<td class="action-buttons">'
					//+ '<a class="edit-link" href="javascript:location.reload(true)">'
					//+ '<span class="action-buttons" >&#8634;</span>' + '</a>' + '</td>'
					//+ '<td class="action-buttons">'
					//+ '<a class="delete-link">'
					//+ '<span class="action-buttons" onclick="updateRegistrationDetail()">&#10004;</span>' + '</a>' + '</td>'
					+ '</tr>';
				tableBody.append(row);
			});
		},
		error: function(xhr, status, error) {
			console.error('Error:', error);
			console.error('xhr:', xhr);
			console.error('status:', status);
		}
	});
}


$("#deleteBtn").on("click", function() {
	var checkboxValue;

	var selectedIds = [];
	$('input[name="checkboxId"]:checked').each(function() {
		// Ensure that the value attribute is set correctly
		 // Assuming ID is in the third column
		checkboxValue = $(this).closest('tr').find('td:eq(2) span').text();
		if (checkboxValue.trim() !== "") {
			selectedIds.push(parseInt(checkboxValue));
		}
	});

	if (selectedIds.length === 0) {
		checkboxSelectId()
		return;
	}
	$.ajax({
		url: "/deleteUsers",
		type: "DELETE",
		data: { id: selectedIds },
		traditional: true,
		//	contentType: "application/json",
		success: function(response) {
			console.log(response);
			deleteAndReload();
			

		},
		error: function(xhr, status, error) {
			console.log("xhr : ", xhr)
			console.log("status : ", status)
			console.log("error : ", error)
		}
	});
});

function checkboxSelectId() {
	$("#checkboxSelectId").show();

	setTimeout(function() {
		$("#checkboxSelectId").hide();
	}, 3000);
}
function successDeleteId() {
	$("#successDeleteId").show();

	setTimeout(function() {
		$("#successDeleteId").hide();
	}, 3000);
}

function deleteAndReload(){
	successDeleteId();
	 setTimeout(function(){
		 location.reload();
	 },3000);
}
