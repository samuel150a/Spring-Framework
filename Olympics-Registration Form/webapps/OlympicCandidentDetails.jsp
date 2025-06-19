<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>OlympicsDetails</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: linear-gradient(to right, #d4bfbf, #b7c1d2);
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        .form-container {
            max-width: 850px;
            margin: 60px auto;
            background-color: white;
            border-radius: 15px;
            overflow: hidden;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
            padding: 30px;
        }

        .form-header-navbar {
            background-color: #0e4a74;
        }

        .form-header-title {
            color: white;
            font-size: 1.6rem;
            font-weight: bold;
            padding: 12px 20px;
            margin: 0 auto;
        }

        .main-navbar {
            background-color: #0e4a74;
        }

        .main-navbar .navbar-brand,
        .main-navbar .nav-link,
        .main-navbar .btn-outline-success {
            color: white !important;
        }

        .main-navbar .btn-outline-success {
            border-color: white;
        }

        .main-navbar .btn-outline-success:hover {
            background-color: white;
            color: #0e4a74 !important;
        }

        .btn-primary {
            background-color: #0e4a74;
            border: none;
        }

        .btn-primary:hover {
            background-color: #093958;
        }

        p {
            font-weight: 500;
            font-size: 1rem;
            color: #333;
        }

        input[type="text"] {
            padding: 8px;
            width: 300px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg main-navbar">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Olympics 2025 2026</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll"
                aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarScroll">
            <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
                <li class="nav-item">
                    <a class="nav-link active" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="Olympics.jsp">Registration Form</a>
                </li>
            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>

<div class="form-container">
    <nav class="navbar form-header-navbar">
        <div class="container-fluid justify-content-center">
            <span class="form-header-title">Candidate Details</span>
        </div>
    </nav>

    <br>
    <form action="Op" method="get" style="text-align:center;">
        Search ID:
        <input type="text" placeholder="Enter ID" name="id">
        <br><br>
        <input type="submit" class="btn btn-primary" value="Search">
    </form>

    <br>
    <div style="text-align:center;">
        <span style="color:red;">${failure}</span>
        <br><br>
    </div>
        <p>Member Name: ${dto.memberName}</p>
        <p>Dob: ${dto.dob}</p>
        <p>Gender: ${dto.gender}</p>
        <p>Mobile No: ${dto.phone}</p>
        <p>State: ${dto.state}</p>
        <p>City:  ${dto.city}</p>
        <p>Sport: ${dto.sport}</p>
    memberName dob gender phone state city sport
    </div>
</div>

</body>
</html>
