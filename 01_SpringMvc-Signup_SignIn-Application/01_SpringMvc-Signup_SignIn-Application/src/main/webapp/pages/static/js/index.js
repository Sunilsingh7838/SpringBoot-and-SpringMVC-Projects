
/*document.addEventListener("DOMContentLoaded", function() {
	var today = new Date().toISOString().split('T')[0];
	document.getElementById('dob').max = today;
});*/

function buttonClickHandler() {

	var today = new Date().toISOString().split('T')[0];
	document.getElementById('dob').max = today;

	var FirstName = $("#firstname").val().trim();
	var LastName = $('#lastname').val().trim();
	var DoB = $('#dob').val();
	var Gender = $('input[name="gender"]:checked').val();
	var Contact = $('#contact').val().trim();
	var Email = $('#email').val().trim();
	var Password = $('#createPassword').val();
	var ConfirmPassword = $('#confirmPassword').val();
	var Address = $('#address').val().trim();
	var PinCode = $('#pincode').val().trim();
	var State = $('#stateDropdown').val();
	var Country = $('#countryDropdown').val();

	/*#firstnameSpan,
	#firstnameSpanValidId,
	#lastnameSpan,
	#lastnameSpanValidId,
	#dobSpan,
	#genderSpan,
	#contactSpan,
	#contactSpanValidId,
	#emailSpan,
	#emailSpanValidId,
	#passwordSpan,
	#confirmPasswordSpan,
	#addressSpan,
	#addressSpanValidId,
	#pincodeSpan,
	#pincodeSpanValidId,
	#stateDropdownSpanId,
	#countryDropdownSpanId*/
	if (FirstName === '') {
		$('#firstnameSpan').show();
		return;
	} else {
		$('#firstnameSpan').hide();
	}

	var nameRegex = /^[a-zA-Z]+$/;
	if (!nameRegex.test(FirstName)) {
		$('#firstnameSpanValidId').show();
		return;
	} else {
		$('#firstnameSpanValidId').hide();
	}

	if (LastName === '') {
		$('#lastnameSpan').show();
		return;
	} else {
		$('#lastnameSpan').hide();
	}

	if (!nameRegex.test(LastName)) {
		$('#lastnameSpanValidId').show();
		return;
	} else {
		$('#lastnameSpanValidId').hide();
	}
	if (DoB === '') {
		$('#dobSpan').show();
		return;
	} else {
		$('#dobSpan').hide();
	}

	if (Gender == undefined) {
		$('#genderSpan').show();
		return;
	} else {
		$('#genderSpan').hide();
	}

	if (Contact === '') {
		$('#contactSpan').show();
		return;
	} else {
		$('#contactSpan').hide();
	}

	var contactRegex = /^\d{10}$/;
	if (!contactRegex.test(Contact)) {
		$('#contactSpanValidId').show();
		return;
	} else {
		$('#contactSpanValidId').hide();
	}
	if (Email === '') {
		$('#emailSpan').show();
		return;
	} else {
		$('#emailSpan').hide();
	}

	var emailRegex = /^[a-zA-Z0-9._%+-]+@gmail\.com$/;
	if (!emailRegex.test(Email)) {
		$('#emailSpanValidId').show();
		return;
	} else {
		$('#emailSpanValidId').hide();
	}
	if (Password === '') {
		$('#passwordSpan').show();
		return;
	} else {
		$('#passwordSpan').hide();
	}
	if (ConfirmPassword === '') {
		$('#confirmPasswordSpan').show();
		return;
	} else {
		$('#confirmPasswordSpan').hide();
	}
	if (Password != ConfirmPassword) {
		$('#matchingPasswordSpan').show();
		return;
	} else {
		$('#matchingPasswordSpan').hide();
	}



	if (Address === '') {
		$('#addressSpan').show();
		return;
	} else {
		$('#addressSpan').hide();
	}

	var addressRegex = /[a-zA-Z0-9\s\-()]+$/;
	if (!addressRegex.test(Address)) {
		$('#emailSpanValidId').show();
		return;
	} else {
		$('#emailSpanValidId').hide();
	}
	if (PinCode === '') {
		$('#pincodeSpan').show();
		return;
	} else {
		$('#pincodeSpan').hide();
	}

	var pincodeRegex = /[\d]/;
	if (!pincodeRegex.test(PinCode)) {
		$('#pincodeSpanValidId').show();
		return;
	} else {
		$('#pincodeSpanValidId').hide();
	}

	if (State == null) {
		$('#stateDropdownSpanId').show();
		return;
	} else {
		$('#stateDropdownSpanId').hide();
	}
	if (Country == null) {
		$('#countryDropdownSpanId').show();
		return;
	} else {
		$('#countryDropdownSpanId').hide();
	}
	//timmer();
	function timmer() {
		showSpinner();
		setTimeout(function() {
			hideSpinner();
		}, 2000);
	}

	var dataToSend = {
		"firstName": FirstName,
		"lastName": LastName,
		"doB": DoB,
		"gender": Gender,
		"contact": Contact,
		"email": Email,
		"password": Password,
		"confirmPassword": ConfirmPassword,
		"address": Address,
		"state": State,
		"pinCode": PinCode,
		"country": Country
	}

	$.ajax({
		url: "/register",
		type: "POST",
		data: JSON.stringify(dataToSend),
		dataType: "json",
		contentType: "application/json",
		success: function(response) {
			console.log(response);
			if (response.status == 'failed') {
				emailAlreadyExist();
			} else {
				showpopup();
				resetForm();
			}
		},
		error: function(XMLHttpRequest) {
			console.error("Failed to Register" + XMLHttpRequest.status, "Error");
			console.error("Response Text: " + XMLHttpRequest.responseText);
		}
	});
}

function showpopup() {
	var popup = document.getElementById('popupId');
	popup.style.display = 'block';

	setTimeout(function() {
		popup.style.display = 'none';
	}, 3000);
}

function validationPopup() {
	var popup = document.getElementById('validationPopupId');
	popup.style.display = 'block';

	setTimeout(function() {
		popup.style.display = 'none';
	}, 3000);
}
function emailAlreadyExist() {
	var popup = document.getElementById('emailAlreadyExist');
	popup.style.display = 'block';

	setTimeout(function() {
		popup.style.display = 'none';
	}, 3000);
}
function resetForm() {
	document.getElementById('registrationForm').reset();
}
function openLoginPage() {
	window.location.href = '/getLogin';
}
function openAdminPage() {
	window.open('/showRegistrationformUI', '_blank');
	//window.location.href = '/showRegistrationformUI';
}

function loginClickHandler() {
	var EmailID = $("#emailID").val();
	var PasswordID = $("#passwordID").val();

	if (EmailID === "") {
		$("#userSpanId").show();
		return;
	} else {
		$("#userSpanId").hide();
	}
	if (PasswordID === "") {
		$("#userPasswordSpanId").show();
		return;
	} else {
		$("#userPasswordSpanId").hide();
	}

	var dataToSend = {
		"userEmail": EmailID,
		"password": PasswordID
	}

	$.ajax({
		url: "/validateLogin",
		type: "POST",
		data: JSON.stringify(dataToSend),
		dataType: "json",
		contentType: "application/json",
		success: function(response) {
			console.log(response);

			if (response.statusCode === 200) {
				successPage(response);
				/*window.location.href = '/getWelcomePage?firstName=' + encodeURIComponent(response.data.firstName);
				window.location.href = '/getWelcomePage?email=' + encodeURIComponent(response.data.email);
*/
			}
			if (response.statusCode == 401) {
				invalidPassword();
			}
			if (response.statusCode == 404) {
				invalidPassword();
			}
		},
		error: function(XMLHttpRequest) {
			console.error("Failed to Login" + XMLHttpRequest.status, "Error");
			console.error("Response Text: " + XMLHttpRequest.responseText);
		}
	});

}

function successPage(data) {
	console.log(data);

	//	var userName = data.country;

	// Assuming you have an element with the ID 'userName' in your HTML
	//	$('#userName').text('User Name: ' + userName);

	// Redirect to another HTML page with the userName as a query parameter
	//	window.location.href = 'welcome.html?userName=' + encodeURIComponent(userName);

	//$("#userNameId12").text("userX :");
	/*window.location.href = '/getWelcomePage';
console.log(response);*/

	//window.location.href = '/getWelcomePage?firstName=' + encodeURIComponent(data.firstName);


	// # for retriving all data
	var data = data.data;
	var queryParams = '';

	for (var key in data) {
		if (data.hasOwnProperty(key)) {
			queryParams += key + '=' + encodeURIComponent(data[key]) + '&';
		}
	}
	queryParams = queryParams.slice(0, -1);

	window.location.href = '/getWelcomePage?' + queryParams;

}
function invalidPassword() {
	$("#invalidPasswordPopupId").show();
	setTimeout(function() {
		$("#invalidPasswordPopupId").hide();
	}, 3000);
}
function invalidUser() {
	$("#userNotExistId").show();
	setTimeout(function() {
		$("#userNotExistId").hide();
	}, 3000);
}


