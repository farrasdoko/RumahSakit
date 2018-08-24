<?php
	include 'server.php';

	$response=array();
	$id= @$_POST['vrid'];

	$sql = "DELETE FROM info WHERE id='$id'";
	if (mysqli_query($db,$sql)) {
		$response['result'] = true;
		$response['msg'] = "Data Berhasil Dihapus";
		echo json_encode($response);
	}else{
		$response['result'] = false;
		$response['msg'] = "Gagal Menghapus Data";
		echo json_encode($response);
	}
	mysqli_close($db);
?>