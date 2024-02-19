
$(document).ready(function() {
	getUserDetail();
});
var params;
function getUserDetail() {

	// Retrieve the firstName from the query parameter
	//var params = new URLSearchParams(window.location.search);
	//	var firstName = params.get('firstName');
	//	var email = params.get('email');

	// Display the firstName on the welcome page
	// document.body.innerHTML += '<p>Welcome, ' + firstName + '!</p>';
	// $('body').append('<p>Welcome, ' + firstName + '!</p>')
	// $('body').append('<p>You login with , ' + email + '!</p>')

	// # for retriving all data
	params = new URLSearchParams(window.location.href);
	console.log(params);
	var firstName = params.get('firstName');
	var lastName = params.get('lastName');
	var Dob = params.get('doB');
	//.split('-').reverse().join('-')
	var gender = params.get('gender');
	var contact = params.get('contact');
	var email = params.get('email');
	var password = params.get('password');
	var address = params.get('address');
	var pincode = params.get('pinCode');
	var state = params.get('state');
	var country = params.get('country');
	$('#fullNameId').append('Welcome ' + firstName + ' ' + lastName + ' !')
	$('#UserData').append('<p>' + 'First Name : ' + firstName + '</p>'
		+'<p>' + 'Last Name : ' + lastName + '</p>'
		+'<p>' + 'Dob : ' + Dob + '</p>'
		+ '<p>' + 'Gender : ' + gender + '</p>'
		+ '<p>' + 'Contact info. : ' + contact + '</p>'
		+ '<p>' + 'Email : ' + email + '</p>'
		+ '<p>' + 'Password : ' + password + '</p>'
		+ '<p>' + 'Address : ' + address + '</p>'
		+ '<p>' + 'PinCode : ' + pincode + '</p>'
		+ '<p>' + 'State : ' + state + '</p>'
		+ '<p>' + 'Country : ' + country + '</p>'
	);

	//var userDataElement = $('#UserData');
	//params.forEach(function(key, value){
	//userDataElement.append('<p>'+ value + ': ' + key+'</p>');
	//});
	//	function editUserDetail(){
	//	window.location.href = "/updateUserDetail";
	//window.location.href = '/getWelcomePage?' + queryParams;
	//	}
}

$("#editUserDetailId").on("click", function() {
/*	var data = data.data;
	var queryParams = '';

	for (var key in data) {
		if (data.hasOwnProperty(key)) {
			queryParams += key + '=' + encodeURIComponent(data[key]) + '&';
		}
	}
	queryParams = queryParams.slice(0, -1);*/
	window.location.href = '/updateUserDetail?' + params;
	//window.location.href = "/updateUserDetail";
});
//export default params;

//sending param to edit_user_detail

