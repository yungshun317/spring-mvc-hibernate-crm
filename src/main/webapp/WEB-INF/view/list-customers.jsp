<%--
  Created by IntelliJ IDEA.
  User: yungshun
  Date: 2022-12-09
  Time: 09:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List Customers</title>
</head>
<body>

<div id="wrapper">
    <div id="header">
        <h2>CRM - Customer Relationship Manager</h2>
    </div>

    <div id="container">
        <div id="content">

            <!-- Add Customer -->
            <input type="button"
                   value="Add Customer"
                   onclick="window.location.href='showFormForAdd'; return false;"
                   class="add-button"
            />

            <!-- Add HTML table -->
            <table>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Action</th>
                </tr>

                <!-- Loop over and print customers -->
                <c:forEach var="tmpCustomer" items="${customers}">

                    <!-- Construct an update link with customer id -->
                    <c:url var="updateLink" value="/customer/showFormForUpdate">
                        <c:param name="customerId" value="${tmpCustomer.id}" />
                    </c:url>

                    <tr>
                        <td>${tmpCustomer.firstName}</td>
                        <td>${tmpCustomer.lastName}</td>
                        <td>${tmpCustomer.email}</td>
                        <td>
                            <!-- Display the update link -->
                            <a href="${updateLink}">Update</a>
                        </td>
                    </tr>

                </c:forEach>
            </table>
        </div>
    </div>
</div>

</body>
</html>
