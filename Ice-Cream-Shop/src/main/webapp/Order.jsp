<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Ice Cream Order Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: #f9f9f9;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            padding: 20px;
        }

        form {
            max-width: 600px;
            margin: 40px auto;
            background: #ffffff;
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.1);
        }

        h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #0d6efd;
        }

        label {
            margin-top: 15px;
            font-weight: bold;
            display: block;
        }

        input[type="text"],
        input[type="number"],
        select {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border-radius: 8px;
            border: 1px solid #ccc;
            transition: border-color 0.3s;
        }

        input[type="text"]:focus,
        input[type="number"]:focus,
        select:focus {
            border-color: #0d6efd;
            outline: none;
        }

        input[type="submit"] {
            width: 100%;
            margin-top: 25px;
            padding: 12px;
            background-color: #0d6efd;
            color: white;
            font-size: 16px;
            font-weight: bold;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #0b5ed7;
        }

        button {
            padding: 8px 16px;
            border: none;
            background-color: #6c757d;
            color: white;
            border-radius: 6px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        button:hover {
            background-color: #5a6268;
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
                    <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
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
    <select name="takeAway"  id="takeAway" required>
        <option value="">Select Option</option>
        <option value="yes">Yes</option>
        <option value="no">No</option>
    </select>

    <label for="addOn">Add On</label>
    <select name="addOn" id="addOn" required>
        <option value="">Select Option</option>
        <option value="yes">Yes</option>
        <option value="no">No</option>
    </select>

    <label for="coupon">Coupon</label>
    <div style="display: flex; gap: 10px;">
        <input type="text" name="coupon" id="coupon" placeholder="Click to generate">
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
<footer class="bg-primary text-white text-center text-lg-start">
    <div class="container p-4">
        <div class="row">
            <div class="col-lg-6 col-md-12 mb-4 mb-md-0">
                <h5 class="text-uppercase">IceCream-Shop</h5>
                <p>
                    Serving happiness, one scoop at a time! Order your favorite flavors and enjoy the chill.
                </p>
            </div>



            <div class="col-lg-3 col-md-6 mb-4 mb-md-0">
                <h5 class="text-uppercase">Contact Us</h5>
                <p>Email: Samuel@gmail.com</p>
                <p>Phone: +91-9876543210</p>
            </div>
        </div>
    </div>

    <div class="text-center p-3 bg-dark">
        © 2025 IceCream-Shop. All rights reserved.
    </div>
</footer>

</body>
</html>
