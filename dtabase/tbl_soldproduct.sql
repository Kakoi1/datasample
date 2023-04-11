-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 11, 2023 at 03:01 AM
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
-- Table structure for table `tbl_soldproduct`
--

CREATE TABLE `tbl_soldproduct` (
  `sp_id` int(15) NOT NULL,
  `f_code` int(15) NOT NULL,
  `c_id` int(15) NOT NULL,
  `sp_status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_soldproduct`
--

INSERT INTO `tbl_soldproduct` (`sp_id`, `f_code`, `c_id`, `sp_status`) VALUES
(2, 17, 11, 'sold');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_soldproduct`
--
ALTER TABLE `tbl_soldproduct`
  ADD PRIMARY KEY (`sp_id`),
  ADD KEY `buyer_id` (`c_id`),
  ADD KEY `buyed_code` (`f_code`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_soldproduct`
--
ALTER TABLE `tbl_soldproduct`
  MODIFY `sp_id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_soldproduct`
--
ALTER TABLE `tbl_soldproduct`
  ADD CONSTRAINT `buyed_code` FOREIGN KEY (`f_code`) REFERENCES `tbl_fish` (`f_code`),
  ADD CONSTRAINT `buyer_id` FOREIGN KEY (`c_id`) REFERENCES `tbl_costumer` (`c_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
