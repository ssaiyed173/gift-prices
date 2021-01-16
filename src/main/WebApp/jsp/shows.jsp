<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta charset="utf-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <title>Gift Prices</title>

   <!-- Bootstrap -->
   <link href="css/bootstrap.min.css" rel="stylesheet">
   <link href="css/dataTables.bootstrap.min.css" rel="stylesheet">
   <link href="css/style.css" rel="stylesheet">

   
 </head>
<body>
<nav class="navbar navbar-default" style="color: cyan !important">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="index">Gift  Prices</a>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="index">Home </a></li>
        <li class="active"><a href="shows">Shows <span class="sr-only">(current)</span></a></li>
        <li><a href="prices">Prices</a></li>
        <li><a href="transaction">Transaction</a></li>
        <li><a href="credit-period">Credit Period</a></li>
        
      </ul>
    </div>
  </div>
</nav>

	<div class="container">
		<div class="row">
			<a href="create-show" class="btn btn-info">Create</a>
		</div>
		<br />
		<div class="row">
			<table  id="example" class="table table-striped " style="width:100%">
				<thead>
					<tr>
						<th>Show Id</th>
						<th>Show Name</th>
						<th>Active</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="show" items="${shows }">
					<tr>
						<td>${show.id }</td>
						<td>${show.name }</td>
						<td>${show.active }</td>
						<td><a href="update-active?id=${show.id }" class="text-warning"><i class="glyphicon glyphicon-pencil"></i></a></td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.dataTables.min.js"></script>
    <script src="js/dataTables.bootstrap.min.js"></script>

    <script type="text/javascript">
	    $(document).ready(function() {
	        $('#example').DataTable();
	    });
    </script>
</body>
</html>