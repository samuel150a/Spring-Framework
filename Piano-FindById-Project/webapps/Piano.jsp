<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Piano</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-expand-lg bg-warning">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Casio Pianos</a>
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

<div align="center">
    <h2>Casio Keyboards</h2>

    <span style="color:green;">${success}</span>
    <span style="color:red;">${failure}</span>
    <form action="Piano" method="Post">
        Customber Name:<input type="text" name="cname" required  value="${dto.customberName}"><br><br>
        Model Name:<input type="text" name="mname" required  value="${dto.modelName}"><br><br>
        No Of Keys:<input type ="int" name="kname"required  value="${dto.noOfKeys}"><br><br>
        Price:<input type ="int" name="pname"required  value="${dto.price}"><br><br>
        MemberShip:<input type="boolean" name="msname" required  value="${dto.memberShip}"><br><br>
        Manufactured by:<input type="date" name="mfname" required  value="${dto.manufactured}"><br><br>

        <input type="submit" class="btn btn-primary" value="Submit"><br><br>





    </form>
</div>

</body>
</html>