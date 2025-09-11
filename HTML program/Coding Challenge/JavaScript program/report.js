
document.getElementById("marksform").addEventListener("submit", function(event) {
  event.preventDefault();

  const subjectMaxMarks = {
    Math: 100,
    Science: 100,
    English: 100,
    History: 100,
    Geography: 100
  };

  let studentName = document.getElementById("studentName").value;
  let marksInput = document.getElementById("subjectMarks").value;
  let marksArray = marksInput.split(",").map(item => item.trim());

  let studentMarks = [];
  let totalMarks = 0;
  let subjectsCount = 0;

  for (let i = 0; i < marksArray.length; i++) {
    const parts = marksArray[i].split(":");
    if (parts.length === 2) {
      const subject = parts[0].trim();
      const mark = parseInt(parts[1].trim());

      if (subjectMaxMarks[subject]) {
        if (mark >= 0 && mark <= subjectMaxMarks[subject]) {
          studentMarks.push({ subject: subject, mark: mark });
          totalMarks += mark;
          subjectsCount++;
        } else {
          console.log(`Invalid mark for ${subject}: ${mark}. Mark should be between 0 and ${subjectMaxMarks[subject]}`);
        }
      } else {
        console.log(`Subject "${subject}" is not recognized.`);
      }
    } else {
      console.log(`Invalid format for marks: ${marksArray[i]}. Please use "Subject:Mark" format.`);
    }
  }

//   let bonus = 0;
//   if (subjectsCount > 3 && totalMarks >= 300) {
//     bonus = totalMarks * 0.05;
//   }

  const finalScore = totalMarks ;

  let reportHtml = `
    <h3>Student Name: ${studentName}</h3>
    <div class="table-responsive">
      <table class="table table-bordered table-striped">
        <thead>
          <tr>
            <th>Subject</th>
            <th>Marks Obtained</th>
            <th>Maximum Marks</th>
          </tr>
        </thead>
        <tbody>
  `;

  studentMarks.forEach(item => {
    reportHtml += `
      <tr>
        <td>${item.subject}</td>
        <td>${item.mark}</td>
        <td>${subjectMaxMarks[item.subject]}</td>
      </tr>
    `;
  });

  reportHtml += `
        </tbody>
        <tfoot>
          <tr>
            <th colspan="1">Total Marks Obtained:</th>
            <td colspan="2">${totalMarks}</td>
          </tr>
           
          <tr>
            <th colspan="1">Final Score:</th>
            <td colspan="2">${finalScore.toFixed(2)}</td>
          </tr>
        </tfoot>
      </table>
    </div>
  `;
  
  document.getElementById("result").innerHTML = reportHtml;

});

