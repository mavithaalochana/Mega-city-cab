<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"> 
    <link rel="stylesheet" href="style.css">
    
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<title>Cab booking compnay </title>
</head>
<body>
<body>
		
		
		<header>
			<nav class="navbar  fixed-top navbar-expand-lg navbar-light  " style="background: #feeb03">
				<a class="navbar-brand" href="#">
					
					<span class="nav-logo-text"> Mega City Cab</span>
				</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarNavDropdown">
					<div class="mr-auto"></div>
					<ul class="navbar-nav">
						<li class="nav-item active">
							<a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="#book-section">Book</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="#our-vehicle">Our Vehicle</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="#our-pricing">Pricing</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="#Feedback">Feedback</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="#contact">Contact us</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="Home.jsp">Logout</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="Ourvehicle.jsp">New Our Vehicle</a>
						</li>
						
					</ul>
				</div>
			</nav>
			<div class="carousel-bg">
				<div id="carouselExampleIndicators" class="carousel slide container" data-ride="carousel">
					<ol class="carousel-indicators">
						<li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
						<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
						<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
					</ol>
					<div class="carousel-inner">
						<div class="carousel-item active">
							<div class="row">
								<div class="col-sm-6">
									<div class="margin-top">
										<h6 class="header-span">REACH YOUR <b>DESTINATION</b> </h6>
										<h1 class="header-larg-text">LET'S<span class="header-cricle animated">go</span></h1>
										<h3 class="header-heading">start at <b> 10rs</b> <sup>/km</sup></h3>
										
										<span class="headedr-span-sec"> You get a 2% discount if you travel more than 250 km</span>
										<div class="row">
											<div class="col-sm-6">
												<button type="button" class="custom-btn btn btn-light">BOOK NOW</button>
											</div>
										</div>
									</div>
									
								</div>
								<div class="col-sm-6">
									<img src="img/slider1.svg" class="d-block w-100" alt="...">
								</div>
							</div>
							
						</div>
						<div class="carousel-item">
							<div class="row">
								<div class="col-sm-6">
									<h6 class="header-span">In Our<b> Package</b> </h6>
									<h1 class="header-larg-text">Enjo<span class="header-cricle animated">ye</span></h1>
									<h3 class="header-heading">Only <b> 200rs</b> <sup>/hr</sup></h3>
									
									<span class="headedr-span-sec"> You get a 2% discount if you travel more than 250 km</span>
									<div class="row">
										<div class="col-sm-6">
											<button type="button" class="custom-btn btn btn-light">VIEW PACAKAGE</button>
										</div>
									</div>
									
								</div>
								<div class="col-sm-6">
									<img src="img/slider2.svg" class="d-block w-100" alt="...">
								</div>
							</div>
						</div>
						<div class="carousel-item">
							<div class="row">
								<div class="col-sm-6">
									<h6 class="header-span">Ready To comfirt  <b>ride</b> </h6>
									<h1 class="header-larg-text">FREE<span class="header-cricle animated">$0</span></h1>
									<h3 class="header-heading">First Ride  <b> 1</b> <sup>/km</sup></h3>
									
									<span class="headedr-span-sec"> You get a 2% discount if you travel more than 250 km</span>
									<div class="row">
										<div class="col-sm-6">
											<button type="button" class="custom-btn btn btn-light">BOOK YOUR RIDE</button>
										</div>
									</div>
									
								</div>
								<div class="col-sm-6">
									<img src="img/slider2.svg" class="d-block w-100" alt="...">
								</div>
							</div>
						</div>
					</div>
					
					<span class="sr-only">Next</span>
				</a>
			</div>
		</div>
	</div>
</header>
<main>
	<!-- section book cab-->
	<section class="bookcab" id="book-section">
    <div class="container container-shadow">
        <div class="row">
            <div class="col-md-5 padding70 bg-white">
                <div class="short-intro">
                    <h4 class="bookcab-heading"> book <small> a cab</small>
                        <br> <span>GO DRIVE</span>
                    </h4>
                    <p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a</p>
                    <blockquote class="custom-blockquote"><i class="bb"> Contrary to popular belief, Lorem Ipsum literature from 45 BC, making it </i> </blockquote>
                    <ul class="list">
                        <li>Super & reliable services</li>
                        <li>24 X 7 customer support provide</li>
                        <li>Large Range of Car Models</li>
                        <li>GPS Tracking and help</li>
                        <li>Powerful Security Offer</li>
                        <li>You get a 2% discount if you travel more than 250 km</li>
                    </ul>
                    <div class="buttons">
                        <button type="button" class="btn btn-warning btn-cus">CONTACT US</button>
                        <button type="button" class="btn btn-light btn-cus">ABOUT US</button>
                    </div>
                </div>
            </div>

            <div class="col-md-7 padding70 bg-yellow">
                <h2>New Customer Booking</h2>
<form id="bookingForm" method="post" action="<%= request.getContextPath() %>/BookingServlet">
    <div class="row">
        <div class="col-sm-6 mb-3">
            <label for="orderNumber">Order Number:</label>
            <input type="text" id="orderNumber" name="orderNumber" class="form-control" required>
        </div>
        <div class="col-sm-6 mb-3">
            <label for="customerRegNumber">Customer Registration Number:</label>
            <input type="text" id="customerRegNumber" name="customerRegNumber" class="form-control" required>
        </div>
        <div class="col-sm-6 mb-3">
            <label for="nicNumber">NIC Number:</label>
            <input type="text" id="nicNumber" name="nicNumber" class="form-control" required>
        </div>
        <div class="col-sm-6 mb-3">
            <label for="customerName">Customer Name:</label>
            <input type="text" id="customerName" name="customerName" class="form-control" required>
        </div>
        <div class="col-sm-6 mb-3">
            <label for="address">Address:</label>
            <input type="text" id="address" name="address" class="form-control" required>
        </div>
        <div class="col-sm-6 mb-3">
            <label for="telephone">Telephone Number:</label>
            <input type="tel" id="telephone" name="telephone" class="form-control" required>
        </div>
        <div class="col-sm-6 mb-3">
            <label for="destination">Destination Details:</label>
            <input type="text" id="destination" name="destination" class="form-control" required>
        </div>
        <div class="col-sm-6 mb-3">
            <label for="vehicleCategory">Vehicle Category:</label>
            <select id="vehicleCategory" name="vehicleCategory" class="form-control" required>
                <option value="">Select a vehicle</option>
                <option value="car">Car</option>
                <option value="motorbike">Motorbike</option>
                <option value="threewheeler">Three Wheeler</option>
                <option value="van">Van</option>
            </select>
        </div>
        <div class="col-sm-6 mb-3">
            <label for="kilometers">Total Kilometers Travelled:</label>
            <input type="number" id="kilometers" name="kilometers" class="form-control" required oninput="calculateAmount()">
        </div>
        <div class="col-sm-6 mb-3">
            <label for="totalAmount">Total Amount (LKR):</label>
            <input type="text" id="totalAmount" name="totalAmount" class="form-control" readonly>
        </div>
        <div class="col-sm-12 text-center">
            <button type="submit" class="btn btn-success btn-cus">SUBMIT</button>
        </div>
    </div>
</form>
            </div>
        </div>
    </div>
</section>
<!-- our vehicle-->
<section class="padding180" id="our-vehicle">
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<div class="short-intro">
					<h4 class="bookcab-heading"> OUR  <small> VEHICLE</small>
					<br> <span>GO DRIVE</span>
					</h4>
					
				</div>
			</div>
			<div class="col-md-6">
				<ul class=" nav  pull-right">
					<li class="nav-link active"> <a href="#cab" data-toggle="tab"  >CAR</a></li>
					<li class="nav-link"> <a href="#cab" data-toggle="tab"  >TAXI</a></li>
					<li class="nav-link" > <a href="#cab" data-toggle="tab"  >CAB</a></li>
					
				</ul>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3">
				<div class="card" style="">
					<img src="img/card-img/car1.svg" class="card-img custom-img" alt="...">
					<div class="card-body">
						<h5 class="card-title">Vehical 1 </h5>
						<small class="card-small">start from $300</small>
						<p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin </p>
						<span class="divider"></span>
						<div class="row">
							<div class="col-md-4">
								<img src="img/card-img/driver1.svg" width="60px" height="60px">
							</div>
							<div class="col-md-8">
								<h6 class="driver-name">Mark Juckerburg</h6>
							</div>
						</div>
						
						
						
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="card" style="">
					<img src="img/card-img/car2.svg" class="card-img custom-img" alt="...">
					<div class="card-body">
						<h5 class="card-title">Vehical 1 </h5>
						<small class="card-small">start from $300</small>
						<p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin </p>
						<span class="divider"></span>
						<div class="row">
							<div class="col-md-4">
								<img src="img/card-img/driver1.svg" width="60px" height="60px">
							</div>
							<div class="col-md-8">
								<h6 class="driver-name">Mark Juckerburg</h6>
							</div>
						</div>
						
						
						
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="card" style="">
					<img src="img/card-img/bike.svg" class="card-img custom-img" alt="...">
					<div class="card-body">
						<h5 class="card-title">Vehical 1 </h5>
						<small class="card-small">start from $300</small>
						<p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin </p>
						<span class="divider"></span>
						<div class="row">
							<div class="col-md-4">
								<img src="img/card-img/driver1.svg" width="60px" height="60px">
							</div>
							<div class="col-md-8">
								<h6 class="driver-name">Mark Juckerburg</h6>
							</div>
						</div>
						
						
						
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="card" style="">
					<img src="img/card-img/jip.svg" class="card-img custom-img" alt="...">
					<div class="card-body">
						<h5 class="card-title">Vehical 1 </h5>
						<small class="card-small">start from $300</small>
						<p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin </p>
						<span class="divider"></span>
						<div class="row">
							<div class="col-md-4">
								<img src="img/card-img/driver1.svg" width="60px" height="60px">
							</div>
							<div class="col-md-8">
								<h6 class="driver-name">Mark Juckerburg</h6>
							</div>
						</div>
						
						
						
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- our pricing-->
	<section class="our-pricing padding180 " id="our-pricing">
		<div class="container">
			<div class="row">
				<div class="short-intro" style="MARGIN-LEFT: 48PX;">
					<h4 class="bookcab-heading yellow"> OUR  <small style="color: #fff"> pricing</small>
					<br> <span>GO DRIVE</span>
					</h4>
				</div>
				<div class="row text-center align-items-end">
					
					<div class="col-lg-4 mb-5 mb-lg-0">
						<div class="bg-white p-5 rounded-lg shadow">
							<h1 class="h6 text-uppercase font-weight-bold mb-4 card-title">Basic</h1>
							<h2 class="h1 font-weight-bold">500<span class="text-small font-weight-normal ml-2">/ month</span></h2>
							<div class="custom-separator my-4 mx-auto bg-primary"></div>
							<ul class="list-unstyled my-5 text-small text-left">
								<li class="mb-3">
								<i class="fa fa-check mr-2  active"></i> Lorem ipsum dolor sit amet</li>
								<li class="mb-3">
								<i class="fa fa-check mr-2  active"></i> Sed ut perspiciatis</li>
								<li class="mb-3">
								<i class="fa fa-check mr-2  active"></i> At vero eos et accusamus</li>
								<li class="mb-3 text-muted">
									<i class="fa fa-times mr-2"></i>
									<del>Nam libero tempore</del>
								</li>
								<li class="mb-3 text-muted">
									<i class="fa fa-times mr-2"></i>
									<del>Sed ut perspiciatis</del>
								</li>
								<li class="mb-3 text-muted">
									<i class="fa fa-times mr-2"></i>
									<del>Sed ut perspiciatis</del>
								</li>
							</ul>
							<button type="button" class="btn btn-warning btn-cus">CONTACT US</button>
						</div>
					</div>
					
					<div class="col-lg-4 mb-5 mb-lg-0">
						<div class="bg-white p-5 rounded-lg shadow">
							<h1 class="h6 text-uppercase font-weight-bold mb-4 card-title">Pro</h1>
							<h2 class="h1 font-weight-bold">399<span class="text-small font-weight-normal ml-2">/ month</span></h2>
							<div class="custom-separator my-4 mx-auto bg-primary"></div>
							<ul class="list-unstyled my-5 text-small text-left font-weight-normal">
								<li class="mb-3">
								<i class="fa fa-check mr-2  active"></i> Lorem ipsum dolor sit amet</li>
								<li class="mb-3">
								<i class="fa fa-check mr-2  active"></i> Sed ut perspiciatis</li>
								<li class="mb-3">
								<i class="fa fa-check mr-2  active"></i> At vero eos et accusamus</li>
								<li class="mb-3">
								<i class="fa fa-check mr-2  active"></i> Nam libero tempore</li>
								<li class="mb-3">
								<i class="fa fa-check mr-2  active"></i> Sed ut perspiciatis</li>
								<li class="mb-3 text-muted">
									<i class="fa fa-times mr-2"></i>
									<del>Sed ut perspiciatis</del>
								</li>
							</ul>
							<button type="button" class="btn btn-warning btn-cus">CONTACT US</button>
						</div>
					</div>
					
					<div class="col-lg-4">
						<div class="bg-white p-5 rounded-lg shadow">
							<h1 class="h6 text-uppercase font-weight-bold mb-4 card-title">Enterprise</h1>
							<h2 class="h1 font-weight-bold">899<span class="text-small font-weight-normal ml-2">/ month</span></h2>
							<div class="custom-separator my-4 mx-auto bg-primary"></div>
							<ul class="list-unstyled my-5 text-small text-left font-weight-normal">
								<li class="mb-3">
								<i class="fa fa-check mr-2  active"></i> Lorem ipsum dolor sit amet</li>
								<li class="mb-3">
								<i class="fa fa-check mr-2  active"></i> Sed ut perspiciatis</li>
								<li class="mb-3">
								<i class="fa fa-check mr-2  active"></i> At vero eos et accusamus</li>
								<li class="mb-3">
								<i class="fa fa-check mr-2  active"></i> Nam libero tempore</li>
								<li class="mb-3">
								<i class="fa fa-check mr-2  active"></i> Sed ut perspiciatis</li>
								<li class="mb-3">
								<i class="fa fa-check mr-2 active"></i> Sed ut perspiciatis</li>
							</ul>
							<button type="button" class="btn btn-warning btn-cus">CONTACT US</button>
						</div>
					</div>
					
				</div>
			</div>
		</section>
	</div>
	
</div>
</div>
</section>
<!-- testmonials-->
<section class="bookcab" id="Feedback">
<div class="container container-shadow">
<div class="row">
	<div class="col-md-5 padding-custom bg-white">
		<div class="short-intro">
			<h4 class="bookcab-heading"> PASSENGER  <small> FEED</small></h4>
			<br> <span>WHAT SAY OUR PASSENGER</span>
			<p style="    margin-top: 46px;">Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a  </p>
			
			<div class="buttons">
				<button type="button" class="btn btn-warning btn-cus">CONTACT US</button> <button type="button" class="btn btn-light btn-cus">ABOUT AS</button>
			</div>
		</div>
	</div>
	<div class="col-md-7 padding-custom">
		<section class="text-center my-5">
			
			<div class="wrapper-carousel-fix">
				
				<div id="carousel-example-1" class="carousel no-flex testimonial-carousel slide carousel-fade" data-ride="carousel"
					data-interval="false">
					
					<div class="carousel-inner" role="listbox">
						
						<div class="carousel-item active">
							<div class="testimonial">
								
								<div class="avatar mx-auto mb-4">
									<img src="img/card-img/driver1.svg" width="80px" height="80px" class="rounded-circle ">
								</div>
								
								<p>
									<i class="fas fa-quote-left"></i> Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod
									eos
									eos
									
								</p>
								<h4 >Maria Kate</h4>
								<h6 >PASSENGER </h6>
								
							</div>
						</div>
						
						<div class="carousel-item">
							<div class="testimonial">
								
								<div class="avatar mx-auto mb-4">
									<img src="img/card-img/driver1.svg" width="80px" height="80px" class="rounded-circle ">
								</div>
								
								<p>
									<i class="fas fa-quote-left"></i> Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut
									odit
								</p>
								<h4 class="">Maria Kate</h4>
								<h6 class="font-weight-bold my-3">PASSENGER </h6>
								
							</div>
						</div>
						
					</div>
					
					<a class="carousel-control-prev left carousel-control" href="#carousel-example-1" role="button"
						data-slide="prev">
						<span class="icon-prev" aria-hidden="true"></span>
						<span class="sr-only">Previous</span>
					</a>
					<a class="carousel-control-next right carousel-control" href="#carousel-example-1" role="button"
						data-slide="next">
						<span class="icon-next" aria-hidden="true"></span>
						<span class="sr-only">Next</span>
					</a>
					
				</div>
				
			</section>
			
		</div>
	</div>
</div>
</section>
</main>
<!--footer section-->
<footer class="footer-padding180 footer" id="contact">
<div class="container">
<div class="row">
	<div class="col-md-3">
		<div class="short-intro" style="margin: 65px 0px 0px 0px;">
			<h4 class="bookcab-heading yellow"> contact <small> </small>
			</h4>
			<address>
				<strong>HEAD OFFICE</strong>
				<p>11 Street No, Jagtpura <br> Near flyover, 012324-12</p>
				<ul class="contact-info">
					<li><i class="fa fa-headphones"></i> (99) 999 - 888 - 12 </li>
					<li><i class="fa fa-print"></i> 123-456-7890 </li>
					<li><i class="fa fa-envelope"></i> <a href="mailTo:support@demo.com">support@demo.com</a> </li>
					<li><i class="fa fa-briefcase "></i> <a href="mailTo:career@demo.com">career@demo.com</a> </li>
				</ul>
			</address>
			
			<ul class="social-icon" style="">
				<li><a href="" class="fab fa-facebook-square"></a></li>
				<li><a href="" class="fab fa-twitter-square"></a></li>
				<li><a href="" class="fab fa-youtube-square"></a></li>
				<li><a href="" class="fab fa-pinterest-square"></a></li>
			</ul>
			
			<p class="copyright">© 2019 <i>HUNGERY CODERS</i> All Rights Reserved</p>
			
		</div>
		</h4>
	</div>
	<div class="col-md-5 msg-form footer-padding">
		<h3 class="toll-free">
		IF YOU HAVE A QUESTION ? FILL THE FORM
		</h3>
		
	
			<form method="post" action="<%= request.getContextPath() %>/Contact">
    <input type="text" name="name" placeholder="Name" required pattern="[A-Za-z ]{2,}" title="Name should contain only letters and be at least 2 characters long">
    <input type="email" name="email" placeholder="Email" required>
    <textarea name="message" placeholder="Your msg" required minlength="5" title="Message should be at least 5 characters long"></textarea>
    <button type="submit">Send Msg</button>
</form>

	</div>
</div>
</footer>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</body>
</html>