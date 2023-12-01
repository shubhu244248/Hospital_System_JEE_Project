
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="components/allcss.jsp"%>
<title>Insert title here</title>
</head>
<body>
<body>

	<div>
		<%@ include file="components/navbar.jsp"%>
	</div>
	<!-- Slid Show -->
	<div id="carouselExampleIndicators" class="carousel slide"
		data-bs-ride="carousel">
		<div class="carousel-indicators">
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="0" class="active" aria-current="true"
				aria-label="Slide 1"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="1" aria-label="Slide 2"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="2" aria-label="Slide 3"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="3" aria-label="Slide 4"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="4" aria-label="Slide 5"></button>
		</div>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="images/1.png" class="d-block w-100" alt="...">
			</div>
			<div class="carousel-item">
				<img src="images/2.png" class="d-block w-100" alt="...">
			</div>
			<div class="carousel-item">
				<img src="images/3.png" class="d-block w-100" alt="...">
			</div>
			<div class="carousel-item">
				<img src="images/4.png" class="d-block w-100" alt="...">
			</div>
			<div class="carousel-item">
				<img src="images/5.png" class="d-block w-100" alt="...">
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>
	<!-- Slid Show End  -->
 
	<!-- Features Card -->
	<div class="container px-4 py-5" id="hanging-icons">
		<h2 class="pb-2 border-bottom">Hanging icons</h2>
		<div class="row g-4 py-5 row-cols-1 row-cols-lg-3">
			<div class="col d-flex align-items-start">
				<div class="icon-square bg-light text-dark flex-shrink-0 me-3">
					<i class="fa-solid fa-user-doctor"></i>
				</div>
				<div>
					<h2>Featured title</h2>
					<p>Paragraph of text beneath the heading to explain the
						heading. We'll add onto it with another sentence and probably just
						keep going until we run out of words.</p>

				</div>
			</div>
			<div class="col d-flex align-items-start">
				<div class="icon-square bg-light text-dark flex-shrink-0 me-3">
					<i class="fa-solid fa-user-doctor"></i>
				</div>
				<div>
					<h2>Featured title</h2>
					<p>Paragraph of text beneath the heading to explain the
						heading. We'll add onto it with another sentence and probably just
						keep going until we run out of words.</p>

				</div>
			</div>
			<div class="col d-flex align-items-start">
				<div class="icon-square bg-light text-dark flex-shrink-0 me-3">
					<i class="fa-solid fa-user-doctor"></i>
				</div>
				<div>
					<h2>Featured title</h2>
					<p>Paragraph of text beneath the heading to explain the
						heading. We'll add onto it with another sentence and probably just
						keep going until we run out of words.</p>

				</div>
			</div>
		</div>
	</div>
	<!-- Features Card End -->

	<!-- Team  -->
	<div class="container ">
		<h2 class=" pb-2 border-bottom">Our Team</h2>
		<div class="row">
			<div class="col-lg-4">
				<svg class="bd-placeholder-img rounded-circle" width="140"
					height="140" xmlns="http://www.w3.org/2000/svg" role="img"
					aria-label="Placeholder: 140x140"
					preserveAspectRatio="xMidYMid slice" focusable="false">
                            <title>Placeholder</title>
                            <rect width="100%" height="100%" fill="#777"></rect>
					<text x="50%" y="50%" fill="#777" dy=".3em">140x140</text>
                        </svg>

				<h2>Heading</h2>
				<p>Some representative placeholder content for the three columns
					of text below the carousel. This is the first column.</p>
				<p>
					<a class="btn btn-secondary" href="#">View details »</a>
				</p>
			</div>
			<!-- /.col-lg-4 -->
			<div class="col-lg-4">
				<svg class="bd-placeholder-img rounded-circle" width="140"
					height="140" xmlns="http://www.w3.org/2000/svg" role="img"
					aria-label="Placeholder: 140x140"
					preserveAspectRatio="xMidYMid slice" focusable="false">
                            <title>Placeholder</title>
                            <rect width="100%" height="100%" fill="#777"></rect>
					<text x="50%" y="50%" fill="#777" dy=".3em">140x140</text>
                        </svg>

				<h2>Heading</h2>
				<p>Another exciting bit of representative placeholder content.
					This time, we've moved on to the second column.</p>
				<p>
					<a class="btn btn-secondary" href="#">View details »</a>
				</p>
			</div>
			<!-- /.col-lg-4 -->
			<div class="col-lg-4">
				<svg class="bd-placeholder-img rounded-circle" width="140"
					height="140" xmlns="http://www.w3.org/2000/svg" role="img"
					aria-label="Placeholder: 140x140"
					preserveAspectRatio="xMidYMid slice" focusable="false">
                            <title>Placeholder</title>
                            <rect width="100%" height="100%" fill="#777"></rect>
					<text x="50%" y="50%" fill="#777" dy=".3em">140x140</text>
                        </svg>

				<h2>Heading</h2>
				<p>And lastly this, the third column of representative
					placeholder content.</p>
				<p>
					<a class="btn btn-secondary" href="#">View details »</a>
				</p>
			</div>
			<!-- /.col-lg-4 -->
		</div>
		<!-- /.row -->
	</div>

	<!-- Team End -->

	<!-- Fotter -->
	<%@ include file="components/footer.jsp"%>

</body>

</body>
</html>