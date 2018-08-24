-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Aug 24, 2018 at 04:41 PM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 5.6.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rumahsakit`
--

-- --------------------------------------------------------

--
-- Table structure for table `info`
--

CREATE TABLE `info` (
  `id` int(10) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `info`
--

INSERT INTO `info` (`id`, `nama`, `alamat`) VALUES
(1, 'Rumah Sakit Premier Jatinegara', ' JL. Raya Jatinegara Timur No 85-87 Jakarta Timur'),
(2, 'RSUPN Dr. Cipto Mangunkusumo', ' Jl. Diponegoro No. 71 Jakarta Pusat'),
(3, 'Rumah Sakit Pondok Indah Puri Indah', 'Jl. Raya Puri Indah Raya Blok S-2 Kembangan Selatan, Jakarta Barat'),
(4, 'Rumah Sakit Umum Pusat Fatmawati', 'Jl. RS Fatmawati, Cilandak, Jakata Selatan'),
(5, 'Medistra Hospital', ' Jl. Gatot Subroto Kav. 59, Jakarta Selatan'),
(6, 'RSPAD Gatot Soebroto', 'Jl. Dr. Abdul Rahman Saleh No. 24, Jakarta Pusat'),
(7, 'Jakarta Eye Center Kedoya', 'Jl. Terusan Arjuna Utara No. 1, Kedoya, Jakarta'),
(8, 'Rumah Sakit Siloam', 'Jl. Raya Pejuangan Kav. 8 Kebon Jeruk, Jakarta');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `info`
--
ALTER TABLE `info`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `info`
--
ALTER TABLE `info`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
