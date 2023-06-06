-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2023 at 01:42 PM
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
  `c_id` int(7) NOT NULL,
  `c_name` varchar(50) NOT NULL,
  `c_username` varchar(50) NOT NULL,
  `c_password` varchar(100) NOT NULL,
  `c_contact_no.` varchar(30) NOT NULL,
  `c_address` varchar(50) NOT NULL,
  `c_status` varchar(50) NOT NULL,
  `c_image` varchar(100) NOT NULL,
  `c_reason` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_costumer`
--

INSERT INTO `tbl_costumer` (`c_id`, `c_name`, `c_username`, `c_password`, `c_contact_no.`, `c_address`, `c_status`, `c_image`, `c_reason`) VALUES
(2, 'rolands', 'lopz', 'aqHgQMi0YHU4lwcx5AQO1g==', 'rolands', 'rolands', '', 'src/forImages/waterl.png', ''),
(21, 'rolands', 'lopz', 'aqHgQMi0YHU4lwcx5AQO1g==', 'rolands', 'rolands', '', 'src/forImages/waterl.png', ''),
(22, 'asd', 'asds', 'eBVpbsvxyW5olLd5RW0zDg==', 'asd', 'asd', '', '', ''),
(23, 'gggg', 'gggg', 'weu0kz4GzlYXSD9mXiZifA==', 'gggg', 'gggg', 'Banned', '', ''),
(24, 'ggg', 'ggg', 'uiSMmFrOlIY4gJIdiQDFPw==', 'ggg', 'ggg', 'pending', '', ''),
(25, 'sssssss', 'sssssss', 'FvyxCR+KDMcMluL/l/3SEw==', 'sssssss', 'sssssss', 'pending', '', ''),
(26, 'aaa', 'aaa', 'R7zlx09Yn0hn29V+nKn4CA==', 'aaa', 'aaa', 'pending', '', ''),
(28, 'eeee', 'sssse', 'Zw2pG+ZBJ8kvqsNcgwDoFA==', 'eeee', 'eeee', 'pending', '', ''),
(29, 'dadas', 'dada', 'CZs7BgFUiYhA8OvftG7Hjw==', 'dada', 'dada', 'pending', '', ''),
(30, 'aaaaa', 'sssaaa', 'n25oAM+ud0nrbEhmGSVLnA==', 'sss', 'aaa', 'pending', '', ''),
(31, 'sasa', 'asas', '9Fcx49OaGyMwu/k+mz3lng==', 'saas', 'sasa', 'pending', '', ''),
(35, 'fff', 'fff', 'ND2QQKZxxFgy7lOBhg4plg==', 'fff', 'fff', 'pending', '', ''),
(36, 'dra', 'dra', 'q+QBshkNJXr+yzoXVR7VqQ==', 'dra', 'dra', 'pending', '', ''),
(37, 'sssa', 'sssa', 'sssa', 'sssa', 'sssa', 'sssa', '', ''),
(38, 'dsa', 'dsa', 'dsa', 'dsa', 'dsa', 'dsa', '', ''),
(39, 'weq', 'weq', 'HQlbTSmtlCuZK5851+0Egw==', 'weq', 'weq', 'pending', '', ''),
(40, 'dddd', 'fdf', 'Ed268zhq6h8pdO7phFQhUg==', 'dddd', 'dddd', 'pending', '', ''),
(41, 'ddddd', 'ddddd', 'ddddd', 'ddddd', 'ddddd', 'ddddd', '', ''),
(42, 'aaaa', 'aaaa', 'aaaa', 'aaaa', 'aaaa', 'aaaa', '', ''),
(44, 'dadas', 'dada', 'CZs7BgFUiYhA8OvftG7Hjw==', 'dada', 'dada', 'pending', '', ''),
(45, 'dadas', 'baba', 'CPjgJgxkQYUQzvsrBu7lzQ==', 'dada', 'dada', 'pending', '', ''),
(46, 'vvs', 'vv', 'gnfgkQ11AZW0SHl2FuCRrQ==', 'svv', 'vvs', 'pending', '', ''),
(48, '123', 'sad', 'SfC60plofGIzQYIXi/112A==', '123', '123', 'pending', 'src/forImages/main.png', ''),
(49, 'sasa', 'sasas', 'R7zlx09Yn0hn29V+nKn4CA==', 'sasa', 'sasa', 'Approved', 'src/forImages/cid.jpg', ''),
(50, 'cacas', 'cacas', 'XwObTvAFih1lLxPWEjdaWw==', 'cacas', 'cacas', 'pending', 'src/forImages/aqua.jpg.png', ''),
(51, 'admin', 'admin', 'ISMvKXpXpadDiUoOSoAfww==', 'admin', 'admin', 'Approved', 'src/forImages/ichika hanabi.jpg', ''),
(52, 'yawa', 'yawa', 'dLbPZzwOqcsIaMH3BbAh5g==', 'yawa', 'yawa', 'Approved', 'src/forImages/1216456.jpg', 'yawa');

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
(2, 'sdsadsss', 'Deceased', 'dsadsss', 'dsasss'),
(3, 'dsas', 'Sold', 'dsas', 'dsas'),
(4, 'dsa', 'Sold', 'dsa', 'dsa'),
(7, 'dsass', 'Available', 'Availabless', 'dsass'),
(14, 'sdaddppsss', 'Available', 'Soldddssssss', 'ssdsaddsss'),
(17, 'koi', 'available', '20', '200'),
(18, 'ss', 'Deceased', 'Sold', 'ss'),
(19, 'sss', 'sss', 'Available', 'sss'),
(20, 'ddd', 'ddd', 'Available', 'ddd'),
(21, 'ss', 'ss', 'Sold', 'ss'),
(22, 'sss', 'ssss', 'Sold', 'ssss');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_soldproduct`
--

CREATE TABLE `tbl_soldproduct` (
  `sp_id` int(15) NOT NULL,
  `f_code` int(15) NOT NULL,
  `u_id` int(15) NOT NULL,
  `sp_date` date NOT NULL DEFAULT current_timestamp(),
  `sp_status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_soldproduct`
--

INSERT INTO `tbl_soldproduct` (`sp_id`, `f_code`, `u_id`, `sp_date`, `sp_status`) VALUES
(3, 22, 2, '2023-06-04', 'Pending'),
(4, 2, 5, '2023-06-04', 'Pending'),
(5, 4, 3, '2023-06-29', 'Pending'),
(7, 17, 5, '2023-06-04', 'Complete'),
(8, 7, 4, '2023-06-05', 'Complete');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `u_id` int(15) NOT NULL,
  `u_name` varchar(50) NOT NULL,
  `u_address` varchar(50) NOT NULL,
  `u_contact_no.` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_name`, `u_address`, `u_contact_no.`) VALUES
(1, 'dsassssa', 'dsassssa', 'dsassssa'),
(2, 'dsa', 'dsa', 'dsa'),
(3, 'ssssaa', 'ssssaaa', 'ssssaaaa'),
(4, 'sass', 'sass', 'sass'),
(5, 'aaa', 'aaa', 'aaa');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_costumer`
--
ALTER TABLE `tbl_costumer`
  ADD PRIMARY KEY (`c_id`);

--
-- Indexes for table `tbl_fish`
--
ALTER TABLE `tbl_fish`
  ADD PRIMARY KEY (`f_code`);

--
-- Indexes for table `tbl_soldproduct`
--
ALTER TABLE `tbl_soldproduct`
  ADD PRIMARY KEY (`sp_id`),
  ADD KEY `buyed_code` (`f_code`),
  ADD KEY `u_id` (`u_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_costumer`
--
ALTER TABLE `tbl_costumer`
  MODIFY `c_id` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- AUTO_INCREMENT for table `tbl_fish`
--
ALTER TABLE `tbl_fish`
  MODIFY `f_code` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `tbl_soldproduct`
--
ALTER TABLE `tbl_soldproduct`
  MODIFY `sp_id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_soldproduct`
--
ALTER TABLE `tbl_soldproduct`
  ADD CONSTRAINT `buyed_code` FOREIGN KEY (`f_code`) REFERENCES `tbl_fish` (`f_code`),
  ADD CONSTRAINT `tbl_soldproduct_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `tbl_user` (`u_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
