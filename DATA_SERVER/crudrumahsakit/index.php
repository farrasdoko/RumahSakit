<?php include('server.php');

	if (isset($_GET['edit'])) {
		$id = $_GET['edit'];
		$edit_state = true;
		$rec = mysqli_query($db, "SELECT * FROM info WHERE id = $id");
		$record = mysqli_fetch_array($rec);
		$nama = $record['nama'];
		$alamat = $record['alamat'];
		$id = $record['id'];

	}

?>



<!DOCTYPE html>
<html>
<head>
	<title>Admin Data Rumah Sakit</title>

	<link rel="stylesheet" type="text/css" href="style.css">
</head> 
<body>
<?php if (isset($_SESSION['msg'])): ?>
	<div class = "msg">
		<?php
		echo $_SESSION['msg'];
		unset($_SESSION['msg']);
		?>
	</div>
<?php endif ?>
<table>
	<thead>
		<tr>
			<th>Nama</th>
			<th>Alamat</th>
			<th colspan="2">Action</th>
		</tr>
	</thead>
	<tbody>
		<?php while ($row = mysqli_fetch_array($results)) { ?>
			<tr>
				<td><?php echo $row['nama']; ?></td>
				<td><?php echo $row['alamat']; ?></td>
				<td><a class="edt_btn" href="index.php?edit=<?php echo $row['id']; ?>">Ubah</td>

				<td><a class="del_btn" href="index.php?delete&id=<?php echo $row['id']; ?>">Hapus</td>

			</tr>
			<?php } ?>
	</tbody>
</table>
<form method="post" action="server.php">
	<input type="hidden" name="id" value="<? echo $id; ?>">
	<div class="input-grup">
		<label>Nama</label>
		<input type="text" name="nama" value="<?php echo $nama; ?>">
	</div>
	<div class="input-grup">
		<label>Alamat</label>
		<input type="text" name="alamat" value="<?php echo $alamat; ?>">
	</div>
	<div class="input-grup">
		<?php if ($edit_state == false): ?> 
			<button type="submit" name="save" class="btn">Save</button>
		<?php else: ?>
			<button type="submit" name="update" class="btn">Update</button>
		<?php endif ?>		
	</div>
</form>
</body>
</html>
