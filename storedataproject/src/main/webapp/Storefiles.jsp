<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="ISO-8859-1">
<title>Store Files</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.btn {
	min-width: 180px;
}
</style>
</head>
<body>
	<div class="container">
		<h2>StoreData Details</h2>
		<form class="form-horizontal" action="StoreFiles" method="post">

			<div class="form-group">
				<label class="control-label col-sm-2" for="id">UserId</label>
				<div class="col-sm-4">
					<input type="number" class="form-control" id="id"
						placeholder="Enter userId " name="id">
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="name">Name </label>
				<div class="col-sm-4">
					<input type="text" class="form-control" id="name"
						placeholder="Enter name " name="name">
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="mail">EMail </label>
				<div class="col-sm-4">
					<input type="email" class="form-control" id="email"
						placeholder="Enter email " name="email">
				</div>
			</div>


			<div class="form-group">
				<label class="control-label col-sm-2" for="image">IMAGE</label>
				<div class="col-sm-4">
					<input type="file" class="form-control" id="image"
						placeholder="Upload Image "
						accept="image/gif, image/jpeg, image/png" name="image">
						
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="file"> FILE</label>
				<div class="col-sm-4">
					<input type="file" class="form-control" id="file"
						placeholder="Upload File " name="phno">
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="video">VIDEOS</label>
				<div class="col-sm-4">
					<input type="file" class="form-control" id="video"
						placeholder="Upload Video" name="video">
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="MP3 Songs">MP3
					SONGS</label>
				<div class="col-sm-4">
					<input type="file" class="form-control" id="cpwd"
						placeholder="Upload MP3 Songs " name="song">
				</div>
			</div>
			

			<br>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-8">
					<button type="submit" class="btn btn-success">Submit</button>
					<button type="Reset" class="btn btn-success">Reset</button>
				</div>
			</div>

		</form>
	</div>

</body>
</html>