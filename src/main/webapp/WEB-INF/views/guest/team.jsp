<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
            <!DOCTYPE html>
            <html lang="en">

            <head>
                <jsp:include page="header.jsp" />
            </head>

            <body>
                <!-- Topbar Start -->
                <div class="container-fluid border-bottom d-none d-lg-block">
                    <div class="row gx-0">
                        <div class="col-lg-4 text-center py-2">
                            <div class="d-inline-flex align-items-center">
                                <i class="bi bi-geo-alt fs-1 text-primary me-3"></i>
                                <div class="text-start">
                                    <h6 class="text-uppercase mb-1">Our Office</h6>
                                    <span>123 Street, New York, USA</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 text-center border-start border-end py-2">
                            <div class="d-inline-flex align-items-center">
                                <i class="bi bi-envelope-open fs-1 text-primary me-3"></i>
                                <div class="text-start">
                                    <h6 class="text-uppercase mb-1">Email Us</h6>
                                    <span>info@example.com</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 text-center py-2">
                            <div class="d-inline-flex align-items-center">
                                <i class="bi bi-phone-vibrate fs-1 text-primary me-3"></i>
                                <div class="text-start">
                                    <h6 class="text-uppercase mb-1">Call Us</h6>
                                    <span>+012 345 6789</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Topbar End -->


                <!-- Navbar Start -->
                <nav class="navbar navbar-expand-lg bg-white navbar-light shadow-sm py-3 py-lg-0 px-3 px-lg-0 mb-5">
                    <a href="<c:url value='/home'/>" class="navbar-brand ms-lg-5">
                        <h1 class="m-0 text-uppercase text-dark"><i class="bi bi-shop fs-1 text-primary me-3"></i>Pet
                            Shop</h1>
                    </a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                        data-bs-target="#navbarCollapse">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarCollapse">
                        <div class="navbar-nav ms-auto py-0">
                            <a href="<c:url value='/home'/>" class="nav-item nav-link">Home</a>
                            <a href="<c:url value='/about'/>" class="nav-item nav-link">About</a>
                            <a href="<c:url value='/service'/>" class="nav-item nav-link ">Service</a>
                            <a href="<c:url value='/product'/>" class="nav-item nav-link ">Product</a>
                            <div class="nav-item dropdown">
                                <a href="#" class="nav-link dropdown-toggle active" data-bs-toggle="dropdown">Pages</a>
                                <div class="dropdown-menu m-0">
                                    <a href="<c:url value='/price'/>" class="dropdown-item">Pricing Plan</a>
                                    <a href="<c:url value='/team'/>" class="dropdown-item">The Team</a>
                                    <a href="<c:url value='/testimonial'/>" class="dropdown-item">Testimonial</a>
                                    <a href="<c:url value='/blog'/>" class="dropdown-item">Blog Grid</a>
                                    <a href="<c:url value='/blog-detail'/>" class="dropdown-item">Blog Detail</a>
                                </div>
                            </div>
                            <a href="<c:url value='/contact'/>"
                                class="nav-item nav-link nav-contact bg-primary text-white px-5 ms-lg-5">Contact <i
                                    class="bi bi-arrow-right"></i></a>
                        </div>
                    </div>
                </nav>
                <!-- Navbar End -->


                <!-- Team Start -->
                <div class="container-fluid py-5">
                    <div class="container">
                        <div class="border-start border-5 border-primary ps-5 mb-5" style="max-width: 600px;">
                            <h6 class="text-primary text-uppercase">Team Members</h6>
                            <h1 class="display-5 text-uppercase mb-0">Qualified Pets Care Professionals</h1>
                        </div>
                        <div class="owl-carousel team-carousel position-relative" style="padding-right: 25px;">
                            <div class="team-item">
                                <div class="position-relative overflow-hidden">
                                    <img class="img-fluid w-100" src="<c:url value='/assets/img/team-1.jpg'/>" alt="">
                                    <div class="team-overlay">
                                        <div class="d-flex align-items-center justify-content-start">
                                            <a class="btn btn-light btn-square mx-1" href="#"><i
                                                    class="bi bi-twitter"></i></a>
                                            <a class="btn btn-light btn-square mx-1" href="#"><i
                                                    class="bi bi-facebook"></i></a>
                                            <a class="btn btn-light btn-square mx-1" href="#"><i
                                                    class="bi bi-linkedin"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <div class="bg-light text-center p-4">
                                    <h5 class="text-uppercase">Emma Johnson</h5>
                                    <p class="m-0">DVM</p>
                                </div>
                            </div>
                            <div class="team-item">
                                <div class="position-relative overflow-hidden">
                                    <img class="img-fluid w-100" src="<c:url value='/assets/img/team-2.jpg'/>" alt="">
                                    <div class="team-overlay">
                                        <div class="d-flex align-items-center justify-content-start">
                                            <a class="btn btn-light btn-square mx-1" href="#"><i
                                                    class="bi bi-twitter"></i></a>
                                            <a class="btn btn-light btn-square mx-1" href="#"><i
                                                    class="bi bi-facebook"></i></a>
                                            <a class="btn btn-light btn-square mx-1" href="#"><i
                                                    class="bi bi-linkedin"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <div class="bg-light text-center p-4">
                                    <h5 class="text-uppercase">James Smith</h5>
                                    <p class="m-0">CVT</p>
                                </div>
                            </div>
                            <div class="team-item">
                                <div class="position-relative overflow-hidden">
                                    <img class="img-fluid w-100" src="<c:url value='/assets/img/team-3.jpg'/>" alt="">
                                    <div class="team-overlay">
                                        <div class="d-flex align-items-center justify-content-start">
                                            <a class="btn btn-light btn-square mx-1" href="#"><i
                                                    class="bi bi-twitter"></i></a>
                                            <a class="btn btn-light btn-square mx-1" href="#"><i
                                                    class="bi bi-facebook"></i></a>
                                            <a class="btn btn-light btn-square mx-1" href="#"><i
                                                    class="bi bi-linkedin"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <div class="bg-light text-center p-4">
                                    <h5 class="text-uppercase">Liam Davis</h5>
                                    <p class="m-0">CPDT-KA</p>
                                </div>
                            </div>
                            <div class="team-item">
                                <div class="position-relative overflow-hidden">
                                    <img class="img-fluid w-100" src="<c:url value='/assets/img/team-4.jpg'/>" alt="">
                                    <div class="team-overlay">
                                        <div class="d-flex align-items-center justify-content-start">
                                            <a class="btn btn-light btn-square mx-1" href="#"><i
                                                    class="bi bi-twitter"></i></a>
                                            <a class="btn btn-light btn-square mx-1" href="#"><i
                                                    class="bi bi-facebook"></i></a>
                                            <a class="btn btn-light btn-square mx-1" href="#"><i
                                                    class="bi bi-linkedin"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <div class="bg-light text-center p-4">
                                    <h5 class="text-uppercase">Olivia Anderson</h5>
                                    <p class="m-0">Pet Groomer</p>
                                </div>
                            </div>
                            <div class="team-item">
                                <div class="position-relative overflow-hidden">
                                    <img class="img-fluid w-100" src="<c:url value='/assets/img/team-5.jpg'/>" alt="">
                                    <div class="team-overlay">
                                        <div class="d-flex align-items-center justify-content-start">
                                            <a class="btn btn-light btn-square mx-1" href="#"><i
                                                    class="bi bi-twitter"></i></a>
                                            <a class="btn btn-light btn-square mx-1" href="#"><i
                                                    class="bi bi-facebook"></i></a>
                                            <a class="btn btn-light btn-square mx-1" href="#"><i
                                                    class="bi bi-linkedin"></i></a>
                                        </div>
                                    </div>
                                </div>
                                <div class="bg-light text-center p-4">
                                    <h5 class="text-uppercase">Noah Martinez</h5>
                                    <p class="m-0">Pet Sitter</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Team End -->


                <!-- Footer Start -->
                <div class="container-fluid bg-light mt-5 py-5">
                    <div class="container pt-5">
                        <div class="row g-5">
                            <div class="col-lg-3 col-md-6">
                                <h5 class="text-uppercase border-start border-5 border-primary ps-3 mb-4">Get In Touch
                                </h5>
                                <p class="mb-4">No dolore ipsum accusam no lorem. Invidunt sed clita kasd clita et et
                                    dolor sed dolor</p>
                                <p class="mb-2"><i class="bi bi-geo-alt text-primary me-2"></i>123 Street, New York, USA
                                </p>
                                <p class="mb-2"><i class="bi bi-envelope-open text-primary me-2"></i>info@example.com
                                </p>
                                <p class="mb-0"><i class="bi bi-telephone text-primary me-2"></i>+012 345 67890</p>
                            </div>
                            <div class="col-lg-3 col-md-6">
                                <h5 class="text-uppercase border-start border-5 border-primary ps-3 mb-4">Quick Links
                                </h5>
                                <div class="d-flex flex-column justify-content-start">
                                    <a class="text-body mb-2" href="#"><i
                                            class="bi bi-arrow-right text-primary me-2"></i>Home</a>
                                    <a class="text-body mb-2" href="#"><i
                                            class="bi bi-arrow-right text-primary me-2"></i>About Us</a>
                                    <a class="text-body mb-2" href="#"><i
                                            class="bi bi-arrow-right text-primary me-2"></i>Our Services</a>
                                    <a class="text-body mb-2" href="#"><i
                                            class="bi bi-arrow-right text-primary me-2"></i>Meet The Team</a>
                                    <a class="text-body mb-2" href="#"><i
                                            class="bi bi-arrow-right text-primary me-2"></i>Latest Blog</a>
                                    <a class="text-body" href="#"><i
                                            class="bi bi-arrow-right text-primary me-2"></i>Contact Us</a>
                                </div>
                            </div>
                            <div class="col-lg-3 col-md-6">
                                <h5 class="text-uppercase border-start border-5 border-primary ps-3 mb-4">Popular Links
                                </h5>
                                <div class="d-flex flex-column justify-content-start">
                                    <a class="text-body mb-2" href="#"><i
                                            class="bi bi-arrow-right text-primary me-2"></i>Home</a>
                                    <a class="text-body mb-2" href="#"><i
                                            class="bi bi-arrow-right text-primary me-2"></i>About Us</a>
                                    <a class="text-body mb-2" href="#"><i
                                            class="bi bi-arrow-right text-primary me-2"></i>Our Services</a>
                                    <a class="text-body mb-2" href="#"><i
                                            class="bi bi-arrow-right text-primary me-2"></i>Meet The Team</a>
                                    <a class="text-body mb-2" href="#"><i
                                            class="bi bi-arrow-right text-primary me-2"></i>Latest Blog</a>
                                    <a class="text-body" href="#"><i
                                            class="bi bi-arrow-right text-primary me-2"></i>Contact Us</a>
                                </div>
                            </div>
                            <div class="col-lg-3 col-md-6">
                                <h5 class="text-uppercase border-start border-5 border-primary ps-3 mb-4">Newsletter
                                </h5>
                                <form action="">
                                    <div class="input-group">
                                        <input type="text" class="form-control p-3" placeholder="Your Email">
                                        <button class="btn btn-primary">Sign Up</button>
                                    </div>
                                </form>
                                <h6 class="text-uppercase mt-4 mb-3">Follow Us</h6>
                                <div class="d-flex">
                                    <a class="btn btn-outline-primary btn-square me-2" href="#"><i
                                            class="bi bi-twitter"></i></a>
                                    <a class="btn btn-outline-primary btn-square me-2" href="#"><i
                                            class="bi bi-facebook"></i></a>
                                    <a class="btn btn-outline-primary btn-square me-2" href="#"><i
                                            class="bi bi-linkedin"></i></a>
                                    <a class="btn btn-outline-primary btn-square" href="#"><i
                                            class="bi bi-instagram"></i></a>
                                </div>
                            </div>
                            <div class="col-12 text-center text-body">
                                <a class="text-body" href="">Terms & Conditions</a>
                                <span class="mx-1">|</span>
                                <a class="text-body" href="">Privacy Policy</a>
                                <span class="mx-1">|</span>
                                <a class="text-body" href="">Customer Support</a>
                                <span class="mx-1">|</span>
                                <a class="text-body" href="">Payments</a>
                                <span class="mx-1">|</span>
                                <a class="text-body" href="">Help</a>
                                <span class="mx-1">|</span>
                                <a class="text-body" href="">FAQs</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="container-fluid bg-dark text-white-50 py-4">
                    <div class="container">
                        <div class="row g-5">
                            <div class="col-md-6 text-center text-md-start">
                                <p class="mb-md-0">&copy; <a class="text-white" href="#">Your Site Name</a>. All Rights
                                    Reserved.</p>
                            </div>
                            <div class="col-md-6 text-center text-md-end">
                                <p class="mb-0">Designed by <a class="text-white" href="https://htmlcodex.com">HTML
                                        Codex</a></p>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Footer End -->


                <!-- Back to Top -->
                <a href="#" class="btn btn-primary py-3 fs-4 back-to-top"><i class="bi bi-arrow-up"></i></a>


                <jsp:include page="footer.jsp" />
            </body>

            </html>