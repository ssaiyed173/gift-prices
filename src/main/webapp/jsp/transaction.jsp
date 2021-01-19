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
        <li><a href="index">Home</a></li>
        <li><a href="shows">Shows</a></li>
        <li><a href="prices">Prices</a></li>
        <li class="active"><a href="transaction">Transaction  <span class="sr-only">(current)</span></a></li>
        <li><a href="credit-period">Credit Period</a></li>        
      </ul>
    </div>
  </div>
</nav>

	<div class="container">
		<div class="row">
			<div class="col-md-5">
				<h3>Gift Voucher</h3>
				<form action="transaction-gv" method="post">
					<div class="form-group">
						<label>Transaction Type</label>
						<select name="type" class="form-control">
							<option value="CR">Credit</option>
							<option value="WD">Withdrawal</option>
						</select>
					</div>
					<div class="form-group">
						<label>Amount</label>
						<input type="number" name="amount"  class="form-control" placeholder="Enter Amount" />
					</div>
					<input type="submit" class="btn btn-primary" value="Do Transaction">
				</form>
			</div>
			
			<div class="col-md-5 col-md-offset-2">
				<h3>Super Coin</h3>
				<form action="transaction-sc" method="post">
					<div class="form-group">
						<label>Transaction Type</label>
						<select name="type"  class="form-control">
							<option value="CR">Credit</option>
							<option value="WD">Withdrawal</option>
						</select>
					</div>
					<div class="form-group">
						<label>Amount</label>
						<input type="number" name="amount"  class="form-control" placeholder="Enter Amount" />
					</div>
					<input type="submit" class="btn btn-primary" value="Do Transaction">
				</form>
			</div>
		</div>
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</body>
</html>