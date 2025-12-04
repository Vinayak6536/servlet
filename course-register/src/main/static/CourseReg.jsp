<html>
<head><title>Course Register</title></head>
<body>
<h1>Course Registration</h1>
<form action="course" method="post">
<pre>
Name:<input type="text" name="name"/>
Date Of Birth:<input type="date" name="dob"/>
Phone No:<input type="number" name="phone"/>
Address:<input type="text" name="address"/>
Gender:<input type="radio" name="gender" value="Male"/>Male <input type="radio" name="gender" value="female"/>Female
Course:<select name="course">
        <option name="">Select Course</option>
        <option name="bca">BCA</option>
        <option name="mca">MCA</option>
        </select>

 <input type="submit" value="send"/>
</body>
</html>