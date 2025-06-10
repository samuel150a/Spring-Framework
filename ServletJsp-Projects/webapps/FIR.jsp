<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>FIR</title>

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

</head>

<nav class="navbar navbar-expand-lg bg-warning">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Karnataka Police Office Portal</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarScroll">
      <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
        </li>




          </ul>
        </li>

      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>

<body>

<div align="center">
<h2>Complient-Registration</h2>
<form action="Reg" method="Post">
  Police Station Name:<input type="text" name="pname"><br><br>
Name:<input type="text" name="name"><br><br>
Complaint:<input type="text" name="complaint"><br><br>
City:<input type="text" name="city"><br><br>
Aadhar proof:<input type="file" name="aadhar"><br><br>
<input type="submit" class="btn btn-primary"value="Register FIR"><br><br>
  <h1></h1>
</form>
</div>





</body>


<style>
  .navbar {
    background-color: #ffc107;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    padding: 0.75rem 1rem;
  }

  .navbar-brand {
    font-weight: 700;
    font-size: 1.25rem;
    color: #212529;
  }

  .navbar-brand:hover {
    color: #0d6efd;
  }

  .nav-link {
    color: #212529;
    font-weight: 500;
    margin-right: 10px;
    transition: color 0.3s ease, background-color 0.3s ease;
  }

  .nav-link:hover,
  .nav-link.active {
    color: #0d6efd;
    background-color: rgba(0, 0, 0, 0.05);
    border-radius: 5px;
  }

  .form-control {
    border-radius: 0.375rem;
  }

  .btn-outline-success {
    border-color: #198754;
    color: #198754;
    transition: all 0.3s ease;
  }

  .btn-outline-success:hover {
    background-color: #198754;
    color: #fff;
  }

  .navbar-toggler {
    border: none;
  }

  .navbar-toggler:focus {
    box-shadow: none;
  }
</style>

</html>