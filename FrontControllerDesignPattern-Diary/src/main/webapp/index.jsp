<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Diary</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Bootstrap Icons -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap" rel="stylesheet">

    <style>
        :root {
          --enterprise-color: #2C3E50;
          --text-light: #f8f9fa;
        }

        html, body {
          height: 100%;
          margin: 0;
          font-family: 'Poppins', sans-serif;
        }

        body {
          display: flex;
          flex-direction: column;
          background-color: white;
          color: #000;
        }

        main {
          flex: 1;
        }

        .top-bar, .category-scroll, footer {
          background-color: var(--enterprise-color);
        }

        .top-bar span,
        .nav-tabs .nav-link,
        .category-scroll a,
        footer {
          color: var(--text-light) !important;
        }

        .nav-tabs .nav-link.active {
          border-bottom: 2px solid var(--text-light);
          color: var(--text-light) !important;
        }

        .nav-tabs .nav-link {
          color: #dbe4ea !important;
        }

        .category-scroll {
          overflow-x: auto;
          white-space: nowrap;
        }

        .category-scroll a {
          margin-right: 20px;
          text-decoration: none;
          font-weight: 500;
        }

        .category-scroll a:hover {
          text-decoration: underline;
        }

        .category-scroll .sale {
          color: #f94144;
          font-weight: bold;
        }

        .category-scroll .dsgn {
          background: #f8f9fa;
          color: var(--enterprise-color);
          padding: 2px 8px;
          border-radius: 4px;
          font-weight: bold;
        }

        .form-control::placeholder {
          font-size: 0.9rem;
          color: #666;
        }

        .form-control {
          font-family: 'Poppins', sans-serif;
        }

        .bi {
          color: var(--text-light);
        }

        footer {
          padding: 1rem 0;
        }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="border-bottom shadow-sm">
    <div class="top-bar">
        <div class="container-fluid px-4 py-3 d-flex justify-content-between align-items-center">
            <div class="d-flex align-items-center gap-4">
                <span class="fs-4 fw-bold">Diary</span>
                <ul class="nav nav-tabs border-0">
                    <li class="nav-item">
                        <a class="nav-link  fw-semibold" href="#">Events</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link fw-semibold" href="#">Reports</a>
                    </li>
                </ul>
            </div>

            <div class="flex-grow-1 mx-5">
                <input type="text" class="form-control rounded-pill border-0" placeholder="What are you looking for?">
            </div>

            <div class="d-flex gap-4 fs-5">
                <i class="bi bi-search" title="Search"></i>
                <i class="bi bi-person" title="Account"></i>
                <i class="bi bi-heart" title="Favorites"></i>
                <i class="bi bi-bag" title="Orders"></i>
            </div>
        </div>
    </div>

    <div class="border-top py-2 px-4 category-scroll">
        <a href="#" class="sale">Highlights</a>
        <a href="Name.jsp">Name</a>
        <a href="Hospital.jsp">Hospital</a>
        <a href="RTO.jsp">RTO</a>
        <a href="PoliceStation.jsp">PoliceStation</a>
        <a href="Fruit.jsp">Fruit</a>
    </div>
</nav>


<main class="container my-5">
    <div align="center">
    <p>"A professional journal covering Names, Hospitals, RTOs, Fruits, and Police Stations."</p>
    </div>
    <footer class="text-center text-lg-start">
        <div class="text-center">
            <h6>WELCOME  TO OBSERVATION  & RECORD DIARY</h6>
        </div>
    </footer>
</main>


<footer class="text-center text-lg-start">
    <div class="text-center">
        &copy; 2025 Enterprise Inc. All rights reserved.
    </div>
</footer>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
