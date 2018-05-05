<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
    <link rel="stylesheet" href="css/bootstrap-theme.css"/>
		<link rel="stylesheet" href="css/bootstrap-theme.css.map"/>
        <link rel="stylesheet" href="css/bootstrap-theme.min.css"/>
        <link rel="stylesheet" href="css/bootstrap-theme.min.css.map"/>
        <link rel="stylesheet" href="css/bootstrap.css"/>
        <link rel="stylesheet" href="css/bootstrap.css.map"/>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/bootstrap.min.css.map"/>
        
        <link rel="stylesheet" href="css/font-awesome.min.css"/>
        <link rel="stylesheet" href="font/fonts/glyphicons-halflings-regular.eot"/>
        <link rel="stylesheet"  href="font/fonts/glyphicons-halflings-regular.svgwesome.min.css"/>
        <link rel="stylesheet" href="font/fonts/glyphicons-halflings-regular.ttf"/>
        <link rel="stylesheet" href="font/fonts/glyphicons-halflings-regular.woff"/>
       <link rel="stylesheet" href="font/fonts/glyphicons-halflings-regular.woff2"/>
       <link rel="stylesheet" href="font/fonts/FontAwesome.otf"/>
       <link rel="stylesheet" href="font/fonts/fontawesome-webfont.woff2"/>
        <link rel="stylesheet" href="font/fonts/fontawesome-webfont.woff"/>
         <link rel="stylesheet" href="font/fonts/fontawesome-webfont.ttf"/>
          <link rel="stylesheet" href="font/fonts/fontawesome-webfont.svg"/>
           <link rel="stylesheet" href="font/fonts/fontawesome-webfont.eot"/>
           <link  type="text/css" rel="stylesheet" href="css/main.css"/>
        <link  type="text/css" rel="stylesheet" href="css/login.css"/>
        <link rel="stylesheet" href="css/style.css"/>
        
        <script src="js/js/html5shiv-printshiv.js"></script> <!--بتعرف عناصر html5-->
      <script src="js/js/respond.js"></script>
      <script src="js/js/respond.matchmedia.addListener.min.js"></script>
      <script src="js/js/respond.matchmedia.addListener.src.js"></script>
      <script src="js/js/html5shiv-printshiv.min.js"></script>
      <script src="js/js/html5shiv.js"></script>
       <script src="js/js/matchmedia.addListener.js"></script>
        <script src="js/js/html5shiv-printshiv.js"></script>
      <script src="js/js/html5shiv.min.js"></script>
      <script src="js/js/respond.min.js"></script>
      
 <script src="js/js/jquery-3.3.1.js"></script>
        <script src="js/js/bootstrap.min.js"></script>
</head>
<body>
<!--[endif]-->
    </head>
   <body>
  
       <nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="profile">KnowItAll <span>IUG</span></a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav nav navbar-right ">
        <li class="active"><a href="http://localhost:8080/KnowAtAllProject/main.jsp">Home<span class="sr-only">(current)</span></a></li>
        <li><a href="#">About</a></li>
   
        <li ><a href="http://localhost:8080/KnowAtAllProject/profile.jsp">
        <% String pname=(String)session.getAttribute("profileName"); out.print(pname); %> </a>  </li>
        <li class="dropdown"> 
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"> <span class="glyphicon glyphicon-user" aria-hidden="true"></span> <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="http://localhost:8080/KnowAtAllProject/profile.jsp">MY Profile</a></li>
            
            <li><a href="http://localhost:8080/KnowAtAllProject/login.jsp">Log Out</a></li>
           
            
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Search</button>
      </form>
       
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
        <section class="Entities">
              <div class="container">
                  <div class="row">
                      <div class="col-lg-12">
                        <div class="contectLeft"> 
                         <a href="http://localhost:8080/KnowAtAllProject/professor.jsp" target="_parent"><p class="lead"><span>Profesor</span></p> </a>
                           
                       </div>
                      </div>
                      <div class="col-lg-12">
                        <div class="contectLeft"> 
                         <a href="http://localhost:8080/KnowAtAllProject/Classes.jsp" target="_parent"><p class="lead"><span>Classes</span></p></a>
                           
                          </div>
                      </div>
                      <div class="col-lg-12">
                        <div class="contectLeft"> 
                         <a href="http://localhost:8080/KnowAtAllProject/coffe.jsp" target="_parent"><p class="lead"><span>Coffee</span></p> </a>
                           
                       </div>
                      </div>
                      <div class="col-lg-12">
                        <div class="contectLeft"> 
                         <a href="http://localhost:8080/KnowAtAllProject/stuff.jsp" target="_parent">  <p class="lead"><span>stuff</span></p> </a>
                           
                       </div>
                      </div>
                      <div class="col-lg-12">
                        <div class="contectLeft"> 
                         <a href="http://localhost:8080/KnowAtAllProject/food.jsp" target="_parent"><p class="lead"><span>Food</span></p> </a>
                           
                       </div>
                      </div>
                      <div class="col-lg-12">
                        <div class="contectLeft"> 
                         <a href="http://localhost:8080/KnowAtAllProject/clothes.jsp" target="_parent"><p class="lead"><span>Clothes</span></p> </a>
                           
                     </div>
                      </div>
                      
                     
                      
                      </div>
                    </div>
            
        </section>
        <section class="follower">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="Contant">
                            <img class="img-circle" src="image/bloc-7000-----2014-android.png_s" alt="NO Image"  >
                            <p class="lead"> <span>Maram Ismail</span></p>
                        </div>
                        
                    </div>
                    <div class="col-lg-12">
                        <div class="Contant">
                            <img class="img-circle" src="image/images.jpg" alt="NO Image"  >
                            <p class="lead"> <span>Hala Naser</span></p>
                        </div>
                        
                    </div>
                    <div class="col-lg-12">
                        <div class="Contant">
                            <img class="img-circle" src="image/photo.jpg" alt="NO Image"  >
                            <p class="lead"> <span>Haneen Madoukh</span></p>
                        </div>
                        
                    </div>
                    <div class="col-lg-12">
                        <div class="Contant">
                            <img class="img-circle" src="image/bac02c037d656e3326fd3192b919915a.jpg" alt="NO Image"  >
                            <p class="lead"> <span>Madleen Khaleil</span></p>
                        </div>
                        
                    </div>
                    <div class="col-lg-12">
                        <div class="Contant">
                            <img class="img-circle" src="image/%D8%AA%D9%86%D8%B2%D9%8A%D9%84.jpg" alt="NO Image"  >
                            <p class="lead"> <span>Rasha Abu Sultan</span></p>
                        </div>
                </div>     
            </div>
            </div> 
        </section>
        
        <section class="center-Area">
            <div class="container">
                
           
            </div>
        </section>
        
        
        <section class="Post-qu text-center">
           <form class="form-inline"  method="post"  action="coffe">
          <div class="container">
                <div class="row">
                    <div class="col-lg-6">
                        <div class="btn1">
                            <div class="form-group">
                                <label class="sr-only" for="exampleInputEmail3"><span>Student ID</span></label>
                                <input type="text" class="text" class="form-control" id="exampleInputEmail3" placeholder="Enter Your Question:)?" name="questionText">
                              </div>
                               <div class="form-group">
                                <label class="sr-only" for="exampleInputEmail3"><span>ratting</span></label>
                                <input type="text" class="text" class="form-control" id="exampleInputEmail3"  name="ratting">
                              </div>
                                <div class="btn-group">
                                 <div class="btn1">
                          <div class="btn1">
                            <label>Type</label>
                        <select name="selected"> Entities
                            <option value="Hatem Hamad"></option>
                            <option value="Hatem Hamad"> rating</option>

                            <option value="Mohamad mki"> polling</option>
                          </select>
                            <br>
                            <label>Life</label>
                        <select name="selected"  > Entities
                            <option value="Hatem Hamad">         </option>
                            <option value="Hatem Hamad"> forever</option>

                            <option value="Mohamad mki"> limited time</option>
                          </select>
                            <br>
                            <label>contant</label>
                            <select name="selected"  > Entities
                            <option value="Hatem Hamad">         </option>
                            <option value="Hatem Hamad"> wesam</option>

                            <option value="Mohamad mki">hatem</option>
                                <option value="Hatem Hamad">     mohamad    </option>
                            <option value="Hatem Hamad"> hatem</option>

                            <option value="Mohamad mki"> hatem</option>
                                <option value="Hatem Hamad">   hatem      </option></select>
                          <br>
                              <button type="submit" class="btn btn-success"><span>post</span></button>
                        </div>
                        </div>
                        </form>
                        
                        
                        
                        
                     </div>
                        
                    </div>
            </div>
            
            
        </section>
        
      
        <section class="center-Area">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6">
                        <div class="center">
                          <ul class="nav navbar-nav navbar-right">
       
                                <li class="dropdown">
                                  <a class="dropdown-toggle" data-toggle="dropdown" href="#"> <span class="glyphicon glyphicon-option-vertical" aria-hidden="true">
                                                    </span></a>
                                  <ul class="dropdown-menu">
                                    <li><a href="#">Share the question</a></li>
                                    
                                  </ul>
                                </li>

                              </ul>
                              <%
                              ArrayList <String> cartItemsList = (ArrayList<String>) session.getAttribute("arlist");

              for(String cartItem : cartItemsList) { %>
   
                            <P class="lead"> <%=cartItem%> </P>
                            <span class="fa fa-star checked"></span>
                            <span class="fa fa-star checked"></span>
                            <span class="fa fa-star checked"></span>
                            <span class="fa fa-star"></span>
                            <span class="fa fa-star"></span>
                            <span class="fa fa-star checked"></span>
                            <span class="fa fa-star checked"></span>
                            <span class="fa fa-star checked"></span>
                            <span class="fa fa-star"></span>
                            <span class="fa fa-star"></span>
                            <br>
                            
                             <button class="btn btn-primary" type="button"><span class="glyphicon glyphicon-thumbs-down" aria-hidden="true">
                                </span>
                                     DisLike<span class="badge">4</span>
                                          </button>
                            
                            <button class="btn btn-primary" type="button"><span class="glyphicon glyphicon-thumbs-up" aria-hidden="true">
                                </span>
                                     Like<span class="badge">4</span>
                                          </button>
                        </div>
                        <div class="center">
                            <ul class="nav navbar-nav navbar-right">
       
                                <li class="dropdown">
                                  <a class="dropdown-toggle" data-toggle="dropdown" href="#"> <span class="glyphicon glyphicon-option-vertical" aria-hidden="true">
                                                    </span></a>
                                  <ul class="dropdown-menu">
                                     <li><a href="#">Share the question</a></li>
                                  
                                  </ul>
                                </li>

                              </ul>
                              
                              
                           <%  }   %>
                           
       
       
       
       
       
       
       
       
       
                      
                        </div>
                        
                        
                    </div>
                    
                    
                </div>
                
                
            </div>
        </section>
       
       
       
       
       
        

</body>
</html>