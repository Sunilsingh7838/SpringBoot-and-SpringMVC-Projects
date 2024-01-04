
let bntclr = document.querySelector('#resetbtn');
let inputFields = document.querySelectorAll('input');

bntclr.addEventListener('click', () => {
	inputFields.forEach(input => input.value = '');
});

document.addEventListener("DOMContentLoaded", function() {
	var today = new Date().toISOString().split('T')[0];
	document.getElementById('dob').max = today;
});

//let sbmtbtn = document.getElementById('submitbtn');
//sbmtbtn.addEventListener('click', buttonClickHandler);

/*$(document).ready(function() {
	$('#submitbtn').click(buttonClickHandler);
});*/

function buttonClickHandler() {
	var FirstName = document.getElementById('firstname').value.trim();
	var LastName = document.getElementById('lastname').value.trim();
	var DoB = document.getElementById('dob').value.trim();
	var Gender = $('input[name="gender"]:checked').val();
	var Contact = document.getElementById('contact').value.trim();
	var Email = document.getElementById('email').value.trim();
	var Address = document.getElementById('address').value.trim();
	var State = document.getElementById('state').value.trim();
	var PinCode = document.getElementById('pincode').value.trim();
	var Country = document.getElementById('country').value.trim();

	if (FirstName === ''
		|| LastName === ''
		|| DoB === ''
		|| Contact === ''
		|| Email === ''
		|| Address === ''
		|| State === ''
		|| PinCode === ''
		|| Country === '') {
		validationPopup();
		return;
	}

	var nameRegex = /^[a-zA-Z]+$/;
	var stateRegex = /^[a-zA-Z\s]+$/;
	var numberRegex = /[a-zA-Z0-9\s\-()]+$/;
	var contactRegex = /^\d{10}$/;
	var pincodeRegex = /[\d]/;
	var emailRegex =/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
	if (!nameRegex.test(FirstName)
		|| !nameRegex.test(LastName)) {
		validName();
		return;
	}
	if(!numberRegex.test(Address)){
		validationAddress();
		return;
	}
	if (!stateRegex.test(State)) {
		validationState();
		return;
	}
	if (!nameRegex.test(Country)) {
		validationCountry();
		return;
	}
	if(!contactRegex.test(Contact)){
		validationContact();
		return;
	}
	if(!pincodeRegex.test(PinCode)){
		validationPincode();
		return;
	}
	if(!emailRegex.test(Email)){
		validationEmail();
		return;
	}
	
	if (!Gender) {
		validationPopup();
		return;
	}
	var dataToSend = {
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
		url: "/register",
		type: "POST",
		data: JSON.stringify(dataToSend),
		dataType: "json",
		contentType: "application/json",
		success: function(response) {
			console.log(response);
			showpopup();
			resetForm();
		},
		error: function(XMLHttpRequest) {
			console.error("Failed to Register" + XMLHttpRequest.status, "Error");
			console.error("Response Text: " + XMLHttpRequest.responseText);
		}
	});
}
function validName() {
	let name = document.getElementById('validationNameId');
	name.style.display = 'block';

	setTimeout(function() {
		name.style.display = 'none';
	}, 3000);
}
function validationCountry() {
	let name = document.getElementById('validationCountryId');
	name.style.display = 'block';

	setTimeout(function() {
		name.style.display = 'none';
	}, 3000);
}
function validationState() {
	let name = document.getElementById('validationStateId');
	name.style.display = 'block';

	setTimeout(function() {
		name.style.display = 'none';
	}, 3000);
}
function validationAddress() {
	let name = document.getElementById('validationAddressId');
	name.style.display = 'block';

	setTimeout(function() {
		name.style.display = 'none';
	}, 3000);
}
function validationContact() {
	let name = document.getElementById('validationContactId');
	name.style.display = 'block';

	setTimeout(function() {
		name.style.display = 'none';
	}, 3000);
}
function validationPincode() {
	let name = document.getElementById('validationPincodeId');
	name.style.display = 'block';

	setTimeout(function() {
		name.style.display = 'none';
	}, 3000);
}
function validationEmail() {
	let name = document.getElementById('validationEmailId');
	name.style.display = 'block';

	setTimeout(function() {
		name.style.display = 'none';
	}, 3000);
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
function resetForm() {
	document.getElementById('registrationForm').reset();
}
