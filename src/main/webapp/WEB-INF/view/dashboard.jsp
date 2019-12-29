<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<head>
	<meta charset="utf-8">
	<title>Buy Tandoors | Ram Chander Tandoors Pvt. Ltd | Manufacturer Tandoors and kitchen Equipment</title>
	<meta name="description" content="Worthy a Bootstrap-based, Responsive HTML5 Template">
	<meta name="author" content="htmlcoder.me">

	<!-- Mobile Meta -->
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<!-- Favicon -->
	<link rel="shortcut icon" href="images/favicon.ico">

	<!-- Web Fonts -->
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,700italic,400,700,300&amp;subset=latin,latin-ext' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Raleway:700,400,300' rel='stylesheet' type='text/css'>

	<!-- Bootstrap core CSS -->
	<link href="bootstrap/css/bootstrap.css" rel="stylesheet">

	<!-- Font Awesome CSS -->
	<link href="fonts/font-awesome/css/font-awesome.css" rel="stylesheet">

	<!-- Plugins -->
	<link href="css/animations.css" rel="stylesheet">

	<!-- Worthy core CSS file -->
	<link href="css/style.css" rel="stylesheet">

	<!-- Custom css --> 
	<link href="css/custom.css" rel="stylesheet">

</head>

<body class="no-trans">
	<!-- scrollToTop -->
	<!-- ================ -->
	<div class="scrollToTop"><i class="icon-up-open-big"></i></div>

	<!-- header start -->
	<!-- ================ --> 
	<header class="header fixed clearfix navbar navbar-fixed-top">
		<div class="container">
			<div class="row">
				<div class="col-md-4">

					<!-- header-left start -->
					<!-- ================ -->
					<div class="header-left clearfix">

						<!-- logo -->
						<div class="logo smooth-scroll">
							<a href="#banner"><img id="logo" src="images/logo.png" alt="Worthy"></a>
						</div>

						<!-- name-and-slogan -->
						<div class="site-name-and-slogan smooth-scroll">
							<div class="site-name"><a href="#banner">Ram Chander Tandoors (P) Ltd.</a></div>
							<div class="site-slogan">www.buytandoors.com <a target="_blank" href="http://htmlcoder.me">since 1952</a></div>
						</div>

					</div>
					<!-- header-left end -->

				</div>
				<div class="col-md-8">

					<!-- header-right start -->
					<!-- ================ -->
					<div class="header-right clearfix">

						<!-- main-navigation start -->
						<!-- ================ -->
						<div class="main-navigation animated">

							<!-- navbar start -->
							<!-- ================ -->
							<nav class="navbar navbar-default" role="navigation">
								<div class="container-fluid">

									<!-- Toggle get grouped for better mobile display -->
									<div class="navbar-header">
										<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse-1">
											<span class="sr-only">Toggle navigation</span>
											<span class="icon-bar"></span>
											<span class="icon-bar"></span>
											<span class="icon-bar"></span>
										</button>
									</div>

									<!-- Collect the nav links, forms, and other content for toggling -->
									<div class="collapse navbar-collapse scrollspy smooth-scroll" id="navbar-collapse-1">
										<ul class="nav navbar-nav navbar-right">
											<li class="active">
											<a href="./">Home</a></li>
											<li><a href="./">About</a></li>
											<li><a href="./">Services</a></li>
											<li><a href="./">Portfolio</a></li>
											<li><a href="./">Clients</a></li>
											<li><a href="./">Contact</a></li>
											<li><a href="./login">Admin</a></li>
										</ul>
									</div>

								</div>
							</nav>
							<!-- navbar end -->

						</div>
						<!-- main-navigation end -->

					</div>
					<!-- header-right end -->

				</div>
			</div>
		</div>
	</header>
	<!-- header end -->

	<!-- banner start -->
	<!-- ================ -->
	<div id="banner" class="banner">
		<div class="banner-image"></div>
		<div class="banner-caption">
			<div class="container">
				<div class="row">
					<div class="object-non-visible" data-animation-effect="fadeIn">
						<div class="login-form">
							<h2 class="text-center">Dash<span> Board</span></h2>
						</div>
					</div>
				</div>
			</div>
			<!-- Button trigger modal -->
			<div class="btn-group-toggle text-center"  data-toggle="buttons">
				<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#addProductModal">
					AddProduct
				</button>
				<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
					ViewProduct
				</button>
				<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
					DeleteProduct
				</button>
			</div>
		</div>
	</div>
	<!-- banner end  -->
</div>
<!-- section end -->
<!-- footer start -->
<!-- ================ -->

<!-- Modal -->
<div class="modal fade" id="addProductModal" tabindex="-1" role="dialog" aria-labelledby="addProductModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="addProductModalLabel">Add Product</h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">

	<form:form action="/submitproduct" method = "POST" enctype="multipart/form-data"  modelAttribute = "productList" onsubmit="return validation()">
		<div class="form-group">

			<div class="form-row">
				<div class="form-group">
					<form:label path="productName" for="inputEmail4">Product Name</form:label>
					<form:input path="productName" type="text" class="form-control" id="productName" placeholder="Product-Name" />
				</div>
				<div class="form-group">
					<form:label path="productDescription" for="desc">Product Description</form:label>
					<form:textarea path="productDescription" class="form-control" id="productDescription" rows="3" />
				</div>
			</div>
			<div class="form-group">
				<form:label path="productSize" for="inputAddress">Product Size</form:label>
				<form:input path="productSize" type="text" class="form-control" id="productSize" placeholder="33x33x32" />
			</div>
			<div class="form-group">
				<form:label path="feature" for="inputAddress2">Feature</form:label>
				<form:input path="feature" type="text" class="form-control" id="feature" placeholder="Iron, Best Price, Catering" />
			</div>
			<div class="form-group">
				<div class="form-check">
					<form:label path="productPicUrl" for="productPicUrl">Select Images</form:label>
					<form:input path="productPicUrl" type="file" class="form-control-file" name="productPicUrl" multiple="multiple" />
				</label>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
				<input type="submit" class="btn btn-primary"></input>
			</div>
	</form:form>
				</div>
			</div>
		</div>
   <!--    <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button> 
    </div>-->
</div>
</div>
</div>



<footer id="footer">

	<!-- .footer start -->
	<!-- ================ -->
	<div class="footer section">
		<div class="container">
			<h1 class="title text-center" id="contact">Contact Us</h1>
			<div class="space"></div>
			<div class="row">
				<div class="col-sm-6">
					<div class="footer-content">
						<p class="large">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Vel nam magnam natus tempora cumque, aliquam deleniti voluptatibus voluptas. Repellat vel, et itaque commodi iste ab, laudantium voluptas deserunt nobis.</p>
						<ul class="list-icons">
							<li><i class="fa fa-map-marker pr-10"></i> One infinity loop, 54100</li>
							<li><i class="fa fa-phone pr-10"></i> +00 1234567890</li>
							<li><i class="fa fa-fax pr-10"></i> +00 1234567891 </li>
							<li><i class="fa fa-envelope-o pr-10"></i> your@email.com</li>
						</ul>
						<ul class="social-links">
							<li class="facebook"><a target="_blank" href="https://www.facebook.com/pages/HtmlCoder/714570988650168"><i class="fa fa-facebook"></i></a></li>
							<li class="twitter"><a target="_blank" href="https://twitter.com/HtmlcoderMe"><i class="fa fa-twitter"></i></a></li>
							<li class="googleplus"><a target="_blank" href="http://plus.google.com"><i class="fa fa-google-plus"></i></a></li>
							<li class="skype"><a target="_blank" href="http://www.skype.com"><i class="fa fa-skype"></i></a></li>
							<li class="linkedin"><a target="_blank" href="http://www.linkedin.com"><i class="fa fa-linkedin"></i></a></li>
							<li class="youtube"><a target="_blank" href="http://www.youtube.com"><i class="fa fa-youtube"></i></a></li>
							<li class="flickr"><a target="_blank" href="http://www.flickr.com"><i class="fa fa-flickr"></i></a></li>
							<li class="pinterest"><a target="_blank" href="http://www.pinterest.com"><i class="fa fa-pinterest"></i></a></li>
						</ul>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="footer-content">
						<form role="form" id="footer-form">
							<div class="form-group has-feedback">
								<label class="sr-only" for="name2">Name</label>
								<input type="text" class="form-control" id="name2" placeholder="Name" name="name2" required>
								<i class="fa fa-user form-control-feedback"></i>
							</div>
							<div class="form-group has-feedback">
								<label class="sr-only" for="email2">Email address</label>
								<input type="email" class="form-control" id="email2" placeholder="Enter email" name="email2" required>
								<i class="fa fa-envelope form-control-feedback"></i>
							</div>
							<div class="form-group has-feedback">
								<label class="sr-only" for="message2">Message</label>
								<textarea class="form-control" rows="8" id="message2" placeholder="Message" name="message2" required></textarea>
								<i class="fa fa-pencil form-control-feedback"></i>
							</div>
							<input type="submit" value="Send" class="btn btn-default">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- .footer end -->

	<!-- .subfooter start -->
	<!-- ================ -->
	<div class="subfooter">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<p class="text-center">Copyright � 2014 Worthy by <a target="_blank" href="http://htmlcoder.me">HtmlCoder</a>.</p>
				</div>
			</div>
		</div>
	</div>
	<!-- .subfooter end -->

</footer>
<!-- footer end -->

		<!-- JavaScript files placed at the end of the document so the pages load faster
		================================================== -->
		<!-- Jquery and Bootstap core js files -->
		<script type="text/javascript" src="plugins/jquery.min.js"></script>
		<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>

		<!-- Modernizr javascript -->
		<script type="text/javascript" src="plugins/modernizr.js"></script>

		<!-- Isotope javascript -->
		<script type="text/javascript" src="plugins/isotope/isotope.pkgd.min.js"></script>
		
		<!-- Backstretch javascript -->
		<script type="text/javascript" src="plugins/jquery.backstretch.min.js"></script>

		<!-- Appear javascript -->
		<script type="text/javascript" src="plugins/jquery.appear.js"></script>

		<!-- Initialization of Plugins -->
		<script type="text/javascript" src="js/template.js"></script>

		<!-- Custom Scripts -->
		<script type="text/javascript" src="js/custom.js"></script>

	</body>
	</html>
