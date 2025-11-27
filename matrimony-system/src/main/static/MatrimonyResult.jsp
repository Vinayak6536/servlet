<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
        rel="stylesheet">
    <title>Profile</title>
</head>
<body class="bg-light p-4">

<div class="container">
    <div class="card shadow-sm">
        <div class="card-header bg-primary text-white">
            Matrimony Details
        </div>
        <ul class="list-group list-group-flush">
            <li class="list-group-item"><strong>Email:</strong> ${email}</li>
            <li class="list-group-item"><strong>Profile:</strong> ${profile}</li>
            <li class="list-group-item"><strong>Gender:</strong> ${gender}</li>
            <li class="list-group-item"><strong>Date Of Birth:</strong> ${dob}</li>
            <li class="list-group-item"><strong>Tongue:</strong> ${tongue}</li>
            <li class="list-group-item"><strong>Religion:</strong> ${religion}</li>
            <li class="list-group-item"><strong>Marital:</strong> ${marital}</li>
            <li class="list-group-item"><strong>Height:</strong> ${height}</li>
        </ul>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
