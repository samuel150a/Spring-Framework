<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en" xmlns:form="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8" />
    <title>Upload Placement File</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
<nav class="navbar navbar-expand-lg bg-success">
    <div class="container-fluid">
        <a class="navbar-brand text-white" href="#">Placement Portal</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link text-white" href="../index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active text-white" href="Order.jsp">Upload</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <h3 class="text-center mb-4">Upload Your File</h3>

    <form:form method="post" action="order" modelAttribute="dto" enctype="multipart/form-data" class="mx-auto" style="max-width: 500px;">
        <div class="mb-3">
            <form:label path="name" class="form-label">Name</form:label>
            <form:input path="name" class="form-control" />
            <form:errors path="name" cssClass="text-danger" />
        </div>

        <div class="mb-3">
            <form:label path="multipartFile" class="form-label">Upload File</form:label>
            <form:input path="multipartFile" type="file" class="form-control" />
            <form:errors path="multipartFile" cssClass="text-danger" />
        </div>

        <div class="text-center">
            <button type="submit" class="btn btn-success">Submit</button>
        </div>

        <div class="mt-3 text-center text-danger">
            ${message}
        </div>
    </form:form>
</div>

<footer class="text-center text-white py-3 mt-5 bg-success">
    &copy; 2025 Placement Portal
</footer>
</body>
</html>
