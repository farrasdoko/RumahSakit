<?php
	session_start();
	$nama = "";
	$alamat = "";
	$id = 0;
	$edit_state = false;

	// Connect to Database
	// Create Variable connection_aborted()
	$db = mysqli_connect('localhost', 'root', '', 'rumahsakit');
	$dbh = new PDO ("mysql:host=localhost;dbname=rumahsakit", "root", "");

	// If save button is clicked
	if (isset($_POST['save'])) {
		$nama = $_POST['nama'];
		$alamat = $_POST['alamat'];
		$query = "INSERT INTO info (nama, alamat) VALUES ('$nama', '$alamat')";
		mysqli_query($db, $query);
		$_SESSION['msg'] = "Data Berhasil Disimpan";
		// fungsi header = meref  resh data yang baru diinput dan dimasukkan kembali di index.php
		header('location: index.php');
	}

	if(isset($_POST['update'])){
		$nama = mysql_real_escape_string($_POST['nama']);
		$alamat = mysql_real_escape_string($_POST['alamat']);
		$id = mysql_real_escape_string($_POST['id']);

		mysqli_query($db, "UPDATE info SET nama = '$nama', alamat='$alamat' WHERE id=$id");
		$_SESSION['msg'] = "Data Telah Diperbarui";
		header('location: index.php');

	}
	if(isset($_GET['delete'])){
		$id = mysql_real_escape_string($_GET['id']);
		mysqli_query($db, "DELETE from info WHERE id=$id");
		$_SESSION['msg'] = "Data Telah Dihapus";
		header('location: index.php');
	}

	$results = mysqli_query($db, "SELECT * FROM info");
?>