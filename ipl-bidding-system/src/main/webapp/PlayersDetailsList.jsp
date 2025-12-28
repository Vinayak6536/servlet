<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Players Details | IPL Bidding</title>

    <!-- Bootstrap CSS -->
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

<!-- CONTENT -->
<div class="container mt-5 mb-5">

    <h3 class="text-center text-white mb-4">Players Details</h3>

    <div class="card shadow">
        <div class="card-body">

            <c:choose>
                <c:when test="${player != null && player.size() > 0}">
                    <div class="table-responsive">
                        <table class="table table-bordered table-striped table-hover text-center align-middle">
                            <thead class="table-dark">
                            <tr>
                                <th>Name</th>
                                <th>Age</th>
                                <th>Type</th>
                                <th>State</th>
                                <th>Bat Avg</th>
                                <th>Bowl Avg</th>
                                <th>Stumps</th>
                                <th>Bid</th>
                            </tr>
                            </thead>

                            <tbody>
                            <c:forEach var="p" items="${player}">
                                <tr>
                                    <td>${p.name}</td>
                                    <td>${p.age}</td>
                                    <td>${p.playerType}</td>
                                    <td>${p.state}</td>
                                    <td>${p.battingAvg}</td>
                                    <td>${p.bowlingAvg}</td>
                                    <td>${p.stumps}</td>
                                    <td><a href="bidding?bidPlayer=${p.name}" class="btn btn-primary btn-sm">
                                                Bid
                                            </a></td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </c:when>

                <c:otherwise>
                    <h5 class="text-danger text-center">No players available</h5>
                </c:otherwise>
            </c:choose>

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
