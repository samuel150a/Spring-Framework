<!DOCTYPE html>
<html>
<head>
    <title>Quiz</title>
    <style>
        body { font-family: Arial; background-color: #eef; padding: 30px; }
        .box { background: #fff; padding: 20px; width: 600px; margin: auto; border-radius: 10px; box-shadow: 0 0 10px gray; }
        .correct { color: green; }
        .wrong { color: red; }
        input[type=submit] {
            background-color: green; color: white;
            border: none; padding: 10px; margin-top: 10px;
        }
    </style>
</head>
<body>
<div class="box">
    <div style="display: ${isResult ? 'none' : 'block'}">
        <form method="post" action="quiz">
            <h2>Question ${qIndex + 1} of 10</h2>
            <p>${question}</p>
            <div><input type="radio" name="choice" value="A" required> ${options[0]}</div>
            <div><input type="radio" name="choice" value="B"> ${options[1]}</div>
            <div><input type="radio" name="choice" value="C"> ${options[2]}</div>
            <div><input type="radio" name="choice" value="D"> ${options[3]}</div>
            <input type="hidden" name="qIndex" value="${qIndex}">
            <input type="submit" value="${isLast ? 'Submit' : 'Next'}">
        </form>
    </div>


    <div style="display: ${isResult ? 'block' : 'none'}">
        <h1>Quiz Results</h1>
        ${resultHTML}
        <hr>
        <h2>Total Score: ${score} / ${total}</h2>
    </div>
</div>
</body>
</html>
