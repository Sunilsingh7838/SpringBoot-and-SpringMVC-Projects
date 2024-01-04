document.getElementById("resetbtn").addEventListener("click", function() { location.reload(true) });
//document.getElementById("submitbtn").addEventListener("click", updateRegistrationDetail);


function updateRegistrationDetail() {

	var FirstName = document.getElementById('firstname').value;
	var LastName = document.getElementById('lastname').value;
	var DoB = document.getElementById('dob').value;
	var Gender = document.getElementById('gender').value;
	var Contact = document.getElementById('contact').value;
	var Email = document.getElementById('email').value; 
	var Address = document.getElementById('address').value;
	var State = document.getElementById('state').value;
	var PinCode = document.getElementById('pincode').value;
	var Country = document.getElementById('country').value;

	var updateDto = {
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
		data: JSON.stringyfy(updateDto),
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