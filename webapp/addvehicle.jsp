<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Page</title>
    <link rel="stylesheet" href="style3.css">
</head>
<body>
    <div class="sidebar">
        <h2>Dashboard</h2>
        <ul>
            <li><a href="Home.jsp">Home</a></li>
        </ul>
    </div>

    <div class="container">
        <div class="admin-product-form-container">
            <form action="Vehicle" method="post" enctype="multipart/form-data">
                <h3>Add a New Vehicle</h3>
                <input type="text" placeholder="Enter vehicle name" name="vehicle_name" class="box" required>
                
                <select id="vehicleCategory" name="vehicle_category" class="box" required>
                    <option value="">Select a vehicle</option>
                    <option value="car">Car</option>
                    <option value="motorbike">Motorbike</option>
                    <option value="threewheeler">Three Wheeler</option>
                    <option value="van">Van</option>
                </select>
                <input type="file" accept="image/png, image/jpeg, image/jpg" name="product_image" class="box" required>
                <input type="hidden" name="action" value="add">
                <input type="submit" class="btn" value="Add Vehicle">
            </form>
        </div>
        
        <div class="product-display">
            <table class="product-display-table">
                <thead>
                    <tr>
                        <th>Vehicle Image</th>
                        <th>Vehicle Name</th>
                        <th>Vehicle Category</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/add_vehicle", "root", "12345");
                            Statement stmt = conn.createStatement();
                            ResultSet rs = stmt.executeQuery("SELECT * FROM vehicle");
                            while (rs.next()) {
                    %>
                    <tr>
                        <td><img src="<%= rs.getString("vehicle_image") %>" alt="Vehicle" width="50"></td>
                        <td><%= rs.getString("vehicle_name") %></td>
                        <td><%= rs.getString("vehicle_category") %></td>
                        <td>
                            <form action="Vehicle" method="post" style="display:inline;">
                                <input type="hidden" name="id" value="<%= rs.getInt("id") %>">
                                <input type="hidden" name="action" value="delete">
                                <button type="submit" class="delete-btn">Delete</button>
                            </form>
                            <button class="update-btn" onclick="editVehicle('<%= rs.getInt("id") %>', '<%= rs.getString("vehicle_name") %>', '<%= rs.getString("vehicle_category") %>')">Edit</button>
                        </td>
                    </tr>
                    <%
                            }
                            conn.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    %>
                </tbody>
            </table>
        </div>

        <!-- Update Form -->
        <div class="admin-product-form-container" id="updateForm" style="display:none;">
            <form action="Vehicle" method="post" enctype="multipart/form-data">
                <h3>Update Vehicle</h3>
                <input type="hidden" id="updateId" name="id">
                <input type="text" id="updateName" name="vehicle_name" class="box" required>
                <select id="updateCategory" name="vehicle_category" class="box" required>
                    <option value="car">Car</option>
                    <option value="motorbike">Motorbike</option>
                    <option value="threewheeler">Three Wheeler</option>
                    <option value="van">Van</option>
                </select>
                <input type="file" accept="image/png, image/jpeg, image/jpg" name="product_image" class="box">
                <input type="hidden" name="action" value="update">
                <input type="submit" class="btn" value="Update Vehicle">
            </form>
        </div>
    </div>

    <script>
        function editVehicle(id, name, category) {
            document.getElementById("updateId").value = id;
            document.getElementById("updateName").value = name;
            document.getElementById("updateCategory").value = category;
            document.getElementById("updateForm").style.display = "block";
        }
    </script>
</body>
</html>
