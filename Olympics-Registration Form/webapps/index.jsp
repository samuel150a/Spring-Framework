<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Olympics</title>
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
                    <a class="nav-link active" aria-current="page" href="Olympic.jsp">Registration Form</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="OlympicCandidentDetails.jsp">Candidate Details</a>
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
            <span class="form-header-title">Hurry! Up! Olympic Registration Opened</span>
        </div>
    </nav>
</div>

</body>
</html>
