<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
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

<p>Order completed for ${name}, total amount is RS.${price}</p>
</body>
</html>