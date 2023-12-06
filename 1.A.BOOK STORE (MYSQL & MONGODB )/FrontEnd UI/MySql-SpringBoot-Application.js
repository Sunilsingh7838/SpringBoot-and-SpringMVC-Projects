// Fetch data from the API
fetch('http://localhost:8080/api/showData')
  .then(response => response.json())
  .then(data => {
    const dataContainer = document.getElementById('data-container');

    if (data && data.length > 0) {
      // Create a table to display the fetched data
      const table = document.createElement('table');
      table.innerHTML = '<tr><th>Book ID</th><th>Book Name</th><th>Book Author</th></tr>';

      // Iterate through the data and create rows in the table
      data.forEach(item => {
        const row = table.insertRow();
        const cell1 = row.insertCell(0);
        const cell2 = row.insertCell(1);
        const cell3 = row.insertCell(2);

        cell1.textContent = item.bookId;
        cell2.textContent = item.bookName;
        cell3.textContent = item.bookAuthor;
      });

      // Append the table to the data container
      dataContainer.appendChild(table);
    } else {
      dataContainer.textContent = 'No data found.';
    }
  })
  .catch(error => {
    console.error('Error fetching data: ' + error);
  });
// ==========================CODE FOR POST METHOD=======================================
// Reset Button
let resetButton = document.querySelector('#reset');
let inputFields = document.querySelectorAll('input');

resetButton.addEventListener('click', () => {
  // Clear input fields when the reset button is clicked
  inputFields.forEach(input => input.value = '');
});

// Define the onClickHandle function for sending data
function onClickHandle() {
  var bookName = document.getElementById("bookname").value;
  var bookAuthor = document.getElementById("bookauthor").value;

  // Create a JavaScript object with the data
  var dataToSend = {
    bookName: bookName,
    bookAuthor: bookAuthor,
  };

  const xhttp = new XMLHttpRequest();
  xhttp.onload = function () {
    // Handle the response from the server (you can add more logic here)
    var responseData = JSON.parse(xhttp.responseText);
    console.log(responseData);
  };

  // Configure the XMLHttpRequest for sending data to the API
  xhttp.open("POST", "http://localhost:8080/api/addData", true);
  xhttp.setRequestHeader("Content-Type", "application/json");

  // Send the data as JSON
  xhttp.send(JSON.stringify(dataToSend));

  // Redirect to a success page (you can customize the URL)
//   window.location.href = "success.html";
}

// Get the send button and add a click event listener
let sendButton = document.getElementById("sendbtn");
sendButton.addEventListener("click", onClickHandle);
