<?php
	include 'server.php';
	$nama = $_POST['nama'];
	$alamat = $_POST['alamat'];

	$sql = "INSERT INTO info (nama, alamat) VALUES ('$nama', '$alamat')";

	if ($result = $db->query($sql)) {
		$json_response = array();
		$json_response ['message'] = "Data Tersimpan";
		$json_response ['success'] = true;
		echo json_encode($json_response);
	}else{
		$json_response ['message'] = "Gagal Menyimpan Data";
		$json_response ['success'] = false;
		echo json_encode($json_response);
	}
?>