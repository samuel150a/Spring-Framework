<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Ice Cream Order Form</title>
    <style>
        body {
            background: #f2f2f2;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        form {
            background-color: white;
            padding: 40px;
            border-radius: 12px;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
            width: 350px;
        }

        h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #333;
        }

        label {
            display: block;
            margin-top: 15px;
            font-weight: 600;
            color: #555;
        }

        input[type="text"],
        input[type="number"],
        select {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 6px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            width: 100%;
            margin-top: 25px;
            padding: 12px;
            background-color: #28a745;
            border: none;
            border-radius: 6px;
            color: white;
            font-weight: bold;
            cursor: pointer;
            transition: background 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>

<form action="details">
    <h2>Order Your Ice Cream</h2>

    <label for="name">Name</label>
    <input type="text" name="name" id="name" placeholder="Enter your name" required>

    <label for="flavour">Choose Ice Cream Flavour:</label>
    <select id="flavour" name="flavour">
        <option value="Pista">Pista -    &#8377;40</option>
        <option value="Chocolate">Chocolate -    &#8377;41</option>
        <option value="Vanilla">Vanilla -    &#8377;42</option>
        <option value="Oreo">Oreo -    &#8377;43</option>
        <option value="Grapes">Grapes -    &#8377;44</option>
    </select>



    <label for="quantity">Quantity</label>
    <input type="number" name="quantity" id="quantity" placeholder="Enter the quantity" min="1" required>

    <label for="takeAway">Take Away</label>
    <select name="takeAway"  id="takeAway"required>
        <option value="">Select Option</option>
        <option value="yes">Yes</option>
        <option value="no">No</option>
    </select>

    <label for="addOn">Add On</label>
    <select name="addOn" id="addOn"required>
        <option value="">Select Option</option>
        <option value="yes">Yes</option>
        <option value="no">No</option>
    </select>







    <label for="coupon">Coupon</label>
    <div style="display: flex; gap: 10px;">
        <input type="text" name="coupon" id="coupon" placeholder="Click to generate" >
        <button type="button" onclick="generateCoupon()">Generate</button>
    </div>



    <input type="submit" value="Order">
</form>

<script>
    function generateCoupon() {
        const coupons = ["Hi12", "Hi13", "Hi14", "Hi15"];
        const randomIndex = Math.floor(Math.random() * coupons.length);
        const selectedCoupon = coupons[randomIndex];
        document.getElementById("coupon").value = selectedCoupon;
    }
</script>




</body>
</html>
