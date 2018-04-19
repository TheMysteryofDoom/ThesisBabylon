-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 19, 2018 at 09:37 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `codersofbabylon1`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminaccount`
--

CREATE TABLE `adminaccount` (
  `accountID` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminaccount`
--

INSERT INTO `adminaccount` (`accountID`, `username`, `password`, `email`) VALUES
(1, 'admin', 'admin', 'admin@admin.com');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `patientID` int(11) NOT NULL,
  `firstName` varchar(100) NOT NULL,
  `lastName` varchar(100) NOT NULL,
  `middleName` varchar(100) NOT NULL,
  `birthMonth` varchar(50) NOT NULL,
  `birthDay` int(11) NOT NULL,
  `birthYear` int(11) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `birthPlace` varchar(100) NOT NULL,
  `citizenship` varchar(100) NOT NULL,
  `religion` varchar(100) NOT NULL,
  `civil` varchar(50) NOT NULL,
  `job` varchar(100) NOT NULL,
  `patientStatus` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`patientID`, `firstName`, `lastName`, `middleName`, `birthMonth`, `birthDay`, `birthYear`, `gender`, `birthPlace`, `citizenship`, `religion`, `civil`, `job`, `patientStatus`) VALUES
(2, 'Mark Luis Gabriel', 'Ticzon', 'V.', 'Oct', 20, 1998, 'M', 'Quezon City', 'filipino', 'Christianity', 'single', 'Student', 'alive'),
(3, 'Mark Luis Gabriel', 'Ticzon', 'V.', 'Oct', 20, 1998, 'M', 'Quezon City', 'filipino', 'Christianity', 'single', 'Student', 'alive'),
(4, 'Mark Luis Gabriel', 'Ticzon', 'V.', 'Oct', 20, 1998, 'M', 'Quezon City', 'filipino', 'Christianity', 'single', 'Student', 'alive'),
(5, 'Mark Luis Gabriel', 'Ticzon', 'V.', 'May', 2, 2017, 'M', 'Quezon City', 'filipino', 'Christianity', 'single', 'Student', 'alive'),
(6, 'Mark Luis Gabriel', 'Ticzon', 'V.', 'Apr', 2, 2017, 'M', 'Quezon City', 'filipino', 'Christianity', 'single', 'Student', 'alive'),
(7, 'Mark Luis Gabriel', 'Ticzon', 'V.', 'Mar', 4, 2017, 'M', 'Quezon City', 'filipino', 'Christianity', 'single', 'Student', 'alive'),
(8, 'Mark Luis Gabriel', 'Ticzon', 'V.', 'Mar', 22, 2015, 'M', 'Quezon City', 'filipino', 'Christianity', 'single', 'Student', 'alive'),
(9, 'Mark Luis Gabriel', 'Ticzon', 'V.', 'Jan', 2, 2017, 'M', 'Quezon City', 'filipino', 'Christianity', 'single', 'Student', 'alive'),
(10, 'Mark Luis Gabriel', 'Ticzon', 'V.', 'Mar', 3, 2006, 'M', 'Quezon City', 'filipino', 'Christianity', 'single', 'Student', 'alive'),
(11, 'Mark Luis Gabriel', 'Ticzon', 'V.', 'May', 2, 2016, 'M', 'Quezon City', 'filipino', 'Christianity', 'single', 'Student', 'alive'),
(12, 'Mark Luis Gabriel', 'Ticzon', 'V.', 'Mar', 4, 2018, 'M', 'Quezon City', 'eritrean', 'Islam', 'single', 'Student', 'alive');

-- --------------------------------------------------------

--
-- Table structure for table `patientaddress`
--

CREATE TABLE `patientaddress` (
  `addressID` int(11) NOT NULL,
  `street` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `country` varchar(100) NOT NULL,
  `zipcode` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patientaddress`
--

INSERT INTO `patientaddress` (`addressID`, `street`, `city`, `country`, `zipcode`) VALUES
(2, 'Mandaluyong City', 'Mandaluyong City', 'Philippines', '1001'),
(3, 'Mandaluyong City', 'Mandaluyong City', 'Philippines', '1001'),
(4, 'Mandaluyong City', 'Mandaluyong City', 'Philippines', '1001'),
(5, 'Mandaluyong City', 'Mandaluyong City', 'Philippines', '1550');

-- --------------------------------------------------------

--
-- Table structure for table `patientcontactinfo`
--

CREATE TABLE `patientcontactinfo` (
  `contactID` int(11) NOT NULL,
  `contactNo1` varchar(50) NOT NULL,
  `contactNo2` varchar(50) NOT NULL,
  `contactNo3` varchar(50) NOT NULL,
  `type1` varchar(50) NOT NULL,
  `type2` varchar(50) NOT NULL,
  `type3` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patientcontactinfo`
--

INSERT INTO `patientcontactinfo` (`contactID`, `contactNo1`, `contactNo2`, `contactNo3`, `type1`, `type2`, `type3`, `email`) VALUES
(2, '09159324417', '09159324456', '5318459', 'Cell', 'Work', 'Home', 'markvticzon@gmail.com'),
(3, '09159324417', '09159324456', '5318459', 'Cell', 'Work', 'Home', 'markvticzon@gmail.com'),
(4, '09159324417', '09159324456', '5318459', 'Cell', 'Work', 'Home', 'markvticzon@gmail.com'),
(5, '09159324417', '09159324456', '5318459', 'Cell', 'Work', 'Home', 'markvticzon@gmail.com'),
(6, '09159324417', '09159324456', '5318459', 'Cell', 'Work', 'Home', 'markvticzon@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `patientemergencycontact`
--

CREATE TABLE `patientemergencycontact` (
  `emergencycontactID` int(11) NOT NULL,
  `fisrtName` varchar(100) NOT NULL,
  `lastName` varchar(100) NOT NULL,
  `middleName` varchar(100) NOT NULL,
  `contactNo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adminaccount`
--
ALTER TABLE `adminaccount`
  ADD PRIMARY KEY (`accountID`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`patientID`);

--
-- Indexes for table `patientaddress`
--
ALTER TABLE `patientaddress`
  ADD PRIMARY KEY (`addressID`);

--
-- Indexes for table `patientcontactinfo`
--
ALTER TABLE `patientcontactinfo`
  ADD PRIMARY KEY (`contactID`);

--
-- Indexes for table `patientemergencycontact`
--
ALTER TABLE `patientemergencycontact`
  ADD PRIMARY KEY (`emergencycontactID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `adminaccount`
--
ALTER TABLE `adminaccount`
  MODIFY `accountID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `patientID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `patientaddress`
--
ALTER TABLE `patientaddress`
  MODIFY `addressID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `patientcontactinfo`
--
ALTER TABLE `patientcontactinfo`
  MODIFY `contactID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `patientemergencycontact`
--
ALTER TABLE `patientemergencycontact`
  MODIFY `emergencycontactID` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `patientaddress`
--
ALTER TABLE `patientaddress`
  ADD CONSTRAINT `patientaddress_ibfk_1` FOREIGN KEY (`addressID`) REFERENCES `patient` (`patientID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `patientcontactinfo`
--
ALTER TABLE `patientcontactinfo`
  ADD CONSTRAINT `patientcontactinfo_ibfk_1` FOREIGN KEY (`contactID`) REFERENCES `patient` (`patientID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `patientemergencycontact`
--
ALTER TABLE `patientemergencycontact`
  ADD CONSTRAINT `patientemergencycontact_ibfk_1` FOREIGN KEY (`emergencycontactID`) REFERENCES `patient` (`patientID`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
