<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Add Product - Dashboard HTML Template</title>
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
                    Admin
                </div>
            </nav>
        </div>
        <div id="layoutSidenav_content">
            <main>
                <div class="container-fluid px-4">
                    <div class="container tm-mt-big tm-mb-big">
                        <div class="row">
                          <div class="col-xl-9 col-lg-10 col-md-12 col-sm-12 mx-auto">
                            <div class="tm-bg-primary-dark tm-block tm-block-h-auto" style="margin-top: 50px;">
                              <div class="row">
                                <div class="col-12">
                                  <h2 class="tm-block-title d-inline-block">Add Product</h2>
                                </div>
                              </div>
                             
                              <form action="<c:url value='/admin/products/'/>"  class="tm-edit-product-form" enctype="multipart/form-data" method="post">
                                <div class="row tm-edit-product-row">
                                  <div class="col-xl-6 col-lg-6 col-md-12">
                                        <div class="form-group mb-3">
                                            <label for="name">Product Name</label>
                                            <input id="name" name="name" type="text" class="form-control validate" required="true"/>
                                        </div>
                    
                                        <div class="form-group mb-3">
                                          <label for="category">Category</label>
                                          <select id="category" class="custom-select tm-select-accounts" name="idCategory">
                                            <c:forEach items="${categoryList}" var="item" varStatus="indexLoop">
                                              <option value="${item.categoryId}"   >${item.categoryName}</option>
                                            </c:forEach>
                                          </select>
                                        </div>
                                        
                                        <div class="row">
                                            <div class="form-group mb-3 col-xs-12 col-sm-6">
                                                <label for="expire_date">Expire Date</label>
                                                <input id="expire_date" type="text" name="date" class="form-control validate" data-large-mode="true"/>
                                            </div>
                                            <div class="form-group mb-3 col-xs-12 col-sm-6">
                                                <label for="stock">Units In Stock</label>
                                                <input  type="number"  id="stock" name="quantity"  class="form-control validate" required="true"/>
                                            </div>
                                            
                                        </div>
                                        <div class="form-group mb-3">
                                          <label for="price">Prce</label>
                                          <input  type="number"  id="price" name="price"  class="form-control validate" required="true"/>
                                        </div>
                                  </div>
                                  <div class="col-xl-6 col-lg-6 col-md-12 mx-auto mb-4">
                                    <div class="form-group">
                                      <label for="photo">Upload New Photo</label>
                                      <input type="file" name="file" id="file"/><br/>
                                    </div>
                                  </div>
                                  <div class="col-12">
                                    <button type="submit" class="btn btn-primary btn-block text-uppercase">Add Product Now</button>
                                  </div>
                    
                                </div>
                                </form>
                            </div>
                          </div>
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
    <footer class="tm-footer row tm-mt-small">
        <div class="col-12 font-weight-light">
          <p class="text-center text-white mb-0 px-4 small">
            Copyright &copy; <b>2018</b> All rights reserved. 
            
            Design: <a rel="nofollow noopener" href="https://templatemo.com" class="tm-footer-link">Template Mo</a>
        </p>
        </div>
    </footer> 
    <script>
      $(function() {
        $("#expire_date").datepicker();
      });
    </script>
  </body>
</html>