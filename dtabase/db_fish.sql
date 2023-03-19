-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 18, 2023 at 11:01 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_fish`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_fish`
--

CREATE TABLE `tbl_fish` (
  `f_code` int(15) NOT NULL,
  `f_name` varchar(50) NOT NULL,
  `f_status` varchar(20) NOT NULL,
  `f_quantity` varchar(20) NOT NULL,
  `f_price` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_fish`
--

INSERT INTO `tbl_fish` (`f_code`, `f_name`, `f_status`, `f_quantity`, `f_price`) VALUES
(1, 'ewqe', 'Available', 'ewqe', 'ewqe'),
(2, 'dsad', 'dsa', 'dsad', 'dsa'),
(3, 'dsa', 'dsa', 'dsa', 'dsa'),
(4, 'dsa', 'Sold', 'dsa', 'dsa'),
(7, 'dsas', 'Sold', 'Availables', 'dsas'),
(13, 'ewq', 'ewq', 'Sold', 'ewq');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_fish`
--
ALTER TABLE `tbl_fish`
  ADD PRIMARY KEY (`f_code`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_fish`
--
ALTER TABLE `tbl_fish`
  MODIFY `f_code` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
