-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 13 Des 2017 pada 16.54
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis_1064`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `identitas_1064`
--

CREATE TABLE `identitas_1064` (
  `nim` bigint(20) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `prodi` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `identitas_1064`
--

INSERT INTO `identitas_1064` (`nim`, `alamat`, `nama`, `prodi`) VALUES
(1555301064, 'umbansari', 'rahma', 'ti'),
(1555301097, 'panam', 'ade', 'ti'),
(1555301098, 'umbansari', 'ani', 'ti');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ipk_1064`
--

CREATE TABLE `ipk_1064` (
  `id` bigint(20) NOT NULL,
  `golongan` varchar(255) DEFAULT NULL,
  `jumlah_ipk` varchar(255) DEFAULT NULL,
  `keterangan` varchar(255) DEFAULT NULL,
  `nim` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `ipk_1064`
--

INSERT INTO `ipk_1064` (`id`, `golongan`, `jumlah_ipk`, `keterangan`, `nim`) VALUES
(1, 'cl', '300', 'istimewa', 1555301064);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas_1064`
--
ALTER TABLE `identitas_1064`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `ipk_1064`
--
ALTER TABLE `ipk_1064`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKnfl0pu5qwqwuyr7xvpijv0ap8` (`nim`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `identitas_1064`
--
ALTER TABLE `identitas_1064`
  MODIFY `nim` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1555301100;
--
-- AUTO_INCREMENT for table `ipk_1064`
--
ALTER TABLE `ipk_1064`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `ipk_1064`
--
ALTER TABLE `ipk_1064`
  ADD CONSTRAINT `FKnfl0pu5qwqwuyr7xvpijv0ap8` FOREIGN KEY (`nim`) REFERENCES `identitas_1064` (`nim`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
