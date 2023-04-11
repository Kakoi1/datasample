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
-- Table structure for table `tbl_costumer`
--

CREATE TABLE `tbl_costumer` (
  `c_id` int(20) NOT NULL,
  `c_name` varchar(50) NOT NULL,
  `c_username` varchar(50) NOT NULL,
  `c_password` varchar(30) NOT NULL,
  `c_contact_no.` varchar(30) NOT NULL,
  `c_address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_costumer`
--

INSERT INTO `tbl_costumer` (`c_id`, `c_name`, `c_username`, `c_password`, `c_contact_no.`, `c_address`) VALUES
(1, 'dsa', 'dsa', '[C@2a96a9f8', 'dsa', 'dsa'),
(2, 'dsa', 'dsa', 'dsa', 'dsa', 'dsa'),
(3, 'dsa', 'dsa', '123', 'ewq', 'ewq'),
(4, 'qwe', 'dsa', '123', 'sda', 'dads'),
(5, 'qwe', '123', '123', 'sda', 'dads'),
(6, 'wqe', 'qqq', '123', 'asd', 'das'),
(11, 'roland', 'roland', 'lopez', '0220450', 'cebu'),
(12, 'dsa', '030303', 'dsa', 'ewq', 'ewq'),
(13, 'dsa', 'hahahasss', 'dsass', 'dsasss', 'dsa');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_costumer`
--
ALTER TABLE `tbl_costumer`
  ADD PRIMARY KEY (`c_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_costumer`
--
ALTER TABLE `tbl_costumer`
  MODIFY `c_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
