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
				let row = '<tr>'
					+ '<td>' + '<span id="tdNameId" contenteditable="true">' + item.firstName + '</span>'+ '</td>'
					+ '<td>' + '<span  id="tdlstNameId" contenteditable="true">' + item.lastName + '</span>' + '</td>'
					+ '<td>' + '<span id="tdContect"contenteditable="true">' + item.contact + '</span>' + '</td>'
					+ '<td>' + '<span id="tdEmail"contenteditable="false">' +item.email  + '</span>'+ '</td>'
					+ '<td>' + '<span id="tdDob" contenteditable="true">' + item.doB + '</span>' + '</td>'
					+ '<td>' + '<span id ="tdGender" contenteditable="true">' + item.gender + '</span>' + '</td>'
					+ '<td>' + '<span id="tdPincode"contenteditable="true">' + item.pinCode + '</span>' + '</td>'
					+ '<td>' + '<span id="tdaddress" contenteditable="true">' + item.address + '</span>' + '</td>'
					+ '<td>' + '<span id="tdstate" contenteditable="true">' + item.state + '</span>' + '</td>'
					+ '<td>' + '<span id ="tdCountry"contenteditable="true">' + item.country + '</span>' + '</td>'
					+ '<td class="action-buttons">'
					+ '<a class="edit-link" href="javascript:location.reload(true)">'
					+ '<span class="action-buttons" >&#8634;</span>' + '</a>' + '</td>'
					+ '<td class="action-buttons">'
					+ '<a class="delete-link">'
					+ '<span class="action-buttons" onclick="updateRegistrationDetail()">&#10004;</span>' + '</a>' + '</td>'
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

function updateRegistrationDetail() {

    let FirstName = $('#tdNameId').text();
    let LastName = $('#tdlstNameId').text();
    let DoB = $('#tdDob').text();
    let Gender = $('#tdGender').text();
    let Contact = $('#tdContect').text();
    let Email = $('#tdEmail').text();
    let Address = $('#tdaddress').text();
    let State = $('#tdstate').text();
    let PinCode = $('#tdPincode').text();
    let Country = $('#tdCountry').text();

	let updateDto = {
		"firstName": FirstName,
		"lastName": LastName,
		"doB": DoB,
		"gender": Gender,
		"contact": Contact,
		"email": Email, 
		"address": Address,
		"state": State,
		"pinCode": PinCode,
		"country": Country
	}
	$.ajax({
		url: "/updateRegistrationDetail",
		type: "PUT",
		data: JSON.stringify(updateDto),
		dataType: "json",
		contentType: "application/json",
		success: function(response) {
			console.log(response);
		},
		error: function(xhr, status, error) {
			console.log("xhr : ", xhr)
			console.log("status : ", status)
			console.log("error : ", error)
		}
	});
}
