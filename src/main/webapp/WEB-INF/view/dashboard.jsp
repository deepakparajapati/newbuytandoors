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
					<button type="button" onclick="window.location.href='/product-view';" class="btn btn-primary">
						ViewProduct
					</button>
					<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#addCustomSize">
						AddCustomSize
					</button>
				</div>
				<br><br>
				<form class="text-center" action="/index" method="GET">
					<input class="btn btn-primary" type="submit" value="Go Live Home">
				</form>
				<br><br>
				<form class="text-center" action="/logout" method="POST">
					<input class="btn btn-primary" type="submit" value="Logout">
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />    
				</form>
			</div>
		</div>
		<!-- banner end  -->
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
						<form:form action="/submitproduct" method = "POST" enctype="multipart/form-data"  modelAttribute = "productModel" >
						<div class="form-group">
							<div class="form-group">
								<form:label path="productName" for="productName">Product Name</form:label>
								<form:input path="productName" type="text" class="form-control" id="productName" placeholder="Product-Name" />
								<td><form:errors path="productName" cssClass="alert alert-warning" /></td>
							</div>
							<div class="form-group">
								<form:label path="productDescription" for="productDescription">Product Description</form:label>
								<form:textarea path="productDescription" class="form-control" id="productDescription" rows="3" />
							</div>
							<div class="form-group">
								<form:label path="feature" for="feature">Feature</form:label>
								<form:input path="feature" type="text" class="form-control" id="feature" placeholder="Iron, Best Price, Catering" />
							</div>
							<div class="form-group">
								<div class="form-check">
									<form:label path="productPicUrl" for="productPicUrl">Select Images for Products</form:label>
									<form:input path="productPicUrl" type="file" class="form-control-file" name="productPicUrl" multiple="multiple" />
								</div>
							</div>
							<div class="form-group">
								<div class="form-check">
									<form:label path="productSpecificationImage" for="productSpecificationImage">Select Images for specification</form:label>
									<form:input path="productSpecificationImage" type="file" class="form-control-file" name="productSpecificationImage"/>
								</div>
							</div>
							<div class="form-group">
								<form:label path="modelName" for="modelName">Model Name</form:label>
								<form:input path="modelName" type="text" class="form-control" id="modelName" placeholder="DDR or MDR" />
							</div>
							<div class="form-group">
								<form:label path="applicationsUsage" for="applicationsUsage">Applications Usage</form:label>
								<div class="container">
									<div class="checkbox-inline"><label><form:checkbox path="applicationsUsage" value="Restaurants"/>Restaurants </label></div> 
									<div class="checkbox-inline"><label><form:checkbox path="applicationsUsage" value="Commercial"/> Commercial </label></div> 
									<div class="checkbox-inline"><label><form:checkbox path="applicationsUsage" value="Live Kitchen"/> Live Kitchen </label></div>
									<div class="checkbox-inline"><label><form:checkbox path="applicationsUsage" value="Outdoor"/> Outdoor </label></div> 
								</div>
								<div class="container">
									<div class="checkbox-inline"><label><form:checkbox path="applicationsUsage" value="Home"/> Home </label></div> 
									<div class="checkbox-inline"><label><form:checkbox path="applicationsUsage" value="Hotel"/> Hotel </label></div>
									<div class="checkbox-inline"><label><form:checkbox path="applicationsUsage" value="Other"/> Other </label></div>  
								</div>
							</div>
							<div class="form-group">
								<form:label path="fuleConsumptionType" for="fuleConsumptionType">Fule Consumption Type</form:label>
								<div class="container">
									<div class="checkbox-inline"><label><form:checkbox path="fuleConsumptionType" value="Coal" checked="checked"/>Coal </label></div> 
									<div class="checkbox-inline"><label><form:checkbox path="fuleConsumptionType" value="Natural"/> Natural/PNG </label></div> 
									<div class="checkbox-inline"><label><form:checkbox path="fuleConsumptionType" value="LPG" checked="checked"/> LPG </label></div>
									<div class="checkbox-inline"><label><form:checkbox path="fuleConsumptionType" value="Electric"/> Electric </label></div> 
									<div class="checkbox-inline"><label><form:checkbox path="fuleConsumptionType" value="N/A"/> N/A </label></div> 
								</div>
							</div>
							<div class="form-group">
								<form:label path="bodyMaterial" for="bodyMaterial">Outer Body Material</form:label>
								<form:select path="bodyMaterial" class="form-control" id="bodyMaterial">
								<form:options items="${listofbodymaterial}" />
							</form:select>
						</div>
						<div class="form-group">
							<form:label path="shape" for="shape">Shape</form:label>
							<form:select path="shape" class="form-control" id="shape">
							<form:options items="${listofbodyshapes}" />
						</form:select>
					</div>

					<div class="form-group">
						<form:label path="brandName" for="brandName">Brand</form:label>
						<form:input path="brandName" type="text" class="form-control" id="brandName" placeholder="RCS" value="RCS" />
					</div>

					<div class="form-group">
						<form:label path="productSize" for="productSize">Product Sizes</form:label>
						<div class="mycheckbox">	

							<form:checkboxes path="productSize" items="${listofsize}" element="span class='span'" cssStyle="margin-right : 10px"/>
						</div>
					</div>

					<div class="form-group">
						<form:label path="measurementUnit" for="measurementUnit">Measurement Unit</form:label>
						<form:select path="measurementUnit" class="form-control" id="measurementUnit">
						<form:option value="Inch" />
					</form:select>
				</div>

				<div class="form-group">
					<form:label path="numberOfWheels" for="numberOfWheels">Number of Wheels</form:label>
					<form:select path="numberOfWheels" class="form-control" id="numberOfWheels">
					<form:option value="0" />
					<form:option value="1" />
					<form:option value="2" />
					<form:option value="3" />
					<form:option value="4" selected="true"/>
					<form:option value="5" />
					<form:option value="6" />
				</form:select>
			</div>

			<div class="form-group">
				<form:label path="useCondition" for="useCondition">Used Condition</form:label>
				<form:input path="useCondition" type="text" class="form-control" id="useCondition" value="New" />
			</div>
			<div class="form-group">
				<form:label path="certification" for="certification">Certification</form:label>
				<form:input path="certification" type="text" class="form-control" id="certification" value="ISO 9001:2008" />
			</div>

			<div class="form-group">
				<form:label path="insulation" for="insulation">Insulation</form:label>
				<div class="container">
					<div class="checkbox-inline"><label><form:checkbox path="insulation" value="GlassWool"/>GlassWool </label></div> 
					<div class="checkbox-inline"><label><form:checkbox path="insulation" value="Fire Blanket"/> Fire Blanket </label></div> 
					<div class="checkbox-inline"><label><form:checkbox path="insulation" value="Ash"/> Ash </label></div>
					<div class="checkbox-inline"><label><form:checkbox path="insulation" value="Stone"/> Stone </label></div>
					<div class="checkbox-inline"><label><form:checkbox path="insulation" value="Clay"/> Clay </label></div> 
					<div class="checkbox-inline"><label><form:checkbox path="insulation" value="Mix"/> Mix </label></div>
					<div class="checkbox-inline"><label><form:checkbox path="insulation" value="N/A"/> N/A </label></div>
				</div>
				<div class="form-group">
					<form:label path="operatingTemperature" for="operatingTemperature">Operating Inside Temperature</form:label>
					<form:input path="operatingTemperature" type="text" class="form-control" id="operatingTemperature" value="250-450 Degrees" />
				</div>

				<div class="form-group">
					<form:label path="operatingOutsideTemperature" for="operatingOutsideTemperature">Operating Outside Temperature</form:label>
					<form:input path="operatingOutsideTemperature" type="text" class="form-control" id="operatingOutsideTemperature" value="60-65 Degrees" />
				</div>

				<div class="form-group">
					<form:label path="keywordMetadata" for="keywordMetadata">Keyword/Metadata</form:label>
					<form:input path="keywordMetadata" type="text" class="form-control" id="keywordMetadata" placeholder="Tandoors, Oven, Clay any three or four" />
				</div>

				<div class="form-group">
					<form:label path="usageArea" for="usageArea">Usage Area</form:label>
					<div class="container">
						<div class="checkbox-inline"><label><form:checkbox path="usageArea" value="Baking"/>Baking </label></div> 
						<div class="checkbox-inline"><label><form:checkbox path="usageArea" value="Grilling"/> Grilling </label></div> 
						<div class="checkbox-inline"><label><form:checkbox path="usageArea" value="Baking & Grilling"/> Baking & Grilling </label></div>
						<div class="checkbox-inline"><label><form:checkbox path="usageArea" value="N/A"/> N/A </label></div> 
					</div>
				</div>

				<div class="form-group">
					<form:label path="manufacturingCountry" for="manufacturingCountry">Manufacturing Country</form:label>
					<form:input path="manufacturingCountry" type="text" class="form-control" id="manufacturingCountry" value="Make in India" />
				</div>

				<div class="form-group">
					<form:label path="packing" for="packing">Packing Material</form:label>
					<form:input path="packing" type="text" class="form-control" id="packing" value="Wooden" />
				</div>
				<div class="form-group">
					<form:label path="thermometer" for="thermometer">Thermometer</form:label>
					<form:select path="thermometer" class="form-control" id="thermometer">
					<form:option value="Internal" selected="true" />
					<form:option value="External" />
					<form:option value="N/A" />
				</form:select>
			</div>

			<div class="form-group">
				<form:label path="includes" for="includes">Package Include</form:label>
				<form:input path="includes" type="text" class="form-control" id="includes" placeholder="12 Skewers (including 2 bread removal skewers), 1 cushion pad, Stainless Steel Mouth Cover" />
			</div>
			<div class="form-group">
				<form:label path="productTopCategory" for="productTopCategory">Product Top Category</form:label>
				<form:select path="productTopCategory" class="form-control" id="productTopCategory">
				<form:options items="${listofProductTopCategory}" />
			</form:select>
		</div>
		<div class="form-group">
			<form:label path="productCategory" for="productCategory">Product Category</form:label>
			<div class="container">
				<div class="checkbox-inline"><label><form:checkbox path="productCategory" value="electric" /> Electric </label></div> 
				<div class="checkbox-inline"><label><form:checkbox path="productCategory" value="clay_tandoors"/> Clay Tandoor </label></div>
				<div class="checkbox-inline"><label><form:checkbox path="productCategory" value="catering" /> Catering </label></div> 
				<div class="checkbox-inline"><label><form:checkbox path="productCategory" value="stainless_steel" /> Stainless Steel </label></div>
			</div>
			<div class="container"> 
				<div class="checkbox-inline"><label><form:checkbox path="productCategory" value="ms_body" /> MS Body </label></div>
				<div class="checkbox-inline"><label><form:checkbox path="productCategory" value="barrel" /> Barrel </label></div>
				<div class="checkbox-inline"><label><form:checkbox path="productCategory" value="home" /> Home </label></div>  
				<div class="checkbox-inline"><label><form:checkbox path="productCategory" value="wall_fitting" /> Wall Fitting </label></div>
				<div class="checkbox-inline"><label><form:checkbox path="productCategory" value="barbeque" /> Barbeque </label></div>
			</div>
			<div class="container"> 
				<div class="checkbox-inline"><label><form:checkbox path="productCategory" value="live_kitchen" /> Live Kitchen </label></div>
				<div class="checkbox-inline"><label><form:checkbox path="productCategory" value="wood_fire" /> Wood Fire </label></div>  
				<div class="checkbox-inline"><label><form:checkbox path="productCategory" value="gas_fire" /> Gas_Fire </label></div>
				<div class="checkbox-inline"><label><form:checkbox path="productCategory" value="hybrid_fire" /> Hybrid Fire </label></div>
				<div class="checkbox-inline"><label><form:checkbox path="productCategory" value="N/A" /> N/A </label></div>
			</div>
		</div>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
		<input type="submit" class="btn btn-primary"/>
	</div>
</form:form>
</div>
</div>
</div>
</div>

<!-- Add custom size -->
<!-- Modal -->
<div class="modal fade" id="addCustomSize" tabindex="-1" role="dialog" aria-labelledby="addCustomSizeLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="addProductModalLabel">Add custom size</h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">
			<form:form action="/products/submitproductsize" method = "POST" enctype="multipart/form-data"  modelAttribute = "productSizeWeightShapeModel" >
				<div class="form-group">
					<div class="form-group">
						<form:label path="shape" for="shape">Product Shape</form:label>
						<form:select path="shape" class="form-control" id="shape">
						<form:options items="${listofbodyshapes}" />
					</form:select>
				</div>

				<div class="form-group">
					<form:label path="productLength" for="productLength">Product Length</form:label>
					<form:input path="productLength" type="Number" class="form-control" id="productLength" min="1"  />
				</div>

				<div class="form-group">
					<form:label path="productWidth" for="productWidth">Product Width</form:label>
					<form:input path="productWidth" type="Number" class="form-control" id="productWidth" min="1" />
				</div>
				<div class="form-group">
					<form:label path="productHeight" for="productHeight">Product Height</form:label>
					<form:input path="productHeight" type="Number" class="form-control" id="productHeight" min="1" />
				</div>
				<div class="form-group">
					<form:label path="productMouth" for="productHeight">Product Mouth</form:label>
					<form:input path="productMouth" type="Number" class="form-control" id="productMouth" min="1" />
				</div>

				<div class="form-group">
					<form:label path="capacityPerBread" for="capacityPerBread">Capacity Per Bread</form:label>
					<form:select path="capacityPerBread" class="form-control" id="capacityPerBread">
					<form:option value="" />
					<form:option value="1 to 4" />
					<form:option value="4 to 8" />
					<form:option value="8 to 10" />
					<form:option value="10 to 12" />
					<form:option value="15 to 18" selected="true"/>
					<form:option value="20 to 22" />
					<form:option value="24 to 25" />
					<form:option value="28 to 30" />
					<form:option value="30+" />
				</form:select>
			</div>

			<div class="form-group">
				<form:label path="productSize" for="productHeight">Product Size Name</form:label>
				<form:input path="productSize" type="text" class="form-control" id="productSize" placeholder="productCategory + Size Specs like Pizzaoven Small" />
			</div>

			<div class="form-group">
				<form:label path="productWidth" for="productWidth">Product Gross Weight</form:label>
				<form:input path="productWidth" type="Number" class="form-control" id="productWidth" min="1" />
			</div>

			<div class="form-group">
				<form:label path="productWidth" for="productWidth">Product Net Weight</form:label>
				<form:input path="productWidth" type="Number" class="form-control" id="productWidth" min="1" />
			</div>

			
		</div>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
		<input type="submit" class="btn btn-primary"/>
	</div>
</form:form>
</div>
</div>
</div>
</div>

   <!--    <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button> 
    </div>-->



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
    					<p class="text-center">Copyright © 2014 Worthy by <a target="_blank" href="http://htmlcoder.me">HtmlCoder</a>.</p>
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