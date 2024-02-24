// Query 1 to 4
document.addEventListener('DOMContentLoaded', (event) => {
    // Attach click event listeners to each button
    ['Query1', 'Query2', 'Query3', 'Query4'].forEach((id) => {
      document.getElementById(id).addEventListener('click', function() {
        fetch(`/dynamic/${id.toLowerCase()}`) // Your endpoint for the query
          .then(response => response.json())
          .then(data => {
            const container = document.getElementById("sql-container");
            container.innerHTML = ''; // Clear previous results
            // Assuming 'data' is an array of objects
            data.forEach(row => {
              const div = document.createElement("div");
              // Customize this line based on how your data needs to be displayed
              div.textContent = JSON.stringify(row); 
              container.appendChild(div);
            });
          })
          .catch(error => console.error('Error:', error));
      });
    });
  });  
// Query 1 to 4 end
// Query 5
/*
document.getElementById("Query5").addEventListener("click", function() {
    const empId1 = document.getElementById("Query5EmployeeID").value;
    const empId2 = document.getElementById("Query5EmployeeName").value;
    
    fetch('/query5', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({ Emp1: empId1, Emp2: empId2 }),
    })
    .then(response => response.json())
    .then(data => {
      console.log(data); // Process and display your data here
    })
    .catch(error => console.error('Error:', error));
  });
  // Query 5 end
  
  // Query 6
  document.getElementById("Query6").addEventListener("click", function() {
    const empId1 = document.getElementById("Query6EmployeeID").value;
    const empId2 = document.getElementById("Query6EmployeeName").value;
    
    fetch('/query6', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({ Emp1: empId1, Emp2: empId2 }),
    })
    .then(response => response.json())
    .then(data => {
      console.log(data); // Process and display your data here
    })
    .catch(error => console.error('Error:', error));
  });
  // Query 6 end
  */