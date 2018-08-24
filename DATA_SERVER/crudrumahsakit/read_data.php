<?php
require_once ('server.php');
	try {
		$sql = "select * from info";

		$hasil = $dbh -> prepare($sql);
		$hasil -> execute();

		$data = $hasil -> fetchAll (PDO::FETCH_OBJ);
		$size = $hasil -> rowCount();

		if ($size>0) {
			$json ['data'] = $data;
			$json ['success'] = true;
			$json ['message'] = 'Sukses Membaca Data';
		} else {
			$json ['success'] = false;
			$json ['message'] = 'Gagal Membaca Data';
		}
	} 
	catch (PDPException $e) {
		$json ['success'] = false;
		$json ['message'] = 'Gagal Membaca Data'.$e-getmessage();
		
	} echo json_encode($json);

?>