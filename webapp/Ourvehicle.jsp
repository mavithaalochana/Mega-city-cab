<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style2.css">
    <title>Our Vehicle</title>
</head>

<body>
    
    <nav>
        <div class="logo">
            <div class="logo-image">
                <img src="logo.png" alt="">
            </div>
        </div>
        <div class="menu-items">
            <ul class="navLinks">
                <li class="navList active">
                    <a href="#">
                        <ion-icon name="home-outline"></ion-icon>
                        <span class="links"></span>
                    </a>
                </li>
                <li class="navList">
                    <a href="#">
                        <ion-icon name="folder-outline"></ion-icon>
                        <span class="links"></span>
                    </a>
                </li>
                <li class="navList">
                    <a href="#">
                        <ion-icon name="analytics-outline"></ion-icon>
                        <span class="links"></span>
                    </a>
                </li>
                <li class="navList">
                    <a href="#">
                        <ion-icon name="heart-outline"></ion-icon>
                        <span class="links"></span>
                    </a>
                </li>
                <li class="navList">
                    <a href="#">
                        <ion-icon name="chatbubbles-outline"></ion-icon>
                        <span class="links"></span>
                    </a>
                </li>
            </ul>
            <ul class="bottom-link">
                <li>
                    <a href="">
                        <ion-icon name="person-circle-outline"></ion-icon>
                        <span class="links"></span>
                    </a>
                </li>
                <li>
					<a href="Home.jsp">
					    <ion-icon name="log-out-outline"></ion-icon>
					    <span class="links">Logout</span>
					</a>
                </li>
            </ul>
        </div>
    </nav>

    <section class="dashboard">
        <div class="container">
            <div class="overview">
                <div class="title">
                    <ion-icon name="speedometer"></ion-icon>
                    <span class="text">Our Vehicle</span>
                </div>

            <!-- Recent Activities -->
            <div class="data-table activityTable">
    <div class="title">
        <ion-icon name="time-outline"></ion-icon>
        <span class="text">Our Vehicle</span>
    </div>
    <div>
        <h2>Our Vehicle</h2>

      <form method="post" action="our">
    <button type="submit">Load</button>
</form>

<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Category</th>
            <th>Image</th>
        </tr>
    </thead>
    <tbody>
        <% 
            List<String[]> vehicleList = (List<String[]>) request.getAttribute("add_vehicle"); // Fix: Corrected attribute name
            if (vehicleList != null && !vehicleList.isEmpty()) {
                for (String[] vehicle : vehicleList) {
        %>
            <tr>
                <td><%= vehicle[0] != null ? vehicle[0] : "N/A" %></td>
                <td><%= vehicle[1] != null ? vehicle[1] : "N/A" %></td>
                <td><img src="<%= vehicle[2] != null ? vehicle[2] : "default.jpg" %>" alt="Vehicle Image" width="50"></td> 
            </tr>
        <% 
                }
            } else {
        %>
            <tr>
                <td colspan="3">No data available</td>
            </tr>
        <% } %>
    </tbody>
</table>

    </div>
</div>


            
       

    <script src="index.js"></script>
    
    <!-- Sources for icons -->
    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
    
</body>

</html>