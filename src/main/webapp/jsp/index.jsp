<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
        <li class="active"><a href="index">Home <span class="sr-only">(current)</span></a></li>
        <li><a href="shows">Shows</a></li>
        <li><a href="prices">Prices</a></li>
        <li><a href="transaction">Transaction</a></li>
        <li><a href="credit-period">Credit Period</a></li>        
      </ul>
    </div>
  </div>
</nav>

	<div class="container">
		<h2>Dashboard</h2>
		<br />
		<div class="row" style="padding-left:1em; padding-right:1em;">
			<div class="col-md-3" style="box-shadow: 0px 0px 5px 0px">
				<h3 class="text-warning">Gift Voucher Balance</h3>
				<hr />
				<p class="text-info"><b>Rs. ${balance.gv }</b></p>
			</div>
			
			<div class="col-md-3 col-md-offset-1" style="box-shadow: 0px 0px 5px 0px">
				<h3 class="text-warning">Gift Voucher Pending</h3>
				<hr />
				<p class="text-info"><b>Rs. ${pending.gv }</b></p>
			</div>
			<div class="col-md-3 col-md-offset-1" style="box-shadow: 0px 0px 5px 0px">
				<h3 class="text-warning">Total Gift Voucher</h3>
				<hr />
				<p class="text-info"><b>Rs. ${balance.gv + pending.gv }</b></p>
			</div>
		</div>
		<br />
		<div class="row" style="padding-left:1em; padding-right:1em;">
			<div class="col-md-3" style="box-shadow: 0px 0px 5px 0px">
				<h3 class="text-warning">Super Coin Balance</h3>
				<hr />
				<p class="text-info"><b>Sc. ${balance.sc }</b></p>
			</div>
			
			<div class="col-md-3 col-md-offset-1" style="box-shadow: 0px 0px 5px 0px">
				<h3 class="text-warning">Super Coin Pending</h3>
				<hr />
				<p class="text-info"><b>Sc. ${pending.sc }</b></p>
			</div>
			<div class="col-md-3 col-md-offset-1" style="box-shadow: 0px 0px 5px 0px">
				<h3 class="text-warning">Total Super Coin</h3>
				<hr />
				<p class="text-info"><b>Sc. ${balance.sc + pending.sc }</b></p>
			</div>
		</div>
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</body>
</html>