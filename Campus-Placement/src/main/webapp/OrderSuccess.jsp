<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Upload Successful</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
<nav class="navbar navbar-expand-lg bg-success">
    <div class="container-fluid">
        <a class="navbar-brand text-white" href="#">Placement Portal</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link text-white" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active text-white" href="Order.jsp">Upload</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container text-center mt-5">
    <h4 class="text-success">${fileSaved}</h4>
    <p class="mt-2">Uploaded by <strong>${name}</strong></p>
    <p>File name: <span class="text-primary">${fileName}</span></p>
    <img src="images/success-check.png" alt="Success" class="img-fluid mt-4" style="width: 150px;" />
</div>

<footer class="text-center text-white py-3 mt-5 bg-success">
    &copy; 2025 Placement Portal
</footer>
</body>
</html>
