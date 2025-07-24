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

        .sticky-wrapper {
  position: fixed;
  top: 0;
  width: 100%;
  z-index: 1030;
  background-color: var(--enterprise-color);
}

.sticky-wrapper + .category-scroll {
  position: fixed;
  top: 70px; /* height of the top bar */
  width: 100%;
  z-index: 1029;
}

body {
  padding-top: 130px; /* Top bar + category-scroll combined height */
}

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
<nav class="sticky-wrapper">
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
        <a href="index.jsp">Home</a>
        <a href="Name.jsp">Name</a>
        <a href="Hospital.jsp">Hospital</a>
        <a href="RTO.jsp">RTO</a>
        <a href="PoliceStation.jsp">Police Station</a>
    </div>
</nav>


<div class="container d-flex justify-content-center my-5">
    <form action="fruit" class="p-4 border rounded shadow" style="width: 100%; max-width: 600px">
        <h4 class="text-center mb-4">Fruit Details</h4>
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="fruitName" class="form-label">Name</label>
                <input type="text" class="form-control" id="fruitName" name="fruitName" />
            </div>
            <div class="col-md-6 mb-3">
                <label for="isRaw" class="form-label">isRaw</label>
                <input type="text" class="form-control" id="isRaw" name="isRaw" />
            </div>
            <div class="col-md-6 mb-3">
                <label for="cost" class="form-label">Cost</label>
                <input type="number" class="form-control" id="cost" name="cost" />
            </div>
            <div class="col-md-6 mb-3">
                <label for="isHealthy" class="form-label">IsHealthy</label>
                <input type="text" class="form-control" id="isHealthy" name="isHealthy" />
            </div>
            <div class="col-md-6 mb-3">
                <label for="isAvaiOnline" class="form-label">IsAvaiOnline</label>
                <input type="text" class="form-control" id="isAvaiOnline" name="isAvaiOnline" />
            </div>
            <div class="col-md-6 mb-3">
                <label for="farmArea" class="form-label">FarmArea</label>
                <input type="text" class="form-control" id="farmArea" name="farmArea" />
            </div>
            <div class="col-md-6 mb-3">
                <label for="grown" class="form-label">Grown</label>
                <select class="form-select" id="grown" name="grown">
                    <option value="">Select State</option>
                    <option value="Karnataka"> Karnataka</option>
                    <option value="Andhra">Andhra</option>
                    <option value="Maharastra> Maharastra</option>
                    <option value="TamilNadu>TamilNadu</option>
                    <option value="Kashmir">Kashmir</option>
                    <option value="Meghalaya">Meghalaya</option>
                </select>
            </div>
            <div class="col-md-6 mb-3">
                <label for="isSeedless" class="form-label">Seedless?</label>
                <select class="form-select" id="isSeedless" name="isSeedless">
                    <option value="">Select</option>
                    <option value="true">Yes</option>
                    <option value="false">No</option>
                </select>
            </div>
            <div class="col-md-6 mb-3">
                <label for="offer" class="form-label">Offer</label>
                <input type="number" class="form-control" id="offer" name="offer" />
            </div>
            <div class="col-md-6 mb-3">
                <label for="isDamaged" class="form-label">IsDamaged</label>
                <select class="form-select" id="isDamaged" name="isDamaged">
                    <option value="">Select</option>
                    <option value="true">Yes</option>
                    <option value="false">No</option>
                </select>
            </div>
        </div>
        <div class="text-center">

            <button type="submit" class="btn text-white" style="background-color: #2c3e50; border: none;">
                Submit
            </button>
        </div>
    </form>
</div>

<footer class="text-center text-lg-start">
    <div class="text-center">
        &copy; 2025 Enterprise Inc. All rights reserved.
    </div>
</footer>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
