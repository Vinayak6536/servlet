<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Email Result | IPL Bidding</title>

    <!-- Bootstrap 5 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-image: url("https://tse3.mm.bing.net/th/id/OIF.EG42HasxrPuUpR9txqCSsA?pid=Api&P=0&h=180");
            background-size: cover;
            background-attachment: fixed;
        }
    </style>
</head>

<body>

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

<!-- RESULT CARD -->
<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card shadow text-center">

                <!-- SUCCESS -->
                <c:if test="${success}">
                    <div class="card-header bg-success text-white">
                        <h4>Email Saved Successfully</h4>
                    </div>
                    <div class="card-body">
                        <p><strong>Company Name:</strong> ${companyName}</p>
                        <p><strong>Email:</strong> ${email}</p>
                        <a href="SearchEmail.jsp" class="btn btn-success mt-3">Add Another</a>
                    </div>
                </c:if>

                <!-- FAILURE -->
                <c:if test="${!success}">
                    <div class="card-header bg-danger text-white">
                        <h4>Failed to Save Email</h4>
                    </div>
                    <div class="card-body">
                        <p class="text-danger">Something went wrong. Please try again.</p>
                        <a href="SearchEmail.jsp" class="btn btn-danger mt-3">Go Back</a>
                    </div>
                </c:if>

            </div>
        </div>
    </div>
</div>

<!-- FOOTER -->
<footer class="bg-dark text-white text-center py-2 fixed-bottom">
    <small>© 2025 IPL Bidding Application | Developed by Xworkz</small>
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
