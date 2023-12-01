<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- allcss.jsp reusable directory-->
        <%@ include file="components/allcss.jsp" %>
            <title>Doctor Login</title>
    </head>

    <body>
        <!-- Navbar -->
        <div>
            <%@ include file="components/navbar.jsp" %>
        </div>
        <!-- Navbar End -->
        <!-- Login Form -->
        <div>
            <div class="container p-5">
                <div class="row">
                    <div class="col-md-4 offset-md-4">
                        <div class="card paint-card">
                            <div class="card-body">
                                <p class="fs-4 text-center">Doctor Login</p>
                                <form action="#" method="post">
                                    <div class="mb-3">
                                        <label class="form-label">Email address</label> <input required name="email"
                                            type="email" class="form-control">
                                    </div>

                                    <div class="mb-3">
                                        <label class="form-label">Password</label> <input required name="password"
                                            type="password" class="form-control">
                                    </div>

                                    <button type="submit" class="btn bg-primary text-white col-md-12">Login</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- footer -->
        <div>
            <%@ include file="components/footer.jsp" %>
        </div>
    </body>

    </html>