<?php
require_once('server.php');

if($_SERVER['REQUEST_METHOD']=='POST') {
	$response = array();
	//getting data
	$id = $_POST['vrid'];
	$nama = $_POST['vrnama'];
	$alamat = $_POST['vralamat'];

	$sql = "UPDATE info SET nama='$nama', alamat='$alamat' WHERE id='$id'";

	if (mysqli_query($db,$sql)) {
		$response['sukses'] = true;
		$response['pesan'] = "Data Berhasil Diperbarui";
		echo json_encode($response);
	}else{
		$response['sukses'] = false;
		$response['pesan'] = "Opps, Gagal Merubah!!";
		echo json_encode($response);
	}
	mysqli_close($db);
}
?>