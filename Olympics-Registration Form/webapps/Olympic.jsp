<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Olympics Registration Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
          background: linear-gradient(to right, #d4bfbf, #b7c1d2);
          font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        .form-container {
          max-width: 800px;
          margin: 50px auto;
          background-color: #fff;
          border-radius: 15px;
          padding: 30px;
          box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);
        }

        .form-header {
          background-color: #0e4a74;
          color: white;
          padding: 20px;
          border-top-left-radius: 15px;
          border-top-right-radius: 15px;
          text-align: center;
          font-size: 1.5rem;
          font-weight: bold;
        }

        .form-group {
          margin-bottom: 20px;
        }

        .form-label-text {
          font-weight: 500;
          margin-bottom: 5px;
        }

        input, select {
          border-radius: 8px;
          padding: 8px;
          width: 100%;
          border: 1px solid #ccc;
        }

        .btn-custom {
          background-color: #0e4a74;
          color: white;
          border-radius: 8px;
          padding: 10px 20px;
          font-weight: 500;
          border: none;
          width: 150px;
        }

        .btn-custom:hover {
          background-color: #0c3c5f;
        }

        .text-center {
          text-align: center;
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
                    <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
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


<body>

<div class="form-container">
    <div class="form-header">Olympics 2025 2026 Registration Form</div>


    <div align="center">
    <h6><span style="color:green;">${success}</span></h6>
    <span style="color:red;">${failure}</span>
</div>

    <form action="Op" method="post">
        <div class="row mt-4">
            <div class="col-md-6 form-group">
                Member Name:<input type="text" name="memberName" required>
            </div>
            <div class="col-md-6 form-group">
                Date of Birth:<input type="date" name="dob" required>
            </div>
        </div>

        <div class="row">
            <div class="col-md-6 form-group">
                Gender:
                <select name="gender" required>
                    <option value="">Select Gender</option>
                    <option value="male">Male</option>
                    <option value="female">Female</option>
                    <option value="other">Other</option>
                </select>
            </div>
            <div class="col-md-6 form-group">
                Mobile No:<input type="tel" name="phone" pattern="[0-9]{10}" required>
            </div>
        </div>

        <div class="row">
            <div class="col-md-6 form-group">
                State:
                <select name="state" required>
                    <option value="">Select State</option>
                    <option>Andhra Pradesh</option>
                    <option>Arunachal Pradesh</option>
                    <option>Assam</option>
                    <option>Bihar</option>
                    <option>Chhattisgarh</option>
                    <option>Goa</option>
                    <option>Gujarat</option>
                    <option>Haryana</option>
                    <option>Himachal Pradesh</option>
                    <option>Jharkhand</option>
                    <option>Karnataka</option>
                    <option>Kerala</option>
                    <option>Madhya Pradesh</option>
                    <option>Maharashtra</option>
                    <option>Manipur</option>
                    <option>Meghalaya</option>
                    <option>Mizoram</option>
                    <option>Nagaland</option>
                    <option>Odisha</option>
                    <option>Punjab</option>
                    <option>Rajasthan</option>
                    <option>Sikkim</option>
                    <option>Tamil Nadu</option>
                    <option>Telangana</option>
                    <option>Tripura</option>
                    <option>Uttar Pradesh</option>
                    <option>Uttarakhand</option>
                    <option>West Bengal</option>
                    <option>Andaman and Nicobar Islands</option>
                    <option>Chandigarh</option>
                    <option>Dadra and Nagar Haveli and Daman and Diu</option>
                    <option>Delhi</option>
                    <option>Jammu and Kashmir</option>
                    <option>Ladakh</option>
                    <option>Lakshadweep</option>
                    <option>Puducherry</option>
                </select>
            </div>
            <div class="col-md-6 form-group">
                City:
                <select name="city" required>
                    <option value="">Select City</option>
                    <option>Mumbai</option>
                    <option>Delhi</option>
                    <option>Bengaluru</option>
                    <option>Hyderabad</option>
                    <option>Chennai</option>
                    <option>Kolkata</option>
                    <option>Pune</option>
                </select>
            </div>
        </div>

        <div class="row">
            <div class="col-md-12 form-group">
                Sport:
                <select name="sport" required>
                    <option value="">Select Sport</option>
                    <option>Athletics</option>
                    <option>Swimming</option>
                    <option>Gymnastics</option>
                    <option>Hockey</option>
                    <option>Boxing</option>
                    <option>Table Tennis</option>
                    <option>Badminton</option>
                    <option>Wrestling</option>
                    <option>Weightlifting</option>
                    <option>Shooting</option>
                    <option>Fencing</option>
                    <option>Judo</option>
                    <option>Taekwondo</option>
                    <option>Basketball</option>
                    <option>Football (Soccer)</option>
                    <option>Volleyball</option>
                    <option>Tennis</option>
                    <option>Skateboarding</option>
                    <option>Surfing</option>
                    <option>Archery</option>
                    <option>Canoeing</option>
                    <option>Rowing</option>
                    <option>Cycling</option>
                    <option>Equestrian</option>
                    <option>Golf</option>
                    <option>Handball</option>
                    <option>Karate</option>
                    <option>Modern Pentathlon</option>
                    <option>Rugby Sevens</option>
                    <option>Triathlon</option>
                    <option>Chess</option>
                </select>
            </div>
        </div>

        <div class="text-center mt-4">
            <input type="submit" value="Register" class="btn btn-custom">
        </div>
    </form>
</div>

</body>
</html>
