<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Contact Us</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" />
    <style>
        body {
            background: #1e293b;
            color: #e2e8f0;
            font-family: 'Segoe UI', sans-serif;
        }

        .navbar {
            background-color: #0f172a;
            padding: 1rem;
        }

        .navbar-brand {
            color: #fbbf24 !important;
            font-weight: bold;
        }

        .nav-link {
            color: #f8fafc !important;
        }

        .form-container {
            background: rgba(255, 255, 255, 0.05);
            backdrop-filter: blur(8px);
            padding: 2rem;
            border-radius: 16px;
            max-width: 600px;
            margin: 4rem auto;
            box-shadow: 0 8px 30px rgba(0,0,0,0.4);
        }

        label {
            font-weight: 500;
            color: #f8fafc;
        }

        .btn-accent {
            background-color: #fbbf24;
            color: #0f172a;
            border: none;
        }

        .btn-accent:hover {
            background-color: #f59e0b;
        }

        footer {
            background-color: #0f172a;
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

<div class="form-container">
    <h3 class="text-center mb-4">Contact Form</h3>
    <div class="text-danger text-center mb-3">${message}</div>
    <form action="contact" method="post">
        <div class="mb-3">
            <label>Full Name</label>
            <input type="text" name="name" value="${contactDTO.name}" class="form-control"  />
        </div>
        <div class="mb-3">
            <label>Email</label>
            <input type="email" name="email" value="${contactDTO.email}" class="form-control"  />
        </div>
        <div class="mb-3">
            <label>Phone Number</label>
            <input type="tel" name="phoneNumber" value="${contactDTO.phoneNumber}" class="form-control" />
        </div>
        <div class="mb-4">
            <label>Comments</label>
            <textarea name="comments" rows="4" class="form-control" required>${contactDTO.comments}</textarea>
        </div>
        <div class="text-center">
            <button type="submit" class="btn btn-accent px-4 py-2">Submit</button>
        </div>
    </form>
</div>

<footer>&copy; 2025 ContactUs. We respect your voice.</footer>
</body>
</html>
