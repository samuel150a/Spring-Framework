<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Order Confirmation</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f3f4f6;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 40px;
            color: #333;
        }

        h6 {
            font-size: 20px;
            color: #28a745;
            margin-bottom: 30px;
        }

        table {
            width: 60%;
            margin: auto;
            border-collapse: collapse;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            background-color: #fff;
        }

        th, td {
            padding: 14px 20px;
            border-bottom: 1px solid #e0e0e0;
            text-align: left;
        }

        th {
            background-color: #007bff;
            color: white;
            width: 30%;
        }

        td {
            background-color: #f9f9f9;
        }

        p {
            margin-top: 30px;
            text-align: center;
            font-size: 18px;
            font-weight: 500;
            color: #444;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">IceCream-Shop</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="Order.jsp">Order</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div align="center">
<p style="color:green;font-size:1rem;">Your order  proceeded successfully!!</p>

</div>
<table>
    <tbody>
    <tr>
        <th scope="row">Name</th>
        <td>${iceCreamShopDto.name}</td>
    </tr>
    <tr>
        <th scope="row">Flavour</th>
        <td>${iceCreamShopDto.flavour}</td>
    </tr>
    <tr>
        <th scope="row">Quantity</th>
        <td>${iceCreamShopDto.quantity}</td>
    </tr>
    <tr>
        <th scope="row">TakeAway</th>
        <td>${iceCreamShopDto.takeAway}</td>
    </tr>
    <tr>
        <th scope="row">AddOn</th>
        <td>${iceCreamShopDto.addOn}</td>
    </tr>
    <tr>
        <th scope="row">Coupon</th>
        <td>${iceCreamShopDto.coupon}</td>
    </tr>

    <tr>
        <th scope="row">Base Price</th>
        <td>Rs. ${basePrice}</td>
    </tr>
    <tr>
        <th scope="row">Discount</th>
        <td>Rs. ${discount}</td>
    </tr>
    <tr>
        <th scope="row">Final Price</th>
        <td><strong>Rs. ${price}</strong></td>
    </tr>



    </tbody>
</table>


<p>Order completed for <strong>${name}</strong>, total amount is <strong>Rs. ${price}</strong></p>

</body>
</html>
