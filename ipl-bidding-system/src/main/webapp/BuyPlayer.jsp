<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bid Amount | IPL Bidding</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-image: url("https://tse3.mm.bing.net/th/id/OIF.EG42HasxrPuUpR9txqCSsA?pid=Api&P=0&h=180");
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center;
            background-attachment: fixed;
        }

        .navbar-nav .nav-link {
            color: #ffffff !important;
            border: 1px solid #ffffff;
            border-radius: 6px;
            padding: 6px 14px;
            margin-left: 10px;
            transition: all 0.3s ease;
        }

        .navbar-nav .nav-link:hover {
            background-color: #ffffff;
            color: #000000 !important;
        }

        .navbar-nav .nav-link.active {
            background-color: #0d6efd;
            border-color: #0d6efd;
            color: #ffffff !important;
        }
    </style>
</head>

<body class="bg-light">

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow">
    <div class="container">
        <a class="navbar-brand fw-bold" href="index.jsp">
            <img src="https://tse3.mm.bing.net/th/id/OIP.J0QRno2r7sJ-fg9QW2yVqQHaFa?pid=Api&P=0&h=180"
                 width="40" height="40" class="me-2">
            IPL Bidding
        </a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="PlayerRegister.jsp">Add Player</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Email.jsp">Add Company Email</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="SearchEmail.jsp">Bidding</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- BID FORM -->
<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">

            <div class="card shadow">
                <div class="card-header bg-primary text-white text-center">
                    <h4>Place Bid</h4>
                </div>

                <div class="card-body">
                    <form action="bidAmount" method="post">

                        <div class="mb-3">
                            <label class="form-label">Player Name</label>
                            <input type="text"
                                   name="name"
                                   class="form-control"
                                   value="${playerlist.name}"
                                   readonly>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Bid Amount</label>
                            <input type="number"
                                   name="bidAmount"
                                   class="form-control"
                                   placeholder="Enter bid amount"
                                   required>
                        </div>

                        <div class="text-center">
                            <button type="submit" class="btn btn-success px-4">
                                Submit Bid
                            </button>
                        </div>

                        <div class="text-center mt-2 text-danger fw-semibold">
                            ${error}
                        </div>

                    </form>
                </div>
            </div>

        </div>
    </div>
</div>

<!-- FOOTER -->
<footer class="bg-dark text-white text-center py-3 fixed-bottom">
    <small>© 2025 IPL Bidding Application | Developed by Xworkz</small>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
