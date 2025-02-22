<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style2.css">
    <title>Driver Dashboard</title>
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
                        <span class="links">Dashboard</span>
                    </a>
                </li>
                <li class="navList">
                    <a href="#">
                        <ion-icon name="folder-outline"></ion-icon>
                        <span class="links">Send Message</span>
                    </a>
                </li>
                <li class="navList">
                    <a href="#">
                        <ion-icon name="analytics-outline"></ion-icon>
                        <span class="links">View Message</span>
                    </a>
                </li>
                <li class="navList">
                    <a href="#">
                        <ion-icon name="heart-outline"></ion-icon>
                        <span class="links">Likes</span>
                    </a>
                </li>
                <li class="navList">
                    <a href="#">
                        <ion-icon name="chatbubbles-outline"></ion-icon>
                        <span class="links">Comments</span>
                    </a>
                </li>
            </ul>
            <ul class="bottom-link">
                <li>
                    <a href="#">
                        <ion-icon name="person-circle-outline"></ion-icon>
                        <span class="links">Profile</span>
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
                    <span class="text">Driver Dashboard</span>
                </div>
                <div class="boxes">
                    <div class="box box1">
                        <ion-icon name="eye-outline"></ion-icon>
                        <span class="text">Total Views</span>
                        <span class="number">18345</span>
                    </div>
                    <div class="box box2">
                        <ion-icon name="people-outline"></ion-icon>
                        <span class="text">Active users</span>
                        <span class="number">2745</span>
                    </div>
                    <div class="box box3">
                        <ion-icon name="chatbubbles-outline"></ion-icon>
                        <span class="text">Total Activities</span>
                        <span class="number">1209</span>
                    </div>
                    <div class="box box4">
                        <ion-icon name="car-sport-outline"></ion-icon>
                        <span class="text">Insured Vehicles</span>
                        <span class="number">123</span>
                    </div>
                </div> 
            </div>
            

            <!-- Recent Activities -->
            <div class="data-table activityTable">
                <div class="title">
                    <ion-icon name="time-outline"></ion-icon>
                    <span class="text">Booking Details</span>
                </div>
                <div>
                    <h2>Bookings</h2>

    <form method="post" action="DriverdataServlet">
        <button type="submit">Load Bookings</button>
    </form>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Order Number</th>
                <th>Customer Reg. Number</th>
                <th>NIC Number</th>
                <th>Customer Name</th>
                <th>Address</th>
                <th>Telephone</th>
                <th>Destination</th>
                <th>Vehicle Category</th>
                <th>Kilometers</th>
                <th>Total Amount</th>
            </tr>
        </thead>
        <tbody>
            <% 
                List<String[]> bookings = (List<String[]>) request.getAttribute("bookings");
                if (bookings != null && !bookings.isEmpty()) {
                    for (String[] booking : bookings) {
            %>
                <tr>
                    <% for (String value : booking) { %>
                        <td><%= value != null ? value : "N/A" %></td>
                    <% } %>
                </tr>
            <% 
                    }
                } else {
            %>
                <tr>
                    <td colspan="11">No data available</td>
                </tr>
            <% } %>
        </tbody>
    </table><!-- Enter any table or section here -->
                </div>
            </div>

            
            <!-- Content -->
            <div style="display:none" class="data-table userDetailsTable">
                <div class="title">
                    <ion-icon name="folder-outline"></ion-icon>
                    <span class="text">Send Message</span>
                </div>
                <div>
   <form method="post" action="Dmessage" style="display: flex; flex-direction: column; gap: 10px; width: 300px;">
    <textarea name="message" placeholder="Your msg" required minlength="5" title="Message should be at least 5 characters long" 
        style="width: 100%; padding: 10px; border: 1px solid #ccc; border-radius: 5px; font-size: 16px; resize: none;">
    </textarea>
    <button type="submit" 
        style="padding: 10px; background-color: #4CAF50; color: white; border: none; border-radius: 5px; cursor: pointer; font-size: 16px;">
        Send Msg
    </button>
</form>
	</div>
</div>
</footer><!-- Enter any table or section here -->
                </div>
            </div>

            <!-- Analytics -->
            <div style="display:none" class="data-table EditUserRole">
                <div class="title">
                    <ion-icon name="analytics-outline"></ion-icon>
                    <span class="text">View Message</span>
                </div>
                <div>
                    <form method="post" action="drivermessage">
        <button type="submit">Messages</button>
    </form>

    <table>
        <thead>
            <tr>
                <th>Message</th>
            </tr>
        </thead>
        <tbody>
            <% 
                List<String[]> a_messages = (List<String[]>) request.getAttribute("a_messages");
                if (a_messages != null && !a_messages.isEmpty()) {
                    for (String[] Message : a_messages) {
            %>
                <tr>
                    <% for (String value : Message) { %>
                        <td><%= value != null ? value : "N/A" %></td>
                    <% } %>
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
    </table><!-- Enter any table or section here -->
                </div>
            </div>

            <!--  Likes -->
            <div style="display:none" class="data-table VehicleDetails">
                <div class="title">
                    <ion-icon name="heart-outline"></ion-icon>
                    <span class="text">Vehicles</span>
                </div>
                <div>
                    <!-- Enter any table or section here -->
                </div>
            </div>

            <!-- Downloads section -->
            <div style="display:none" class="data-table downloads">
                <div class="title">
                    <ion-icon name="chatbubbles-outline"></ion-icon>
                    <span class="text">Comments</span>
                </div>
                <div>
                    <!-- Enter any table or section here -->
                </div>
            </div>
        </div>
    </section>

    <script src="index.js"></script>
    
    <!-- Sources for icons -->
    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
    
</body>

</html>
