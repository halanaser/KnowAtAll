<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>KnowAtALL</title>
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
      
           <script src="js/js/jquery-3.3.1.min.js"></script>
        <script src="js/js/bootstrap.min.js"></script>
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
      <a class="navbar-brand" href="http://localhost:8080/knowAtAll/login.jsp">KnowItAll <span>IUG</span></a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
  
    </div><!-- /.navbar-collapse -->
  <!-- /.container-fluid -->
</nav>
    <section class="img text-center">
        <div class="login">
                 <div class="container">

                            <form class="form-inline"  method="post"  action="LoginValidate">
                              <div class="form-group">
                                <label class="sr-only" for="exampleInputEmail3"><span>Student ID</span></label>
                                <input type="text" class="form-control" id="exampleInputEmail3" placeholder="Student ID" name="student_id">
                              </div>
                                <br>
                                <br>
                              <div class="form-group">
                                <label class="sr-only" for="exampleInputPassword3"><span>Password</span></label>
                                <input type="password" class="form-control" id="exampleInputPassword3" placeholder="Password" name="password">
                              </div>
                                <br>
                                
                              <div class="checkbox">
                                  
                                <label>
                                  <input type="checkbox"> <span>Remember me</span>
                                </label>
                                  
                              </div>
                                <br>
                              <button type="submit" class="btn btn-default"><span>Sign in</span></button>
                            </form>



</body>
</html>