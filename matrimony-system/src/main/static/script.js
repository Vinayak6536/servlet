<!-- JS VALIDATION -->

    const form = document.getElementById("matForm");
    const submitBtn = document.getElementById("submitBtn");

    function validateFields() {

        let valid = true;

        // Email
        let email = document.getElementById("email").value;
        let emailErr = document.getElementById("emailErr");
        let emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (!emailRegex.test(email)) {
            emailErr.innerHTML = "Enter a valid email";
            valid = false;
            alert "Valid Email"
        } else {
            emailErr.innerHTML = "";

        }

        // Dropdown validations
        function checkDropdown(id, errId, msg) {
            let value = document.getElementById(id).value;
            let err = document.getElementById(errId);
            if (value === "") {
                err.innerHTML = msg;
                valid = false;
            } else {
                err.innerHTML = "";
            }
        }

        checkDropdown("profile", "profileErr", "Please select profile");
        checkDropdown("gender", "genderErr", "Select gender");
        checkDropdown("tongue", "tongueErr", "Select mother tongue");
        checkDropdown("religion", "religionErr", "Select religion");
        checkDropdown("marital", "maritalErr", "Select marital status");

        // Date of Birth
        let dob = document.getElementById("dob").value;
        let dobErr = document.getElementById("dobErr");
        if (dob === "") {
            dobErr.innerHTML = "Select date of birth";
            valid = false;
        } else {
            dobErr.innerHTML = "";
        }

        // Height
        let height = document.getElementById("height").value;
        let heightErr = document.getElementById("heightErr");
        if (height < 1 || height > 7 || height === "") {
            heightErr.innerHTML = "Height must be 1 to 7 feet";
            valid = false;
        } else {
            heightErr.innerHTML = "";
        }

        // Enable or disable button
        submitBtn.disabled = !valid;
    }

    // Validate on input change
    form.addEventListener("input", validateFields);
