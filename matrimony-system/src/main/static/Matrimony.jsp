<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Matrimony Form</title>

    <!-- Bootstrap 5 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: linear-gradient(135deg, #FFDEE9, #B5FFFC);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 30px;
        }
        .card {
            border-radius: 20px;
        }
        .error {
            color: red;
            font-size: 0.9em;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="card shadow-lg p-4">
        <h2 class="text-center mb-4 text-primary">Matrimony Registration</h2>

        <form id="matForm" action="matrimony" method="post">

            <div class="row g-3">

                <!-- Email -->
                <div class="col-md-6">
                    <label class="form-label">Email</label>
                    <input type="email" id="email" name="email" class="form-control" placeholder="Enter Email">
                    <span class="error" id="emailErr"></span>
                </div>

                <!-- Profile Created For -->
                <div class="col-md-6">
                    <label class="form-label">Profile Created For</label>
                    <select class="form-select" id="profile" name="profile">
                        <option value="">Select</option>
                        <option value="myself">Myself</option>
                        <option value="daughter">Daughter</option>
                        <option value="son">Son</option>
                        <option value="sister">Sister</option>
                        <option value="brother">Brother</option>
                        <option value="relative">Relative</option>
                        <option value="friend">Friend</option>
                    </select>
                    <span class="error" id="profileErr"></span>
                </div>

                <!-- Gender -->
                <div class="col-md-6">
                    <label class="form-label">Gender</label>
                    <select class="form-select" id="gender" name="gender">
                        <option value="">Select Gender</option>
                        <option value="male">Male</option>
                        <option value="female">Female</option>
                    </select>
                    <span class="error" id="genderErr"></span>
                </div>

                <!-- DOB -->
                <div class="col-md-6">
                    <label class="form-label">Date of Birth</label>
                    <input type="date" id="dob" name="dob" class="form-control">
                    <span class="error" id="dobErr"></span>
                </div>

                <!-- Mother Tongue -->
                <div class="col-md-6">
                    <label class="form-label">Mother Tongue</label>
                    <select class="form-select" id="tongue" name="tongue">
                        <option value="">Select</option>
                        <option value="Kannada">Kannada</option>
                        <option value="Hindi">Hindi</option>
                        <option value="Tamil">Tamil</option>
                        <option value="Telugu">Telugu</option>
                        <option value="Marathi">Marathi</option>
                        <option value="Malayalam">Malayalam</option>
                        <option value="Bengali">Bengali</option>
                    </select>
                    <span class="error" id="tongueErr"></span>
                </div>

                <!-- Religion -->
                <div class="col-md-6">
                    <label class="form-label">Religion</label>
                    <select class="form-select" id="religion" name="religion">
                        <option value="">Select</option>
                        <option value="Hindu">Hindu</option>
                        <option value="Christian">Christian</option>
                        <option value="Muslim">Muslim</option>
                        <option value="Sikh">Sikh</option>
                        <option value="Jain">Jain</option>
                        <option value="Parsi">Parsi</option>
                        <option value="Inter-Religion">Inter-Religion</option>
                    </select>
                    <span class="error" id="religionErr"></span>
                </div>

                <!-- Marital Status -->
                <div class="col-md-6">
                    <label class="form-label">Marital Status</label>
                    <select class="form-select" id="marital" name="marital">
                        <option value="">Select</option>
                        <option value="Single">Single</option>
                        <option value="Married">Married</option>
                        <option value="Divorced">Divorced</option>
                        <option value="Widowed">Widowed</option>
                        <option value="Engaged">Engaged</option>
                        <option value="Separated">Separated</option>
                    </select>
                    <span class="error" id="maritalErr"></span>
                </div>

                <!-- Height -->
                <div class="col-md-6">
                    <label class="form-label">Height (in feet)</label>
                    <input type="number" id="height" name="height" class="form-control" min="1" max="7">
                    <span class="error" id="heightErr"></span>

                </div>

            </div>

            <div class="text-center mt-4">
                <button id="submitBtn" class="btn btn-primary px-5 py-2" disabled>Register</button>
            </div>

        </form>
    </div>
</div>

<script src="script.js"></script>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
