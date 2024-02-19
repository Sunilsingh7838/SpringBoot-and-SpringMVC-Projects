
//import params from './welcome.js';

//document.addEventListener('DOMContentLoaded', function () {
$("#refreshBtn").on("click", function() {
	location.reload(true);
});
$(document).ready(function() {
	editUserDetail();
});

function editUserDetail() {

	//console.log(params.get(window.location.href));
	//document.getElementById("jsId").innerHTML = "This text from usdetjs";
	var params = new URLSearchParams(window.location.href);
	//var importedParams = params.get(window.location.href);

	//console.log(importedParams);
	/*	var firstName = params.get('firstName');
		var lastName = params.get('lastName');
		var Dob = params.get('doB');
		//.split('-').reverse().join('-')
		var gender = params.get('gender');
		var contact = params.get('contact');*/
	/*var email = params.get('email');*/
	/*var password = params.get('password');
	var address = params.get('address');
	var pincode = params.get('pinCode');
	var state = params.get('state');
	var country = params.get('country');*/

	/*$('#fullNameId').append('Welcome ' + firstName + ' ' + lastName + ' !');
	$('#email').append(email);
	$('#UserData').append(
		'<p>First Name: <input type="text" id="firstNameId" value="' + firstName + '"></p>'
		+ '<p>Last Name: <input type="text" id="lastNameId" value="' + lastName + '"></p>'
		+ '<p>Date of Birth: <input type="date" id="DobId" value="' + Dob + '"></p>'
		+ '<p>Gender: <input type="text" id="genderId" value="' + gender + '"></p>'
		+ '<p>Contact info: <input type="text" id="contactId" value="' + contact + '"></p>'
		+ '<p>Email: <input type="text" id="emailId" value="' + email + '" readonly></p>'
		+ '<p>Password: <input type="text" id="passwordId" value="' + password + '"></p>'
		+ '<p>Address: <input type="text" id="addressId" value="' + address + '"></p>'
		+ '<p>Pincode: <input type="text" id="pincodeId" value="' + pincode + '"></p>'
		+ '<p>State: <input type="text" id="stateId" value="' + state + '"></p>'
		+ '<p>Country: <input type="text" id="countryId" value="' + country + '"></p>'
	);*/

	var EmailId = params.get('email');
	$.ajax({
		url: "/getUserDetailByEmail?emailId=" + EmailId,
		type: "GET",
		/*	data: JSON.stringify(dataToSend),*/
		dataType: "json",
		contentType: "application/json",
		success: function(response) {
			console.log(response);

			if (response.statusCode === 200) {
				showUserData(response);
			}
			if (response.statusCode == 404 || response.statusCode == 401) {
				internalServerError();
			}
		},
		error: function(XMLHttpRequest) {
			console.error("Failed to Login" + XMLHttpRequest.status, "Error");
			console.error("Response Text: " + XMLHttpRequest.responseText);
		}
	});
}

function showUserData(response) {
	var data = response.data;

	$("#UserData").append(
		'<p>First Name: <input type="text" id="firstNameId" value="' + data.firstName + '"></p>'
		+ '<p>Last Name: <input type="text" id="lastNameId" value="' + data.lastName + '"></p>'
		+ '<p>Date of Birth: <input type="date" id="DobId" value="' + data.doB + '"></p>'
		+ '<p>Gender: <input type="text" id="genderId" value="' + data.gender + '"></p>'
		+ '<p>Contact info: <input type="text" id="contactId" value="' + data.contact + '"></p>'
		+ '<p>Email: <input type="text" id="emailId" value="' + data.email + '" readonly></p>'
		+ '<p>Password: <input type="text" id="passwordId" value="' + data.password + '"></p>'
		+ '<p>Address: <input type="text" id="addressId" value="' + data.address + '"></p>'
		+ '<p>Pincode: <input type="text" id="pincodeId" value="' + data.pinCode + '"></p>'
		+ '<p>State: <input type="text" id="stateId" value="' + data.state + '"></p>'
		+ '<p>Country: <input type="text" id="countryId" value="' + data.country + '"></p>'

	)

}

$("#updateUserDetail").on("click", function() {
	let FirstName = $('#firstNameId').val();
	let LastName = $('#lastNameId').val();
	let DoB = $('#DobId').val();
	let Gender = $('#genderId').val();
	let Contact = $('#contactId').val();
	let Email = $('#emailId').val();
	let Address = $('#addressId').val();
	let State = $('#stateId').val();
	let PinCode = $('#pincodeId').val();
	let Country = $('#countryId').val();

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
			if (response.statusCode === 200) {
				updateAndReload();
			} else {
				internalServerError();
			}
		},
		error: function(xhr, status, error) {
			console.log("xhr : ", xhr)
			console.log("status : ", status)
			console.log("error : ", error)
		}
	});

	function updatedPopId() {
		$("#updatedPopupId").show();

		setTimeout(function() {
			$("#updatedPopupId").hide();
		}, 3000);
/*		setTimeout(function() {
			location.reload();
		}, 1000);*/
	}

	function updateAndReload() {
		updatedPopId();
		setTimeout(function() {
			location.reload();
		}, 3000);
	}
	function internalServerError() {
		$("#serverErrorId").show();

		setTimeout(function() {
			$("#serverErrorId").hide();
		}, 3000);

	}
	/*function updateAndReload1() {

		let EmailId = $('#emailId').val();
		//var PasswordID = $("#passwordID").val();

		var dataToSend = {
			"userEmail": EmailId
			//"password": PasswordID
		}

		$.ajax({
			url: "/getUserDetailByEmail?emailId=" + EmailId,
			type: "GET",
				data: JSON.stringify(dataToSend),
			dataType: "json",
			contentType: "application/json",
			success: function(response) {
				console.log(response);

				if (response.statusCode === 200) {
					updatedPopId();
				}
				if (response.statusCode == 404 || response.statusCode == 401) {
					internalServerError();
				}
			},
			error: function(XMLHttpRequest) {
				console.error("Failed to Login" + XMLHttpRequest.status, "Error");
				console.error("Response Text: " + XMLHttpRequest.responseText);
			}
		});

			updatedPopId();
			 setTimeout(function(){
				 location.reload();
			 },3000);
	}*/
});
