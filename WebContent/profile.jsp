<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>profile</title>
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
        <!--<link rel="stylesheet" href="css/normalize.css"> */-->  <!-- فش داعي الو لانو بوتسراب بستخدمو-->
        <link  type="text/css" rel="stylesheet" href="css/main.css"/>
<!--         <link  type="text/css" rel="stylesheet" href="css/login.css"/> -->
<!--         <link rel="stylesheet" href="css/style.css"/> -->
        <!--[if lt IE 9]-->
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
        
        
        
     
               
           <div id="Myslids" class="carousel slide" data-ride="carousel">
                         <!-- Indicators 
                    <ol class="carousel-indicators">
                         <li data-target="#Myslids" data-slide-to="0" class="active"></li>
                         <li data-target="#Myslids" data-slide-to="1"></li>
                         
                    </ol>
                      -->
                           <!-- Wrapper for slides -->

                   <div class="carousel-inner" role="listbox">
                       
                              <div class="item active">
                                    <img src="image/hhhh.jpg" alt="pic1">
                                  
                              <div class="carousel-caption">
                                      <h1><span></span>  <% String pname=(String)session.getAttribute("profileName"); out.print(pname); %> </span></h1>
                                       <div class="photo"> 
                                           <img src="image/k.jpg" width="200px;">
                                      
                                        </div>
                                      
                                     <div class="btn btn-primary">Follow</div>
                                     <div class="btn btn-success">Follower</div>
                                     <div class="btn btn-info">Following</div>
                                    
                              </div>
                              </div>
                            
                             <div class="item ">
                                    <img src="image/hhhh.jpg" alt="pic1">
                                  <div class="carousel-caption">
                                      <p class="lead">College of Engineering</p>
                                      <p class="lead">From Khan Younis</p>
                                       <p class="lead">The third level</p>
                                      
                                    
                                    
                                   </div>
                              </div>
                            
                   </div>
                   

  <!-- Controls -->
  <a class="left carousel-control" href="#Myslids" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#Myslids" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
         
        <!-- Start The Center Area-->
        
      
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