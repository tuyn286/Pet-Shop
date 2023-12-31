<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>PET SHOP table - SB Admin</title>
        <link href="<c:url value='https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/style.min.css'/>" rel="stylesheet" />
        <link href="<c:url value='/assets/css/styles.css'/>" rel="stylesheet" />
        <script src="<c:url value='https://use.fontawesome.com/releases/v6.3.0/js/all.js'/>" crossorigin="anonymous"></script>
    </head>
    <body class="sb-nav-fixed">
        <nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
            <!-- Navbar Brand-->
            <a class="navbar-brand ps-3" href="<c:url value='/home'/>">PET SHOP</a>
            <!-- Sidebar Toggle-->
            <button class="btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0" id="sidebarToggle" href="#!"><i class="fas fa-bars"></i></button>
            <!-- Navbar Search-->
            <form class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0">
                <div class="input-group">
                    <input class="form-control" type="text" placeholder="Search for..." aria-label="Search for..." aria-describedby="btnNavbarSearch" />
                    <button class="btn btn-primary" id="btnNavbarSearch" type="button"><i class="fas fa-search"></i></button>
                </div>
            </form>
            <!-- Navbar-->
            <ul class="navbar-nav ms-auto ms-md-0 me-3 me-lg-4">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
                    <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="#!">Settings</a></li>
                        <li><a class="dropdown-item" href="#!">Activity Log</a></li>
                        <li><hr class="dropdown-divider" /></li>
                        <li><a class="dropdown-item" href="#!">Logout</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
        <div id="layoutSidenav">
            <div id="layoutSidenav_nav">
                <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
                    <div class="sb-sidenav-menu">
                        <div class="nav">
                            <div class="sb-sidenav-menu-heading">Core</div>
                            <a class="nav-link" href="<c:url value='/admin/home'/>">
                                <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                                Dashboard
                            </a>
                        
                            <div class="sb-sidenav-menu-heading">Addons</div>
                            <a class="nav-link" href="<c:url value='/admin/charts'/>">
                                <div class="sb-nav-link-icon"><i class="fas fa-chart-area"></i></div>
                                Charts
                            </a>
                            <a class="nav-link" href="<c:url value='/admin/tables'/>">
                                <div class="sb-nav-link-icon"><i class="fas fa-table"></i></div>
                                Tables
                            </a>
                            <a class="nav-link" href="<c:url value='/admin/products'/>">
                            <div class="sb-nav-link-icon"><i class="fas fa-table"></i></div>
                            Add Product
                        </a>
                        </div>
                    </div>
                    <div class="sb-sidenav-footer">
                        <div class="small">Logged in as:</div>
                        Start Bootstrap
                    </div>
                </nav>
            </div>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                        <h1 class="mt-4">Table</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">Table</li>
                        </ol>

                
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table me-1"></i>
                                DataTable Example
                            </div>
                            <div class="card-body">
                                <table id="datatablesSimple">
                                    
                                    <thead>
                                        <tr>
                                            <th>Name</th>
                                            <th>Description</th>
                                            <th>Price</th>
                                            <th>Quantity</th>
                                            <th>Category</th>
                                            <th>Action</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                            <th>Name</th>
                                            <th>Description</th>
                                            <th>Price</th>
                                            <th>Quantity</th>
                                            <th>Category</th>
                                            <th>Action</th>
                                        </tr>
                                    </tfoot>
                                    <tbody>
                                        <c:forEach var="item" items="${productList}">        
                                            <tr>
                                                <td>${item.productName}</td>
                                                <td>${item.description}</td>
                                                <td>${item.price}</td>
                                                <td>${item.quantity}</td>
                                                <td>${item.categoryEntityCategoryName}</td>
                                                <td style="align-items: center;">
                                                    <a href="<c:url value='/admin/products/delete/${item.productId}'/>" style="display: block;text-align: center;">Delete</a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                  </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </main>
                <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid px-4">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Copyright &copy; Your Website 2023</div>
                            <div>
                                <a href="#">Privacy Policy</a>
                                &middot;
                                <a href="#">Terms &amp; Conditions</a>
                            </div>
                        </div>
                    </div>
                </footer>
            </div>
        </div>
        <script src="<c:url value='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js'/>" crossorigin="anonymous"></script>
        <script src="<c:url value='/assets/js/scripts.js'/>"></script>
        <script src="<c:url value='https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js'/>" crossorigin="anonymous"></script>
        <script src="<c:url value='/assets/demo/chart-area-demo.js'/>"></script>
        <script src="<c:url value='/assets/demo/chart-bar-demo.js'/>"></script>
        <script src="<c:url value='https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/umd/simple-datatables.min.js'/>" crossorigin="anonymous"></script>
        <script src="<c:url value='/assets/js/datatables-simple-demo.js'/>"></script>
        

    </body>
</html>
