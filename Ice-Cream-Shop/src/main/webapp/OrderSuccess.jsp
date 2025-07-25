<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Order Confirmation</title>
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

<h6>Your order proceeded successfully</h6>

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
    </tbody>
</table>

<p>Order completed for <strong>${name}</strong>, total amount is <strong>Rs. ${price}</strong></p>

</body>
</html>
