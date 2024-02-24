// Query 1 to 4
document.addEventListener('DOMContentLoaded', (event) => {
  ['Query1', 'Query2', 'Query3', 'Query4'].forEach((id) => {
    document.getElementById(id).addEventListener("click", function() {
      document.getElementById('spinner').style.display = 'block'; // Show spinner
      fetch(`/dynamic/${id.toLowerCase()}`)
        .then(response => response.json())
        .then(data => {
          document.getElementById('spinner').style.display = 'none'; // Hide spinner
          const container = document.getElementById("sql-container");
          container.innerHTML = ''; // Clear previous results

          // Create a table
          const table = document.createElement('table');
          container.appendChild(table);

          // Add table head
          const thead = document.createElement('thead');
          table.appendChild(thead);

          // Assuming the data is an array of objects, use the keys of the first object for the table headers
          const headerRow = document.createElement('tr');
          thead.appendChild(headerRow);
          if (data.length > 0) {
            Object.keys(data[0]).forEach(key => {
              const th = document.createElement('th');
              th.textContent = key;
              headerRow.appendChild(th);
            });
          }

          // Add table body
          const tbody = document.createElement('tbody');
          table.appendChild(tbody);

          // Add rows to table body
          data.forEach(row => {
            const tr = document.createElement('tr');
            tbody.appendChild(tr);
            Object.values(row).forEach(value => {
              const td = document.createElement('td');
              td.textContent = value;
              tr.appendChild(td);
            });
          });
        })
        .catch(error => {
          console.error('Error:', error);
          document.getElementById('spinner').style.display = 'none'; // Hide spinner
        });
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

  