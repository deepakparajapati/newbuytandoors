<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
    </head>
<body>
    <h2>Submitted Employee Information</h2>
    <table>
        <tr>
            <td>Name :</td>
            <td>${name}</td>
        </tr>
        <tr>
            <td>ID :</td>
            <td>${id}</td>
        </tr>
        <tr>
            <td>Contact Number :</td>
            <td>${contactNumber}</td>
        </tr>
                <tr>
            <td>Image One :</td>
            <td>
                <img src="productimages/${image1}" width="200" height="100"></img>
                </td>
        </tr>
                <tr>
            <td>Image Two :</td>
            <td>
                <img src="productimages/${image2}" width="200" height="100"></img>
        </td>
        </tr>
    </table>
</body>
</html>