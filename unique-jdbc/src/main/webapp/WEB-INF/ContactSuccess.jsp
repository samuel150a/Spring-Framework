<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Success | ContactUs</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" />
    <style>
        body {
            background: #0f172a;
            color: #f1f5f9;
            font-family: 'Segoe UI', sans-serif;
        }

        .navbar {
            background-color: #1e293b;
        }

        .navbar-brand {
            color: #fbbf24 !important;
            font-weight: bold;
        }

        .nav-link {
            color: #f8fafc !important;
        }

        .card-success {
            background: rgba(255, 255, 255, 0.05);
            backdrop-filter: blur(8px);
            border-radius: 16px;
            max-width: 700px;
            margin: 4rem auto;
            padding: 2rem;
            box-shadow: 0 8px 30px rgba(0,0,0,0.4);
        }

        .card-header {
            background-color: #fbbf24;
            color: #0f172a;
            font-weight: bold;
            text-align: center;
            padding: 1rem;
            border-radius: 12px 12px 0 0;
        }

        .table th {
            width: 180px;
        }

        footer {
            background-color: #1e293b;
            padding: 1rem;
            text-align: center;
            color: #cbd5e1;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg">
    <div class="container">
        <a class="navbar-brand" href="#">ContactUs</a>
        <div class="collapse navbar-collapse justify-content-end">
            <ul class="navbar-nav">
                <li class="nav-item"><a class="nav-link" href="../index.jsp">Home</a></li>
                <li class="nav-item"><a class="nav-link active" href="Contact.jsp">Contact</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="card-success">
    <div class="card-header"> Submission Successful</div>
    <div class="card-body">
        <p class="text-center mb-4">Thanks for reaching out. We'll get back to you soon!</p>
        <table class="table table-bordered text-white">
            <tr><th>Full Name</th><td>${contactDTO.name}</td></tr>
            <tr><th>Email</th><td>${contactDTO.email}</td></tr>
            <tr><th>Phone Number</th><td>${contactDTO.phoneNumber}</td></tr>
            <tr><th>Comments</th><td>${contactDTO.comments}</td></tr>
        </table>
    </div>
</div>

<footer>&copy; 2025 ContactUs. We'll be in touch.</footer>
</body>
</html>
