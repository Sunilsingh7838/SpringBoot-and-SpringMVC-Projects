/**
 * 
 */

let bntclr = document.querySelector('#resetbtn');
let inputFields = document.querySelectorAll('input');

bntclr.addEventListener('click', () => {
	inputFields.forEach(input => input.value = '');
});

let sbmtbtn = document.getElementById('submitbtn');

sbmtbtn.addEventListener('click', buttonClickHandler);

function buttonClickHandler() {

	var FirstName = document.getElementById('firstname');
	var LastName = document.getElementById('lastname').value;
	var DoB = document.getElementById('dob').value;
	var Gender = document.getElementById('gender').value;
	var Contact = document.getElementById('contact').value;
	var Email = document.getElementById('email').value;
	var Address = document.getElementById('address').value;
	var State = document.getElementById('state').value;
	var PinCode = document.getElementById('pincode').value;
	var Country = document.getElementById('country').value;

	var dataToSend = {
		FirstName: FirstName,
		LastName: LastName,
		DoB: DoB,
		Gender: Gender,
		Contact: Contact,
		Email: Email,
		Address: Address,
		State: State,
		PinCode: PinCode,
		Country: Country
	}


	// Collect form data
	/* 
	   let formData = {};
		inputFields.forEach(() => {
			formData[firstname] = FirstName.value;
		});
	    
	*/

	$.ajax({
		url: "/register",
		type: "POST",
		/*		data: JSON.stringify(dataToSend),*/
		data: JSON.stringify(dataToSend),
		dataType: "json",
		contentType: "application/json",
		success: function(response) {
			console.log(response);
			console.log("Registration Success!")

			window.location.href = "success.html";
		},
		error: function(XMLHttpRequest) {

			console.error("Failed to Register" + XMLHttpRequest.status, "Error");
	//		console.error("Response Text: " + XMLHttpRequest.responseText);
		}
	});
}











