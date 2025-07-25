<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="details">
    <div align="center">
    Name<input type="text" name="name" placeholder="enter your name"><br><br>
    Flavour<input type="text" name="flavour" placeholder="enter the flavour"><br><br>
    Quantity<input type="number" name="quantity" placeholder="enter the quantity"><br><br>
    Take Away
    <select name="takeAway" required><br><br>
        <option value="">Select Option</option><br><br>
        <option value="yes">Yes</option>
        <option value="no">No</option>
    </select>

    Add On
    <select name="addOn" required><br><br>
        <option value="yes">Yes</option><br><br>
        <option value="no">No</option><br><br>
    </select>

    Coupon<input type="text" name="coupon" placeholder="enter the coupon"><br><br>
        <input type="submit" value="Order">
    </div>



</form>

</body>
</html>