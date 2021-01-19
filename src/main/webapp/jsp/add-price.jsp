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
        <li><a href="shows">Shows</a></li>
        <li class="active"><a href="prices">Prices <span class="sr-only">(current)</span></a></li>
        <li><a href="transaction">Transaction</a></li>
        <li><a href="credit-period">Credit Period</a></li>
  
      </ul>
    </div>
  </div>
</nav>

	<div class="container">
		<div class="row">
			<form action="add-price" method="post">
				<div class="form-group">
					<label for="name">Show Name: </label>
					<select name="show" class="form-control" required>
						<option value="Invitition Reward">Invitition Reward</option>
						<c:forEach var="show" items="${shows }">
							<option value="${show.name }">${show.name }</option>
						</c:forEach>
					</select>
				</div> 
				
				<div class="form-group">
					Price:<br />
					<label>
						<input type="radio" name="type" value="Super Coin" checked /> Super Coin
					</label>
					<label>
						<input type="radio" name="type" value="Gift Voucher"  /> Gift Voucher 
					</label>
				</div>
				<div class="form-group">
					<label>Amount: </label>
					<input type="number" name="amount" class="form-control" placeholder="Enter amount" />
				</div> 
				<div class="form-group">
					<label>Winning Date: </label>
					<input type="date" name="winningDate"  class="form-control" />
				</div>
				
				<div class="form-group">
					<label>
						<input type="checkbox" name="credited"  /> Price is Credited
					</label>
				</div> 
				<input type="submit" value="Add" class="btn btn-primary" />  
			</form>
		</div>
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</body>
</html>