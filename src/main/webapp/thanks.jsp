<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Murach Submitted</title>
    <link rel="stylesheet" href="thanks.css" type="text/css"/>
</head>
<body id="wrapper-thanks">
    <h1 class="header-thanks">Thank you for taking our survey!</h1>

    <section class="wrapper-info">
        <p class="description">Here is the information</p>

        <div class="info">
            <label>First Name:</label>
            <span>${userData.firstName}</span>
        </div>

        <div class="info">
            <label>Last Name:</label>
            <span>${userData.lastName}</span>
        </div>

        <div class="info">
            <label>Email:</label>
            <span>${userData.email}</span>
        </div>

        <div class="info">
            <label>Date of Birth:</label>
            <span>${userData.dateOfBirth}</span>
        </div>

        <div class="info">
            <label>Heard About Us:</label>
            <span>${userData.chooseOne}</span>
        </div>

        <div class="info">
            <label>Contact Method:</label>
            <span>${userData.contactMethod}</span>
        </div>
    </section>

</body>
</html>
