<%if (session.getAttribute("User_email") == null) {response.sendRedirect("login"); } else {%> 
  <jsp:include page="includes/header.jsp" />  
    
    <jsp:include page="includes/userNav.jsp" />  
    
    <style>
      .card:hover {
        transform: scale(1.05);
        box-shadow: 0 10px 20px rgba(0, 0, 0, .12), 0 4px 8px rgba(0, 0, 0, .06);
        transition: 0.3s ease-in-out;
        cursor:pointer;
    }
      </style>
        <!-- Page Content  -->
          <div id="content">
  
               <nav class="navbar navbar-expand-lg navbar-light bg-light">
                  <div class="container-fluid">
  
         
                      <div>
                    	<h3 class="text-info">USER DASHBOARD</h3>
                    </div>
                     <div>
                        <p>Welcome 
                        <% if(session.getAttribute("User_gender").equals("male")){ %> 
                          Mr.
                        <%}else{%> 
                          Miss.
                        <%}%> 
                        <span class="font-weight-bold text-info">${User_firstname} ${User_lastname}</span></p>
                      </div>
                  </div>
              </nav>
  
  <link rel="stylesheet" type="text/css" href="https://pixinvent.com/stack-responsive-bootstrap-4-admin-template/app-assets/css/bootstrap-extended.min.css">
  <link rel="stylesheet" type="text/css" href="https://pixinvent.com/stack-responsive-bootstrap-4-admin-template/app-assets/fonts/simple-line-icons/style.min.css">
  <link rel="stylesheet" type="text/css" href="https://pixinvent.com/stack-responsive-bootstrap-4-admin-template/app-assets/css/colors.min.css">
  
  
  <div class="grey-bg container-fluid">
    <section id="minimal-statistics">
      <div class="row">
        <div class="col-12 mt-3 mb-1">
          
        </div>
      </div>
      <div class="row">
  
        
        <div class="col-xl-3 col-sm-6 col-12">
          <div class="card">
            <div class="card-content">
              <div class="card-body">
                <div class="media d-flex">
                  <div class="align-self-center">
                    <i class="fas fa-birthday-cake success fa-3x"></i>
                  </div>
                  <div class="media-body text-right">
                    <h3 class="primary">${totalEvents}</h3>
                    <span>Total Events</span>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        

        
        <div class="col-xl-3 col-sm-6 col-12">
          <div class="card">
            <div class="card-content">
              <div class="card-body">
                <div class="media d-flex">
                  <div class="media-body text-left">
                    <h3 class="primary">${bookings}</h3>
                    <span>Bookings</span>
                  </div>
                  <div class="align-self-center">
                    <i class="fab fa-amazon-pay primary fa-3x"></i>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        
      
        <div class="col-xl-3 col-sm-6 col-12">
          <div class="card">
            <div class="card-content">
              <div class="card-body">
                <div class="media d-flex">
                  <div class="media-body text-left">
                    <h3 class="primary">3</h3>
                    <span>Notifications</span>
                  </div>
                   <div class="align-self-center">
                    <i class="fas fa-calendar-check success fa-3x"></i>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
  
  
   




    

  </div>
    </div>
  </section>
  </div>  
   

  
     
    </div>
  </div>
  </div>
  </div>
    
    
  
  
  <%}%>