<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Player | IPL Bidding</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-image: url("https://tse3.mm.bing.net/th/id/OIF.EG42HasxrPuUpR9txqCSsA?pid=Api&P=0&h=180");
            background-size: cover;
            background-attachment: fixed;
        }
    </style>

    <script>
        function toggleFields() {
            let type = document.getElementById("playerType").value;

            let battingDiv = document.getElementById("battingDiv");
            let bowlingDiv = document.getElementById("bowlingDiv");
            let stumpsDiv = document.getElementById("stumpsDiv");

            battingDiv.style.display = "none";
            bowlingDiv.style.display = "none";
            stumpsDiv.style.display = "none";

            if (type === "Batter") {
                battingDiv.style.display = "block";
            } else if (type === "Bowler") {
                bowlingDiv.style.display = "block";
            } else if (type === "AllRounder") {
                battingDiv.style.display = "block";
                bowlingDiv.style.display = "block";
            } else if (type === "Keeper") {
                battingDiv.style.display = "block";
                stumpsDiv.style.display = "block";
            }
        }

        function validateForm() {
            let f = document.forms["playerForm"];

            if (f.name.value.trim() === "" || !isNaN(f.name.value)) {
                alert("Enter valid player name");
                return false;
            }

            if (f.age.value < 15 || f.age.value > 50) {
                alert("Age must be between 15 and 50");
                return false;
            }

            if (f.playerType.value === "") {
                alert("Select player type");
                return false;
            }

            if (f.state.value.trim() === "" || !isNaN(f.state.value)) {
                alert("Enter valid state");
                return false;
            }

            return true;
        }
    </script>
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

<!-- FORM CARD -->
<div class="container mt-5 mb-5">
    <div class="row justify-content-center">
        <div class="col-md-7">
            <div class="card shadow">
                <div class="card-header bg-primary text-white text-center">
                    <h4>Add Player Details</h4>
                </div>

                <div class="card-body">
                    <form name="playerForm" action="register" method="post"
                          onsubmit="return validateForm();">

                        <div class="mb-3">
                            <label class="form-label">Player Name</label>
                            <input type="text" name="name" class="form-control" required>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Age</label>
                            <input type="number" name="age" class="form-control" required>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Player Type</label>
                            <select name="playerType" id="playerType"
                                    class="form-select"
                                    onchange="toggleFields()" required>
                                <option value="">-- Select Type --</option>
                                <option value="Batter">Batter</option>
                                <option value="Bowler">Bowler</option>
                                <option value="AllRounder">All Rounder</option>
                                <option value="Keeper">Keeper</option>
                            </select>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">State</label>
                            <input type="text" name="state" class="form-control" required>
                        </div>

                        <div class="mb-3" id="battingDiv" style="display:none;">
                            <label class="form-label">Batting Average</label>
                            <input type="number" step="0.01" name="battingAvg"
                                   value="0" class="form-control">
                        </div>

                        <div class="mb-3" id="bowlingDiv" style="display:none;">
                            <label class="form-label">Bowling Average</label>
                            <input type="number" step="0.01" name="bowlingAvg"
                                   value="0" class="form-control">
                        </div>

                        <div class="mb-3" id="stumpsDiv" style="display:none;">
                            <label class="form-label">No of Stumps</label>
                            <input type="number" name="stumps"
                                   value="0" class="form-control">
                        </div>

                        <div class="text-center">
                            <button class="btn btn-success px-4">
                                Add Player
                            </button>
                        </div>

                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- FOOTER -->
<footer class="bg-dark text-white text-center py-2 fixed-bottom">
    <small>© 2025 IPL Bidding Application | Developed by Xworkz</small>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
