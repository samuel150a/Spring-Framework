<!doctype html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Quiz</title>
</head>
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
<body>
<h1>Start Quiz</h1>
<form action="quiz" method="post">
<input type="submit">
</form>
</body>
</html>